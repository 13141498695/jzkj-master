package com.jzkj.modules.product.service;

import com.baomidou.mybatisplus.service.IService;
import com.com.jzkj.miservice.entity.Barcode.SysBarcode;
import com.jzkj.common.utils.PageUtils;

import java.util.Map;

public interface BarCodeService extends  IService<SysBarcode>{
    PageUtils queryPage(Map<String, Object> params);

    void deleteByids(int i);
}
