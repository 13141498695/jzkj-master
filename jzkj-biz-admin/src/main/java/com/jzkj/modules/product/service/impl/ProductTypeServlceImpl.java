package com.jzkj.modules.product.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.github.pagehelper.PageHelper;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.Query;
import com.jzkj.miservice.entity.product.ProductTypeBoxEntity;
import com.jzkj.miservice.entity.product.ProductTypeBoxEntityExample;
import com.jzkj.modules.product.dao.ProductTypeBoxDao;
import com.jzkj.modules.product.service.ProduceTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("ProduceTypeService")
public class ProductTypeServlceImpl implements ProduceTypeService {
@Resource
private ProductTypeBoxDao producttypedao;
	
	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		/*
		 String productName = (String)params.get("productName");

			Page<ProductEntity> page = new Query<ProductEntity>(params).getPage();
	        PageHelper.startPage(page.getCurrent(), page.getSize());  
	        
	        ProductEntityExample example=new ProductEntityExample();
	        if(productName!=null){
	        	ProductEntityExample.Criteria  criteria=example.createCriteria();
	        	criteria.andProductNameLike("%"+productName+"%");
	        }
	        List<ProductEntity> allItems = productdao.selectByExample(example);
	        long total = productdao.countByExample(example);
	        
	        System.out.println("total:"+total);
	        page.setTotal((int)total);
	        page.setRecords(allItems);
	        return new PageUtils(page);*/
		String productTypeName = (String)params.get("productTypeName");
		Page<ProductTypeBoxEntity> page = new Query<ProductTypeBoxEntity>(params).getPage();
        PageHelper.startPage(page.getCurrent(), page.getSize()); 
        ProductTypeBoxEntityExample example =new ProductTypeBoxEntityExample();
    	ProductTypeBoxEntityExample.Criteria  criteria=example.createCriteria();

        if(productTypeName!=null){
        	criteria.andProductTypeNameLike("%"+productTypeName+"%");
        }
        Byte delflag=0;
        criteria.andDelFlagEqualTo(delflag);
        List<ProductTypeBoxEntity> allItems = producttypedao.selectByExample(example);
        long total = producttypedao.countByExample(example);

        page.setTotal((int)total);
        page.setRecords(allItems);
        return new PageUtils(page);
        
        
	}






	@Override
	public int delete(String productTypeId) {
		// TODO Auto-generated method stub
		return this.producttypedao.deleteByid(productTypeId);
	}

	@Override
	public int save(ProductTypeBoxEntity productTypeBoxEntity) {
		// TODO Auto-generated method stub
		return this.producttypedao.insertSelective(productTypeBoxEntity);
	}


	@Override
	public ProductTypeBoxEntity selectByid(String productTypeId) {
		// TODO Auto-generated method stub
		return this.producttypedao.selectByPrimaryKey(productTypeId);
	}






	






	@Override
	public int update(ProductTypeBoxEntity productTypeBoxEntity) {
		// TODO Auto-generated method stub
		return this.producttypedao.updateByPrimaryKeySelective(productTypeBoxEntity);
	}






	@Override
	public List<ProductTypeBoxEntity> seletecProductList() {
		// TODO Auto-generated method stub
		return this.producttypedao.selecProductList();
	}








	

}
