package com.jzkj.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.jzkj.modules.sys.entity.SysRoleDeptEntity;

import java.util.List;


/**
 * 角色与公司对应关系
 */
public interface SysRoleDeptService extends IService<SysRoleDeptEntity> {
	
	void saveOrUpdate(Long roleId, List<Long> deptIdList);
	
	/**
	 * 根据角色ID，获取公司ID列表
	 */
	List<Long> queryDeptIdList(Long[] roleIds) ;

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
