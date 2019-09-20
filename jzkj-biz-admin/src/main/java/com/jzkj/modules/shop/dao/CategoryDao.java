package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-21 15:32:31
 */
public interface CategoryDao extends BaseMapper<CategoryEntity> {

    public int deleteByParentBatch(Object[] id);

    CategoryEntity queryObject(Integer id);

    List<CategoryEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int deleteBatch(Integer[] ids);
}
