package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.CouponGoodsEntity;

import java.util.List;
import java.util.Map;

/**
 * 优惠券关联商品Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-29 21:50:17
 */
public interface CouponGoodsDao extends BaseMapper<CouponGoodsEntity> {

    int save(CouponGoodsEntity couponGoodsVo);

    CouponGoodsEntity queryObject(Integer id);

    List<CouponGoodsEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int deleteBatch(Integer[] ids);
}
