package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.OrderGoodsEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-13 10:41:09
 */
public interface OrderGoodsDao extends BaseMapper<OrderGoodsEntity> {

    OrderGoodsEntity queryObject(Integer id);

    List<OrderGoodsEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(OrderGoodsEntity orderGoods);

    void deleteBatch(Integer[] ids);
}
