package com.jzkj.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.sys.entity.SysUserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统用户
 *
 * @author
 * @email
 * @date
 */
public interface SysUserDao extends BaseMapper<SysUserEntity> {

	/**
	 * 查询用户的所有权限
	 * @param userId  用户ID
	 */
	List<String> queryAllPerms(@Param("userId") Long userId);

	/**
	 * 查询用户的所有菜单ID
	 */
	List<String> queryAllMenuId(@Param("userId") Long userId);

}
