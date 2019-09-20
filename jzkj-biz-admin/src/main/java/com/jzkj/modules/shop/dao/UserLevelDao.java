package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.UserLevelEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-16 16:52:22
 */
public interface UserLevelDao extends BaseMapper<UserLevelEntity> {

    UserLevelEntity queryObject(Integer id);

    List<UserLevelEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(UserLevelEntity userLevel);

    int deleteBatch(Integer[] ids);
}
