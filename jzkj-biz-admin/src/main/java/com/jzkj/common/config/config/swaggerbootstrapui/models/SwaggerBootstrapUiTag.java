package com.jzkj.common.config.config.swaggerbootstrapui.models;


import io.swagger.models.Tag;

/**
 * @author 张宾
 */
public class SwaggerBootstrapUiTag extends Tag {

    private Integer order;

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public SwaggerBootstrapUiTag() {
    }

    public SwaggerBootstrapUiTag(Integer order) {
        this.order = order;
    }
}
