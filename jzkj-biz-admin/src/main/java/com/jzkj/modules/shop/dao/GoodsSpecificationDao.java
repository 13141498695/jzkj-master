package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.GoodsSpecificationEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品对应规格表值表Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-31 11:15:55
 */
public interface GoodsSpecificationDao extends BaseMapper<GoodsSpecificationEntity> {

    GoodsSpecificationEntity queryObject(String goodsSpecificationId);

    List<GoodsSpecificationEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(GoodsSpecificationEntity goodsSpecification);

    int deleteBatch(Integer[] ids);
}
