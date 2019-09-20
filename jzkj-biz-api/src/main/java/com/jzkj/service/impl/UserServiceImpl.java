package com.jzkj.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.common.exception.ResultException;
import com.jzkj.common.validator.Assert;
import com.jzkj.dao.UserDao;
import com.jzkj.entity.TokenEntity;
import com.jzkj.entity.UserEntity;
import com.jzkj.form.LoginForm;
import com.jzkj.service.TokenService;
import com.jzkj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {
	@Autowired
	private TokenService tokenService;

	@Override
	public UserEntity queryByMobile(String mobile) {
		UserEntity userEntity = new UserEntity();
		userEntity.setMobile(mobile);
		return baseMapper.selectOne(userEntity);
	}

	@Override
	public Map<String, Object> login(LoginForm form) {
		UserEntity user = queryByMobile(form.getMobile());
		Assert.isNull(user, "手机号或密码错误");

		//密码错误
		if(!user.getPassword().equals(form.getPassword())){
			throw new ResultException("登录名或密码错误");
		}
		/*if(!user.getPassword().equals(DigestUtils.sha256Hex(form.getPassword()))){
			throw new ResultException("登录名或密码错误");
		}*/

		//获取登录token
		TokenEntity tokenEntity = tokenService.createToken(user.getUserId());

		Map<String, Object> map = new HashMap<>(2);
		map.put("token", tokenEntity.getToken());
		map.put("expire", tokenEntity.getExpireTime().getTime() - System.currentTimeMillis());

		return map;
	}

}
