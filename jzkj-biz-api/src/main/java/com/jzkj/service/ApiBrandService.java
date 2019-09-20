package com.jzkj.service;

import com.jzkj.dao.ApiBrandMapper;
import com.jzkj.entity.BrandVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class ApiBrandService {
	@Autowired
	private ApiBrandMapper brandDao;


	public BrandVo queryObject(Integer id){
		return brandDao.queryObject(id);
	}


	public List<BrandVo> queryList(Map<String, Object> map){
		return brandDao.queryList(map);
	}


	public int queryTotal(Map<String, Object> map){
		return brandDao.queryTotal(map);
	}


	public void save(BrandVo brand){
		brandDao.insert(brand);
	}


	public void update(BrandVo brand){
		brandDao.updateById(brand);
	}


	public void delete(Integer id){
		brandDao.deleteById(id);
	}


	public void deleteBatch(Integer[] ids){
		//brandDao.deleteBatch(ids);
	}

}
