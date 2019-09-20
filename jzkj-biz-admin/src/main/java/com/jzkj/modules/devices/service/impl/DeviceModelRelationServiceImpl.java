package com.jzkj.modules.devices.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.jzkj.modules.devices.dao.DeviceModelRelationDao;
import com.jzkj.modules.devices.service.DeviceModelRelationService;
import com.jzkj.modules.product.dao.ModelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzkj.miservice.entity.devices.DeviceModelRelationEntity;
import com.jzkj.miservice.entity.devices.DeviceModelRelationEntityExample;
import com.jzkj.miservice.entity.product.ModelEntityExample;

@Service("deviceModelRelationService")
public class DeviceModelRelationServiceImpl implements DeviceModelRelationService {
	
	@Autowired
	private DeviceModelRelationDao deviceModelRelationDao;
	@Autowired
	private ModelDao modelDao;

	@Override
	public List<String> getModelId(String devicesId) {
		DeviceModelRelationEntityExample example = new DeviceModelRelationEntityExample();
		DeviceModelRelationEntityExample.Criteria criteria=example.createCriteria();
		criteria.andDeviceIdEqualTo(devicesId);
		List<DeviceModelRelationEntity> deviceModelRelationEntities=deviceModelRelationDao.selectByExample(example);
		
		List<String> list=new ArrayList<String>();
		for (int i = 0; i < deviceModelRelationEntities.size(); i++) {
			list.add(deviceModelRelationEntities.get(i).getModelId());
		}
		
		ModelEntityExample exampleModel = new ModelEntityExample();
		ModelEntityExample.Criteria criteriaModel=exampleModel.createCriteria();
		criteriaModel.andModelIdIn(list);//modelDao.selectByExample(exampleModel)
		return list;
	}

	@Override
	public int save(DeviceModelRelationEntity deviceModelRelationEntity) {
		return deviceModelRelationDao.insert(deviceModelRelationEntity);
	}

	@Override
	public int deleteByDeviceId(String deviceId) {
		DeviceModelRelationEntityExample example = new DeviceModelRelationEntityExample();
		DeviceModelRelationEntityExample.Criteria criteria=example.createCriteria();
		criteria.andDeviceIdEqualTo(deviceId);
		return deviceModelRelationDao.deleteByExample(example);
	}
	
	@Override
	public int deleteByModelId(String modelId) {
		DeviceModelRelationEntityExample example = new DeviceModelRelationEntityExample();
		DeviceModelRelationEntityExample.Criteria criteria=example.createCriteria();
		criteria.andModelIdEqualTo(modelId);
		return deviceModelRelationDao.deleteByExample(example);
	}

}
