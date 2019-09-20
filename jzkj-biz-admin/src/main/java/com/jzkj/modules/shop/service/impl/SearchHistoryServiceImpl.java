package com.jzkj.modules.shop.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.SearchHistoryDao;
import com.jzkj.modules.shop.entity.SearchHistoryEntity;
import com.jzkj.modules.shop.service.SearchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("searchHistoryService")
public class SearchHistoryServiceImpl  extends ServiceImpl<SearchHistoryDao, SearchHistoryEntity> implements SearchHistoryService {
	@Autowired
	private SearchHistoryDao searchHistoryDao;
	
	@Override
	public SearchHistoryEntity queryObject(Integer id){
		return searchHistoryDao.queryObject(id);
	}
	
	@Override
	public List<SearchHistoryEntity> queryList(Map<String, Object> map){
		return searchHistoryDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return searchHistoryDao.queryTotal(map);
	}
	
	@Override
	public void save(SearchHistoryEntity searchHistory){
		searchHistoryDao.save(searchHistory);
	}
	
	@Override
	public void update(SearchHistoryEntity searchHistory){
		searchHistoryDao.updateById(searchHistory);
	}
	
	@Override
	public void delete(Integer id){
		searchHistoryDao.deleteById(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		searchHistoryDao.deleteBatch(ids);
	}
	
}
