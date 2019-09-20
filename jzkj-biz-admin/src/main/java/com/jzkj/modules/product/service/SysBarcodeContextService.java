package com.jzkj.modules.product.service;


import com.baomidou.mybatisplus.service.IService;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.miservice.entity.SysBarcodeContext;
import com.jzkj.miservice.entity.product.ProductEntity;

import java.util.Map;

public interface SysBarcodeContextService extends IService<SysBarcodeContext>{

    PageUtils queryPage(Map<String, Object> params);


    void updateBarcode(SysBarcodeContext sysBarcodeContext);

    void deleteByPrimaryKey(String s);

    SysBarcodeContext selectByids(String id);

    void deleteByIdids(String[] barcodeId);
}
