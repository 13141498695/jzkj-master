package com.jzkj.miservice.entity.devices;

import java.io.Serializable;
import java.util.Date;

public class DeviceEntity implements Serializable {
    /**
     * 设备唯一标识
     */
    private String deviceId;

    /**
     * 设备类型：0智能调压器1.采集仪
     */
    private Integer deviceType;

    /**
     * 1使用2.停用
     */
    private Integer deviceStatus;

    /**
     * DTU编号
     */
    private String deviceDtuid;

    /**
     * 选择模型（数据类型记录表）
     */
    private String sysDeviceModelllist;

    /**
     * 路信息外键
     */
    private String deviceRoadId;

    /**
     * 系统展示名称
     */
    private String deviceSysname;

    /**
     * sim卡编号
     */
    private String deviceSim;

    /**
     * 生成的表名
     */
    private String deviceDatatablename;

    /**
     * 负责人手机号
     */
    private String devicePicPhone;

    /**
     * 负责人邮箱
     */
    private String devicePicEmail;

    /**
     * 负责人微信
     */
    private String devicePicWeixin;

    /**
     * 硬件生成唯一编码
     */
    private String deviceUniqueno;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否删除 -1：已删除  0：正常
     */
    private Byte delFlag;

    /**
     * sys_device
     */
    private static final long serialVersionUID = 1L;

    /**
     * 设备唯一标识
     * @return device_id 设备唯一标识
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设备唯一标识
     * @param deviceId 设备唯一标识
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    /**
     * 设备类型：0智能调压器1.采集仪
     * @return device_type 设备类型：0智能调压器1.采集仪
     */
    public Integer getDeviceType() {
        return deviceType;
    }

    /**
     * 设备类型：0智能调压器1.采集仪
     * @param deviceType 设备类型：0智能调压器1.采集仪
     */
    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 1使用2.停用
     * @return device_status 1使用2.停用
     */
    public Integer getDeviceStatus() {
        return deviceStatus;
    }

    /**
     * 1使用2.停用
     * @param deviceStatus 1使用2.停用
     */
    public void setDeviceStatus(Integer deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    /**
     * DTU编号
     * @return device_dtuid DTU编号
     */
    public String getDeviceDtuid() {
        return deviceDtuid;
    }

    /**
     * DTU编号
     * @param deviceDtuid DTU编号
     */
    public void setDeviceDtuid(String deviceDtuid) {
        this.deviceDtuid = deviceDtuid == null ? null : deviceDtuid.trim();
    }

    /**
     * 选择模型（数据类型记录表）
     * @return sys_device_modelLlist 选择模型（数据类型记录表）
     */
    public String getSysDeviceModelllist() {
        return sysDeviceModelllist;
    }

    /**
     * 选择模型（数据类型记录表）
     * @param sysDeviceModelllist 选择模型（数据类型记录表）
     */
    public void setSysDeviceModelllist(String sysDeviceModelllist) {
        this.sysDeviceModelllist = sysDeviceModelllist == null ? null : sysDeviceModelllist.trim();
    }

    /**
     * 路信息外键
     * @return device_road_id 路信息外键
     */
    public String getDeviceRoadId() {
        return deviceRoadId;
    }

    /**
     * 路信息外键
     * @param deviceRoadId 路信息外键
     */
    public void setDeviceRoadId(String deviceRoadId) {
        this.deviceRoadId = deviceRoadId == null ? null : deviceRoadId.trim();
    }

    /**
     * 系统展示名称
     * @return device_sysname 系统展示名称
     */
    public String getDeviceSysname() {
        return deviceSysname;
    }

    /**
     * 系统展示名称
     * @param deviceSysname 系统展示名称
     */
    public void setDeviceSysname(String deviceSysname) {
        this.deviceSysname = deviceSysname == null ? null : deviceSysname.trim();
    }

    /**
     * sim卡编号
     * @return device_sim sim卡编号
     */
    public String getDeviceSim() {
        return deviceSim;
    }

    /**
     * sim卡编号
     * @param deviceSim sim卡编号
     */
    public void setDeviceSim(String deviceSim) {
        this.deviceSim = deviceSim == null ? null : deviceSim.trim();
    }

    /**
     * 生成的表名
     * @return device_datatableName 生成的表名
     */
    public String getDeviceDatatablename() {
        return deviceDatatablename;
    }

    /**
     * 生成的表名
     * @param deviceDatatablename 生成的表名
     */
    public void setDeviceDatatablename(String deviceDatatablename) {
        this.deviceDatatablename = deviceDatatablename == null ? null : deviceDatatablename.trim();
    }

    /**
     * 负责人手机号
     * @return device_pic_phone 负责人手机号
     */
    public String getDevicePicPhone() {
        return devicePicPhone;
    }

    /**
     * 负责人手机号
     * @param devicePicPhone 负责人手机号
     */
    public void setDevicePicPhone(String devicePicPhone) {
        this.devicePicPhone = devicePicPhone == null ? null : devicePicPhone.trim();
    }

    /**
     * 负责人邮箱
     * @return device_pic_email 负责人邮箱
     */
    public String getDevicePicEmail() {
        return devicePicEmail;
    }

    /**
     * 负责人邮箱
     * @param devicePicEmail 负责人邮箱
     */
    public void setDevicePicEmail(String devicePicEmail) {
        this.devicePicEmail = devicePicEmail == null ? null : devicePicEmail.trim();
    }

    /**
     * 负责人微信
     * @return device_pic_weixin 负责人微信
     */
    public String getDevicePicWeixin() {
        return devicePicWeixin;
    }

    /**
     * 负责人微信
     * @param devicePicWeixin 负责人微信
     */
    public void setDevicePicWeixin(String devicePicWeixin) {
        this.devicePicWeixin = devicePicWeixin == null ? null : devicePicWeixin.trim();
    }

    /**
     * 硬件生成唯一编码
     * @return device_uniqueNo 硬件生成唯一编码
     */
    public String getDeviceUniqueno() {
        return deviceUniqueno;
    }

    /**
     * 硬件生成唯一编码
     * @param deviceUniqueno 硬件生成唯一编码
     */
    public void setDeviceUniqueno(String deviceUniqueno) {
        this.deviceUniqueno = deviceUniqueno == null ? null : deviceUniqueno.trim();
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
     * 是否删除 -1：已删除  0：正常
     * @return del_flag 是否删除 -1：已删除  0：正常
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * 是否删除 -1：已删除  0：正常
     * @param delFlag 是否删除 -1：已删除  0：正常
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}