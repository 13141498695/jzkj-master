package com.jzkj.miservice.entity.product;

import java.io.Serializable;
import java.util.Date;

public class ModelEntity implements Serializable {
    /**
     * 唯一
     */
    private String modelId;

    /**
     * 模型名称
     */
    private String modelName;

    /**
     * 模型标识
     */
    private String modelIdentification;

    /**
     * 数据类型
     */
    private String modelDatatype;

    /**
     * 取值范围
     */
    private String modelSpam;

    /**
     * 单位
     */
    private String modelUnit;

    /**
     * 读写类型：0读写1只读
     */
    private Integer modelReadorwrite;

    /**
     * 模型描述
     */
    private String modelDesc;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    private Byte delFlag;

    /**
     * sys_model
     */
    private static final long serialVersionUID = 1L;

    /**
     * 唯一
     * @return model_id 唯一
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * 唯一
     * @param modelId 唯一
     */
    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    /**
     * 模型名称
     * @return model_name 模型名称
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * 模型名称
     * @param modelName 模型名称
     */
    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    /**
     * 模型标识
     * @return model_identification 模型标识
     */
    public String getModelIdentification() {
        return modelIdentification;
    }

    /**
     * 模型标识
     * @param modelIdentification 模型标识
     */
    public void setModelIdentification(String modelIdentification) {
        this.modelIdentification = modelIdentification == null ? null : modelIdentification.trim();
    }

    /**
     * 数据类型
     * @return model_datatype 数据类型
     */
    public String getModelDatatype() {
        return modelDatatype;
    }

    /**
     * 数据类型
     * @param modelDatatype 数据类型
     */
    public void setModelDatatype(String modelDatatype) {
        this.modelDatatype = modelDatatype == null ? null : modelDatatype.trim();
    }

    /**
     * 取值范围
     * @return model_spam 取值范围
     */
    public String getModelSpam() {
        return modelSpam;
    }

    /**
     * 取值范围
     * @param modelSpam 取值范围
     */
    public void setModelSpam(String modelSpam) {
        this.modelSpam = modelSpam == null ? null : modelSpam.trim();
    }

    /**
     * 单位
     * @return model_unit 单位
     */
    public String getModelUnit() {
        return modelUnit;
    }

    /**
     * 单位
     * @param modelUnit 单位
     */
    public void setModelUnit(String modelUnit) {
        this.modelUnit = modelUnit == null ? null : modelUnit.trim();
    }

    /**
     * 读写类型：0读写1只读
     * @return model_readorwrite 读写类型：0读写1只读
     */
    public Integer getModelReadorwrite() {
        return modelReadorwrite;
    }

    /**
     * 读写类型：0读写1只读
     * @param modelReadorwrite 读写类型：0读写1只读
     */
    public void setModelReadorwrite(Integer modelReadorwrite) {
        this.modelReadorwrite = modelReadorwrite;
    }

    /**
     * 模型描述
     * @return model_desc 模型描述
     */
    public String getModelDesc() {
        return modelDesc;
    }

    /**
     * 模型描述
     * @param modelDesc 模型描述
     */
    public void setModelDesc(String modelDesc) {
        this.modelDesc = modelDesc == null ? null : modelDesc.trim();
    }

    /**
     * 创建时间
     * @return createtime 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 创建时间
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 是否删除  -1：已删除  0：正常
     * @return del_flag 是否删除  -1：已删除  0：正常
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * 是否删除  -1：已删除  0：正常
     * @param delFlag 是否删除  -1：已删除  0：正常
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}