package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.FootprintEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-13 10:41:08
 */
public interface FootprintDao extends BaseMapper<FootprintEntity> {

    FootprintEntity queryObject(Integer id);

    List<FootprintEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(FootprintEntity footprint);

    void deleteBatch(Integer[] ids);
}
