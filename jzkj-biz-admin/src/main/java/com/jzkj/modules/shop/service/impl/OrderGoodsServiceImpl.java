package com.jzkj.modules.shop.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.OrderGoodsDao;
import com.jzkj.modules.shop.entity.OrderGoodsEntity;
import com.jzkj.modules.shop.service.OrderGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("orderGoodsService")
public class OrderGoodsServiceImpl  extends ServiceImpl<OrderGoodsDao, OrderGoodsEntity> implements OrderGoodsService {
	@Autowired
	private OrderGoodsDao orderGoodsDao;
	
	@Override
	public OrderGoodsEntity queryObject(Integer id){
		return orderGoodsDao.queryObject(id);
	}
	
	@Override
	public List<OrderGoodsEntity> queryList(Map<String, Object> map){
		return orderGoodsDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return orderGoodsDao.queryTotal(map);

	}
	
	@Override
	public void save(OrderGoodsEntity orderGoods){
		orderGoodsDao.save(orderGoods);
	}
	
	@Override
	public void update(OrderGoodsEntity orderGoods){
		orderGoodsDao.updateById(orderGoods);
	}
	
	@Override
	public void delete(Integer id){
		orderGoodsDao.deleteById(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		orderGoodsDao.deleteBatch(ids);
	}
	
}
