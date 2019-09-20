package com.jzkj.miservice.entity;

public class SysPaperFactory {
    private String syspaperId;

    private String syspaperName;

    private String syspaperLongitude;

    private String syspaperLatitude;

    private String syspaperPhone;

    private String syspaperWx;

    public String getSyspaperId() {
        return syspaperId;
    }

    public void setSyspaperId(String syspaperId) {
        this.syspaperId = syspaperId == null ? null : syspaperId.trim();
    }

    public String getSyspaperName() {
        return syspaperName;
    }

    public void setSyspaperName(String syspaperName) {
        this.syspaperName = syspaperName == null ? null : syspaperName.trim();
    }

    public String getSyspaperLongitude() {
        return syspaperLongitude;
    }

    public void setSyspaperLongitude(String syspaperLongitude) {
        this.syspaperLongitude = syspaperLongitude == null ? null : syspaperLongitude.trim();
    }

    public String getSyspaperLatitude() {
        return syspaperLatitude;
    }

    public void setSyspaperLatitude(String syspaperLatitude) {
        this.syspaperLatitude = syspaperLatitude == null ? null : syspaperLatitude.trim();
    }

    public String getSyspaperPhone() {
        return syspaperPhone;
    }

    public void setSyspaperPhone(String syspaperPhone) {
        this.syspaperPhone = syspaperPhone == null ? null : syspaperPhone.trim();
    }

    public String getSyspaperWx() {
        return syspaperWx;
    }

    public void setSyspaperWx(String syspaperWx) {
        this.syspaperWx = syspaperWx == null ? null : syspaperWx.trim();
    }
}