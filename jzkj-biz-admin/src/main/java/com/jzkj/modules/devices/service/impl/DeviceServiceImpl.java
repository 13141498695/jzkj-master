package com.jzkj.modules.devices.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.jzkj.common.utils.Query;
import com.jzkj.modules.devices.dao.DeviceDao;
import com.jzkj.modules.devices.dao.DeviceModelRelationDao;
import com.jzkj.modules.devices.service.DeviceService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.miservice.entity.devices.DeviceEntity;
import com.jzkj.miservice.entity.devices.DeviceEntityExample;
import com.jzkj.miservice.entity.devices.DeviceModelRelationEntityExample;
import com.github.pagehelper.PageHelper;
@Service("DeviceService")
public class DeviceServiceImpl  implements DeviceService {
	@Resource
	private DeviceDao deviceDao;
	
	@Resource
	private DeviceModelRelationDao deviceModelRelationDao;

	@Override
	public int save(DeviceEntity device) {
		return deviceDao.insert(device);
	}

	@Override
	public int update(DeviceEntity device) {
		DeviceEntityExample example = new DeviceEntityExample();
		DeviceEntityExample.Criteria criteria = example.createCriteria();
		criteria.andDeviceIdEqualTo(device.getDeviceId());	
		return deviceDao.updateByExample(device, example);
	}

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		String deviceName = (String)params.get("deviceName");
		Page<DeviceEntity> page = new Query<DeviceEntity>(params).getPage();
		
        PageHelper.startPage(page.getCurrent(), page.getSize()); 

        DeviceEntityExample example = new DeviceEntityExample();
        DeviceEntityExample.Criteria criteria= example.createCriteria();
        if(StringUtils.isNotBlank(deviceName)){
            criteria.andDeviceSysnameLike("%"+deviceName+"%");
		}
         //定义查
        Byte delflg=-1;
        criteria.andDelFlagNotEqualTo(delflg);
        List<DeviceEntity> allItems = deviceDao.selectByExample(example);
        long total = deviceDao.countByExample(example);        
        page.setTotal((int)total);
        page.setRecords(allItems);
        return new PageUtils(page);
	}

	@Override
	public void deleteBatchIds(List<String> asList) {
		DeviceEntityExample example = new DeviceEntityExample();
		DeviceEntityExample.Criteria criteria = example.createCriteria();
		criteria.andDeviceIdIn(asList);
		deviceDao.deleteByExample(example);
	}

	@Override
	public DeviceEntity selectById(String deviceId) {
		return deviceDao.selectByPrimaryKey(deviceId);
	}
	
	@Override
	public void delete(List<String> devicesId) {
		DeviceModelRelationEntityExample exampleDR=new DeviceModelRelationEntityExample();
		exampleDR.createCriteria().andDeviceIdIn(devicesId);
		deviceModelRelationDao.deleteByExample(exampleDR);
		
		DeviceEntityExample example = new DeviceEntityExample();
		DeviceEntityExample.Criteria criteria = example.createCriteria();
		criteria.andDeviceIdIn(devicesId);	
		DeviceEntity device=new DeviceEntity();
		device.setDelFlag((byte) -1);
		deviceDao.updateByExampleSelective(device,example);
	}

	@Override
	public int updateByRoadId(List<String> roadIds) {
		DeviceEntityExample example = new DeviceEntityExample();
		DeviceEntityExample.Criteria criteria = example.createCriteria();
		criteria.andDeviceRoadIdIn(roadIds);
		DeviceEntity deviceEntity=new DeviceEntity();
		deviceEntity.setDeviceRoadId("");
		return deviceDao.updateByExample(deviceEntity, example);
	}

}
