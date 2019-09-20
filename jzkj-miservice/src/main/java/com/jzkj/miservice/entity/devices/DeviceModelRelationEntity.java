package com.jzkj.miservice.entity.devices;

import java.io.Serializable;

public class DeviceModelRelationEntity implements Serializable {
    /**
     * 唯一id
     */
    private String deviceModelId;

    /**
     * 模型关联id
     */
    private String modelId;

    /**
     * 设备关联id(就是采集仪)
     */
    private String deviceId;

    /**
     * sys_device_model_relation
     */
    private static final long serialVersionUID = 1L;

    /**
     * 唯一id
     * @return device_model_id 唯一id
     */
    public String getDeviceModelId() {
        return deviceModelId;
    }

    /**
     * 唯一id
     * @param deviceModelId 唯一id
     */
    public void setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId == null ? null : deviceModelId.trim();
    }

    /**
     * 模型关联id
     * @return model_id 模型关联id
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * 模型关联id
     * @param modelId 模型关联id
     */
    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    /**
     * 设备关联id(就是采集仪)
     * @return device_id 设备关联id(就是采集仪)
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设备关联id(就是采集仪)
     * @param deviceId 设备关联id(就是采集仪)
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }
}