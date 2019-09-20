package com.jzkj.modules.product.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpRequest;
import com.com.jzkj.miservice.entity.Barcode.SysBarcode;
import com.google.gson.Gson;
import com.jzkj.common.annotation.SysLog;
import com.jzkj.common.exception.ResultException;
import com.jzkj.common.utils.DateUtils;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;

import com.jzkj.miservice.entity.SysBarcodeContext;
import com.jzkj.miservice.entity.product.ProductEntity;
import com.jzkj.modules.oss.cloud.OSSFactory;
import com.jzkj.modules.oss.entity.SysOssEntity;
import com.jzkj.modules.oss.service.SysOssService;
import com.jzkj.modules.product.service.BarCodeService;
import com.jzkj.modules.product.service.ProduceService;
import com.jzkj.modules.product.service.SysBarcodeContextService;
import com.jzkj.modules.sys.entity.SysUserEntity;
import com.jzkj.modules.sys.service.SysConfigService;
import com.jzkj.modules.until.FilesUntiles;
import com.jzkj.modules.until.QRCodeUtil;
import com.jzkj.modules.until.ZipUntil;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sys/barcode")
public class BarCodeController {
    /**
     *
     *
     * @author zhangbin
     * @date 2019-06-5 11:55:39
     */

    @Resource
    private BarCodeService barCodeervice;
    @Resource
    private ProduceService produceService;

    @Resource
    private SysBarcodeContextService sysBarcodeContextService;

    @Autowired
    private SysOssService sysOssService;

