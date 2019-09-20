package com.jzkj.modules.sys.service;


import com.baomidou.mybatisplus.service.IService;
import com.jzkj.modules.sys.entity.SysDeptEntity;

import java.util.List;
import java.util.Map;

/**
 * 公司管理
 */
public interface SysDeptService extends IService<SysDeptEntity> {

	List<SysDeptEntity> queryList(Map<String, Object> map);

	/**
	 * 查询子公司ID列表
	 * @param parentId  上级公司ID
	 */
	List<Long> queryDetpIdList(Long parentId);

	/**
	 * 获取子公司ID，用于数据过滤
	 */
	List<Long> getSubDeptIdList(Long deptId);

}
