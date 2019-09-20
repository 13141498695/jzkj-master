package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.BrandEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-19 17:59:15
 */
public interface BrandDao extends BaseMapper<BrandEntity> {

    BrandEntity queryObject(Integer id);

    List<BrandEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(BrandEntity brand);

    int deleteBatch(Integer[] ids);
}
