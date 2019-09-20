package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.ChannelEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-22 19:19:56
 */
public interface ChannelDao extends BaseMapper<ChannelEntity> {

    ChannelEntity queryObject(Integer id);

    List<ChannelEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(ChannelEntity channel);

    int deleteBatch(Integer[] ids);
}
