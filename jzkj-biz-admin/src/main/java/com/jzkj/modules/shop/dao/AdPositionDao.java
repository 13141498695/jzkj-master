package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.AdPositionEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-19 12:02:42
 */
public interface AdPositionDao  extends BaseMapper<AdPositionEntity> {

    int queryTotal(Map<String, Object> map);

    AdPositionEntity queryObject(Integer id);

    List<AdPositionEntity> queryList(Map<String, Object> map);

    int deleteBatch(Integer[] ids);
}
