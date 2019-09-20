package com.jzkj.modules.product.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.github.pagehelper.PageHelper;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.Query;
import com.jzkj.miservice.entity.product.RoadEntity;
import com.jzkj.miservice.entity.product.RoadEntityExample;
import com.jzkj.modules.product.dao.RoadDao;
import com.jzkj.modules.product.service.RoadService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("roadService")
public class RoadServiceImpl implements RoadService{
	@Autowired
	private RoadDao roadDao;

	@Override
	public int save(RoadEntity road) {
		road.setRoadId(java.util.UUID.randomUUID().toString());
		return roadDao.insert(road);
	}

	@Override
	public int update(RoadEntity road) {
		RoadEntityExample example = new RoadEntityExample();
		RoadEntityExample.Criteria criteria = example.createCriteria();
		criteria.andRoadIdEqualTo(road.getRoadId());	
		return roadDao.updateByExample(road, example);
	}

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		String roadName = (String)params.get("roadName");
		Page<RoadEntity> page = new Query<RoadEntity>(params).getPage();
		
        PageHelper.startPage(page.getCurrent(), page.getSize()); 
        
        RoadEntityExample example = new RoadEntityExample();
        RoadEntityExample.Criteria criteria= example.createCriteria();

        if(StringUtils.isNotBlank(roadName)){
            criteria.andRoadNameLike("%"+roadName+"%");
		}
        //定义查询状态为0
        Byte delflg=-1;
        criteria.andDelFlagNotEqualTo(delflg);
        List<RoadEntity> allItems = roadDao.selectByExample(example);
        long total = roadDao.countByExample(example);        
        page.setTotal((int)total);
        page.setRecords(allItems);
        return new PageUtils(page);
	}

	@Override
	public void deleteBatchIds(List<String> asList) {
		RoadEntityExample example = new RoadEntityExample();
		RoadEntityExample.Criteria criteria = example.createCriteria();
		criteria.andRoadIdIn(asList);
		roadDao.deleteByExample(example);
	}

	@Override
	public RoadEntity selectById(String roadId) {
		return roadDao.selectByPrimaryKey(roadId);
	}

	@Override
	public List<RoadEntity> getRoadByBoxId(String boxId) {
		RoadEntityExample example = new RoadEntityExample();
		RoadEntityExample.Criteria criteria = example.createCriteria();
		criteria.andRoadBoxIdEqualTo(boxId);
		criteria.andDelFlagEqualTo((byte) 0);
		return roadDao.selectByExample(example);
	}

	@Override
	public void delete(List<String> roadIds) {
		RoadEntityExample example = new RoadEntityExample();
		RoadEntityExample.Criteria criteria = example.createCriteria();
		criteria.andRoadIdIn(roadIds);
		RoadEntity road=new RoadEntity();
		road.setDelFlag((byte) -1);
		roadDao.updateByExampleSelective(road,example);
	}

	@Override
	public int updateByBoxId(List<String> boxIds) {
		RoadEntityExample example = new RoadEntityExample();
		RoadEntityExample.Criteria criteria = example.createCriteria();
		criteria.andRoadBoxIdIn(boxIds);
		RoadEntity roadEntity=new RoadEntity();
		roadEntity.setRoadBoxId("");
		return roadDao.updateByExampleSelective(roadEntity, example);
	}

}
