package com.jzkj.modules.cooperative.contoller;

import com.jzkj.common.annotation.SysLog;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.common.validator.ValidatorUtils;
import com.jzkj.modules.cooperative.entity.CooperativeEntity;
import com.jzkj.modules.cooperative.servlce.CooperativeServlce;
import com.jzkj.modules.farm.entity.SysFarmEntity;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;

@RestController
@RequestMapping("/sys/cooperative")
public class SysCooperativeController {
    @Resource
    private CooperativeServlce cooperativeServlce;

    /**
     * 树列表
     */
    @SysLog("树列表")
    @ApiOperation("果树列表")
    @RequestMapping("/list")
    public ReturnResult list(@RequestParam Map<String, Object> params){
        PageUtils page = cooperativeServlce.queryPage(params);
        return ReturnResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @SysLog("树列表单个")
    @ApiOperation("树列表单个")
    @PostMapping("/info/{cooperativeid}")
    public ReturnResult info(@PathVariable("cooperativeid")  Long cooperativeid){
        System.out.println("cooperativeid="+cooperativeid);
        CooperativeEntity cooperative = cooperativeServlce.selectById(cooperativeid);
        System.out.println("11"+cooperative.toString());
        return ReturnResult.ok().put("cooperative", cooperative);
    }

    /**
     * 保存
     */
    @SysLog("果树信息保存")
    @ApiOperation("果树信息保存")
    @PostMapping("/save")
    public ReturnResult save(@RequestBody CooperativeEntity dict){
        cooperativeServlce.insert(dict);
        return ReturnResult.ok();
    }

    /**
     * 修改
     */
    @SysLog("树修改单个")
    @ApiOperation("果树信息修改")
    @PostMapping("/update")
    public ReturnResult update(@RequestBody CooperativeEntity dict){
        ValidatorUtils.validateEntity(dict);
        cooperativeServlce.updateById(dict);
        return ReturnResult.ok();
    }

    /**
     * 删除
     */
    @SysLog("树删除单个")
    @ApiOperation("果树信息删除")
    @PostMapping("/delete")
    public ReturnResult delete(@RequestBody Long[] cooperativeid){
        cooperativeServlce.deleteBatchIds(Arrays.asList(cooperativeid));
        return ReturnResult.ok();
    }

}
