package com.jzkj.modules.customer.service;

import com.baomidou.mybatisplus.service.IService;
import com.jzkj.miservice.entity.customer.CustomerTokenEntity;

/**
 * APP Token
 */
public interface CustomerTokenService extends IService<CustomerTokenEntity> {

	CustomerTokenEntity queryByToken(String token);

	/**
	 * 生成token
	 * @param userId  用户ID
	 * @return        返回token信息
	 */
	CustomerTokenEntity createToken(long userId);

	/**
	 * 设置token过期
	 * @param userId 用户ID
	 */
	void expireToken(long userId);

}
