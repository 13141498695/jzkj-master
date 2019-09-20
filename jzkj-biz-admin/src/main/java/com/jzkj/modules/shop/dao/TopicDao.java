package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.TopicEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-20 14:10:08
 */
public interface TopicDao extends BaseMapper<TopicEntity> {

    TopicEntity queryObject(Integer id);

    List<TopicEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(TopicEntity topic);

    int deleteBatch(Integer[] ids);
}
