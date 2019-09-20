package com.jzkj.modules.until;

import com.jzkj.modules.product.util.FileUtil;
import com.jzkj.ueditor.config.UeditorProperties;
import com.jzkj.ueditor.upload.StorageManager;
import com.qiniu.util.Auth;

/**
 * 七牛私有空间文件下载
 * @author xuhuanchao
 *
 */
//
import java.io.*;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
//
//---------------------
//        作者：Ryan-指尖上的奋斗
//        来源：CSDN
//        原文：https://blog.csdn.net/PEACEFUL000/article/details/53171578
//        版权声明：本文为博主原创文章，转载请附上博文链接！
public class Download {

    //密钥配置
    String accessKey="EF5HdarErv7e2n6BE8o4o9OvJlbtreslhHCBV9cm";
    String secretKey="MYrIGJhYvy0nqb4QpC753B7qy_8NjuFBDAej4LzC";
    Auth auth = Auth.create(accessKey,secretKey);

    /**
     * 获取下载文件路径，即：donwloadUrl
     *
     * @return
     */
    public String getDownloadUrl(String targetUrl) {
        String downloadUrl = auth.privateDownloadUrl(targetUrl);
        return downloadUrl;
    }


    /**
     * 文件下载
     *
     * @param targetUrl
     */
    public void download(String targetUrl) {
        //获取downloadUrl
        String downloadUrl = getDownloadUrl(targetUrl);
        //本地保存路径
        String filePath = "upload";
        download(downloadUrl, filePath);
    }


    /**
     * 通过发送http get 请求获取文件资源
     *
     * @param url
     * @param filepath
     * @return
     */
    private static void download(String url, String filepath) {
        OkHttpClient client = new OkHttpClient();
        System.out.println(url);
        Request req = new Request.Builder().url(url).build();
        Response resp = null;
        try {
            resp = client.newCall(req).execute();
            System.out.println(resp.isSuccessful());
            if (resp.isSuccessful()) {
                ResponseBody body = resp.body();
                InputStream is = body.byteStream();
                byte[] data = readInputStream(is);
                //判断文件夹是否存在，不存在则创建
                File file = new File(filepath);
                if (!file.exists() && !file.isDirectory()) {
                    System.out.println("===文件夹不存在===创建====");
                    file.mkdir();
                }
                File imgFile = new File(filepath + "888.jpg");
                FileOutputStream fops = new FileOutputStream(imgFile);
                fops.write(data);
                fops.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unexpected code " + resp);
        }
    }

    /**
     * 读取字节输入流内容
     *
     * @param is
     * @return
     */
    private static byte[] readInputStream(InputStream is) {
        ByteArrayOutputStream writer = new ByteArrayOutputStream();
        byte[] buff = new byte[1024 * 2];
        int len = 0;
        try {
            while ((len = is.read(buff)) != -1) {
                writer.write(buff, 0, len);
            }
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return writer.toByteArray();
    }


    /**
     * 主函数：测试
     * @param args
     */
    public static void main(String[] args) {
        //构造私有空间的需要生成的下载的链接；
        //格式： http://私有空间绑定的域名/空间下的文件名

        String targetUrl = "http://qiniu.zhangbin.art/qr904f71be-6bc8-456e-9c78-b0bcd0b39782201906281548.png";

        new Download().download(targetUrl);

    }

}

