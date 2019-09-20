package com.jzkj.modules.product.dao;

import com.jzkj.miservice.entity.product.ProductEntity;
import com.jzkj.miservice.entity.product.ProductEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {
    long countByExample(ProductEntityExample example);

    int deleteByExample(ProductEntityExample example);

    int deleteByPrimaryKey(String productid);

    int insert(ProductEntity record);

    int insertSelective(ProductEntity record);

    List<ProductEntity> selectByExample(ProductEntityExample example);

    ProductEntity selectByPrimaryKey(String productid);

    int updateByExampleSelective(@Param("record") ProductEntity record, @Param("example") ProductEntityExample example);

    int updateByExample(@Param("record") ProductEntity record, @Param("example") ProductEntityExample example);

    int updateByPrimaryKeySelective(ProductEntity record);

    int updateByPrimaryKey(ProductEntity record);

	List<ProductEntity> productlist();

	int updatedelflag(String productId);

	int deleteByid(String productiId);

    ProductEntity selectLastEntity();

    ProductEntity selectByPrimaryKeyId(String productId);
}