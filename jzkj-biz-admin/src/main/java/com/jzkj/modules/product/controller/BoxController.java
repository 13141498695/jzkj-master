package com.jzkj.modules.product.controller;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.jzkj.common.annotation.SysLog;
import com.jzkj.modules.oss.cloud.OSSFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.common.validator.ValidatorUtils;
import com.jzkj.common.validator.group.AddGroup;
import com.jzkj.common.validator.group.UpdateGroup;
import com.jzkj.miservice.entity.product.BoxEntity;
import com.jzkj.modules.product.service.BoxService;
import com.jzkj.modules.product.service.RoadService;
@RestController
@RequestMapping("/product/sysbox")
public class BoxController {
	@Resource
	private BoxService boxService;
	
	@Resource
	private RoadService roadService;
	    
	  
	@RequestMapping("/list")
	public ReturnResult list(@RequestParam Map<String, Object> params){
		PageUtils page = boxService.queryPage(params);

		return ReturnResult.ok().put("page", page);
	}

	
	/**
	 * 路信息信息
	 */
	@RequestMapping("/info/{boxId}")
	public ReturnResult info(@PathVariable("boxId") String boxId){
		BoxEntity box = boxService.selectById(boxId);
		
		return ReturnResult.ok().put("box", box);
	}
	
	/**
	 * 保存路信息
	 */
	@SysLog("保存路信息")
	@RequestMapping("/save")
	public ReturnResult save(@RequestBody BoxEntity box){
		ValidatorUtils.validateEntity(box, AddGroup.class);
		box.setCreateTime(new Date());
		
		box.setDelFlag((byte) 0);
		boxService.save(box);
		
		return ReturnResult.ok();
	}
	
	/**
	 * 修改路信息
	 */
	@SysLog("修改路信息")
	@RequestMapping("/update")
	public ReturnResult update(@RequestBody BoxEntity box){
		ValidatorUtils.validateEntity(box, UpdateGroup.class);
		boxService.update(box);		
		return ReturnResult.ok();
	}
	

	@RequestMapping("/uploadFile")
	public ReturnResult upload(@RequestParam("file") MultipartFile file) throws Exception {
		//上传文件
		String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String url = OSSFactory.build().uploadSuffix(file.getBytes(), suffix);

		return ReturnResult.ok().put("url", url);
	}
	
	
	@SysLog("保存路信息")
	@RequestMapping("/file")
	public ReturnResult file(MultipartFile  file,HttpServletRequest  request){

		String basePath = request.getServletContext().getRealPath("upload/imagesBox/");
        System.out.println(basePath);
        File directory = new File(basePath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        String pathString = basePath + file.getOriginalFilename();
        try {
        	file.transferTo(new File(pathString));
        } catch (Exception e) {
            // TODO
        }
	

		return ReturnResult.ok().put("url", pathString);

	}

	/**
	 * 删除路信息
	 */
	@SysLog("删除路信息")
	@RequestMapping("/delete")
	public ReturnResult delete(@RequestBody String[] boxIds){
		boxService.delete(Arrays.asList(boxIds));
		roadService.updateByBoxId(Arrays.asList(boxIds));
		return ReturnResult.ok();
	}
	
	/**
	 * 查询所有调压箱
	 */
	@RequestMapping("/boxlist")
	public List<BoxEntity> boxlist(){		
		return boxService.getAllBox();
	}
}
