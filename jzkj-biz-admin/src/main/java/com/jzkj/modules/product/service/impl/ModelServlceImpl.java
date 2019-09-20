package com.jzkj.modules.product.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.github.pagehelper.PageHelper;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.Query;
import com.jzkj.miservice.entity.product.ModelEntity;
import com.jzkj.miservice.entity.product.ModelEntityExample;
import com.jzkj.modules.product.dao.ModelDao;
import com.jzkj.modules.product.service.ModelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("ModelService")
public class ModelServlceImpl implements ModelService {
	@Resource	
	private ModelDao modelDao;
	@Override
	public PageUtils queryPage(Map<String, Object> params) {
        String modelName = (String)params.get("modelName");
		Page<ModelEntity> page = new Query<ModelEntity>(params).getPage();
        PageHelper.startPage(page.getCurrent(), page.getSize());   
        
        ModelEntityExample example = new ModelEntityExample();
    	ModelEntityExample.Criteria criteria= example.createCriteria();
        if(modelName!=null){
        	criteria.andModelNameLike("%"+modelName+"%");
		}
        Byte delflag=0;
        criteria.andDelFlagEqualTo(delflag);
        List<ModelEntity> allItems = modelDao.selectByExample(example);
        long total = modelDao.countByExample(example);
        page.setTotal((int)total);
        page.setRecords(allItems);
        return new PageUtils(page);
        
        
      /*  BoxEntityExample example = new BoxEntityExample();
        if(StringUtils.isNotBlank(boxName)){
            BoxEntityExample.Criteria criteria= example.createCriteria();
            criteria.andBoxNameLike("%"+boxName+"%");
		}
        List<BoxEntity> allItems = boxDao.selectByExample(example);
        long total = boxDao.countByExample(example);   */
	}


	@Override
	public int save(ModelEntity model) {
		// TODO Auto-generated method stub
		return this.modelDao.insertSelective(model);
	}


	


	@Override
	public List<ModelEntity> selectmodellist() {
		// TODO Auto-generated method stub
		return this.modelDao.selectList();
	}

	@Override
	public void delete(String modelId) {
		this.modelDao.deleteByid(modelId);
	}


	@Override
	public int update(ModelEntity model) {
		
		return this.modelDao.updateByPrimaryKeySelective(model);
	}


	@Override
	public ModelEntity selectmodellist(String modelid) {
		return this.modelDao.selectByPrimaryKey(modelid);
	}


	


}
