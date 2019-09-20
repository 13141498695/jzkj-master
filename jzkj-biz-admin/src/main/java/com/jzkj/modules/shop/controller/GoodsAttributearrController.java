package com.jzkj.modules.shop.controller;//package com.jzkj.modules.shop.controller;
//
//import java.util.List;
//import java.util.Map;
//
//import com.jzkj.common.platform.utils.PageUtils;
//import com.jzkj.common.platform.utils.Query;
//import com.jzkj.common.platform.utils.R;
//import com.jzkj.modules.shop.entity.GoodsAttributeEntity;
//import com.jzkj.modules.shop.service.GoodsAttributenewService;
//import org.apache.shiro.authz.annotation.RequiresPermissions;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController
//@RequestMapping("goodsattributes")
//public class GoodsAttributearrController {
//	@Autowired
//	private GoodsAttributenewService goodsAttributeService;
//
//	/**
//	 * 列表
//	 */
//	@RequestMapping("/list")
//	@RequiresPermissions("goodsattribute:list")
//	public R list(@RequestParam Map<String, Object> params){
//		//查询列表数据
//		Query query = new Query(params);
//
//		List<GoodsAttributeEntity> goodsAttributeList = goodsAttributeService.queryList(query);
//		int total = goodsAttributeService.queryTotal(query);
//
//		PageUtils pageUtil = new PageUtils(goodsAttributeList, total, query.getLimit(), query.getPage());
//
//		return R.ok().put("page", pageUtil);
//	}
//
//
//	/**
//	 * 信息
//	 */
//	@RequestMapping("/info/{id}")
//	@RequiresPermissions("goodsattribute:info")
//	public R info(@PathVariable("id") Integer id){
//		GoodsAttributeEntity goodsAttribute = goodsAttributeService.queryObject(id);
//
//		return R.ok().put("goodsAttribute", goodsAttribute);
//	}
//
//	/**
//	 * 保存
//	 */
//	@RequestMapping("/save")
//	@RequiresPermissions("goodsattribute:save")
//	public R save(@RequestBody GoodsAttributeEntity goodsAttribute){
//		goodsAttributeService.save(goodsAttribute);
//
//		return R.ok();
//	}
//
//	/**
//	 * 修改
//	 */
//	@RequestMapping("/update")
//	@RequiresPermissions("goodsattribute:update")
//	public R update(@RequestBody GoodsAttributeEntity goodsAttribute){
//		goodsAttributeService.update(goodsAttribute);
//
//		return R.ok();
//	}
//
//	/**
//	 * 删除
//	 */
//	@RequestMapping("/delete")
//	@RequiresPermissions("goodsattribute:delete")
//	public R delete(@RequestBody Integer[] ids){
//		goodsAttributeService.deleteBatch(ids);
//
//		return R.ok();
//	}
//
//}
