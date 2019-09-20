package com.jzkj.modules.shop.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.UserCouponDao;
import com.jzkj.modules.shop.entity.UserCouponEntity;
import com.jzkj.modules.shop.service.UserCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-19 15:40:33
 */
@Service("userCouponService")
public class UserCouponServiceImpl  extends ServiceImpl<UserCouponDao, UserCouponEntity> implements UserCouponService {
    @Autowired
    private UserCouponDao userCouponDao;

    @Override
    public UserCouponEntity queryObject(Integer id) {
        return userCouponDao.queryObject(id);
    }

    @Override
    public List<UserCouponEntity> queryList(Map<String, Object> map) {

        return userCouponDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return userCouponDao.queryTotal(map);
    }

    @Override
    public int save(UserCouponEntity userCoupon) {

        return userCouponDao.insert(userCoupon);
    }

    @Override
    public int update(UserCouponEntity userCoupon) {
        return userCouponDao.updateById(userCoupon);
    }

    @Override
    public int delete(Integer id) {
        return userCouponDao.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return userCouponDao.deleteBatch(ids);
    }
}
