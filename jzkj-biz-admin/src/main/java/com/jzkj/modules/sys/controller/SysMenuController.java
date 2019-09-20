package com.jzkj.modules.sys.controller;

import com.jzkj.common.annotation.SysLog;
import com.jzkj.common.exception.ResultException;
import com.jzkj.common.utils.Constant;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.modules.sys.entity.SysMenuEntity;
import com.jzkj.modules.sys.service.SysMenuService;

import com.jzkj.modules.until.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 系统菜单
 *
 * @author
 * @email
 * @date
 */
@RestController
@RequestMapping("/sys/menu")
public class SysMenuController extends AbstractController {
	@Autowired
	private SysMenuService sysMenuService;

	/**
	 * 导航菜单
	 */
	@RequestMapping("/nav")
	public ReturnResult nav(){
		List<SysMenuEntity> menuList = sysMenuService.getUserMenuList(getUserId());
		return ReturnResult.ok().put("menuList", menuList);
	}

	/**
	 * 所有菜单列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:menu:list")
	public List<SysMenuEntity> list(){
		List<SysMenuEntity> menuList = sysMenuService.selectList(null);
		for(SysMenuEntity sysMenuEntity : menuList){
			SysMenuEntity parentMenuEntity = sysMenuService.selectById(sysMenuEntity.getParentId());
			if(parentMenuEntity != null){
				sysMenuEntity.setParentName(parentMenuEntity.getName());
			}
		}

		return menuList;
	}

	/**
	 * 选择菜单(添加、修改菜单)
	 */
	@RequestMapping("/select")
	@RequiresPermissions("sys:menu:select")
	public ReturnResult select(){

		List<SysMenuEntity> menuList = sysMenuService.queryNotButtonList();

////		//添加顶级菜单
////		SysMenuEntity root = new SysMenuEntity();
////		root.setMenuId(0L);
////		root.setName("一级菜单");
////		root.setParentId(-1L);
////		root.setOpen(true);
////		menuList.add(root);
////		return ReturnResult.ok().put("menuList", menuList);
//
//		//添加顶级菜单
//		SysMenuEntity root = new SysMenuEntity();
//		root.setMenuId(0L);
//		root.setName("一级菜单");
//		root.setOpen(true);
//		menuList.add(root);
		return ReturnResult.ok().put("menuList", menuList);
	}

	/**
	 * 菜单信息
	 */
	@RequestMapping("/info/{menuId}")
	@RequiresPermissions("sys:menu:info")
	public ReturnResult info(@PathVariable("menuId") Long menuId){
		SysMenuEntity menu = sysMenuService.selectById(menuId);
		return ReturnResult.ok().put("menu", menu);
	}

	/**
	 * 保存
	 */
	@SysLog("保存菜单")
	@RequestMapping("/save")
	@RequiresPermissions("sys:menu:save")
	public ReturnResult save(@RequestBody SysMenuEntity menu){
		//数据校验
		verifyForm(menu);

		sysMenuService.insert(menu);
		return ReturnResult.ok();
	}

	/**
	 * 修改
	 */
	@SysLog("修改菜单")
	@RequestMapping("/update")
	@RequiresPermissions("sys:menu:update")
	public ReturnResult update(@RequestBody SysMenuEntity menu){
		//数据校验
		verifyForm(menu);

		sysMenuService.updateById(menu);

		return ReturnResult.ok();
	}

	/**
	 * 删除
	 */
	@SysLog("删除菜单")
	@RequestMapping("/delete")
	@RequiresPermissions("sys:menu:delete")
	public ReturnResult delete(long menuId){
		if(menuId <= 31){
			return ReturnResult.error("系统菜单，不能删除");
		}

		//判断是否有子菜单或按钮
		List<SysMenuEntity> menuList = sysMenuService.queryListParentId(menuId);
		if(menuList.size() > 0){
			return ReturnResult.error("请先删除子菜单或按钮");
		}

		sysMenuService.delete(menuId);

		return ReturnResult.ok();
	}

	/**
	 * 验证参数是否正确
	 */
	private void verifyForm(SysMenuEntity menu){
		if(StringUtils.isBlank(menu.getName())){
			throw new ResultException("菜单名称不能为空");
		}

		if(menu.getParentId() == null){
			throw new ResultException("上级菜单不能为空");
		}

		//菜单
		if(menu.getType() == Constant.MenuType.MENU.getValue()){
			if(StringUtils.isBlank(menu.getUrl())){
				throw new ResultException("菜单URL不能为空");
			}
		}

		//上级菜单类型
		int parentType = Constant.MenuType.CATALOG.getValue();
		if(menu.getParentId() != 0){
			SysMenuEntity parentMenu = sysMenuService.selectById(menu.getParentId());
			parentType = parentMenu.getType();
		}

		//目录、菜单
		if(menu.getType() == Constant.MenuType.CATALOG.getValue() ||
				menu.getType() == Constant.MenuType.MENU.getValue()){
			if(parentType != Constant.MenuType.CATALOG.getValue()){
				throw new ResultException("上级菜单只能为目录类型");
			}
			return ;
		}

		//按钮
		if(menu.getType() == Constant.MenuType.BUTTON.getValue()){
			if(parentType != Constant.MenuType.MENU.getValue()){
				throw new ResultException("上级菜单只能为菜单类型");
			}
			return ;
		}
	}
}
