package com.jzkj.modules.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.common.config.config.Constant;
import com.jzkj.common.platform.utils.DateUtils;
import com.jzkj.common.platform.utils.IdUtil;
import com.jzkj.common.platform.utils.RRException;
import com.jzkj.modules.sys.dao.SysSmsLogDao;
import com.jzkj.modules.sys.entity.SmsConfig;
import com.jzkj.modules.sys.entity.SysSmsLogEntity;
import com.jzkj.modules.sys.service.SysConfigService;
import com.jzkj.modules.sys.service.SysSmsLogService;
import com.jzkj.modules.sys.shiro.ShiroUtils;
import com.jzkj.modules.until.SmsUtil;
import com.jzkj.modules.until.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service("smsLogService")
public class SysSmsLogServiceImpl  extends ServiceImpl<SysSmsLogDao,SysSmsLogEntity> implements SysSmsLogService {
    @Autowired
    private SysSmsLogDao smsLogDao;
    @Autowired
    private SysConfigService sysConfigService;


    @Override
    public SysSmsLogEntity sendSms(SysSmsLogEntity smsLog) {
        String result = "";
        //获取云存储配置信息
        SmsConfig config = sysConfigService.getConfigObject(Constant.SMS_CONFIG_KEY, SmsConfig.class);
        if (StringUtils.isNullOrEmpty(config)) {
            throw new RRException("请先配置短信平台信息");
        }
        if (StringUtils.isNullOrEmpty(config.getName())) {
            throw new RRException("请先配置短信平台用户名");
        }
        if (StringUtils.isNullOrEmpty(config.getPwd())) {
            throw new RRException("请先配置短信平台密钥");
        }
        if (StringUtils.isNullOrEmpty(config.getSign())) {
            throw new RRException("请先配置短信平台签名");
        }
        try {
            /**
             * 状态,发送编号,无效号码数,成功提交数,黑名单数和消息，无论发送的号码是多少，一个发送请求只返回一个sendid，如果响应的状态不是“0”，则只有状态和消息
             */
            result = SmsUtil.crSendSms(config.getName(), config.getPwd(), smsLog.getMobile(), smsLog.getContent(), config.getSign(),
                    DateUtils.format(smsLog.getStime(), "yyyy-MM-dd HH:mm:ss"), smsLog.getExtno());
        } catch (Exception e) {

        }
        String arr[] = result.split(",");
        //发送成功
        if ("0".equals(arr[0])) {
            smsLog.setSendId(arr[1]);
            smsLog.setInvalidNum(Integer.parseInt(arr[2]));
            smsLog.setSuccessNum(Integer.parseInt(arr[3]));
            smsLog.setBlackNum(Integer.parseInt(arr[4]));
            smsLog.setReturnMsg(arr[5]);
        } else {
            //发送失败
            smsLog.setReturnMsg(arr[1]);
        }
        smsLog.setSendStatus(Integer.parseInt(arr[0]));
        try {
            smsLog.setUserId(ShiroUtils.getUserId());
        } catch (Exception e) {
            //外部发送短信
            smsLog.setUserId(1L);
        }
        smsLog.setSign(config.getSign());
        if (null == smsLog.getStime()) {
            smsLog.setStime(new Date());
        }
        //保存发送记录
        smsLogDao.insertAllColumn(smsLog);
        return smsLog;
    }

    @Override
    public List<SysSmsLogEntity> queryList(Map<String, Object> map) {
        return smsLogDao.queryList(map);
    }
}
