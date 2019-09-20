package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.AddressEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-16 17:22:46
 */
public interface AddressDao  extends BaseMapper<AddressEntity> {

    AddressEntity queryObject(Integer id);

    int deleteBatch(Integer[] ids);

    List<AddressEntity> queryList(Map<String, Object> map);

    int save(AddressEntity address);

    int queryTotal(Map<String, Object> map);
}
