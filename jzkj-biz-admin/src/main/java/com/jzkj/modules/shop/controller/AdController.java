package com.jzkj.modules.shop.controller;


import com.jzkj.common.platform.annotation.SysLog;
import com.jzkj.common.platform.utils.Query;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.modules.shop.entity.AdEntity;
import com.jzkj.modules.shop.service.AdService;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Controller
 *
 * @author zhangbin
 * @email 1314149869@163.com
 * @date 2018-08-19 09:37:35
 */
@RestController
@RequestMapping("ad")
public class AdController {
    @Autowired
    private AdService adService;

    /**
     * 查看列表
     */
    @SysLog("广告列表")
    @ApiOperation("广告列表")
    @PostMapping("/list")
    @RequiresPermissions("ad:list")
    public ReturnResult list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);

    List<AdEntity> adList = adService.queryList(query);
        int total = adService.queryTotal(query);

        PageUtils pageUtil = new PageUtils(adList, total, query.getLimit(), query.getPage());

        return ReturnResult.ok().put("page", pageUtil);
    }


    /**
     * 查看信息
     */
    @SysLog("查看信息")
    @ApiOperation("查看信息")
    @PostMapping("/info/{id}")
    @RequiresPermissions("ad:info")
    public ReturnResult info(@PathVariable("id") Integer id) {
        AdEntity ad = adService.queryObject(id);

        return ReturnResult.ok().put("ad", ad);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("ad:save")
    public ReturnResult save(@RequestBody AdEntity ad) {
        adService.save(ad);

        return ReturnResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("ad:update")
    public ReturnResult update(@RequestBody AdEntity ad) {
        adService.update(ad);

        return ReturnResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("ad:delete")
    public ReturnResult delete(@RequestBody Integer[] ids) {
        adService.deleteBatch(ids);

        return ReturnResult.ok();
    }

    /**
     * 查看所有列表
     */
    @ApiOperation("查看所有列表")
    @PostMapping("/queryAll")
    public ReturnResult queryAll(@RequestParam Map<String, Object> params) {

        List<AdEntity> list = adService.queryList(params);

        return ReturnResult.ok().put("list", list);
    }
}
