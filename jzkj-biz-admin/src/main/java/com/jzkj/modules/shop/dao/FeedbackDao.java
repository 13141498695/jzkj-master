package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.FeedbackEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-23 15:03:25
 */
public interface FeedbackDao extends BaseMapper<FeedbackEntity> {

    FeedbackEntity queryObject(Integer msgId);

    List<FeedbackEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(FeedbackEntity feedback);

    int deleteBatch(Integer[] msgIds);
}
