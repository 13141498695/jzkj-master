package com.jzkj.modules.product.controller;

import com.jzkj.common.annotation.SysLog;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.miservice.entity.product.ProductEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public class FileController {



    /**
     * 保存产品
     */
    @SysLog("保存产品")
    @RequestMapping("/file")
    public ReturnResult save(@RequestBody ProductEntity product){



                String file;
                String uploadDir;
                String endpoint;
                String accessKeyId;
                String accessKeySecret;
                String bucketName;


        //FileUtil.uploadFile()

        return ReturnResult.ok();
    }

}
