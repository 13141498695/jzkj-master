package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.CartEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-13 10:41:06
 */
public interface CartDao extends BaseMapper<CartEntity> {

    CartEntity queryObject(Integer id);

    List<CartEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(CartEntity cart);

    void deleteBatch(Integer[] ids);
}
