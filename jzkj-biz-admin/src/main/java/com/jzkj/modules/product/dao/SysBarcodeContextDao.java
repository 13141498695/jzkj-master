package com.jzkj.modules.product.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.miservice.entity.SysBarcodeContext;
import com.jzkj.miservice.entity.SysBarcodeContextExample;
import com.jzkj.miservice.entity.product.ProductTypeBoxEntity;

import java.util.List;

public interface SysBarcodeContextDao extends BaseMapper<SysBarcodeContext>{

    SysBarcodeContext selectbyids(String id);

    void updateBarcode(SysBarcodeContext sysBarcodeContext);


    long countByExample(SysBarcodeContextExample example);

    List<SysBarcodeContext> selectByExample(SysBarcodeContextExample example);


    void deleteByPrimaryKey(String s);
}
