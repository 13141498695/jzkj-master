package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.UserCouponEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-19 15:40:33
 */
public interface UserCouponDao extends BaseMapper<UserCouponEntity> {

    UserCouponEntity queryObject(Integer id);

    List<UserCouponEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(UserCouponEntity userCoupon);

    int deleteBatch(Integer[] ids);
}
