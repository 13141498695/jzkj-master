package com.jzkj.modules.product.controller;

import com.jzkj.common.utils.ReturnResult;
import com.jzkj.miservice.entity.product.ProductEntity;
import com.jzkj.modules.product.service.BarCodeService;
import com.jzkj.modules.product.service.ProduceService;
import com.jzkj.modules.sys.entity.SysUserEntity;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/sys/productContext")
public class ProductContextContoroller {

    /**
     *
     *
     * @author zhangbin
     * @date 2019-05-30 15:55:39
     */

    @Resource
    private ProduceService produceService;

    @Resource
    private BarCodeService barCodeervice;

    /**
     * 保存产品
     */
    @ApiOperation("保存产品")
    @PostMapping("/productContext")
    @ResponseBody
    public ReturnResult productCotext(@RequestBody String productContext, HttpServletRequest request ){
        String string = java.util.UUID.randomUUID().toString();
       ProductEntity productEntity=new ProductEntity();
        String productContext3 = request.getParameter("productContext");
        System.out.println("值"+productContext);
        productEntity.setProductId(string);
        productEntity.setProductContext(productContext);
        String username = ((SysUserEntity) SecurityUtils.getSubject().getPrincipal()).getUsername();
        productEntity.setCreatePeople(username);
        produceService.saveContext(productEntity);
        return ReturnResult.ok();

    }



}
