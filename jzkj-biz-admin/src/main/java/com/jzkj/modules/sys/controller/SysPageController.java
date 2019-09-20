package com.jzkj.modules.sys.controller;

import com.jzkj.common.annotation.SysLog;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.miservice.entity.SysBarcodeContext;
import com.jzkj.miservice.entity.product.ProductEntity;
import com.jzkj.modules.oss.service.SysOssService;
import com.jzkj.modules.product.service.BarCodeService;
import com.jzkj.modules.product.service.ProduceService;

import com.jzkj.modules.product.service.SysBarcodeContextService;
import com.jzkj.modules.sys.service.SysConfigService;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;


/**
 * 系统页面视图
 *
 * @author
 * @email
 * @date
 */

@Controller
public class SysPageController {
	@Resource
	private ProduceService produceService;

	@RequestMapping("modules/{module}/{url}.html")
	public String module(@PathVariable("module") String module, @PathVariable("url") String url){
		return "modules/" + module + "/" + url;
	}
	@RequestMapping("shop/{shop}/{url}.html")
	public String shop(@PathVariable("shop") String module, @PathVariable("url") String url){
		return "shop/" + module + "/" + url;
	}


	@RequestMapping(value = {"/", "index.html"})
	public String index(){
		return "index";
	}


	@RequestMapping("http://localhost:8073/image/*")
	public String tets(){
		return "http://localhost:8073/image/*";
	}




	@RequestMapping("index1.html")
	public String index1(){

		return "index1";
	}

	@RequestMapping("suyuanindex.html")
	public String suyuanindex(){
		return "suyuanindex";
	}

//	@RequestMapping("jiekou.html")
//	public String dochtml(){
//		return "jiekou";
//	}


	@RequestMapping("about.html")
	public String abouthtml(){
		return "about";
	}


	@RequestMapping("bird.html")
	public String birdhtml(){

		return "bird";
	}
	@RequestMapping("data.html")
	public String datahtml(){
		return "data";
	}

	@RequestMapping("certification.html")
	public String certification(){

		return "certification";
	}

	@RequestMapping("download.html")
	public String download(){

		return "download";
	}
	@RequestMapping("data-list.html")
	public String datalist(){
		return "datalist";
	}
	@RequestMapping("distribute.html")
	public String distribute(){
		return "distribute";
	}
	@RequestMapping("register.html")
	public String registerhtml(){

		return "register";
	}

	@RequestMapping("new.html")
	public String newhtml(){

		return "new";
	}
	@RequestMapping("productlist.html")
	public String productlist(){

		return "productlist";
	}
	@RequestMapping("login.html")
	public String login(){
		return "login";
	}

	@RequestMapping("main.html")
	public String main(){

		return "main";
	}
	@RequestMapping("tamap.html")
	public String tamap(){

		return "tamap";
	}
	@RequestMapping("tamap1.html")
	public String tamap1(){

		return "tamap1";
	}
@RequestMapping("map.html")
	public String map(){

		return "map";
	}


	@RequestMapping("404.html")
	public String notFound(){

		return "404";
	}
//	@RequestMapping("productContext.html")
//	public String productContext(){
//
//		return "productContext";
//	}
//	@RequestMapping("productContextTest.jsp")
////	public String productContextTest(){
////
////		return "productContextTest.jsp";
////	}



	@Resource
	private BarCodeService barCodeervice;


	@Resource
	private SysBarcodeContextService sysBarcodeContextService;

	@Autowired
	private SysOssService sysOssService;
	@Autowired
	private SysConfigService sysConfigService;

	@SysLog("修改单个产品回显")
	@GetMapping("/getsession")
	/*@RequiresPermissions("sys:model:select")*/
	public ReturnResult getsession(HttpServletRequest request){
		Object productId = request.getSession().getAttribute("productId");
		return ReturnResult.ok().put("productId",productId.toString());

	}
	/**
	 * 查询单个
	 */
	@ApiOperation("产品回显")
	@GetMapping("/info")
	public String select(String productId,@RequestParam("id") String id, ModelMap map, HttpServletRequest request, HttpServletResponse response){
		System.out.println("修改查询："+productId);
		System.out.println("二维码对象："+id);
		ProductEntity	product=this.produceService.selectByid(productId);
		System.out.println("详情："+product.getProductContext().toString());
		if(product!=null ) {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("html");
			//System.out.println("修改查询：" + product.getProductName());
			map.addAttribute("productName", product.getProductName());
	//		ProductEntity productEntitys=sysBarcodeContextService.selectByids(id);
//			System.out.println("回显查询"+productEntitys.getProductContext());

			String context	=	product.getProductContext();
			//图片铺满整个屏幕
			String str="<img";
             String newString="<img style=max-width:100%;height:auto";
			String replace = context.replace(str, newString);
			map.addAttribute("productContext", replace);
			map.addAttribute("productVersion", product.getProductVersion());
			map.addAttribute("productId", product.getProductId());
			SysBarcodeContext sysBarcodeContext=sysBarcodeContextService.selectByids(id);
            int count=sysBarcodeContext.getBarcodeCount();
			System.out.println("上一次二维码扫码次数："+count);

			if(sysBarcodeContext==null) {
				return "productNull.html";
			}
			count=count+1;
			sysBarcodeContext.setBarcodeCount(count);
			sysBarcodeContext.setProductName(product.getProductName());
			//修改状态为已鉴别状态
			sysBarcodeContext.setBarcodeStatus(1);
			sysBarcodeContext.setBarcodeCreatetime(new Date());
			System.out.println("本次二维码扫码次数："+sysBarcodeContext.getBarcodeCount());
			this.sysBarcodeContextService.updateBarcode(sysBarcodeContext);
			System.out.println("数据扫码成功");
			return "productContext.html";
		}else{
			return "productNull.html";

		}

	}

}
