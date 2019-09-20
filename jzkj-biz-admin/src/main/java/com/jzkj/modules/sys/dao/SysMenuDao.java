package com.jzkj.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.sys.entity.SysMenuEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 菜单管理
 *
 * @author
 * @email
 * @date
 */
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {

	/**
	 * 根据父菜单，查询子菜单
	 * @param parentId 父菜单ID
	 */
	List<SysMenuEntity> queryListParentId(@Param("parentId") Long parentId);

	/**
	 * 获取不包含按钮的菜单列表
	 */
	List<SysMenuEntity> queryNotButtonList();

	String queryMaxIdByParentId(@Param("parentId") long parentId);
}
