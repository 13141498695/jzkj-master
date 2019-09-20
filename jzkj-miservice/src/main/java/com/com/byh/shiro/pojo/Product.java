package com.com.byh.shiro.pojo;



import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;
@Data
public class Product {
    private String productId;
    private String productName;
    private String productVersion;
    private String productContext;

    private Byte delFlag;

    private Date createTime;

    private Date updateTime;

    private String createPeople;

    private String productType;

    private Integer productStatus;

    private String productCompany;

    private String deptId;

}