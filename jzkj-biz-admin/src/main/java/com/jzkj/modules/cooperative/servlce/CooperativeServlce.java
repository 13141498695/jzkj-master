package com.jzkj.modules.cooperative.servlce;

import com.baomidou.mybatisplus.service.IService;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.modules.cooperative.entity.CooperativeEntity;

import java.util.Map;

public interface CooperativeServlce extends IService<CooperativeEntity> {
    PageUtils queryPage(Map<String, Object> params);
}