    /**
     * 二维码申请修改
     */
    @ApiOperation("二维码申请修改")
    @SysLog("二维码申请修改")
    @PostMapping("/update")
    @ResponseBody
    @RequiresPermissions("sys:barcode:update")
    public ReturnResult update(@RequestBody SysBarcode sysBarcode, HttpServletResponse httpServletRequest){
        String productId=sysBarcode.getProductId();
        System.out.println("产品"+sysBarcode.getProductId());

        // 嵌入二维码的图片路径
        String destPath=null;
        String pizi=null;
        ProductEntity products  =produceService.selectByid(sysBarcode.getProductId());
        //文件集合
        List<File> srcFiles=new ArrayList<>();
        pizi=products.getProductName();
        File zipFile = new File("Users/zhangbin/Desktop/ppt/jzkj/biz-admin/statics/image/image/"+pizi+".zip");
int cont11=0;
        try {
            int count= sysBarcode.getScCount();
            for (int i = 0; i < count; i++) {
                String imgPath = "Users/zhangbin/Desktop/ppt/jzkj/biz-admin/statics/image/image/jz.png";
                cont11++;
                destPath = "Users/zhangbin/Desktop/ppt/jzkj/biz-admin/statics/image/image/"+cont11+ ".jpg";

                //生成二维码
                //生成二维码-
                ProductEntity product  =produceService.selectByid(sysBarcode.getProductId());
                SysBarcodeContext sysBarcodeContext=new SysBarcodeContext();
                String barcode=java.util.UUID.randomUUID().toString();
                sysBarcodeContext.setBarcodeId(barcode);
                sysBarcodeContext.setProductName(product.getProductName());
                String text = "http://192.168.1.107/info?productId="+productId+"&id="+barcode;
                QRCodeUtil.encode(text, imgPath, destPath, true);
                System.out.println(destPath);


                System.out.println("二维码路径"+text);
                System.out.println("生成二维码"+i);
                String accessKey = "EF5HdarErv7e2n6BE8o4o9OvJlbtreslhHCBV9cm";
                String secretKey = "MYrIGJhYvy0nqb4QpC753B7qy_8NjuFBDAej4LzC";
                String bucket = "bjcpimages";
                com.qiniu.storage.Configuration configuration = new com.qiniu.storage.Configuration(Zone.zone0());
                UploadManager manager = new UploadManager(configuration);
                String key = java.util.UUID.randomUUID().toString()+DateUtil.format(new Date(),"yyyyMMddHHss")+".png";
                Auth auth = Auth.create(accessKey, secretKey);
                String upToken = auth.uploadToken(bucket);
                String localFilePath = destPath;
                  Response response = null;
                    response = manager.put(localFilePath, key, upToken);
                    DefaultPutRet set = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                    System.out.println(set.key);
                    System.out.println(set.hash);
         //       System.out.println("集合长度"+srcfiles.size());

                String imgUrl = "http://qiniu.zhangbin.art/" + key;

               File   srcFiles1 = new File(destPath);
                srcFiles.add(srcFiles1);


                sysBarcodeContext.setBarcodeUrl(imgUrl);
                sysBarcodeContext.setBarcodeCount(0);
                //二维码的状态
                sysBarcodeContext.setBarcodeStatus(0);
                sysBarcodeContext.setBarcodeCreatetime(new Date());

                sysBarcodeContext.setBarcodePici(pizi);
                //  sysBarcodeContextService.insert(sysBarcodeContext);
                sysBarcodeContextService.insertAllColumn(sysBarcodeContext);
                System.out.println("二维码的图片路径："+imgUrl);
                sysBarcode.setCreateTime(new Date());
                sysBarcode.setBarcodeStatus(1);


            }
            cont11=0;
            ZipUntil.zipFiles(srcFiles,zipFile);
            String accessKey = "EF5HdarErv7e2n6BE8o4o9OvJlbtreslhHCBV9cm";
            String secretKey = "MYrIGJhYvy0nqb4QpC753B7qy_8NjuFBDAej4LzC";
            String bucket = "bjcpimages";
            com.qiniu.storage.Configuration configuration = new com.qiniu.storage.Configuration(Zone.zone0());
            UploadManager manager = new UploadManager(configuration);
            String key = java.util.UUID.randomUUID().toString()+DateUtil.format(new Date(),"yyyyMMddHHss")+".zip";
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);
            String localFilePath = destPath;
            Response response = null;
            response = manager.put(zipFile, key, upToken);
            DefaultPutRet set = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(set.key);
            System.out.println(set.hash);
            //       System.out.println("集合长度"+srcfiles.size());

            String imgUrl = "http://qiniu.zhangbin.art/" + key;

            System.out.println("二维码的图片路径："+imgUrl);
            FilesUntiles.delAllFile("Users/zhangbin/Desktop/ppt/jzkj/biz-admin/statics/image/image");
            sysBarcode.setZipurl(imgUrl);
            barCodeervice.updateAllColumnById(sysBarcode);
        }catch (Exception e) {
            System.out.println("生成二维码异常");
            e.printStackTrace();
        }
        return ReturnResult.ok();
    }


    /**
     * 二维码申请修改
     */
    @ApiOperation("二维码申请修改")
    @SysLog("二维码申请修改")
    @PostMapping("/scBarcode")
    @ResponseBody
    // @RequiresPermissions("sys:barcode:update")
    public ReturnResult scBarcode(@RequestBody SysBarcode sysBarcode,HttpServletResponse httpServletResponse){
        String productId=sysBarcode.getProductId();
     //   String text = "http://192.168.1.103:8073/info?productId="+id;

        System.out.println("产品"+sysBarcode.getProductId());
      //
        // 嵌入二维码的图片路径
        String imgPath = "Users/zhangbin/Desktop/ppt/jzkj/biz-admin/statics/image/image/log/jz.png";
        String destPath =null;
        List<String> srcFiles=new ArrayList<>();

        try {
            int count= sysBarcode.getScCount();
            for (int i = 0; i < count; i++) {
                //生成二维码
                destPath = "Users/zhangbin/Desktop/ppt/jzkj/biz-admin/statics/image/image/ewm/"+new Date()+sysBarcode.getProductId() + ".jpg";        ;
                SysBarcodeContext sysBarcodeContext=new SysBarcodeContext();
                String barcode=java.util.UUID.randomUUID().toString();
                sysBarcodeContext.setBarcodeId(barcode);
                String text = "http://192.168.1.107/info?productId="+productId+"&id="+barcode;


                QRCodeUtil.encode(text, imgPath + new Date(), destPath, true);
                System.out.println("路径"+text);
                String suffic="http://qiniu.zhangbin.art";
                String filetype="jpg";
                srcFiles.add(destPath);

                // String url = OSSFactory.build().getPath(filetype,destPath);


                String accessKey = "EF5HdarErv7e2n6BE8o4o9OvJlbtreslhHCBV9cm";
                String secretKey = "MYrIGJhYvy0nqb4QpC753B7qy_8NjuFBDAej4LzC";
                String bucket = "bjcpimages";

                com.qiniu.storage.Configuration configuration = new com.qiniu.storage.Configuration(Zone.zone0());
                UploadManager manager = new UploadManager(configuration);
                String key = "qr"+ DateUtil.format(new Date(),"yyyyMMddHHss")+".png";
                Auth auth = Auth.create(accessKey, secretKey);
                String upToken = auth.uploadToken(bucket);
                String localFilePath = destPath;
                Response response = null;
                response = manager.put(localFilePath, key, upToken);
                DefaultPutRet set = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                System.out.println(set.key);
                System.out.println(set.hash);
                String imgUrl = "http://qiniu.zhangbin.art/"+key;
                SysOssEntity ossEntity = new SysOssEntity();
                ossEntity.setUrl(imgUrl);
                ossEntity.setCreateDate(new Date());
                sysOssService.insert(ossEntity);
                //二维码生成记录
               // sysBarcodeContext.setBarcodeIp("127.0.0.1");
                sysBarcodeContext.setBarcodeUrl(imgUrl);
                sysBarcodeContext.setBarcodeStatus(0);

                //   sysBarcodeContext.setId(java.util.UUID.randomUUID().toString());


              //  sysBarcodeContextService.insert(sysBarcodeContext);
                System.out.println("二维码的图片七牛云路径："+imgUrl);
                String lujing="/Users/zhangbin/Desktop/项目最新/jzkj-master";
                String zipFileName="demo";
                HttpServletResponse ddd=null;
                FilesUntiles.downloadZipFiles(httpServletResponse,srcFiles,zipFileName);
                this.sysBarcodeContextService.insertAllColumn(sysBarcodeContext);
            }
        } catch (Exception e) {
            System.out.println("生成二维码异常");
            e.printStackTrace();
        }
        // 解析二维码,这里只是将上面的text解析出来了，所以扫描结果就是一串字符串
        String str = null;
        try {
            str = QRCodeUtil.decode(destPath);
        } catch (Exception e) {
            System.out.println("解析二维码异常");
            e.printStackTrace();
        }
        sysBarcode.setCreateTime(new Date());
        sysBarcode.setBarcodeStatus(1);
        barCodeervice.updateAllColumnById(sysBarcode);
        return ReturnResult.ok();
    }


    /**
     * 二维码申请修改
     */
    @ApiOperation("二维码申请修改")
    @SysLog("二维码申请修改")
    @PostMapping("/add")
    @RequiresPermissions("sys:barcode:save")
    @ResponseBody
    public ReturnResult add(@RequestBody SysBarcode sysBarcode){
        sysBarcode.setCreateTime(new Date());
        String username = ((SysUserEntity) SecurityUtils.getSubject().getPrincipal()).getUsername();
        sysBarcode.setCreatePeople(username);
        barCodeervice.insertAllColumn(sysBarcode);
        return ReturnResult.ok();
    }

    /**
     * 二维码修改回显查询
     */
    @ApiOperation("二维码修改回显查询")
    @PostMapping("/info/{id}")
    @RequiresPermissions("sys:role:info")
    @ResponseBody
    public ReturnResult info(@PathVariable("id") int id){
        SysBarcode barcode = barCodeervice.selectById(id);
        System.out.println("查询单个用户的信息"+barcode.getCreateTime());
        //查询单个用户的信息
        return ReturnResult.ok().put("barcode", barcode);

    }


    /**
     * 删除模型
     */
    @ApiOperation("删除模型")
    @SysLog("产品模型")
    @PostMapping("/delete")
    //@ResponseBody
    @RequiresPermissions("sys:barcode:delete")
    @ResponseBody
    public ReturnResult delete(@RequestBody int[] id){

        for (int i = 0; i < id.length; i++) {
            barCodeervice.deleteByids(id[i]);
        }
        return ReturnResult.ok();
    }

    /**
     * 二维码修改回显查询		 */
    @SysLog("二维码修改回显查询")
    @ApiOperation("二维码申请列表")
    @RequestMapping("/list")
    @RequiresPermissions("sys:barcode:list")
    @ResponseBody
    public ReturnResult list(@RequestParam Map<String, Object> params){
        PageUtils page = barCodeervice.queryPage(params);
        System.out.println("页面："+page);

        return ReturnResult.ok().put("page", page);
    }



}
