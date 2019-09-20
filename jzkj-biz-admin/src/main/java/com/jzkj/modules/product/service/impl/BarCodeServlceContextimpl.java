package com.jzkj.modules.product.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.jzkj.common.annotation.DataFilter;
import com.jzkj.common.utils.Constant;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.Query;

import com.jzkj.miservice.entity.SysBarcodeContext;
import com.jzkj.miservice.entity.SysBarcodeContextExample;
import com.jzkj.miservice.entity.product.ProductEntity;
import com.jzkj.miservice.entity.product.ProductTypeBoxEntity;
import com.jzkj.miservice.entity.product.ProductTypeBoxEntityExample;
import com.jzkj.modules.product.dao.SysBarcodeContextDao;
import com.jzkj.modules.product.dao.SysBarcodeDao;
import com.jzkj.modules.product.service.BarCodeService;
import com.jzkj.modules.product.service.SysBarcodeContextService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("BarCodeContextService")
public class BarCodeServlceContextimpl extends ServiceImpl<SysBarcodeContextDao, SysBarcodeContext> implements SysBarcodeContextService {
    @Resource
    private SysBarcodeContextDao sysBarcodeContextao;

    public PageUtils queryPage(Map<String, Object> params) {
        String productName = (String)params.get("productName");
        String barcodePici = (String)params.get("barcodePici");


        Page<SysBarcodeContext> page = new Query<SysBarcodeContext>(params).getPage();
        PageHelper.startPage(page.getCurrent(), page.getSize());
        SysBarcodeContextExample example =new SysBarcodeContextExample();
        SysBarcodeContextExample.Criteria  criteria=example.createCriteria();


        if(productName!=null){
            criteria.andProductNameLike("%"+productName+"%");
        }

        if(barcodePici!=null){
            criteria.andBarcodePiciLike("%"+barcodePici+"%");
        }

        List<SysBarcodeContext> allItems = sysBarcodeContextao.selectByExample(example);

        long total = sysBarcodeContextao.countByExample(example);

        page.setTotal((int)total);
        page.setRecords(allItems);
        return new PageUtils(page);


    }


    @Override
    public void updateBarcode(SysBarcodeContext sysBarcodeContext) {
        this.sysBarcodeContextao.updateBarcode(sysBarcodeContext);
    }

    @Override
    public void deleteByPrimaryKey(String s) {

    }


    @Override
    public SysBarcodeContext selectByids(String id) {

        return this.sysBarcodeContextao.selectbyids(id);
    }

    @Override
    public void deleteByIdids(String[] barcodeId) {
        for (int i=0;i<barcodeId.length;i++){
            this.sysBarcodeContextao.deleteByPrimaryKey(barcodeId[i]);


        }
    }




}
