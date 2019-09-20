package com.jzkj.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.entity.CategoryVo;

/**
 *
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-11 09:14:25
 */
public interface ApiCategoryMapper extends BaseMapper<CategoryVo> {

    CategoryVo queryObject(Integer id);
}
