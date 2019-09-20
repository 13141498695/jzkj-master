package com.jzkj.modules.farm.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.jzkj.common.annotation.IdCard;
import com.jzkj.common.annotation.Phone;
import com.jzkj.common.validator.group.AddGroup;
import com.jzkj.common.validator.group.UpdateGroup;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
/**
 * 农户相关
 *
 * @author 张宾
 * @entity
 * @Email 13141498685@163.com
 */
@Data
@TableName("sys_farming")

public class   SysFarmEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 获取 果树名称，0
     * * */
    @TableId
    private long farmingId;
    /**
     * 获取 名称，0
     */
    @NotBlank(message="名称不能为空")
    private String farmingname;
    /**
     * 获取 果树名称，0
     */
    @NotBlank(message="电话号码不能为空")
    @Phone
    private String farmingPhone;
    /**
     * 果树证号码，
     */
    @NotBlank(message="身份证号码不能为空")
    @IdCard
    private String farmingCard;

    @NotBlank(message="邮箱不能为空")
    @Email(message="邮箱格式不正确")
    private String farmingEmail;
    /**
     * 获取 微信名称
     */
    private String farmingWx;

    private String farmingImage;
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
