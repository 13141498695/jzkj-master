package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.RelatedGoodsEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-13 10:41:09
 */
public interface RelatedGoodsDao extends BaseMapper<RelatedGoodsEntity> {

    RelatedGoodsEntity queryObject(Integer id);

    List<RelatedGoodsEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(RelatedGoodsEntity relatedGoods);

    void deleteBatch(Integer[] ids);
}
