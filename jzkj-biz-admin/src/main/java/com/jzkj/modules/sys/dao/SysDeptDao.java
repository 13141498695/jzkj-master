package com.jzkj.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.sys.entity.SysDeptEntity;

import java.util.List;

/**
 * 公司管理
 * 
 * @author 
 * @email 
 * @date 2017-06-20 15:23:47
 */
public interface SysDeptDao extends BaseMapper<SysDeptEntity> {

    /**
     * 查询子公司ID列表
     * @param parentId  上级公司ID
     */
    List<Long> queryDetpIdList(Long parentId);
 
   
}
