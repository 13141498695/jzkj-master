package com.jzkj.modules.farm.service;

import com.baomidou.mybatisplus.service.IService;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.modules.farm.entity.SysFarmEntity;

import java.util.Map;
/**
 * 农户相关
 *
 * @author 张宾
 * @Dao
 * @Email 13141498685@163.com
 */
public interface SysFarmingServlce extends IService<SysFarmEntity> {
    PageUtils queryPage(Map<String, Object> params);
}
