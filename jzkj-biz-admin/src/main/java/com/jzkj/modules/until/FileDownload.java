//package com.jzkj.modules.until;
//
//import com.google.common.annotations.VisibleForTesting;
//import org.apache.commons.io.FileUtils;
//import org.aspectj.util.FileUtil;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.*;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.URLConnection;
//import java.net.URLEncoder;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.logging.Logger;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipOutputStream;
//
//import static cn.hutool.core.io.FileUtil.getInputStream;
//
///**
// * 下载文件
// * @version
// */
//public class FileDownload {
//    private static final String FilePath = "D:\\";
//
//    private static final long serialVersionUID = -8694640030455344419L
//
//    public static void fileDownload() throws Exception{
//        byte[] buffer = new byte[1024];
//        // 生成的ZIP文件名为Demo.zip
//        String strZipName = "Demo.zip";
//        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(strZipName));
//        String[] fileUrl = {
//                "http://qiniu.zhangbin.art/qrf1f02b66-0384-43e1-b331-98a8a89f4cce201907031003.png",
//                "http://qiniu.zhangbin.art/qrb796951c-170a-4382-96ef-317194e04900201907031053.png" };
//
//        for (int i = 0; i < fileUrl.length; i++) {
//            InputStream inStream = getInputStream(fileUrl[i]);
//            // FileInputStream fis = new FileInputStream(file1[i]);
//            out.putNextEntry(new ZipEntry("名字" + i+".png"));
//            int len;
//            // 读入需要下载的文件的内容，打包到zip文件
//            while ((len = inStream.read(buffer)) > 0) {
//                out.write(buffer, 0, len);
//            }
//            out.closeEntry();
//            inStream.close();
//        }
//        out.flush();
//        out.close();
//        System.out.println("生成Demo.zip成功");
//    }
//
//
//    public void downloadNet(HttpServletResponse response) throws MalformedURLException {
//        // 下载网络文件
//        int bytesum = 0;
//        int byteread = 0;
//
//        URL url = new URL("windine.blogdriver.com/logo.gif");
//
//        try {
//            URLConnection conn = url.openConnection();
//            InputStream inStream = conn.getInputStream();
//            FileOutputStream fs = new FileOutputStream("/Users/zhangbin/Desktop/项目最新/jzkj-master");
//
//            byte[] buffer = new byte[1204];
//            int length;
//            while ((byteread = inStream.read(buffer)) != -1) {
//                bytesum += byteread;
//                System.out.println(bytesum);
//                fs.write(buffer, 0, byteread);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
///*
//        * 压缩文件
//	 * @param zipBasePath 临时压缩文件基础路径
//	 * @param zipName 临时压缩文件名称
//	 * @param zipFilePath 临时压缩文件完整路径
//	 * @param filePaths 需要压缩的文件路径集合
//	 * @throws IOException
//	 */
//    private static String zipFile(String zipBasePath, String zipName, String zipFilePath, List<String> filePaths, ZipOutputStream zos) throws IOException {
//
//        //循环读取文件路径集合，获取每一个文件的路径
//        for(String filePath : filePaths){
//            File inputFile = new File(filePath);  //根据文件路径创建文件
//            if(inputFile.exists()) { //判断文件是否存在
//                if (inputFile.isFile()) {  //判断是否属于文件，还是文件夹
//                    //创建输入流读取文件
//                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
//
//                    //将文件写入zip内，即将文件进行打包
//                    zos.putNextEntry(new ZipEntry(inputFile.getName()));
//
//                    //写入文件的方法，同上
//                    int size = 0;
//                    byte[] buffer = new byte[1024];  //设置读取数据缓存大小
//                    while ((size = bis.read(buffer)) > 0) {
//                        zos.write(buffer, 0, size);
//                    }
//                    //关闭输入输出流
//                    zos.closeEntry();
//                    bis.close();
//
//                } else {  //如果是文件夹，则使用穷举的方法获取文件，写入zip
//                    try {
//                        File[] files = inputFile.listFiles();
//                        List<String> filePathsTem = new ArrayList<String>();
//                        for (File fileTem:files) {
//                            filePathsTem.add(fileTem.toString());
//                        }
//                        return zipFile(zipBasePath, zipName, zipFilePath, filePathsTem,zos);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//        return null;
//    }
//    public String execute() {
//        //生成的ZIP文件名为Demo.zip
//        String tmpFileName = "Demo.zip";
//        byte[] buffer = new byte[1024];
//        String strZipPath = FilePath + tmpFileName;
//        try {
//            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(
//                    strZipPath));
//            // 需要同时下载的两个文件result.txt ，source.txt
//            File[] file1 = { new File(FilePath+"test1.txt"),
//                    new File(FilePath+"测试2.docx") };
//            for (int i = 0; i < file1.length; i++) {
//                FileInputStream fis = new FileInputStream(file1[i]);
//                out.putNextEntry(new ZipEntry(file1[i].getName()));
//                //设置压缩文件内的字符编码，不然会变成乱码
//                //out.setEncoding("GBK");
//                int len;
//                // 读入需要下载的文件的内容，打包到zip文件
//                while ((len = fis.read(buffer)) > 0) {
//                    out.write(buffer, 0, len);
//                }
//                out.closeEntry();
//                fis.close();
//            }
//            out.close();
//            this.downFile(getResponse(), tmpFileName);
//        } catch (Exception e) {
//            //Log.error("文件下载出错", e);
//
//        }
//        return null;
//    }
//
//
//
//    /**
//     * 文件下载
//     * @param response
//     * @param str
//     */
//    private void downFile(HttpServletResponse response, String str) {
//        try {
//            String path = FilePath + str;
//            File file = new File(path);
//            if (file.exists()) {
//                InputStream ins = new FileInputStream(path);
//                BufferedInputStream bins = new BufferedInputStream(ins);// 放到缓冲流里面
//                OutputStream outs = response.getOutputStream();// 获取文件输出IO流
//                BufferedOutputStream bouts = new BufferedOutputStream(outs);
//                response.setContentType("application/x-download");// 设置response内容的类型
//                response.setHeader(
//                        "Content-disposition",
//                        "attachment;filename="
//                                + URLEncoder.encode(str, "UTF-8"));// 设置头部信息
//                int bytesRead = 0;
//                byte[] buffer = new byte[8192];
//                // 开始向网络传输文件流
//                while ((bytesRead = bins.read(buffer, 0, 8192)) != -1) {
//                    bouts.write(buffer, 0, bytesRead);
//                }
//                bouts.flush();// 这里一定要调用flush()方法
//                ins.close();
//                bins.close();
//                outs.close();
//                bouts.close();
//            } else {
//                response.sendRedirect("../error.jsp");
//            }
//        } catch (IOException e) {
//            Log.error("文件下载出错", e);
//        }
//    }
//    public static void main(String[] args){
//            try {
//                FileDownload.fileDownload();
//                String[] fileUrl = {
//                        "http://qiniu.zhangbin.art/qrf1f02b66-0384-43e1-b331-98a8a89f4cce201907031003.png",
//                        "http://qiniu.zhangbin.art/qrb796951c-170a-4382-96ef-317194e04900201907031053.png" };
//              //  String zipBasePath, String zipName, String zipFilePath, List<String> filePaths
//               // FileDownload.zipFile();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//
//}
