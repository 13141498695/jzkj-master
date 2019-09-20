package com.jzkj.modules.product.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.github.pagehelper.PageHelper;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.Query;
import com.jzkj.miservice.entity.product.BoxEntity;
import com.jzkj.miservice.entity.product.BoxEntityExample;
import com.jzkj.modules.product.dao.BoxDao;
import com.jzkj.modules.product.service.BoxService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("boxService")
public class BoxServiceImpl implements BoxService {
	@Autowired
	private BoxDao boxDao;

	@Override
	public int save(BoxEntity box) {
		box.setBoxId(java.util.UUID.randomUUID().toString());
		return boxDao.insert(box);
	}

	@Override
	public int update(BoxEntity box) {
		BoxEntityExample example = new BoxEntityExample();
		BoxEntityExample.Criteria criteria = example.createCriteria();
		criteria.andBoxIdEqualTo(box.getBoxId());	
		return boxDao.updateByExample(box, example);
	}

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		String boxName = (String)params.get("boxName");
		Page<BoxEntity> page = new Query<BoxEntity>(params).getPage();
		
        PageHelper.startPage(page.getCurrent(), page.getSize()); 
        
        BoxEntityExample example = new BoxEntityExample();
        BoxEntityExample.Criteria criteria= example.createCriteria();
        if(StringUtils.isNotBlank(boxName)){
            criteria.andBoxNameLike("%"+boxName+"%");
		}
        //定义查询状态为0
        Byte delflg=-1;
        criteria.andDelFlagNotEqualTo(delflg);
        List<BoxEntity> allItems = boxDao.selectByExample(example);
        long total = boxDao.countByExample(example);        
        page.setTotal((int)total);
        page.setRecords(allItems);
        return new PageUtils(page);
	}

	@Override
	public void deleteBatchIds(List<String> asList) {
		BoxEntityExample example = new BoxEntityExample();
		BoxEntityExample.Criteria criteria = example.createCriteria();
		criteria.andBoxIdIn(asList);
		boxDao.deleteByExample(example);
	}

	@Override
	public BoxEntity selectById(String boxId) {
		return boxDao.selectByPrimaryKey(boxId);
	}

	@Override
	public List<BoxEntity> getAllBox() {
		BoxEntityExample example = new BoxEntityExample();
		BoxEntityExample.Criteria criteria = example.createCriteria();
		criteria.andDelFlagNotEqualTo((byte) -1);
		return boxDao.selectByExample(new BoxEntityExample());
	}

	@Override
	public void delete(List<String> boxIds) {		
		BoxEntityExample example = new BoxEntityExample();
		BoxEntityExample.Criteria criteria = example.createCriteria();
		criteria.andBoxIdIn(boxIds);
		BoxEntity road=new BoxEntity();
		road.setDelFlag((byte) -1);
		boxDao.updateByExampleSelective(road,example);
	}

}
