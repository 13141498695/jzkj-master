package com.com.jzkj.miservice.entity.product.mapper;



import com.com.jzkj.miservice.entity.Barcode.SysBarcode;
import com.com.jzkj.miservice.entity.Barcode.SysBarcodeExample;

import java.util.List;

public interface SysBarcodeMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysBarcode record);

    int insertSelective(SysBarcode record);

//    List<SysBarcode> selectByExamplele(SysBarcodßeExample example);

    SysBarcode selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysBarcode record);

    int updateByPrimaryKey(SysBarcode record);
}