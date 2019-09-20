package com.com.jzkj.miservice.entity.product;

import java.io.Serializable;
import java.util.Date;

public class BoxEntity implements Serializable {
    /**
     * 箱子唯一id
     */
    private String boxId;

    /**
     * 箱子版本
     */
    private String boxVersion;

    /**
     * 所属工厂
     */
    private String boxFactory;

    /**
     * 所属公司
     */
    private String boxConpany;

    /**
     * 箱子地址
     */
    private String boxAddress;

    /**
     * 箱子名称
     */
    private String boxName;

    /**
     * 箱子联系 1自建2，代管
     */
    private Integer boxType;

    /**
     * 箱子图片
     */
    private String boxImage;

    /**
     * 工艺图 ，设计图
     */
    private String processDrawing;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    private Byte delFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * sys_box
     */
    private static final long serialVersionUID = 1L;

    /**
     * 箱子唯一id
     * @return box_id 箱子唯一id
     */
    public String getBoxId() {
        return boxId;
    }

    /**
     * 箱子唯一id
     * @param boxId 箱子唯一id
     */
    public void setBoxId(String boxId) {
        this.boxId = boxId == null ? null : boxId.trim();
    }

    /**
     * 箱子版本
     * @return box_version 箱子版本
     */
    public String getBoxVersion() {
        return boxVersion;
    }

    /**
     * 箱子版本
     * @param boxVersion 箱子版本
     */
    public void setBoxVersion(String boxVersion) {
        this.boxVersion = boxVersion == null ? null : boxVersion.trim();
    }

    /**
     * 所属工厂
     * @return box_factory 所属工厂
     */
    public String getBoxFactory() {
        return boxFactory;
    }

    /**
     * 所属工厂
     * @param boxFactory 所属工厂
     */
    public void setBoxFactory(String boxFactory) {
        this.boxFactory = boxFactory == null ? null : boxFactory.trim();
    }

    /**
     * 所属公司
     * @return box_conpany 所属公司
     */
    public String getBoxConpany() {
        return boxConpany;
    }

    /**
     * 所属公司
     * @param boxConpany 所属公司
     */
    public void setBoxConpany(String boxConpany) {
        this.boxConpany = boxConpany == null ? null : boxConpany.trim();
    }

    /**
     * 箱子地址
     * @return box_address 箱子地址
     */
    public String getBoxAddress() {
        return boxAddress;
    }

    /**
     * 箱子地址
     * @param boxAddress 箱子地址
     */
    public void setBoxAddress(String boxAddress) {
        this.boxAddress = boxAddress == null ? null : boxAddress.trim();
    }

    /**
     * 箱子名称
     * @return box_name 箱子名称
     */
    public String getBoxName() {
        return boxName;
    }

    /**
     * 箱子名称
     * @param boxName 箱子名称
     */
    public void setBoxName(String boxName) {
        this.boxName = boxName == null ? null : boxName.trim();
    }

    /**
     * 箱子联系 1自建2，代管
     * @return box_type 箱子联系 1自建2，代管
     */
    public Integer getBoxType() {
        return boxType;
    }

    /**
     * 箱子联系 1自建2，代管
     * @param boxType 箱子联系 1自建2，代管
     */
    public void setBoxType(Integer boxType) {
        this.boxType = boxType;
    }

    /**
     * 箱子图片
     * @return box_image 箱子图片
     */
    public String getBoxImage() {
        return boxImage;
    }

    /**
     * 箱子图片
     * @param boxImage 箱子图片
     */
    public void setBoxImage(String boxImage) {
        this.boxImage = boxImage == null ? null : boxImage.trim();
    }

    /**
     * 工艺图 ，设计图
     * @return process_drawing 工艺图 ，设计图
     */
    public String getProcessDrawing() {
        return processDrawing;
    }

    /**
     * 工艺图 ，设计图
     * @param processDrawing 工艺图 ，设计图
     */
    public void setProcessDrawing(String processDrawing) {
        this.processDrawing = processDrawing == null ? null : processDrawing.trim();
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