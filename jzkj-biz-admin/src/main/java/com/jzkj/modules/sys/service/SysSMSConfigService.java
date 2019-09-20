package com.jzkj.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.modules.sys.entity.SysSMSConfigEntity;

import java.util.List;
import java.util.Map;

/**
 * 系统配置信息
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2016年12月4日 下午6:49:01
 */
public interface SysSMSConfigService  extends IService<SysSMSConfigEntity> {



    PageUtils queryPage(Map<String, Object> params);
}
