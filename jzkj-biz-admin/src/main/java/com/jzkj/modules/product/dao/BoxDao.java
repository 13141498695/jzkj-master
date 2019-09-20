package com.jzkj.modules.product.dao;

import com.jzkj.miservice.entity.product.BoxEntity;
import com.jzkj.miservice.entity.product.BoxEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BoxDao {
    long countByExample(BoxEntityExample example);

    int deleteByExample(BoxEntityExample example);

    int deleteByPrimaryKey(String boxId);

    int insert(BoxEntity record);

    int insertSelective(BoxEntity record);

    List<BoxEntity> selectByExample(BoxEntityExample example);

    BoxEntity selectByPrimaryKey(String boxId);

    int updateByExampleSelective(@Param("record") BoxEntity record, @Param("example") BoxEntityExample example);

    int updateByExample(@Param("record") BoxEntity record, @Param("example") BoxEntityExample example);

    int updateByPrimaryKeySelective(BoxEntity record);

    int updateByPrimaryKey(BoxEntity record);
}