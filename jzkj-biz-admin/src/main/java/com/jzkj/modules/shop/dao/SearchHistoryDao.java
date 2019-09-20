package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.SearchHistoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-13 10:41:10
 */
public interface SearchHistoryDao extends BaseMapper<SearchHistoryEntity> {

    SearchHistoryEntity queryObject(Integer id);

    List<SearchHistoryEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(SearchHistoryEntity searchHistory);

    void deleteBatch(Integer[] ids);
}
