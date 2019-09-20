package com.jzkj.modules.until;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

/**
 * 条形码校验及生成方法
 * @author zhangbin
 * @date 2019-7-19
 */
public class BarcodeUtil {

    /**
     * 校验第13位条形码
     * @param cBarcode 条形码
     * @return message
     */
    public static Map<String, Object> getcBarcode(String cBarcode) {
        Map<String, Object> message = new HashMap<String, Object>();
        boolean flag = isInteger(cBarcode);
        if(!flag){
            message.put("flag", false);
            message.put("value", null);
            message.put("msg", "条形码必须是数字,请重新输入");
            return message;
        }
        //数组 自右向左顺序编号 位置序号13 12 11 10 9 8 7 6 5 4 3 2 1
        int[] aa = new int[cBarcode.length()];
        //下标  0  1  2  3 4 5 6 7 8 9 10 11 12

        //转换成数字型数组
        for (int i = 0; i < cBarcode.length(); i++) {
            //逐个获取字符串中的字符
            char c = cBarcode.charAt(i);
            //字符数字-字符0就是实际的数字值，赋值给数字数组
            aa[i] =  (c - '0');
        }
        //偶数位的和
        int count = 0;
        //从第三位起的基数位的和
        int count1 = 0;
        if (cBarcode.length() == 13) {
            for (int j = 0; j < aa.length; j++) {
                //求出偶数序号的和
                if (j % 2 == 1) {
                    count += aa[j];
                } else if (j % 2 == 0 && j <= aa.length - 3) {
                    count1 += aa[j];
                }
            }
            int sum = (count * 3) + count1;
            int value = 0;
            if (sum % 10 == 0) {
                value = 0;
            } else {
                int ceil = (int) Math.floor((sum / 10));
                value = (ceil + 1) * 10 - sum;
            }
            if (value != aa[aa.length - 1]) {
                message.put("flag", false);
                message.put("value", value);
                message.put("msg", "最后一位条码应该是" + value);
            } else {
                message.put("flag", true);
                message.put("value", value);
                message.put("msg", "");
            }
        } else {
            message.put("flag", false);
            message.put("value", null);
            message.put("msg", "该条码不是标准的ENA码");
        }
        return message;

    }


    /**
     * 生成13位条码
     * @param code  12位码
     * @return  新的13位码
     */
    public static String encode(String code) {
        if (null == code) {
            return "";
        }
        char[] codes = code.toCharArray();
        int sum = 0;
        for (int i = 0; i < codes.length; i++) {
            int num = codes[i] - '0';
            if (isEven(num)) {
                sum += num;
            } else {
                sum += num * 3;
            }
        }
        int x = sum % 10;
        return code + (x == 0 ? 0 : 10 - x);
    }


    /**
     * 内部调用方法
     * @param x  数字
     * @return 布尔
     */
    private static boolean isEven(int x) {
        return x % 2 == 0;
    }


    /**
     * 判断条码是否是数字
     * @param str 条形码
     * @return 布尔
     */
        public static boolean isInteger(String str) {
            Pattern pattern = compile("^[-\\+]?[\\d]*$");
            return pattern.matcher(str).matches();
        }
}
