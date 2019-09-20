package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.ShippingEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-09-04 21:42:24
 */
public interface ShippingDao extends BaseMapper<ShippingEntity> {

    ShippingEntity queryObject(Integer id);

    List<ShippingEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(ShippingEntity shipping);

    int deleteBatch(Integer[] ids);
}
