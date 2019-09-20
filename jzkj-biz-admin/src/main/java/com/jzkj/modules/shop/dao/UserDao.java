package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.UserEntity;

import java.util.List;
import java.util.Map;

/**
 * 会员Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-16 15:02:28
 */
public interface UserDao extends BaseMapper<UserEntity> {

    UserEntity queryObject(Integer id);

    List<UserEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(UserEntity user);

    int deleteBatch(Integer[] ids);
}
