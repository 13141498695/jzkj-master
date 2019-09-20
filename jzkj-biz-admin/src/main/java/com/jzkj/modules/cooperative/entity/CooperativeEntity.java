package com.jzkj.modules.cooperative.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.jzkj.common.validator.group.AddGroup;
import com.jzkj.common.validator.group.UpdateGroup;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@TableName("sys_cooperative")
public class CooperativeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 农村合作社
     */
    @TableId
    private long cooperativeid;

    @NotBlank(message="合作社名称不能为空", groups = {AddGroup.class, UpdateGroup.class})
    private String cooperativename;

    @NotBlank(message="合作社地址不能为空", groups = {AddGroup.class, UpdateGroup.class})
    @ApiModelProperty(value = "合作社地址", name = "cooperativeaddress")
    private String cooperativeaddress;


    @NotBlank(message="合合作社电话不能为空", groups = {AddGroup.class, UpdateGroup.class})
    private String cooperativephone;


    @NotBlank(message="合作社联系人能为空", groups = {AddGroup.class, UpdateGroup.class})
    private String cooperativelxr;


    @NotBlank(message="合作社联系人能为空", groups = {AddGroup.class, UpdateGroup.class})
    private String longitude;


    @NotBlank(message="合作社联系人能为空", groups = {AddGroup.class, UpdateGroup.class})
    private String latitude;


    private Long parentId;

    private Integer ordernum;

    @TableField(exist=false)
    private String parentName;

    private Integer delflag;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

}
