package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.SpecificationEntity;

import java.util.List;
import java.util.Map;

/**
 * 规格表
 * 
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-13 10:41:10
 */
public interface SpecificationDao extends BaseMapper<SpecificationEntity> {

    SpecificationEntity queryObject(Integer id);

    int queryTotal(Map<String, Object> map);

    void save(SpecificationEntity specification);

    void deleteBatch(Integer[] ids);

    List<SpecificationEntity> queryList(Map<String, Object> map);
}
