package com.jzkj.modules.sys.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


/**
 * 公司管理
 *
 *
 */
@TableName("sys_dept")
@Data
public class SysDeptEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@TableId
	@ApiModelProperty(value = "公司ID", name = "userId")
	private Long deptId;


	@ApiModelProperty(value = "上级公司ID，一级公司为0", name = "parentId")
	private Long parentId;


	@ApiModelProperty(value = "公司名称，一级公司为0", name = "name")
	private String name;

	@ApiModelProperty(value = "上级公司名称", name = "name")
	@TableField(exist=false)
	private String parentName;
	//排序
	@ApiModelProperty(value = "排序", name = "orderNum")
	private Integer orderNum;

	@TableLogic
	@ApiModelProperty(value = "删除标志", name = "delFlag")

	private Integer delFlag;
	/**
	 * ztree属性
	 */
	@TableField(exist=false)
	private Boolean open;
	@TableField(exist=false)
	private List<?> list;

}
