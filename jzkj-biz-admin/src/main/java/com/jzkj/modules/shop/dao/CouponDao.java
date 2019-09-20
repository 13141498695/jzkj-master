package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.CouponEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-19 12:53:26
 */
public interface CouponDao extends BaseMapper<CouponEntity> {

    int deleteBatch(Integer[] ids);

    int save(CouponEntity coupon);

    int queryTotal(Map<String, Object> map);

    List<CouponEntity> queryList(Map<String, Object> map);

    CouponEntity queryObject(Integer id);
}
