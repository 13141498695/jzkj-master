package com.jzkj.modules.shop.controller;

import com.jzkj.common.platform.annotation.SysLog;
import com.jzkj.common.platform.utils.Query;
import com.jzkj.common.platform.utils.R;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.modules.shop.entity.UserEntity;
import com.jzkj.modules.shop.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Controller
 *
 * @author zhangbin
 * @email 939961241@qq.com
 * @date 2017-08-16 15:02:28
 */
@RestController
@RequestMapping("users")
public class UsersController {
    @Autowired
    private UserService userService;

    /**
     * 查看列表
     */
    @ApiOperation("会员查看所有列表")
    @PostMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);

        List<UserEntity> userList = userService.queryList(query);
        int total = userService.queryTotal(query);

        PageUtils pageUtil = new PageUtils(userList, total, query.getLimit(), query.getPage());

        System.out.println("数据"+pageUtil.getPageSize());
        return R.ok().put("page", pageUtil);
    }


    /**
     * 查看信息
     */
    @PostMapping("/info/{id}")
    @ApiOperation("会员查看所有列表")
//    @RequiresPermissions("user:info")
    public R info(@PathVariable("id") Integer id) {
        UserEntity user = userService.queryObject(id);

        return R.ok().put("user", user);
    }

    /**
     * 保存
     */
    @SysLog("会员提交")
    @ApiOperation("会员提交")
    @PostMapping("/save")
//    @RequiresPermissions("user:save")
    public R save(@RequestBody UserEntity user) {
        userService.save(user);

        return R.ok();
    }

    /**
     * 修改
     */
    @SysLog("update")
    @PostMapping("/update")
    @ApiOperation("会员查看所有列表")
    public R update(@RequestBody UserEntity user) {
        userService.update(user);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
//    @RequiresPermissions("user:delete")
    public R delete(@RequestBody Integer [] ids) {
        userService.deleteBatch(ids);

        return R.ok();
    }

    /**
     * 查看所有列表
     */
    @SysLog("查看所有会员")
    @ApiOperation("查看所有列表")
    @PostMapping("/queryAll")
    public R queryAll(@RequestParam Map<String, Object> params) {

        List<UserEntity> userList = userService.queryList(params);

        return R.ok().put("list", userList);
    }

    /**
     * 总计
     */
    @PostMapping("/queryTotal")
    @ApiOperation("导出会员")
    public R queryTotal(@RequestParam Map<String, Object> params) {
        int sum = userService.queryTotal(params);
        return R.ok().put("userSum", sum);
    }

    /**
     * 导出会员
     */
    @ApiOperation("导出会员")
    @PostMapping("/export")
//    @RequiresPermissions("user:export")
    public R export(@RequestParam Map<String, Object> params, HttpServletResponse response) {

        List<UserEntity> userList = userService.queryList(params);

       // ExcelExport ee = new ExcelExport("会员列表");

        String[] header = new String[]{"会员名称", "性别", "会员级别", "手机号码"};

        List<Map<String, Object>> list = new ArrayList<>();

        if (userList != null && userList.size() != 0) {
            for (UserEntity userEntity : userList) {
                LinkedHashMap<String, Object> map = new LinkedHashMap<>();
                map.put("USERNAME", userEntity.getUsername());
                map.put("GENDER", userEntity.getGender() == 1 ? "男" : (userEntity.getGender() == 2 ? "女" : "未知"));
                map.put("LEVEL_NAME", userEntity.getLevelName());
                map.put("MOBILE", userEntity.getMobile());
                list.add(map);
            }
        }

       // ee.addSheetByMap("会员", list, header);
        //ee.export(response);
        return R.ok();
    }
}
