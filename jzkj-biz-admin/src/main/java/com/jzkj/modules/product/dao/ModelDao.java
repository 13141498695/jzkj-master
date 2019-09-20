package com.jzkj.modules.product.dao;

import com.jzkj.miservice.entity.product.ModelEntity;
import com.jzkj.miservice.entity.product.ModelEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ModelDao {
    long countByExample(ModelEntityExample example);

    int deleteByExample(ModelEntityExample example);

    int deleteByPrimaryKey(String modelId);

    int insert(ModelEntity record);

    int insertSelective(ModelEntity record);

    List<ModelEntity> selectByExample(ModelEntityExample example);

    ModelEntity selectByPrimaryKey(String modelId);

    int updateByExampleSelective(@Param("record") ModelEntity record, @Param("example") ModelEntityExample example);

    int updateByExample(@Param("record") ModelEntity record, @Param("example") ModelEntityExample example);

    int updateByPrimaryKeySelective(ModelEntity record);

    int updateByPrimaryKey(ModelEntity record);

	List<ModelEntity> selectList();

	void deleteByid(String modelId);

}