package com.jzkj.modules.customer.service.impl;

import java.util.Date;
import java.util.UUID;

import com.jzkj.modules.customer.dao.CustomerTokenDao;
import com.jzkj.modules.customer.service.CustomerTokenService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.miservice.entity.customer.CustomerTokenEntity;


@Service("customerTokenService")
public class CustomerTokenServiceImpl extends ServiceImpl<CustomerTokenDao, CustomerTokenEntity> implements CustomerTokenService {
	/**
	 * 12小时后过期
	 */
	private final static int EXPIRE = 3600 * 12;

	@Override
	public CustomerTokenEntity queryByToken(String token) {
		return this.selectOne(new EntityWrapper<CustomerTokenEntity>().eq("token", token));
	}

	@Override
	public CustomerTokenEntity createToken(long userId) {
		//当前时间
		Date now = new Date();
		//过期时间
		Date expireTime = new Date(now.getTime() + EXPIRE * 1000);

		//生成token
		String token = generateToken();

		//保存或更新用户token
		CustomerTokenEntity tokenEntity = new CustomerTokenEntity();
		tokenEntity.setUserId(userId);
		tokenEntity.setToken(token);
		tokenEntity.setUpdateTime(now);
		tokenEntity.setExpireTime(expireTime);
		this.insertOrUpdate(tokenEntity);

		return tokenEntity;
	}

	@Override
	public void expireToken(long userId){
		Date now = new Date();
		CustomerTokenEntity tokenEntity = new CustomerTokenEntity();
		tokenEntity.setUserId(userId);
		tokenEntity.setUpdateTime(now);
		tokenEntity.setExpireTime(now);
		this.insertOrUpdate(tokenEntity);
	}

	private String generateToken(){
		return UUID.randomUUID().toString().replace("-", "");
	}
}
