package com.jzkj.modules.tree.controller;

import com.jzkj.common.annotation.SysLog;
import com.jzkj.common.exception.ResultException;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.common.validator.ValidatorUtils;
import com.jzkj.modules.oss.cloud.OSSFactory;
import com.jzkj.modules.oss.entity.SysOssEntity;
import com.jzkj.modules.oss.service.SysOssService;
import com.jzkj.modules.sys.entity.SysFruitTreeEntity;
import com.jzkj.modules.sys.service.SysConfigService;
import com.jzkj.modules.tree.service.Systreefruitservice;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/sys/tree")
public class SysTreeController {
    @Resource
    private Systreefruitservice systreefruitservice;


    /**
     * 列表
     */
    @SysLog("果树列表")
    @ApiOperation("果树列表")
    @RequestMapping("/list")
//    @RequiresPermissions("sys:SysFruitTreeEntity:list")
    public ReturnResult list(@RequestParam Map<String, Object> params){
        PageUtils page = systreefruitservice.queryPage(params);

        return ReturnResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("农户信息")
    @SysLog("农户信息")
    @PostMapping("/info/{treeId}")
//    @RequiresPermissions("sys:SysFruitTreeEntity:info")
    public ReturnResult info(@PathVariable("treeId") Long treeId){
        SysFruitTreeEntity tree = systreefruitservice.selectById(treeId);
        return ReturnResult.ok().put("tree", tree);
    }

    /**
     * 保存
     */
    @SysLog("果树保存")
    @ApiOperation("果树保存")
    @PostMapping("/save")
    public ReturnResult save(@RequestBody SysFruitTreeEntity dict){
        //校验类型
        ValidatorUtils.validateEntity(dict);
        dict.setCreateTime(new Date());
        systreefruitservice.insert(dict);

        return ReturnResult.ok();
    }

    /**
     * 修改
     */
    @SysLog("果树修改")
    @ApiOperation("果树修改")
    @PostMapping("/update")
//    @RequiresPermissions("sys:SysFruitTreeEntity:update")
    public ReturnResult update(@RequestBody SysFruitTreeEntity dict){
        //校验类型
        ValidatorUtils.validateEntity(dict);

        systreefruitservice.updateById(dict);

        return ReturnResult.ok();
    }

    /**
     * 删除
     */
    @SysLog("果树删除")
    @ApiOperation("果树删除")
    @PostMapping("/delete")
//    @RequiresPermissions("sys:SysFruitTreeEntity:delete")
    public ReturnResult delete(@RequestBody Long[] ids){
        systreefruitservice.deleteBatchIds(Arrays.asList(ids));
        return ReturnResult.ok();
    }


}
