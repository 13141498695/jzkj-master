package com.jzkj.modules.shop.controller;


import com.jzkj.common.platform.utils.Query;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.modules.shop.entity.AddressEntity;
import com.jzkj.modules.shop.service.AddressService;
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
@RequestMapping("address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    /**
     * 查看列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("address:list")
    public ReturnResult list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);

        List<AddressEntity> addressList = addressService.queryList(query);
        int total = addressService.queryTotal(query);

        PageUtils pageUtil = new PageUtils(addressList, total, query.getLimit(), query.getPage());

        return ReturnResult.ok().put("page", pageUtil);
    }


    /**
     * 查看信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("address:info")
    public ReturnResult info(@PathVariable("id") Integer id) {
        AddressEntity address = addressService.queryObject(id);

        return ReturnResult.ok().put("address", address);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("address:save")
    public ReturnResult save(@RequestBody AddressEntity address) {
        addressService.save(address);

        return ReturnResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("address:update")
    public ReturnResult update(@RequestBody AddressEntity address) {
        addressService.update(address);

        return ReturnResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("address:delete")
    public ReturnResult delete(@RequestBody Integer[] ids) {
        addressService.deleteBatch(ids);

        return ReturnResult.ok();
    }
}
