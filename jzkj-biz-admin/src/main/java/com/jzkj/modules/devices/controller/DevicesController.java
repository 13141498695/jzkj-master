package com.jzkj.modules.devices.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.jzkj.common.annotation.SysLog;
import com.jzkj.modules.devices.service.DeviceModelRelationService;
import com.jzkj.modules.devices.service.DeviceService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.common.validator.ValidatorUtils;
import com.jzkj.common.validator.group.AddGroup;
import com.jzkj.common.validator.group.UpdateGroup;
import com.jzkj.miservice.entity.devices.DeviceEntity;
import com.jzkj.miservice.entity.devices.DeviceEntityView;
import com.jzkj.miservice.entity.devices.DeviceModelRelationEntity;
import com.jzkj.miservice.entity.product.ModelEntity;
import com.jzkj.miservice.entity.product.RoadEntity;
import com.jzkj.modules.product.service.ModelService;
import com.jzkj.modules.product.service.RoadService;

@RestController
@RequestMapping("/devices/devices")
public class DevicesController {

	@Resource
	private DeviceService devicesService;
	
	@Resource
	private DeviceModelRelationService deviceModelRelationService;
	
	@Resource
	private ModelService modelService;
	
	@Resource
	private RoadService roadService;
	    
	  
	@RequestMapping("/list")
	public ReturnResult list(@RequestParam Map<String, Object> params){
		PageUtils page = devicesService.queryPage(params);
		
		List<DeviceEntityView> deviceEntitiesList =  new ArrayList<DeviceEntityView>();
		
		List<DeviceEntity> deviceEntities=(List<DeviceEntity>)page.getList();
		for (int i = 0; i < deviceEntities.size(); i++) {
			DeviceEntity deviceEntity=deviceEntities.get(i);
			DeviceEntityView deviceEntityView=new DeviceEntityView();
			deviceEntityView.setCreateTime(deviceEntity.getCreateTime());
			deviceEntityView.setDeviceDatatablename(deviceEntity.getDeviceDatatablename());
			deviceEntityView.setDeviceDtuid(deviceEntity.getDeviceDtuid());
			deviceEntityView.setDeviceId(deviceEntity.getDeviceId());
			deviceEntityView.setDevicePicEmail(deviceEntity.getDevicePicEmail());
			deviceEntityView.setDevicePicPhone(deviceEntity.getDevicePicPhone());
			deviceEntityView.setDevicePicWeixin(deviceEntity.getDevicePicWeixin());
			deviceEntityView.setDeviceRoadId(deviceEntity.getDeviceRoadId());
			deviceEntityView.setDeviceSim(deviceEntity.getDeviceSim());
			deviceEntityView.setDelFlag(deviceEntity.getDelFlag());
			deviceEntityView.setDeviceStatus(deviceEntity.getDeviceStatus());
			deviceEntityView.setDeviceSysname(deviceEntity.getDeviceSysname());
			deviceEntityView.setDeviceType(deviceEntity.getDeviceType());
			deviceEntityView.setDeviceUniqueno(deviceEntity.getDeviceUniqueno());
			deviceEntityView.setSysDeviceModelllist(deviceEntity.getSysDeviceModelllist());
			
			String roadId=deviceEntity.getDeviceRoadId();
			if(roadId!=null){
				RoadEntity roadEntity=roadService.selectById(roadId);
				if(roadEntity!=null){
					deviceEntityView.setRoadName(roadEntity.getRoadName());
				}
			}
			deviceEntitiesList.add(deviceEntityView);
		}

		page.setList(deviceEntitiesList);
		return ReturnResult.ok().put("page", page);
	}

	
	/**
	 * 路信息信息
	 */
	@RequestMapping("/info/{deviceId}")
	public ReturnResult info(@PathVariable("deviceId") String devicesId){
		DeviceEntity devices = devicesService.selectById(devicesId);

		List<String> modelEntities = deviceModelRelationService.getModelId(devicesId);
		
		//List<ModelEntity> list=modelService.selectmodellist();
		return ReturnResult.ok().put("devices", devices).put("models", modelEntities);//.put("modelList", list);
	}
	
	/**
	 * 保存路信息
	 */
	@SysLog("保存路信息")
	@RequestMapping("/save")
	public ReturnResult save(@RequestBody DeviceEntity devices){
		ValidatorUtils.validateEntity(devices, AddGroup.class);

		String id=java.util.UUID.randomUUID().toString();
		devices.setDeviceId(id);
		devices.setCreateTime(new Date());
		devices.setDelFlag((byte) 0);
		
		String sysDeviceModelllistStr=devices.getSysDeviceModelllist();
		StringBuilder sysDeviceModelllistB =  new StringBuilder();
		sysDeviceModelllistB.append("");
		
		String[] sysDeviceModelllistArr= sysDeviceModelllistStr.split(";");
		for (int i = 0; i < sysDeviceModelllistArr.length; i++) {
			String modeId=sysDeviceModelllistArr[i];
			if(modeId!=null){

				ModelEntity modelEntity=modelService.selectmodellist(modeId);
				DeviceModelRelationEntity deviceModelRelationEntity=new DeviceModelRelationEntity();
				String deviceModelId=java.util.UUID.randomUUID().toString();
				deviceModelRelationEntity.setDeviceId(id);
				deviceModelRelationEntity.setDeviceModelId(deviceModelId);
				deviceModelRelationEntity.setModelId(modelEntity.getModelId());
				deviceModelRelationService.save(deviceModelRelationEntity);
				sysDeviceModelllistB.append(modelEntity.getModelName()+";");
			}
		}
		devices.setSysDeviceModelllist(sysDeviceModelllistB.toString());
		devicesService.save(devices);
		
		return ReturnResult.ok();
	}
	
	/**
	 * 修改路信息
	 */
	@SysLog("修改路信息")
	@RequestMapping("/update")
	public ReturnResult update(@RequestBody DeviceEntity devices){
		ValidatorUtils.validateEntity(devices, UpdateGroup.class);
		
		String sysDeviceModelllistStr=devices.getSysDeviceModelllist();
		StringBuilder sysDeviceModelllistB =  new StringBuilder();
		sysDeviceModelllistB.append("");
		
		deviceModelRelationService.deleteByDeviceId(devices.getDeviceId());
		
		String[] sysDeviceModelllistArr= sysDeviceModelllistStr.split(";");
		for (int i = 0; i < sysDeviceModelllistArr.length; i++) {
			String modeId=sysDeviceModelllistArr[i];
			if(modeId!=null){

				ModelEntity modelEntity=modelService.selectmodellist(modeId);
				DeviceModelRelationEntity deviceModelRelationEntity=new DeviceModelRelationEntity();
				String deviceModelId=java.util.UUID.randomUUID().toString();
				deviceModelRelationEntity.setDeviceId(devices.getDeviceId());
				deviceModelRelationEntity.setDeviceModelId(deviceModelId);
				deviceModelRelationEntity.setModelId(modelEntity.getModelId());
				deviceModelRelationService.save(deviceModelRelationEntity);
				sysDeviceModelllistB.append(modelEntity.getModelName()+";");
			}
		}
		devices.setSysDeviceModelllist(sysDeviceModelllistB.toString());
		devicesService.update(devices);		
		return ReturnResult.ok();
	}
	
	/**
	 * 删除路信息
	 */
	@SysLog("删除路信息")
	@RequestMapping("/delete")
	public ReturnResult delete(@RequestBody String[] devicesIds){
		devicesService.delete(Arrays.asList(devicesIds));
		return ReturnResult.ok();
	}
	
}
