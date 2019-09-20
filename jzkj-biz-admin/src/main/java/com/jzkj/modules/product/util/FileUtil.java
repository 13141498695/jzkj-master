package com.jzkj.modules.product.util;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.CannedAccessControlList;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectRequest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**    
 * @Description:  文件上传工具类
 * @Author:      张宾   
 * @CreateDate:   2018/8/8 08:50     
 */
public class FileUtil {


    /**
     * @Description:
     * @param    file               源文件
     * @param    uploadDir          根据业务自定义
     * @param    endpoint           oss配置
     * @param    accessKeyId        oss配置
     * @param    accessKeySecret    oss配置
     * @param    bucketName         oss配置
     * @return   key                保存路径
     * @throws
     * @author ajian
     * @date 2018/8/8
     */
    public static String uploadFile(File file, String uploadDir, String endpoint, String accessKeyId, String accessKeySecret, String bucketName) {
        OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        String extend = file.getName().substring(file.getName().lastIndexOf(".") + 1).toLowerCase();
        String key = "";
        if(!isImg(extend)){
            key =  uploadDir + "/" + UUID.randomUUID() + ".jpg";
        }else{
            key =  uploadDir + "/" + UUID.randomUUID() + "." + extend;
        }
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setObjectAcl(CannedAccessControlList.PublicRead);

        setCache(metadata);

        // 上传图片
        client.putObject(new PutObjectRequest(bucketName, key, file,metadata));

        return key;
    }


    public static boolean isImg(String extend) {
        boolean ret = false;
        List<String> list = new ArrayList<String>();
        list.add("jpg");
        list.add("jpeg");
        list.add("bmp");
        list.add("gif");
        list.add("png");
        list.add("tif");
        for (String s : list) {
            if (s.equals(extend)) {
                ret = true;
            }
        }
        return ret;
    }


    /**
     * 设置缓存30天时间
     * @param metadata
     */
    private static void setCache(ObjectMetadata metadata) {
        metadata.setHeader("Cache-Control", "max-age=2592000");
    }

    public static void main(String[] args){

        File file = new File("/Users/ajian/Pictures/loading.gif");

        String key = uploadFile(file, "uploadDir", "http://oss-cn-beijing.aliyuncs.com/",
                "LTAIT5ES0A6WSLnG", "1JwuucDJc7OFOvpvgSFhaXRAeGScg3", "wpmk-oss");

        System.out.println("wpmk-oss.oss-cn-beijing.aliyuncs.com/" + key);


    }
}
