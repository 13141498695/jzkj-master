package com.jzkj.modules.until;

import org.springframework.cglib.beans.BeanCopier;
import org.springframework.cglib.core.Converter;

/**    
 * @Description:    
 * @Author:       张宾   
 * @CreateDate:   2019/8/2 14:44     
 */
public final class BeanCopierUtil {

    private BeanCopierUtil() {
    }

    public static <S, T> BeanCopier create(Class source, Class target) {
        return BeanCopier.create(source, target, false);
    }

    public static <S, T> void copy(BeanCopier beanCopier, Object source, Object target) {
        beanCopier.copy(source, target, (Converter)null);
    }

    public static <S, T> void copy(Class<S> sourceClz, S source, Class<T> targetClz, T target) {
        BeanCopier.create(sourceClz, targetClz, false).copy(source, target, (Converter)null);
    }
}
