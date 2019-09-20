package com.jzkj.modules.sys.controller;


import com.jzkj.common.annotation.SysLog;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.common.validator.ValidatorUtils;
import com.jzkj.modules.sys.entity.SysSMSConfigEntity;
import com.jzkj.modules.sys.service.SysSMSConfigService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 系统配置信息
 *
 * @author
 * @email
 * @date
 */
@RestController
@RequestMapping("/syssms/config")
public class SysOldConfigController extends AbstractController {
	@Autowired
	private SysSMSConfigService sysConfigService;

	/**
	 * 所有配置列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:config:list")
	public ReturnResult list(@RequestParam Map<String, Object> params){
		PageUtils page = sysConfigService.queryPage(params);

		return ReturnResult.ok().put("page", page);
	}


	/**
	 * 配置信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("sys:config:info")
	public ReturnResult info(@PathVariable("id") Long id){
		SysSMSConfigEntity config = sysConfigService.selectById(id);

		return ReturnResult.ok().put("config", config);
	}

	/**
	 * 保存配置
	 */
	@SysLog("保存配置")
	@RequestMapping("/save")
	public ReturnResult save(@RequestBody SysSMSConfigEntity config){
		ValidatorUtils.validateEntity(config);

		sysConfigService.insertAllColumn(config);

		return ReturnResult.ok();
	}

	/**
	 * 修改配置
	 */
	@SysLog("修改配置")
	@RequestMapping("/update")
	@RequiresPermissions("sys:config:update")
	public ReturnResult update(@RequestBody SysSMSConfigEntity config){
		ValidatorUtils.validateEntity(config);

		sysConfigService.updateById(config);

		return ReturnResult.ok();
	}

	/**
	 * 删除配置
	 */
	@SysLog("删除配置")
	@RequestMapping("/delete")
	@RequiresPermissions("sys:config:delete")
	public ReturnResult delete(@RequestBody Long[] ids){
		sysConfigService.deleteBatchIds(Arrays.asList(ids));
		return ReturnResult.ok();
	}

}
