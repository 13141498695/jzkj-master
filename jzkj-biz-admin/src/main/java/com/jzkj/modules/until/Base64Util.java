package com.jzkj.modules.until;
import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

/**
 * @author zhangbin
 * @date 2019/8/23 16:46
 */
public class Base64Util {

    /**
     * base64编码
     * @param str 要编码的字符串
     * @return 编码后的字符串
     */
    public static String encode(String str) {
        byte[] b = null;
        String s = null;
        try {
            //获取byte编码
            b = str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (b != null) {
            //对字符串进行编码
            s =  Base64.encodeBase64String(b);
        }
        return s;
    }

    /**
     * base64解码
     * @param  s 要解码的字符串
     * @return 解码后的字符串
     */
    public static String decode(String s) {
        byte[] b = null;
        String result = null;
        if (s != null) {
            try {
                b =Base64.decodeBase64(s);
                //对字符串进行解码
                result = new String(b, "utf-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "清明上河图";

        System.out.println(encode(str));
        System.out.println(decode(encode(str)));
    }

}
