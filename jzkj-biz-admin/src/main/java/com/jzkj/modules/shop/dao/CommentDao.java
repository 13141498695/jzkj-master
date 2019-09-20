package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.CommentEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-28 17:03:40
 */
public interface CommentDao extends BaseMapper<CommentEntity> {

    CommentEntity queryObject(Integer id);

    List<CommentEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(CommentEntity comment);

    int deleteBatch(Integer[] ids);
}
