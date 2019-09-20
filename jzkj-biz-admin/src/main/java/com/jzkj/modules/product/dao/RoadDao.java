package com.jzkj.modules.product.dao;

import com.jzkj.miservice.entity.product.RoadEntity;
import com.jzkj.miservice.entity.product.RoadEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoadDao {
    long countByExample(RoadEntityExample example);

    int deleteByExample(RoadEntityExample example);

    int deleteByPrimaryKey(String roadId);

    int insert(RoadEntity record);

    int insertSelective(RoadEntity record);

    List<RoadEntity> selectByExample(RoadEntityExample example);

    RoadEntity selectByPrimaryKey(String roadId);

    int updateByExampleSelective(@Param("record") RoadEntity record, @Param("example") RoadEntityExample example);

    int updateByExample(@Param("record") RoadEntity record, @Param("example") RoadEntityExample example);

    int updateByPrimaryKeySelective(RoadEntity record);

    int updateByPrimaryKey(RoadEntity record);
}