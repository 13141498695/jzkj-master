package com.jzkj.modules.farm.controller;

import com.jzkj.common.annotation.SysLog;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.common.validator.ValidatorUtils;
import com.jzkj.modules.farm.entity.SysFarmEntity;
import com.jzkj.modules.farm.service.SysFarmingServlce;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * 农户相关
 *
 * @author 张宾
 * @controlelr
 * @Email 13141498685@163.com
 */
@RestController
@RequestMapping("/sys/farming")
public class SysFarmingController {
    @Resource
    private SysFarmingServlce sysFarmingServlce;


    /**
     *  * 农户相关
     */
    @SysLog("农户相关")
    @RequestMapping("/list")
    @ApiOperation("农户相关")
    public ReturnResult list(@RequestParam Map<String, Object> params){
        PageUtils page = sysFarmingServlce.queryPage(params);
        return ReturnResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @SysLog("树列表单个")
    @ApiOperation("农户单个信息查询")
    @PostMapping("/info/{farmingId}")
//    @RequiresPermissions("sys:SysFarmEntity:info")
    public ReturnResult info(@PathVariable("farmingId") Long farmingId){
        SysFarmEntity farm = sysFarmingServlce.selectById(farmingId);
        return ReturnResult.ok().put("farm", farm);
    }

    /**
     * 保存
     */
    @SysLog("农户信息保存")
    @ApiOperation("农户信息保存")
    @PostMapping("/save")
//    @RequiresPermissions("sys:SysFarmEntity:save")
    public ReturnResult save(@RequestBody SysFarmEntity dict){
        //校验类型
         ValidatorUtils.validateEntity(dict);
        dict.setCreateTime(new Date());
        sysFarmingServlce.insert(dict);

        return ReturnResult.ok();
    }

    /**
     * 修改
     */
    @SysLog("农户修改单个")
    @ApiOperation("农户修改")
    @PostMapping("/update")
//    @RequiresPermissions("sys:SysFarmEntity:update")
    public ReturnResult update(@RequestBody SysFarmEntity dict){
        //校验类型
        ValidatorUtils.validateEntity(dict);
        dict.setUpdateTime(new Date());
        sysFarmingServlce.updateById(dict);
        return ReturnResult.ok();
    }
    /**
     * 删除
     */
    @SysLog("农户信息删除")
    @PostMapping("/delete")
    @ApiOperation("农户信息删除")
//    @RequiresPermissions("sys:dict:delete")
    public ReturnResult delete(@RequestBody Long[] ids){
        sysFarmingServlce.deleteBatchIds(Arrays.asList(ids));
        return ReturnResult.ok();
    }

}
