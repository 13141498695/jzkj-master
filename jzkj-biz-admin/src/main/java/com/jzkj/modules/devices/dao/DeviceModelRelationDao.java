package com.jzkj.modules.devices.dao;

import com.jzkj.miservice.entity.devices.DeviceModelRelationEntity;
import com.jzkj.miservice.entity.devices.DeviceModelRelationEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceModelRelationDao {
	
    long countByExample(DeviceModelRelationEntityExample example);

    
    
    int deleteByExample(DeviceModelRelationEntityExample example);

    
    
    int deleteByPrimaryKey(String deviceModelId);

    int insert(DeviceModelRelationEntity record);

    int insertSelective(DeviceModelRelationEntity record);

    List<DeviceModelRelationEntity> selectByExample(DeviceModelRelationEntityExample example);

    DeviceModelRelationEntity selectByPrimaryKey(String deviceModelId);

    int updateByExampleSelective(@Param("record") DeviceModelRelationEntity record, @Param("example") DeviceModelRelationEntityExample example);

    int updateByExample(@Param("record") DeviceModelRelationEntity record, @Param("example") DeviceModelRelationEntityExample example);

    int updateByPrimaryKeySelective(DeviceModelRelationEntity record);

    int updateByPrimaryKey(DeviceModelRelationEntity record);
}