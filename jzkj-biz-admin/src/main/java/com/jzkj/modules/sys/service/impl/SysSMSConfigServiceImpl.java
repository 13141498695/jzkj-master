package com.jzkj.modules.sys.service.impl;

import com.alibaba.fastjson.JSON;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.common.platform.utils.RRException;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.Query;
import com.jzkj.modules.sys.dao.SysSMSConfigDao;
import com.jzkj.modules.sys.entity.SysDictEntity;
import com.jzkj.modules.sys.entity.SysSMSConfigEntity;
import com.jzkj.modules.sys.service.SysSMSConfigService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("sysSMSConfigService")
public class SysSMSConfigServiceImpl  extends ServiceImpl<SysSMSConfigDao, SysSMSConfigEntity> implements SysSMSConfigService {
	@Autowired
	private SysSMSConfigDao sysConfigDao;

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		String name = (String)params.get("name");

		Page<SysSMSConfigEntity> page = this.selectPage(
				new Query<SysSMSConfigEntity>(params).getPage(),
				new EntityWrapper<SysSMSConfigEntity>()
						.like(StringUtils.isNotBlank(name),"name", name)
		);

		return new PageUtils(page);
	}
}
