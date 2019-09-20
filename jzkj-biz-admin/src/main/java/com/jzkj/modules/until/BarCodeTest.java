package com.jzkj.modules.until;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
/**
 * @author zhangbin
 */
public class BarCodeTest {

    public static void main(String[] args) {
        // 存放在二维码中的内容
        String text = "http://47.95.208.93:8073/info?productId=a3383595-00fb-49cc-8ec8-cf814d68c326";
        // 嵌入二维码的图片路径
        String imgPath = "C:/Users/zhangbin/Desktop/zhangbin/jzkj/biz-admin/statics/image/image/20190618/logo.png";

        String destPath = "/Users/zhangbin/Desktop/zhangbin/jzkj/C:/Users/zhangbin/Desktop/zhangbin/jzkj/biz-admin/statics/image/image/qr.jpg";
        try {
            //生成二维码
            QRCodeUtil.encode(text, imgPath, destPath, true);
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
        // 打印出解析出的内容
        System.out.println(str);


    }
}
