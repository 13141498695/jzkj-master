package com.jzkj.miservice.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysBarcodeContextExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysBarcodeContextExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBarcodeIdIsNull() {
            addCriterion("barcode_id is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIdIsNotNull() {
            addCriterion("barcode_id is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIdEqualTo(String value) {
            addCriterion("barcode_id =", value, "barcodeId");
            return (Criteria) this;
        }

        public Criteria andBarcodeIdNotEqualTo(String value) {
            addCriterion("barcode_id <>", value, "barcodeId");
            return (Criteria) this;
        }

        public Criteria andBarcodeIdGreaterThan(String value) {
            addCriterion("barcode_id >", value, "barcodeId");
            return (Criteria) this;
        }

        public Criteria andBarcodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("barcode_id >=", value, "barcodeId");
            return (Criteria) this;
        }

        public Criteria andBarcodeIdLessThan(String value) {
            addCriterion("barcode_id <", value, "barcodeId");
            return (Criteria) this;
        }

        public Criteria andBarcodeIdLessThanOrEqualTo(String value) {
            addCriterion("barcode_id <=", value, "barcodeId");
            return (Criteria) this;
        }

        public Criteria andBarcodeIdLike(String value) {
            addCriterion("barcode_id like", value, "barcodeId");
            return (Criteria) this;
        }

        public Criteria andBarcodeIdNotLike(String value) {
            addCriterion("barcode_id not like", value, "barcodeId");
            return (Criteria) this;
        }

        public Criteria andBarcodeIdIn(List<String> values) {
            addCriterion("barcode_id in", values, "barcodeId");
            return (Criteria) this;
        }

        public Criteria andBarcodeIdNotIn(List<String> values) {
            addCriterion("barcode_id not in", values, "barcodeId");
            return (Criteria) this;
        }

        public Criteria andBarcodeIdBetween(String value1, String value2) {
            addCriterion("barcode_id between", value1, value2, "barcodeId");
            return (Criteria) this;
        }

        public Criteria andBarcodeIdNotBetween(String value1, String value2) {
            addCriterion("barcode_id not between", value1, value2, "barcodeId");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlIsNull() {
            addCriterion("barcode_url is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlIsNotNull() {
            addCriterion("barcode_url is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlEqualTo(String value) {
            addCriterion("barcode_url =", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlNotEqualTo(String value) {
            addCriterion("barcode_url <>", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlGreaterThan(String value) {
            addCriterion("barcode_url >", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("barcode_url >=", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlLessThan(String value) {
            addCriterion("barcode_url <", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlLessThanOrEqualTo(String value) {
            addCriterion("barcode_url <=", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlLike(String value) {
            addCriterion("barcode_url like", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlNotLike(String value) {
            addCriterion("barcode_url not like", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlIn(List<String> values) {
            addCriterion("barcode_url in", values, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlNotIn(List<String> values) {
            addCriterion("barcode_url not in", values, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlBetween(String value1, String value2) {
            addCriterion("barcode_url between", value1, value2, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlNotBetween(String value1, String value2) {
            addCriterion("barcode_url not between", value1, value2, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountIsNull() {
            addCriterion("barcode_count is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountIsNotNull() {
            addCriterion("barcode_count is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountEqualTo(Integer value) {
            addCriterion("barcode_count =", value, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountNotEqualTo(Integer value) {
            addCriterion("barcode_count <>", value, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountGreaterThan(Integer value) {
            addCriterion("barcode_count >", value, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("barcode_count >=", value, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountLessThan(Integer value) {
            addCriterion("barcode_count <", value, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountLessThanOrEqualTo(Integer value) {
            addCriterion("barcode_count <=", value, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountIn(List<Integer> values) {
            addCriterion("barcode_count in", values, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountNotIn(List<Integer> values) {
            addCriterion("barcode_count not in", values, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountBetween(Integer value1, Integer value2) {
            addCriterion("barcode_count between", value1, value2, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("barcode_count not between", value1, value2, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressIsNull() {
            addCriterion("barcode_address is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressIsNotNull() {
            addCriterion("barcode_address is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressEqualTo(String value) {
            addCriterion("barcode_address =", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressNotEqualTo(String value) {
            addCriterion("barcode_address <>", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressGreaterThan(String value) {
            addCriterion("barcode_address >", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("barcode_address >=", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressLessThan(String value) {
            addCriterion("barcode_address <", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressLessThanOrEqualTo(String value) {
            addCriterion("barcode_address <=", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressLike(String value) {
            addCriterion("barcode_address like", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressNotLike(String value) {
            addCriterion("barcode_address not like", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressIn(List<String> values) {
            addCriterion("barcode_address in", values, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressNotIn(List<String> values) {
            addCriterion("barcode_address not in", values, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressBetween(String value1, String value2) {
            addCriterion("barcode_address between", value1, value2, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressNotBetween(String value1, String value2) {
            addCriterion("barcode_address not between", value1, value2, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeStatusIsNull() {
            addCriterion("barcode_status is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeStatusIsNotNull() {
            addCriterion("barcode_status is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeStatusEqualTo(Integer value) {
            addCriterion("barcode_status =", value, "barcodeStatus");
            return (Criteria) this;
        }

        public Criteria andBarcodeStatusNotEqualTo(Integer value) {
            addCriterion("barcode_status <>", value, "barcodeStatus");
            return (Criteria) this;
        }

        public Criteria andBarcodeStatusGreaterThan(Integer value) {
            addCriterion("barcode_status >", value, "barcodeStatus");
            return (Criteria) this;
        }

        public Criteria andBarcodeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("barcode_status >=", value, "barcodeStatus");
            return (Criteria) this;
        }

        public Criteria andBarcodeStatusLessThan(Integer value) {
            addCriterion("barcode_status <", value, "barcodeStatus");
            return (Criteria) this;
        }

        public Criteria andBarcodeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("barcode_status <=", value, "barcodeStatus");
            return (Criteria) this;
        }

        public Criteria andBarcodeStatusIn(List<Integer> values) {
            addCriterion("barcode_status in", values, "barcodeStatus");
            return (Criteria) this;
        }

        public Criteria andBarcodeStatusNotIn(List<Integer> values) {
            addCriterion("barcode_status not in", values, "barcodeStatus");
            return (Criteria) this;
        }

        public Criteria andBarcodeStatusBetween(Integer value1, Integer value2) {
            addCriterion("barcode_status between", value1, value2, "barcodeStatus");
            return (Criteria) this;
        }

        public Criteria andBarcodeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("barcode_status not between", value1, value2, "barcodeStatus");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andBarcodePiciIsNull() {
            addCriterion("barcode_pici is null");
            return (Criteria) this;
        }

        public Criteria andBarcodePiciIsNotNull() {
            addCriterion("barcode_pici is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodePiciEqualTo(String value) {
            addCriterion("barcode_pici =", value, "barcodePici");
            return (Criteria) this;
        }

        public Criteria andBarcodePiciNotEqualTo(String value) {
            addCriterion("barcode_pici <>", value, "barcodePici");
            return (Criteria) this;
        }

        public Criteria andBarcodePiciGreaterThan(String value) {
            addCriterion("barcode_pici >", value, "barcodePici");
            return (Criteria) this;
        }

        public Criteria andBarcodePiciGreaterThanOrEqualTo(String value) {
            addCriterion("barcode_pici >=", value, "barcodePici");
            return (Criteria) this;
        }

        public Criteria andBarcodePiciLessThan(String value) {
            addCriterion("barcode_pici <", value, "barcodePici");
            return (Criteria) this;
        }

        public Criteria andBarcodePiciLessThanOrEqualTo(String value) {
            addCriterion("barcode_pici <=", value, "barcodePici");
            return (Criteria) this;
        }

        public Criteria andBarcodePiciLike(String value) {
            addCriterion("barcode_pici like", value, "barcodePici");
            return (Criteria) this;
        }

        public Criteria andBarcodePiciNotLike(String value) {
            addCriterion("barcode_pici not like", value, "barcodePici");
            return (Criteria) this;
        }

        public Criteria andBarcodePiciIn(List<String> values) {
            addCriterion("barcode_pici in", values, "barcodePici");
            return (Criteria) this;
        }

        public Criteria andBarcodePiciNotIn(List<String> values) {
            addCriterion("barcode_pici not in", values, "barcodePici");
            return (Criteria) this;
        }

        public Criteria andBarcodePiciBetween(String value1, String value2) {
            addCriterion("barcode_pici between", value1, value2, "barcodePici");
            return (Criteria) this;
        }

        public Criteria andBarcodePiciNotBetween(String value1, String value2) {
            addCriterion("barcode_pici not between", value1, value2, "barcodePici");
            return (Criteria) this;
        }

        public Criteria andBarcodeCreatetimeIsNull() {
            addCriterion("barcode_createTime is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeCreatetimeIsNotNull() {
            addCriterion("barcode_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeCreatetimeEqualTo(Date value) {
            addCriterion("barcode_createTime =", value, "barcodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeCreatetimeNotEqualTo(Date value) {
            addCriterion("barcode_createTime <>", value, "barcodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeCreatetimeGreaterThan(Date value) {
            addCriterion("barcode_createTime >", value, "barcodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("barcode_createTime >=", value, "barcodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeCreatetimeLessThan(Date value) {
            addCriterion("barcode_createTime <", value, "barcodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("barcode_createTime <=", value, "barcodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeCreatetimeIn(List<Date> values) {
            addCriterion("barcode_createTime in", values, "barcodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeCreatetimeNotIn(List<Date> values) {
            addCriterion("barcode_createTime not in", values, "barcodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeCreatetimeBetween(Date value1, Date value2) {
            addCriterion("barcode_createTime between", value1, value2, "barcodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("barcode_createTime not between", value1, value2, "barcodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeUpdatetimeIsNull() {
            addCriterion("barcode_updateTime is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeUpdatetimeIsNotNull() {
            addCriterion("barcode_updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeUpdatetimeEqualTo(Date value) {
            addCriterion("barcode_updateTime =", value, "barcodeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeUpdatetimeNotEqualTo(Date value) {
            addCriterion("barcode_updateTime <>", value, "barcodeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeUpdatetimeGreaterThan(Date value) {
            addCriterion("barcode_updateTime >", value, "barcodeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("barcode_updateTime >=", value, "barcodeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeUpdatetimeLessThan(Date value) {
            addCriterion("barcode_updateTime <", value, "barcodeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("barcode_updateTime <=", value, "barcodeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeUpdatetimeIn(List<Date> values) {
            addCriterion("barcode_updateTime in", values, "barcodeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeUpdatetimeNotIn(List<Date> values) {
            addCriterion("barcode_updateTime not in", values, "barcodeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("barcode_updateTime between", value1, value2, "barcodeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("barcode_updateTime not between", value1, value2, "barcodeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBarcodeProductidIsNull() {
            addCriterion("barcode_productId is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeProductidIsNotNull() {
            addCriterion("barcode_productId is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeProductidEqualTo(String value) {
            addCriterion("barcode_productId =", value, "barcodeProductid");
            return (Criteria) this;
        }

        public Criteria andBarcodeProductidNotEqualTo(String value) {
            addCriterion("barcode_productId <>", value, "barcodeProductid");
            return (Criteria) this;
        }

        public Criteria andBarcodeProductidGreaterThan(String value) {
            addCriterion("barcode_productId >", value, "barcodeProductid");
            return (Criteria) this;
        }

        public Criteria andBarcodeProductidGreaterThanOrEqualTo(String value) {
            addCriterion("barcode_productId >=", value, "barcodeProductid");
            return (Criteria) this;
        }

        public Criteria andBarcodeProductidLessThan(String value) {
            addCriterion("barcode_productId <", value, "barcodeProductid");
            return (Criteria) this;
        }

        public Criteria andBarcodeProductidLessThanOrEqualTo(String value) {
            addCriterion("barcode_productId <=", value, "barcodeProductid");
            return (Criteria) this;
        }

        public Criteria andBarcodeProductidLike(String value) {
            addCriterion("barcode_productId like", value, "barcodeProductid");
            return (Criteria) this;
        }

        public Criteria andBarcodeProductidNotLike(String value) {
            addCriterion("barcode_productId not like", value, "barcodeProductid");
            return (Criteria) this;
        }

        public Criteria andBarcodeProductidIn(List<String> values) {
            addCriterion("barcode_productId in", values, "barcodeProductid");
            return (Criteria) this;
        }

        public Criteria andBarcodeProductidNotIn(List<String> values) {
            addCriterion("barcode_productId not in", values, "barcodeProductid");
            return (Criteria) this;
        }

        public Criteria andBarcodeProductidBetween(String value1, String value2) {
            addCriterion("barcode_productId between", value1, value2, "barcodeProductid");
            return (Criteria) this;
        }

        public Criteria andBarcodeProductidNotBetween(String value1, String value2) {
            addCriterion("barcode_productId not between", value1, value2, "barcodeProductid");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpIsNull() {
            addCriterion("barcode_Ip is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpIsNotNull() {
            addCriterion("barcode_Ip is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpEqualTo(String value) {
            addCriterion("barcode_Ip =", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpNotEqualTo(String value) {
            addCriterion("barcode_Ip <>", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpGreaterThan(String value) {
            addCriterion("barcode_Ip >", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpGreaterThanOrEqualTo(String value) {
            addCriterion("barcode_Ip >=", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpLessThan(String value) {
            addCriterion("barcode_Ip <", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpLessThanOrEqualTo(String value) {
            addCriterion("barcode_Ip <=", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpLike(String value) {
            addCriterion("barcode_Ip like", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpNotLike(String value) {
            addCriterion("barcode_Ip not like", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpIn(List<String> values) {
            addCriterion("barcode_Ip in", values, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpNotIn(List<String> values) {
            addCriterion("barcode_Ip not in", values, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpBetween(String value1, String value2) {
            addCriterion("barcode_Ip between", value1, value2, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpNotBetween(String value1, String value2) {
            addCriterion("barcode_Ip not between", value1, value2, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeBdurlIsNull() {
            addCriterion("barcode_bdurl is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeBdurlIsNotNull() {
            addCriterion("barcode_bdurl is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeBdurlEqualTo(String value) {
            addCriterion("barcode_bdurl =", value, "barcodeBdurl");
            return (Criteria) this;
        }

        public Criteria andBarcodeBdurlNotEqualTo(String value) {
            addCriterion("barcode_bdurl <>", value, "barcodeBdurl");
            return (Criteria) this;
        }

        public Criteria andBarcodeBdurlGreaterThan(String value) {
            addCriterion("barcode_bdurl >", value, "barcodeBdurl");
            return (Criteria) this;
        }

        public Criteria andBarcodeBdurlGreaterThanOrEqualTo(String value) {
            addCriterion("barcode_bdurl >=", value, "barcodeBdurl");
            return (Criteria) this;
        }

        public Criteria andBarcodeBdurlLessThan(String value) {
            addCriterion("barcode_bdurl <", value, "barcodeBdurl");
            return (Criteria) this;
        }

        public Criteria andBarcodeBdurlLessThanOrEqualTo(String value) {
            addCriterion("barcode_bdurl <=", value, "barcodeBdurl");
            return (Criteria) this;
        }

        public Criteria andBarcodeBdurlLike(String value) {
            addCriterion("barcode_bdurl like", value, "barcodeBdurl");
            return (Criteria) this;
        }

        public Criteria andBarcodeBdurlNotLike(String value) {
            addCriterion("barcode_bdurl not like", value, "barcodeBdurl");
            return (Criteria) this;
        }

        public Criteria andBarcodeBdurlIn(List<String> values) {
            addCriterion("barcode_bdurl in", values, "barcodeBdurl");
            return (Criteria) this;
        }

        public Criteria andBarcodeBdurlNotIn(List<String> values) {
            addCriterion("barcode_bdurl not in", values, "barcodeBdurl");
            return (Criteria) this;
        }

        public Criteria andBarcodeBdurlBetween(String value1, String value2) {
            addCriterion("barcode_bdurl between", value1, value2, "barcodeBdurl");
            return (Criteria) this;
        }

        public Criteria andBarcodeBdurlNotBetween(String value1, String value2) {
            addCriterion("barcode_bdurl not between", value1, value2, "barcodeBdurl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}