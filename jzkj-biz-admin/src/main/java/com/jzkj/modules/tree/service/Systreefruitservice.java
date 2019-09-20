package com.jzkj.modules.tree.service;

import com.baomidou.mybatisplus.service.IService;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.modules.sys.entity.SysFruitTreeEntity;

import java.util.Map;

public interface Systreefruitservice extends IService<SysFruitTreeEntity> {
    PageUtils queryPage(Map<String, Object> params);
}
