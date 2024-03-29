package com.jzkj.modules.oss.controller;

import com.google.gson.Gson;
import com.jzkj.common.exception.ResultException;
import com.jzkj.common.platform.validator.ValidatorUtils;
import com.jzkj.common.platform.validator.group.AliyunGroup;
import com.jzkj.common.platform.validator.group.QcloudGroup;
import com.jzkj.common.platform.validator.group.QiniuGroup;
import com.jzkj.common.utils.ConfigConstant;
import com.jzkj.common.utils.Constant;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.modules.oss.cloud.CloudStorageConfig;
import com.jzkj.modules.oss.cloud.OSSFactory;
import com.jzkj.modules.oss.entity.SysOssEntity;
import com.jzkj.modules.oss.service.SysOssService;
import com.jzkj.modules.sys.service.SysConfigService;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * 文件上传
 *
 * @author
 * @email
 * @date
 */
@RestController
@RequestMapping("sys/oss")
public class SysOssController {
	@Autowired
	private SysOssService sysOssService;
    @Autowired
    private SysConfigService sysConfigService;

    private final static String KEY = ConfigConstant.CLOUD_STORAGE_CONFIG_KEY;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:oss:all")
	public ReturnResult list(@RequestParam Map<String, Object> params){
		PageUtils page = sysOssService.queryPage(params);
		return ReturnResult.ok().put("page", page);
	}


    /**
     * 云存储配置信息
     */
    @RequestMapping("/config")
    @RequiresPermissions("sys:oss:all")
    public ReturnResult config(){
        CloudStorageConfig config = sysConfigService.getConfigObject(KEY, CloudStorageConfig.class);

        return ReturnResult.ok().put("config", config);
    }


	/**
	 * 保存云存储配置信息
	 */
	@RequestMapping("/saveConfig")
	@RequiresPermissions("sys:oss:all")
	public ReturnResult saveConfig(@RequestBody CloudStorageConfig config){
		//校验类型
		ValidatorUtils.validateEntity(config);

		if(config.getType() == Constant.CloudService.QINIU.getValue()){
			//校验七牛数据
			ValidatorUtils.validateEntity(config, QiniuGroup.class);
		}else if(config.getType() == Constant.CloudService.ALIYUN.getValue()){
			//校验阿里云数据
			ValidatorUtils.validateEntity(config, AliyunGroup.class);
		}else if(config.getType() == Constant.CloudService.QCLOUD.getValue()){
			//校验腾讯云数据
			ValidatorUtils.validateEntity(config, QcloudGroup.class);
		}

        sysConfigService.updateValueByKey(KEY, new Gson().toJson(config));

		return ReturnResult.ok();
	}


	/**
	 * 上传文件
	 */
	@RequestMapping("/upload")
	@RequiresPermissions("sys:oss:all")
	public ReturnResult upload(@RequestParam("file") MultipartFile file) throws Exception {
		if (file.isEmpty()) {
			throw new ResultException("上传文件不能为空");
		}
		//上传文件
		String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String url = OSSFactory.build().uploadSuffix(file.getBytes(), suffix);
		//保存文件信息
		SysOssEntity ossEntity = new SysOssEntity();
		ossEntity.setUrl(url);
		ossEntity.setCreateDate(new Date());
		sysOssService.insert(ossEntity);

		return ReturnResult.ok().put("url", url);
	}


	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("sys:oss:all")
	public ReturnResult delete(@RequestBody Long[] ids){
		sysOssService.deleteBatchIds(Arrays.asList(ids));

		return ReturnResult.ok();
	}

}
