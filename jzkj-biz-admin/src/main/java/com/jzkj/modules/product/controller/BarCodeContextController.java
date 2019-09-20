package com.jzkj.modules.product.controller;

import com.google.gson.Gson;
import com.jzkj.common.annotation.SysLog;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.miservice.entity.SysBarcodeContext;
import com.jzkj.modules.product.service.ProduceService;
import com.jzkj.modules.product.service.SysBarcodeContextService;
import com.jzkj.modules.until.FilesUntiles;
import com.jzkj.modules.until.QiNiuZipUtil;
import com.jzkj.modules.until.UrlFilesToZip;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static cn.hutool.core.io.FileUtil.getInputStream;

@RestController
@RequestMapping("/sys/barcodeContext")
public class BarCodeContextController {
    private static final Logger logger = LoggerFactory.getLogger(BarCodeContextController.class);

    /**
     *
     *
     * @author zhangbin
     * @date 2019-06-5 11:55:39
     */

    @Resource
    private ProduceService produceService;
    @Resource
    private SysBarcodeContextService sysBarcodeContextService;





    /**
     * 二维码申请修改
     */
    @ApiOperation("二维码申请修改")
    @SysLog("二维码申请修改")
    @PostMapping("/update")
    @RequiresPermissions("sys:barcode:update")
    public ReturnResult update(@RequestBody SysBarcodeContext sysBarcodeContext){
        sysBarcodeContextService.updateAllColumnById(sysBarcodeContext);
        return ReturnResult.ok();
    }
//
//    /**
//     * 二维码申请修改
//     */
//    @ApiOperation("二维码申请修改")
//    @SysLog("二维码申请修改")
//    @RequestMapping("/add")
//    @RequiresPermissions("sys:barcode:save")
//    public ReturnResult add(@RequestBody SysBarcodeContext sysBarcodeContext){
//        sysBarcodeContext.s(new Date());
//        String username = ((SysUserEntity) SecurityUtils.getSubject().getPrincipal()).getUsername();
//        sysBarcode.setCreatePeople(username);
//        sysBarcodeContextService.insertAllColumn(sysBarcode);
//        return ReturnResult.ok();
//    }

    /**
     * 二维码修改回显查询
     */
    @SysLog("二维码修改回显查询")
    @ApiOperation("二维码修改回显查询")
    @PostMapping("/info/{id}")
    @RequiresPermissions("sys:role:info")
    public ReturnResult info(@PathVariable("id") int id){
        SysBarcodeContext barcode = sysBarcodeContextService.selectById(id);
        //查询单个用户的信息
        return ReturnResult.ok().put("barcode", barcode);

    }

    /**
     * 删除模型
     */
    @ApiOperation("删除模型")
    @SysLog("产品模型")
    @PostMapping("/delete")
    public ReturnResult delete(@RequestBody String [] barcodeId){
            sysBarcodeContextService.deleteByIdids(barcodeId);
        return ReturnResult.ok();
    }

    /**
     * 二维码修改回显查询		 */
    @SysLog("二维码修改回显查询")
    @ApiOperation("二维码申请列表")
    @RequestMapping("/list")
 //  @RequiresPermissions("sys:barcode:list")
    public ReturnResult list(@RequestParam Map<String, Object> params){
        PageUtils page = sysBarcodeContextService.queryPage(params);
        System.out.println("页面："+page);

        return ReturnResult.ok().put("page", page);
    }

//    @SysLog("二维码下载")
//    @ApiOperation("二维码下载")
//    @RequestMapping("/dowload")
//    public ReturnResult dowload( @RequestBody String [] barcodeId,HttpServletResponse response) throws Exception {
//            for(int a=0;a<barcodeId.length;a++){
//                System.out.println("下载的id:"+barcodeId[a]);
//            }
//        byte[] buffer = new byte[1024];
//            String zipName = "image.zip";
//        List<FileBean> fileList=new ArrayList<>();
//        FileBean fileBean=new FileBean();
//
//        for(int a=0;a<barcodeId.length;a++){
//            SysBarcodeContext sysBarcodeContext=  this.sysBarcodeContextService.selectByids(barcodeId[a]);
//            fileBean.setFilePath(sysBarcodeContext.getBarcodeUrl()+"?attname=");
//            fileList.add(fileBean);
//            QiNiuZipUtil.mkzip(sysBarcodeContext.getBarcodeUrl());
//        }
//        return ReturnResult.ok();
//
//    }

   // @RequestMapping("/batchDownLoad")
  //  @ResponseBody
    public void batchDownLoad(HttpServletRequest request, HttpServletResponse response, String fileNames) {
        Map<String,String> map=new HashMap<>();
        String[] files=fileNames.split(",");
        for(String fileName:files){
            String realPath = request.getSession().getServletContext().getRealPath("/");
            try {
                //调用文件打包方法
                zipFile(map, realPath, fileName);
                realPath = realPath + fileName;
                //以流的形式下载文件
                BufferedInputStream fis = new BufferedInputStream(new FileInputStream(realPath));
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                fis.close();
                //清空
                response.reset();
                OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
                response.setContentType("application/octet-stream");
                response.setHeader("Content-Disposition", "attachment;filename=" + new String(fileName.getBytes("UTF-8"), "ISO-8859-1"));
                toClient.write(buffer);
                toClient.flush();
                toClient.close();
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }
//    @RequestMapping("/batchDownLoad")
//    @ApiOperation("二维码批量下载")
//    public void filesdown(HttpServletResponse response){
//        String a="http://qiniu.zhangbin.art/qr7704e30f-fe73-4508-9b5b-a00205424b9c201909181246.png";
//        String b="http://qiniu.zhangbin.art/qr628dc07e-08c4-46b9-9513-193fd8fdd742201909181251.png";
//        String c="http://qiniu.zhangbin.art/qre5f94449-9aad-49da-a4f3-8a6ea9e12eca201909171358.png";
//        List<String> srcFiles=new ArrayList<>();
//        srcFiles.add(a);
//        srcFiles.add(b);
//        srcFiles.add(c);
//
//        String lujing="/Users/zhangbin/Desktop/项目最新/jzkj-master";
//        String zipFileName="demo";
//        HttpServletResponse ddd=null;
//        FilesUntiles.downloadZipFiles(response,srcFiles,zipFileName);
//
//}

    /**
         * 文件打包
         * @author niuyuhui
         * @param map
         * @param rootPath
         * @param fileName
         * @throws Exception
         */
        public void zipFile (Map < String, String > map, String rootPath, String fileName) throws Exception {
            File zipFile = new File(rootPath + "/" + fileName);
            if (zipFile.exists()) {
                zipFile.delete();
            }
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(rootPath + "/" + fileName));
            ZipEntry ze = null;
            byte[] buf = new byte[1024];
            int readLen = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                ze = new ZipEntry(entry.getKey());//设置下载文件名称
                zos.putNextEntry(ze);
                String absoluteFileName = entry.getValue();//文件绝对路径
                InputStream is = new BufferedInputStream(new FileInputStream(absoluteFileName));
                while ((readLen = is.read(buf, 0, 1024)) != -1) {
                    zos.write(buf, 0, readLen);
                }
                is.close();
            }
            zos.close();
        }

    }
