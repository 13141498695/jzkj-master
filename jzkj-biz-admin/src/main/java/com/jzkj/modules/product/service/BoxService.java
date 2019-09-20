package com.jzkj.modules.product.service;

import com.jzkj.common.utils.PageUtils;
import com.jzkj.miservice.entity.product.BoxEntity;

import java.util.List;
import java.util.Map;


public interface BoxService {

	int save(BoxEntity box);

	int update(BoxEntity box);

	PageUtils queryPage(Map<String, Object> params);

	void deleteBatchIds(List<String> asList);

	BoxEntity selectById(String boxId);

	List<BoxEntity> getAllBox();

	void delete(List<String> boxIds);
}
