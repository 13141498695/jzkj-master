package com.jzkj.modules.product.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.jzkj.common.annotation.SysLog;
import com.jzkj.modules.devices.service.DeviceService;
import com.jzkj.modules.product.util.TreeNode;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.common.validator.ValidatorUtils;
import com.jzkj.common.validator.group.AddGroup;
import com.jzkj.common.validator.group.UpdateGroup;
import com.jzkj.miservice.entity.product.BoxEntity;
import com.jzkj.miservice.entity.product.RoadEntity;
import com.jzkj.miservice.entity.product.RoadEntityView;
import com.jzkj.modules.product.service.BoxService;
import com.jzkj.modules.product.service.RoadService;

@RestController
@RequestMapping("/product/sysroad")
public class RoadController {
	
	@Resource
	private RoadService roadService;
	@Resource
	private BoxService boxService;
	@Resource
	private DeviceService deviceService;
	    
	  
	@RequestMapping("/list")
	public ReturnResult list(@RequestParam Map<String, Object> params){
		PageUtils page = roadService.queryPage(params);
		
		List<RoadEntityView> entityViews=new ArrayList<RoadEntityView>();
		
		List<RoadEntity> roadEntities=(List<RoadEntity>)page.getList();
		for (int i = 0; i < roadEntities.size(); i++) {
			RoadEntity roadEntity=roadEntities.get(i);
			
			RoadEntityView roadEntityView=new RoadEntityView();
			roadEntityView.setRoadBoxId(roadEntity.getRoadBoxId());
			roadEntityView.setCreateTime(roadEntity.getCreateTime());
			roadEntityView.setRoadName(roadEntity.getRoadName());
			roadEntityView.setRoadDesc(roadEntity.getRoadDesc());
			roadEntityView.setRoadId(roadEntity.getRoadId());
			roadEntityView.setDelFlag(roadEntity.getDelFlag());
			String boxId=roadEntity.getRoadBoxId();
			if(boxId!=null){
				BoxEntity boxEntity=boxService.selectById(boxId);
				if(boxEntity!=null){
					roadEntityView.setBoxName(boxEntity.getBoxName());
				}
			}
			entityViews.add(roadEntityView);
		}
		page.setList(entityViews);
		return ReturnResult.ok().put("page", page);
	}

	
	/**
	 * 路信息信息
	 */
	@RequestMapping("/info/{roadId}")
	public ReturnResult info(@PathVariable("roadId") String roadId){
		RoadEntity road = roadService.selectById(roadId);
		
		return ReturnResult.ok().put("road", road);
	}
	
	/**
	 * 保存路信息
	 */
	@SysLog("保存路信息")
	@RequestMapping("/save")
	public ReturnResult save(@RequestBody RoadEntity road){
		ValidatorUtils.validateEntity(road, AddGroup.class);
		road.setDelFlag((byte) 0);
		roadService.save(road);		
		return ReturnResult.ok();
	}
	
	/**
	 * 修改路信息
	 */
	@SysLog("修改路信息")
	@RequestMapping("/update")
	public ReturnResult update(@RequestBody RoadEntity road){
		ValidatorUtils.validateEntity(road, UpdateGroup.class);
		roadService.update(road);		
		return ReturnResult.ok();
	}
	
	/**
	 * 删除路信息
	 */
	@SysLog("删除路信息")
	@RequestMapping("/delete")
	public ReturnResult delete(@RequestBody String[] roadIds){
		roadService.delete(Arrays.asList(roadIds));
		deviceService.updateByRoadId(Arrays.asList(roadIds));
		return ReturnResult.ok();
	}

	@RequestMapping("/alllist")
	public List<TreeNode> getAllList(){
		List<TreeNode> returnList = new ArrayList<TreeNode>();
		List<BoxEntity> boxList = boxService.getAllBox();
		for (int i = 0; i < boxList.size(); i++) {
			BoxEntity boxEntity = boxList.get(i);
			TreeNode treeNode=new TreeNode();
			treeNode.setName(boxEntity.getBoxName());
			treeNode.setId("box_"+boxEntity.getBoxId());
			treeNode.setOpen(true);
			treeNode.setpId("0");
			returnList.add(treeNode);
			List<RoadEntity> roadlist = roadService.getRoadByBoxId(boxEntity.getBoxId());
			for (int j = 0; j < roadlist.size(); j++) {
				RoadEntity roadEntity=roadlist.get(j);
				TreeNode pTreeNode=new TreeNode();
				pTreeNode.setName(roadEntity.getRoadName());
				pTreeNode.setId(roadEntity.getRoadId());
				pTreeNode.setChecked(false);
				pTreeNode.setpId(treeNode.getId());
				returnList.add(pTreeNode);
			}
		}
		return returnList;
	}
}
