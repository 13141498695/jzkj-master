package com.jzkj.common.validator;

import com.jzkj.common.exception.ResultException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 * @author 
 * @email 
 * @date 
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new ResultException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new ResultException(message);
        }
    }
}
