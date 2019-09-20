package com.jzkj.modules.until;

public class AutoSupplyZeroUtil {
    /**不够位数的在前面补0，保留num的长度位数字
     *
     * @param code 数据
     * @param number 代表长度保留的位数
     * @return String
     */
    public static String autoSupplyZeroTypeLong(long code, int number){
        // d 代表参数为正数型
        return String.format("%0" + number + "d", code);
    }
}
