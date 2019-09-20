package com.jzkj.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.entity.BrandVo;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-11 09:14:25
 */
public interface ApiBrandMapper extends BaseMapper<BrandVo> {

    BrandVo queryObject(Integer id);

    List<BrandVo> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);
}
