package com.jzkj.miservice.entity.product;

import java.io.Serializable;
import java.util.Date;

public class ProductTypeBoxEntity implements Serializable {
    /**
     * 唯一标识
     */
    private String productTypeId;

    /**
     * 产品类型名称
     */
    private String productTypeName;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    private Byte delFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * sys_product_type
     */
    private static final long serialVersionUID = 1L;

    /**
     * 唯一标识
     * @return product_type_id 唯一标识
     */
    public String getProductTypeId() {
        return productTypeId;
    }

    /**
     * 唯一标识
     * @param productTypeId 唯一标识
     */
    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId == null ? null : productTypeId.trim();
    }

    /**
     * 产品类型名称
     * @return product_type_name 产品类型名称
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * 产品类型名称
     * @param productTypeName 产品类型名称
     */
    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName == null ? null : productTypeName.trim();
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

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}