package com.jzkj.modules.customer.service;


import com.baomidou.mybatisplus.service.IService;
import com.jzkj.miservice.entity.customer.CustomerUserEntity;

/**
 * 用户 APP
 */
public interface CustomerUserService extends IService<CustomerUserEntity> {

	CustomerUserEntity queryByMobile(String mobile);

	
}
