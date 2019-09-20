package com.jzkj.modules.sys.entity;


import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 角色与公司对应关系

 */
@Data
@TableName("sys_role_dept")
public class SysRoleDeptEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@TableId
	private Long id;

	/**
	 * 角色ID
	 */
	@ApiModelProperty(value = "角色ID", name = "roleId")
	private Long roleId;

	/**
	 * 公司ID
	 */
	@ApiModelProperty(value = "公司ID", name = "deptId")
	private Long deptId;
}
