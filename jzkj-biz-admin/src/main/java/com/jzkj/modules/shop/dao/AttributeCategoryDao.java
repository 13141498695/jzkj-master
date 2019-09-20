package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.AttributeCategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-17 16:13:27
 */
public interface AttributeCategoryDao extends BaseMapper<AttributeCategoryEntity> {

    AttributeCategoryEntity queryObject(Integer id);

    List<AttributeCategoryEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(AttributeCategoryEntity attributeCategory);

    int deleteBatch(Integer[] ids);
}
