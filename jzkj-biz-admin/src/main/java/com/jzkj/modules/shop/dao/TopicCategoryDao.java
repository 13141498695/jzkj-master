package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.TopicCategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-20 15:41:56
 */
public interface TopicCategoryDao extends BaseMapper<TopicCategoryEntity> {

    TopicCategoryEntity queryObject(Integer id);

    List<TopicCategoryEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(TopicCategoryEntity topicCategory);

    int deleteBatch(Integer[] ids);
}
