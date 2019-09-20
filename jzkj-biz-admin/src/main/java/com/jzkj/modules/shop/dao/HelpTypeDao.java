package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.HelpTypeEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2018-11-07 10:09:54
 */
public interface HelpTypeDao extends BaseMapper<HelpTypeEntity> {

    HelpTypeEntity queryObject(Integer id);

    List<HelpTypeEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(HelpTypeEntity helpType);

    int deleteBatch(Integer[] ids);
}
