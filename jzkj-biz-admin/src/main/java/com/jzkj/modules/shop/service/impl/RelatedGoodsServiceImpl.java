package com.jzkj.modules.shop.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.RelatedGoodsDao;
import com.jzkj.modules.shop.entity.RelatedGoodsEntity;
import com.jzkj.modules.shop.service.RelatedGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("relatedGoodsService")
public class RelatedGoodsServiceImpl  extends ServiceImpl<RelatedGoodsDao, RelatedGoodsEntity> implements RelatedGoodsService {
	@Autowired
	private RelatedGoodsDao relatedGoodsDao;
	
	@Override
	public RelatedGoodsEntity queryObject(Integer id){
		return relatedGoodsDao.queryObject(id);
	}
	
	@Override
	public List<RelatedGoodsEntity> queryList(Map<String, Object> map){
		return relatedGoodsDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return relatedGoodsDao.queryTotal(map);
	}
	
	@Override
	public void save(RelatedGoodsEntity relatedGoods){
		relatedGoodsDao.save(relatedGoods);
	}
	
	@Override
	public void update(RelatedGoodsEntity relatedGoods){
		relatedGoodsDao.updateById(relatedGoods);
	}
	
	@Override
	public void delete(Integer id){
		relatedGoodsDao.deleteById(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		relatedGoodsDao.deleteBatch(ids);
	}
	
}
