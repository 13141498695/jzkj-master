///*
// * 项目名称:platform-plus
// * 类名称:WebMvcConfig.java
// * 包名称:com.platform.modules.app.config
// *
// * 修改履历:
// *      日期                修正者      主要内容
// *      2018/11/21 16:04    李鹏军      初版完成
// *
// * Copyright (c) 2019-2019 微同软件
// */
//package com.jzkj.common.config.config;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.method.support.HandlerMethodArgumentResolver;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import java.util.List;
//
///**
// * MVC配置
// *
// * @author 李鹏军
// */
//@Configuration
//public class WebMvcConfig implements WebMvcConfigurer {
//    @Autowired
//    private AuthorizationInterceptor authorizationInterceptor;
//    @Autowired
//    private LoginUserHandlerMethodArgumentResolver loginUserHandlerMethodArgumentResolver;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(authorizationInterceptor)
//                .addPathPatterns("/app/**")
//                .excludePathPatterns("/app/wx/mp/portal", "/app/wx/ma/portal", "/app/wx/menu/create", "/actuator/**");
//    }
//
//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
//        argumentResolvers.add(loginUserHandlerMethodArgumentResolver);
//    }
//}
