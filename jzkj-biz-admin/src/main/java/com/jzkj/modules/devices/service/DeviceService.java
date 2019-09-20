package com.jzkj.modules.devices.service;

import java.util.List;
import java.util.Map;

import com.jzkj.common.utils.PageUtils;
import com.jzkj.miservice.entity.devices.DeviceEntity;

public interface DeviceService {

	int save(DeviceEntity box);

	int update(DeviceEntity box);

	PageUtils queryPage(Map<String, Object> params);

	void deleteBatchIds(List<String> asList);

	DeviceEntity selectById(String boxId);
	
	void delete(List<String> devicesIds);

	int updateByRoadId(List<String> asList);

}
