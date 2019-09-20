package com.jzkj.modules.product.service;

import com.jzkj.common.utils.PageUtils;
import com.jzkj.miservice.entity.product.RoadEntity;

import java.util.List;
import java.util.Map;


public interface RoadService {

	int save(RoadEntity road);

	int update(RoadEntity road);

	PageUtils queryPage(Map<String, Object> params);

	void deleteBatchIds(List<String> asList);

	RoadEntity selectById(String roadId);

	List<RoadEntity> getRoadByBoxId(String boxId);

	void delete(List<String> roadId);

	int updateByBoxId(List<String> boxIds);
}
