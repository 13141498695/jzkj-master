package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.KeywordsEntity;

import java.util.List;
import java.util.Map;

/**
 * 热闹关键词表Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-25 21:23:41
 */
public interface KeywordsDao extends BaseMapper<KeywordsEntity> {

    KeywordsEntity queryObject(Integer id);

    List<KeywordsEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(KeywordsEntity keywords);

    int deleteBatch(Integer[] ids);
}
