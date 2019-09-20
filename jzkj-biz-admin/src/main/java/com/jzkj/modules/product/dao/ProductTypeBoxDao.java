package com.jzkj.modules.product.dao;

import com.jzkj.miservice.entity.product.ProductTypeBoxEntity;
import com.jzkj.miservice.entity.product.ProductTypeBoxEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductTypeBoxDao {
    long countByExample(ProductTypeBoxEntityExample example);

    int deleteByExample(ProductTypeBoxEntityExample example);

    int deleteByPrimaryKey(String productTypeId);

    int insert(ProductTypeBoxEntity record);

    int insertSelective(ProductTypeBoxEntity record);

    List<ProductTypeBoxEntity> selectByExample(ProductTypeBoxEntityExample example);

    ProductTypeBoxEntity selectByPrimaryKey(String productTypeId);

    int updateByExampleSelective(@Param("record") ProductTypeBoxEntity record, @Param("example") ProductTypeBoxEntityExample example);

    int updateByExample(@Param("record") ProductTypeBoxEntity record, @Param("example") ProductTypeBoxEntityExample example);

    int updateByPrimaryKeySelective(ProductTypeBoxEntity record);

    int updateByPrimaryKey(ProductTypeBoxEntity record);

	int deleteByid(String productTypeId);

	List<ProductTypeBoxEntity> selecProductList();

}