package com.jzkj.modules.sys.service;


import com.baomidou.mybatisplus.service.IService;
import com.jzkj.modules.sys.entity.SysSmsLogEntity;

import java.util.List;
import java.util.Map;

/**
 * 发送短信日志Service
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-12-16 23:38:05
 */
public interface SysSmsLogService extends IService <SysSmsLogEntity>{

    /**
     * 发送短信
     *
     * @param smsLog
     * @return
     */
    SysSmsLogEntity sendSms(SysSmsLogEntity smsLog);

    List<SysSmsLogEntity> queryList(Map<String, Object> params);
}
