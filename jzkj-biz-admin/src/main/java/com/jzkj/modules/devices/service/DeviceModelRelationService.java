package com.jzkj.modules.devices.service;

import java.util.List;

import com.jzkj.miservice.entity.devices.DeviceModelRelationEntity;

public interface DeviceModelRelationService {

	List<String> getModelId(String devicesId);

	int save(DeviceModelRelationEntity deviceModelRelationEntity);

	int deleteByDeviceId(String deviceId);
	
	int deleteByModelId(String modelId);

}
