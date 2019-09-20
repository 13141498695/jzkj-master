package com.jzkj.modules.shop.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.FootprintDao;
import com.jzkj.modules.shop.entity.FootprintEntity;
import com.jzkj.modules.shop.service.FootprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("footprintService")
public class FootprintServiceImpl  extends ServiceImpl<FootprintDao, FootprintEntity> implements FootprintService {
	@Autowired
	private FootprintDao footprintDao;
	
	@Override
	public FootprintEntity queryObject(Integer id){
		return footprintDao.queryObject(id);
	}
	
	@Override
	public List<FootprintEntity> queryList(Map<String, Object> map){
		return footprintDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return footprintDao.queryTotal(map);
	}
	
	@Override
	public void save(FootprintEntity footprint){
		footprintDao.save(footprint);
	}
	
	@Override
	public void update(FootprintEntity footprint){
		footprintDao.updateById(footprint);
	}
	
	@Override
	public void delete(Integer id){
		footprintDao.deleteById(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		footprintDao.deleteBatch(ids);
	}
	
}
