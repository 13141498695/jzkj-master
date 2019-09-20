package com.jzkj.miservice.entity;

import java.util.Date;

public class SysBarcodeContext {
    private String barcodeId;

    private String barcodeUrl;

    private Integer barcodeCount;

    private String barcodeAddress;

    private Integer barcodeStatus;

    private String productName;

    private String barcodePici;

    private Date barcodeCreatetime;

    private Date barcodeUpdatetime;

    private String barcodeProductid;

    private String barcodeIp;

    private String barcodeBdurl;

    public String getBarcodeId() {
        return barcodeId;
    }

    public void setBarcodeId(String barcodeId) {
        this.barcodeId = barcodeId == null ? null : barcodeId.trim();
    }

    public String getBarcodeUrl() {
        return barcodeUrl;
    }

    public void setBarcodeUrl(String barcodeUrl) {
        this.barcodeUrl = barcodeUrl == null ? null : barcodeUrl.trim();
    }

    public Integer getBarcodeCount() {
        return barcodeCount;
    }

    public void setBarcodeCount(Integer barcodeCount) {
        this.barcodeCount = barcodeCount;
    }

    public String getBarcodeAddress() {
        return barcodeAddress;
    }

    public void setBarcodeAddress(String barcodeAddress) {
        this.barcodeAddress = barcodeAddress == null ? null : barcodeAddress.trim();
    }

    public Integer getBarcodeStatus() {
        return barcodeStatus;
    }

    public void setBarcodeStatus(Integer barcodeStatus) {
        this.barcodeStatus = barcodeStatus;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getBarcodePici() {
        return barcodePici;
    }

    public void setBarcodePici(String barcodePici) {
        this.barcodePici = barcodePici == null ? null : barcodePici.trim();
    }

    public Date getBarcodeCreatetime() {
        return barcodeCreatetime;
    }

    public void setBarcodeCreatetime(Date barcodeCreatetime) {
        this.barcodeCreatetime = barcodeCreatetime;
    }

    public Date getBarcodeUpdatetime() {
        return barcodeUpdatetime;
    }

    public void setBarcodeUpdatetime(Date barcodeUpdatetime) {
        this.barcodeUpdatetime = barcodeUpdatetime;
    }

    public String getBarcodeProductid() {
        return barcodeProductid;
    }

    public void setBarcodeProductid(String barcodeProductid) {
        this.barcodeProductid = barcodeProductid == null ? null : barcodeProductid.trim();
    }

    public String getBarcodeIp() {
        return barcodeIp;
    }

    public void setBarcodeIp(String barcodeIp) {
        this.barcodeIp = barcodeIp == null ? null : barcodeIp.trim();
    }

    public String getBarcodeBdurl() {
        return barcodeBdurl;
    }

    public void setBarcodeBdurl(String barcodeBdurl) {
        this.barcodeBdurl = barcodeBdurl == null ? null : barcodeBdurl.trim();
    }
}