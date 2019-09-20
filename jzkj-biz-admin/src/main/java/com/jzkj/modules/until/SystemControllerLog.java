/**
 * @Copyright Copyright (c) 2015-2020
 * @Company BeiJing Zhiyunda Science and Technology Com.,Ltd.
 */
package com.jzkj.modules.until;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName SystemControllerLog
 * @Description 自定义注解 拦截Controller 
 * @date 
 * @Version:1.1.0
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})    
@Retention(RetentionPolicy.RUNTIME)    
@Documented 
public @interface SystemControllerLog {
	
	String description()  default "" ;
	String type() default "" ;
}
