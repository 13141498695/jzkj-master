package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.AttributeEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-17 16:48:17
 */
public interface AttributeDao extends BaseMapper<AttributeEntity> {

    AttributeEntity queryObject(Integer id);

    List<AttributeEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(AttributeEntity attribute);

    void deleteBatch(Integer[] ids);
}
