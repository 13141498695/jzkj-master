package com.jzkj.modules.shop.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.SpecificationDao;
import com.jzkj.modules.shop.entity.SpecificationEntity;
import com.jzkj.modules.shop.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("specificationService")
public class SpecificationServiceImpl  extends ServiceImpl<SpecificationDao, SpecificationEntity> implements SpecificationService {
	@Autowired
	private SpecificationDao specificationDao;
	
	@Override
	public SpecificationEntity queryObject(Integer id){
		return specificationDao.queryObject(id);
	}
	
	@Override
	public List<SpecificationEntity> queryList(Map<String, Object> map){
		return specificationDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return specificationDao.queryTotal(map);
	}
	
	@Override
	public void save(SpecificationEntity specification){
		specificationDao.save(specification);
	}
	
	@Override
	public void update(SpecificationEntity specification){
		specificationDao.updateById(specification);
	}
	
	@Override
	public void delete(Integer id){
		specificationDao.deleteById(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		specificationDao.deleteBatch(ids);
	}
	
}
