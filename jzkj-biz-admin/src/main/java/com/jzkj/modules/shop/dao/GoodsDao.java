package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.GoodsEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-21 21:19:49
 */
public interface GoodsDao extends BaseMapper<GoodsEntity> {
    Integer queryMaxId();

    GoodsEntity queryObject(Integer id);

    List<GoodsEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(GoodsEntity goods);
}
