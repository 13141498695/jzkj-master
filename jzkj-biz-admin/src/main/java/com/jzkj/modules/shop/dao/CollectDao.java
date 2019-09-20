package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.CollectEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-13 10:41:06
 */
public interface CollectDao extends BaseMapper<CollectEntity> {

    CollectEntity queryObject(Integer id);

    List<CollectEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(CollectEntity collect);

    void deleteBatch(Integer[] ids);
}
