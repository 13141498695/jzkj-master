package com.com.jzkj.miservice.entity.Barcode;

import lombok.Data;

import java.util.Date;
@Data
public class SysBarcode {
    private Integer id;

    private Integer needCount;

    private Date createTime;

    private Integer intCount;

    private Integer barcodeStatus;

    private Integer scCount;

    private Date operationTime;

    private String sqRemarks;

    private String createPeople;

    private String operatePeople;

    private String clRemark;

    private String productId;

    private String zipurl;

}
