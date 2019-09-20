package com.jzkj.modules.shop.controller;


import com.jzkj.common.platform.utils.PageUtils;
import com.jzkj.common.utils.Query;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.modules.shop.entity.AttributeCategoryEntity;
import com.jzkj.modules.shop.service.AttributeCategoryService;
import com.thoughtworks.xstream.mapper.Mapper;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static java.sql.JDBCType.NULL;

/**
 * Controller
 *
 * @author zhangbin
 * @email 1314149869@163.com
 * @date 2018-08-19 09:37:35
 */

@RestController
@RequestMapping("attributecategory")
public class AttributeCategoryController {
    @Autowired
    private AttributeCategoryService attributeCategoryService;

    /**
     * 查看列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("attributecategory:list")
    public ReturnResult list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);

        List<AttributeCategoryEntity> attributeCategoryList = attributeCategoryService.queryList(query);
        int total = attributeCategoryService.queryTotal(query);

      //  PageUtils pageUtil = new PageUtils(attributeCategoryList, total, query.getLimit(), query.getPage());

        return ReturnResult.ok().put("page", NULL);
    }


    /**
     * 查看信息
     */
    @RequestMapping("/info/{id}")
//    @RequiresPermissions("attributecategory:info")
    public ReturnResult info(@PathVariable("id") Integer id) {
        AttributeCategoryEntity attributeCategory = attributeCategoryService.queryObject(id);

        return ReturnResult.ok().put("attributeCategory", attributeCategory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
//    @RequiresPermissions("attributecategory:save")
    public ReturnResult save(@RequestBody AttributeCategoryEntity attributeCategory) {
        attributeCategoryService.save(attributeCategory);
        return ReturnResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
//    @RequiresPermissions("attributecategory:update")
    public ReturnResult update(@RequestBody AttributeCategoryEntity attributeCategory) {
        attributeCategoryService.update(attributeCategory);
        return ReturnResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
//    @RequiresPermissions("attributecategory:delete")
    public ReturnResult delete(@RequestBody Integer[] ids) {
        attributeCategoryService.deleteBatch(ids);
        return ReturnResult.ok();
    }

    /**
     * 查看所有列表
     */
    @RequestMapping("/queryAll")
    public ReturnResult qReturnResultueryAll(@RequestParam Map<String, Object> params) {

        List<AttributeCategoryEntity> list = attributeCategoryService.queryList(params);

        return ReturnResult.ok().put("list", list);
    }
}
