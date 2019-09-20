package com.jzkj.miservice.entity.product;

import java.io.Serializable;
import java.util.Date;

public class RoadEntityView implements Serializable {
    /**
     * 唯一标识
     */
    private String roadId;

    /**
     * 路名称
     */
    private String roadName;

    /**
     * 路描述
     */
    private String roadDesc;

    /**
     * 箱子外键
     */
    private String roadBoxId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    private Byte delFlag;

    /**
     * sys_road
     */
    private static final long serialVersionUID = 1L;

    /**
     * 唯一标识
     * @return road_id 唯一标识
     */
    public String getRoadId() {
        return roadId;
    }

    /**
     * 唯一标识
     * @param roadId 唯一标识
     */
    public void setRoadId(String roadId) {
        this.roadId = roadId == null ? null : roadId.trim();
    }

    /**
     * 路名称
     * @return road_name 路名称
     */
    public String getRoadName() {
        return roadName;
    }

    /**
     * 路名称
     * @param roadName 路名称
     */
    public void setRoadName(String roadName) {
        this.roadName = roadName == null ? null : roadName.trim();
    }

    /**
     * 路描述
     * @return road_desc 路描述
     */
    public String getRoadDesc() {
        return roadDesc;
    }

    /**
     * 路描述
     * @param roadDesc 路描述
     */
    public void setRoadDesc(String roadDesc) {
        this.roadDesc = roadDesc == null ? null : roadDesc.trim();
    }

    /**
     * 箱子外键
     * @return road_box_id 箱子外键
     */
    public String getRoadBoxId() {
        return roadBoxId;
    }

    /**
     * 箱子外键
     * @param roadBoxId 箱子外键
     */
    public void setRoadBoxId(String roadBoxId) {
        this.roadBoxId = roadBoxId == null ? null : roadBoxId.trim();
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
    
    private String boxName;

	public String getBoxName() {
		return boxName;
	}

	public void setBoxName(String boxName) {
		this.boxName = boxName;
	}
    
}