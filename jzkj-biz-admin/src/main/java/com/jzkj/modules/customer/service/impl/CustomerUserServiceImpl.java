package com.jzkj.modules.customer.service.impl;


import com.jzkj.modules.customer.dao.CustomerUserDao;
import com.jzkj.modules.customer.service.CustomerTokenService;
import com.jzkj.modules.customer.service.CustomerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.miservice.entity.customer.CustomerUserEntity;

@Service("customerUserService")
public class CustomerUserServiceImpl extends ServiceImpl<CustomerUserDao, CustomerUserEntity> implements CustomerUserService {
	@Autowired
	private CustomerTokenService tokenService;

	@Override
	public CustomerUserEntity queryByMobile(String mobile) {
		CustomerUserEntity userEntity = new CustomerUserEntity();
		userEntity.setMobile(mobile);
		return baseMapper.selectOne(userEntity);
	}

	

}
