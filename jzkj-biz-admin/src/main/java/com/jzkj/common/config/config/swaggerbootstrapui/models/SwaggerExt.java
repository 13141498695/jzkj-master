package com.jzkj.common.config.config.swaggerbootstrapui.models;

import io.swagger.models.Swagger;
import org.springframework.beans.BeanUtils;

/**
 * @author 张宾
 */
public class SwaggerExt extends Swagger {

    protected SwaggerBootstrapUi swaggerBootstrapUi;

    public SwaggerBootstrapUi getSwaggerBootstrapUi() {
        return swaggerBootstrapUi;
    }

    public void setSwaggerBootstrapUi(SwaggerBootstrapUi swaggerBootstrapUi) {
        this.swaggerBootstrapUi = swaggerBootstrapUi;
    }

    public SwaggerExt(Swagger swagger) {
        BeanUtils.copyProperties(swagger, this);
    }
}
