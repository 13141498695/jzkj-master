package com.jzkj.modules.devices.dao;

import com.jzkj.miservice.entity.devices.DeviceEntity;
import com.jzkj.miservice.entity.devices.DeviceEntityExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DeviceDao {
	
	
	
    long countByExample(DeviceEntityExample example);

    int deleteByExample(DeviceEntityExample example);

    int deleteByPrimaryKey(String deviceId);

    int insert(DeviceEntity record);

    int insertSelective(DeviceEntity record);

    List<DeviceEntity> selectByExample(DeviceEntityExample example);

    DeviceEntity selectByPrimaryKey(String deviceId);

    int updateByExampleSelective(@Param("record") DeviceEntity record, @Param("example") DeviceEntityExample example);

    int updateByExample(@Param("record") DeviceEntity record, @Param("example") DeviceEntityExample example);

    int updateByPrimaryKeySelective(DeviceEntity record);

    int updateByPrimaryKey(DeviceEntity record);

	List<DeviceEntity> selectlist();
}