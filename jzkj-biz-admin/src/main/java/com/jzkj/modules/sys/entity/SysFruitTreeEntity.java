package com.jzkj.modules.sys.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@TableName("sys_tree")
@Data
public class SysFruitTreeEntity implements Serializable {
    /**
     * 获取 果树ID，0
     */
    @TableId
    private String treeId;
    /**
     * 获取 果树名称，0
     */
    @NotBlank(message="果树名称不能为空")
    private String treename;
    /**
     * 果树描述，
     */
    @NotBlank(message="果树描述不能为空")
    private String treeContext;
    /**
     * 果树图片，
     */
    private String treeImages;
    /**
     * 果树视频，
     */
    private String treeVedio;
    /**
     * 果树经度，
     */
    @NotBlank(message="果树经度不能为空")
    private String treeLongitude;
    /**
     * 果树纬度，
     */
    @NotBlank(message="果树纬度不能为空")
    private String treeLatitude;

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
