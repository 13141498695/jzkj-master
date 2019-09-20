package com.jzkj.miservice.entityVo.devices;




import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 * @author luozhenqing
 * @email luozhenqing@xgjgas.com
 * @date 2019-01-10 13:55:39
 */
@TableName("sys_device")
public class DeviceEntityVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 设备唯一标识
	 */
	@TableId
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
	private Date createtime;

	/**
	 * 设置：设备唯一标识
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	/**
	 * 获取：设备唯一标识
	 */
	public String getDeviceId() {
		return deviceId;
	}
	/**
	 * 设置：设备类型：0智能调压器1.采集仪
	 */
	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
	}
	/**
	 * 获取：设备类型：0智能调压器1.采集仪
	 */
	public Integer getDeviceType() {
		return deviceType;
	}
	/**
	 * 设置：1使用2.停用
	 */
	public void setDeviceStatus(Integer deviceStatus) {
		this.deviceStatus = deviceStatus;
	}
	/**
	 * 获取：1使用2.停用
	 */
	public Integer getDeviceStatus() {
		return deviceStatus;
	}
	/**
	 * 设置：DTU编号
	 */
	public void setDeviceDtuid(String deviceDtuid) {
		this.deviceDtuid = deviceDtuid;
	}
	/**
	 * 获取：DTU编号
	 */
	public String getDeviceDtuid() {
		return deviceDtuid;
	}
	/**
	 * 设置：选择模型（数据类型记录表）
	 */
	public void setSysDeviceModelllist(String sysDeviceModelllist) {
		this.sysDeviceModelllist = sysDeviceModelllist;
	}
	/**
	 * 获取：选择模型（数据类型记录表）
	 */
	public String getSysDeviceModelllist() {
		return sysDeviceModelllist;
	}
	/**
	 * 设置：路信息外键
	 */
	public void setDeviceRoadId(String deviceRoadId) {
		this.deviceRoadId = deviceRoadId;
	}
	/**
	 * 获取：路信息外键
	 */
	public String getDeviceRoadId() {
		return deviceRoadId;
	}
	/**
	 * 设置：系统展示名称
	 */
	public void setDeviceSysname(String deviceSysname) {
		this.deviceSysname = deviceSysname;
	}
	/**
	 * 获取：系统展示名称
	 */
	public String getDeviceSysname() {
		return deviceSysname;
	}
	/**
	 * 设置：sim卡编号
	 */
	public void setDeviceSim(String deviceSim) {
		this.deviceSim = deviceSim;
	}
	/**
	 * 获取：sim卡编号
	 */
	public String getDeviceSim() {
		return deviceSim;
	}
	/**
	 * 设置：生成的表名
	 */
	public void setDeviceDatatablename(String deviceDatatablename) {
		this.deviceDatatablename = deviceDatatablename;
	}
	/**
	 * 获取：生成的表名
	 */
	public String getDeviceDatatablename() {
		return deviceDatatablename;
	}
	/**
	 * 设置：负责人手机号
	 */
	public void setDevicePicPhone(String devicePicPhone) {
		this.devicePicPhone = devicePicPhone;
	}
	/**
	 * 获取：负责人手机号
	 */
	public String getDevicePicPhone() {
		return devicePicPhone;
	}
	/**
	 * 设置：负责人邮箱
	 */
	public void setDevicePicEmail(String devicePicEmail) {
		this.devicePicEmail = devicePicEmail;
	}
	/**
	 * 获取：负责人邮箱
	 */
	public String getDevicePicEmail() {
		return devicePicEmail;
	}
	/**
	 * 设置：负责人微信
	 */
	public void setDevicePicWeixin(String devicePicWeixin) {
		this.devicePicWeixin = devicePicWeixin;
	}
	/**
	 * 获取：负责人微信
	 */
	public String getDevicePicWeixin() {
		return devicePicWeixin;
	}
	/**
	 * 设置：硬件生成唯一编码
	 */
	public void setDeviceUniqueno(String deviceUniqueno) {
		this.deviceUniqueno = deviceUniqueno;
	}
	/**
	 * 获取：硬件生成唯一编码
	 */
	public String getDeviceUniqueno() {
		return deviceUniqueno;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreatetime() {
		return createtime;
	}
}
