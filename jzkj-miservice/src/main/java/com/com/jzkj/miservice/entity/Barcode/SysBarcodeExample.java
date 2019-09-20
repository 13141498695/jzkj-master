package com.com.jzkj.miservice.entity.Barcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysBarcodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysBarcodeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNeedCountIsNull() {
            addCriterion("need_count is null");
            return (Criteria) this;
        }

        public Criteria andNeedCountIsNotNull() {
            addCriterion("need_count is not null");
            return (Criteria) this;
        }

        public Criteria andNeedCountEqualTo(Integer value) {
            addCriterion("need_count =", value, "needCount");
            return (Criteria) this;
        }

        public Criteria andNeedCountNotEqualTo(Integer value) {
            addCriterion("need_count <>", value, "needCount");
            return (Criteria) this;
        }

        public Criteria andNeedCountGreaterThan(Integer value) {
            addCriterion("need_count >", value, "needCount");
            return (Criteria) this;
        }

        public Criteria andNeedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("need_count >=", value, "needCount");
            return (Criteria) this;
        }

        public Criteria andNeedCountLessThan(Integer value) {
            addCriterion("need_count <", value, "needCount");
            return (Criteria) this;
        }

        public Criteria andNeedCountLessThanOrEqualTo(Integer value) {
            addCriterion("need_count <=", value, "needCount");
            return (Criteria) this;
        }

        public Criteria andNeedCountIn(List<Integer> values) {
            addCriterion("need_count in", values, "needCount");
            return (Criteria) this;
        }

        public Criteria andNeedCountNotIn(List<Integer> values) {
            addCriterion("need_count not in", values, "needCount");
            return (Criteria) this;
        }

        public Criteria andNeedCountBetween(Integer value1, Integer value2) {
            addCriterion("need_count between", value1, value2, "needCount");
            return (Criteria) this;
        }

        public Criteria andNeedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("need_count not between", value1, value2, "needCount");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIntCountIsNull() {
            addCriterion("int_count is null");
            return (Criteria) this;
        }

        public Criteria andIntCountIsNotNull() {
            addCriterion("int_count is not null");
            return (Criteria) this;
        }

        public Criteria andIntCountEqualTo(Integer value) {
            addCriterion("int_count =", value, "intCount");
            return (Criteria) this;
        }

        public Criteria andIntCountNotEqualTo(Integer value) {
            addCriterion("int_count <>", value, "intCount");
            return (Criteria) this;
        }

        public Criteria andIntCountGreaterThan(Integer value) {
            addCriterion("int_count >", value, "intCount");
            return (Criteria) this;
        }

        public Criteria andIntCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("int_count >=", value, "intCount");
            return (Criteria) this;
        }

        public Criteria andIntCountLessThan(Integer value) {
            addCriterion("int_count <", value, "intCount");
            return (Criteria) this;
        }

        public Criteria andIntCountLessThanOrEqualTo(Integer value) {
            addCriterion("int_count <=", value, "intCount");
            return (Criteria) this;
        }

        public Criteria andIntCountIn(List<Integer> values) {
            addCriterion("int_count in", values, "intCount");
            return (Criteria) this;
        }

        public Criteria andIntCountNotIn(List<Integer> values) {
            addCriterion("int_count not in", values, "intCount");
            return (Criteria) this;
        }

        public Criteria andIntCountBetween(Integer value1, Integer value2) {
            addCriterion("int_count between", value1, value2, "intCount");
            return (Criteria) this;
        }

        public Criteria andIntCountNotBetween(Integer value1, Integer value2) {
            addCriterion("int_count not between", value1, value2, "intCount");
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

        public Criteria andScCountIsNull() {
            addCriterion("sc_count is null");
            return (Criteria) this;
        }

        public Criteria andScCountIsNotNull() {
            addCriterion("sc_count is not null");
            return (Criteria) this;
        }

        public Criteria andScCountEqualTo(Integer value) {
            addCriterion("sc_count =", value, "scCount");
            return (Criteria) this;
        }

        public Criteria andScCountNotEqualTo(Integer value) {
            addCriterion("sc_count <>", value, "scCount");
            return (Criteria) this;
        }

        public Criteria andScCountGreaterThan(Integer value) {
            addCriterion("sc_count >", value, "scCount");
            return (Criteria) this;
        }

        public Criteria andScCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_count >=", value, "scCount");
            return (Criteria) this;
        }

        public Criteria andScCountLessThan(Integer value) {
            addCriterion("sc_count <", value, "scCount");
            return (Criteria) this;
        }

        public Criteria andScCountLessThanOrEqualTo(Integer value) {
            addCriterion("sc_count <=", value, "scCount");
            return (Criteria) this;
        }

        public Criteria andScCountIn(List<Integer> values) {
            addCriterion("sc_count in", values, "scCount");
            return (Criteria) this;
        }

        public Criteria andScCountNotIn(List<Integer> values) {
            addCriterion("sc_count not in", values, "scCount");
            return (Criteria) this;
        }

        public Criteria andScCountBetween(Integer value1, Integer value2) {
            addCriterion("sc_count between", value1, value2, "scCount");
            return (Criteria) this;
        }

        public Criteria andScCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_count not between", value1, value2, "scCount");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNull() {
            addCriterion("operation_time is null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNotNull() {
            addCriterion("operation_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeEqualTo(Date value) {
            addCriterion("operation_time =", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotEqualTo(Date value) {
            addCriterion("operation_time <>", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThan(Date value) {
            addCriterion("operation_time >", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operation_time >=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThan(Date value) {
            addCriterion("operation_time <", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThanOrEqualTo(Date value) {
            addCriterion("operation_time <=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIn(List<Date> values) {
            addCriterion("operation_time in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotIn(List<Date> values) {
            addCriterion("operation_time not in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeBetween(Date value1, Date value2) {
            addCriterion("operation_time between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotBetween(Date value1, Date value2) {
            addCriterion("operation_time not between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andSqRemarksIsNull() {
            addCriterion("sq_remarks is null");
            return (Criteria) this;
        }

        public Criteria andSqRemarksIsNotNull() {
            addCriterion("sq_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andSqRemarksEqualTo(String value) {
            addCriterion("sq_remarks =", value, "sqRemarks");
            return (Criteria) this;
        }

        public Criteria andSqRemarksNotEqualTo(String value) {
            addCriterion("sq_remarks <>", value, "sqRemarks");
            return (Criteria) this;
        }

        public Criteria andSqRemarksGreaterThan(String value) {
            addCriterion("sq_remarks >", value, "sqRemarks");
            return (Criteria) this;
        }

        public Criteria andSqRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("sq_remarks >=", value, "sqRemarks");
            return (Criteria) this;
        }

        public Criteria andSqRemarksLessThan(String value) {
            addCriterion("sq_remarks <", value, "sqRemarks");
            return (Criteria) this;
        }

        public Criteria andSqRemarksLessThanOrEqualTo(String value) {
            addCriterion("sq_remarks <=", value, "sqRemarks");
            return (Criteria) this;
        }

        public Criteria andSqRemarksLike(String value) {
            addCriterion("sq_remarks like", value, "sqRemarks");
            return (Criteria) this;
        }

        public Criteria andSqRemarksNotLike(String value) {
            addCriterion("sq_remarks not like", value, "sqRemarks");
            return (Criteria) this;
        }

        public Criteria andSqRemarksIn(List<String> values) {
            addCriterion("sq_remarks in", values, "sqRemarks");
            return (Criteria) this;
        }

        public Criteria andSqRemarksNotIn(List<String> values) {
            addCriterion("sq_remarks not in", values, "sqRemarks");
            return (Criteria) this;
        }

        public Criteria andSqRemarksBetween(String value1, String value2) {
            addCriterion("sq_remarks between", value1, value2, "sqRemarks");
            return (Criteria) this;
        }

        public Criteria andSqRemarksNotBetween(String value1, String value2) {
            addCriterion("sq_remarks not between", value1, value2, "sqRemarks");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleIsNull() {
            addCriterion("create_people is null");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleIsNotNull() {
            addCriterion("create_people is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleEqualTo(String value) {
            addCriterion("create_people =", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleNotEqualTo(String value) {
            addCriterion("create_people <>", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleGreaterThan(String value) {
            addCriterion("create_people >", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("create_people >=", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleLessThan(String value) {
            addCriterion("create_people <", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleLessThanOrEqualTo(String value) {
            addCriterion("create_people <=", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleLike(String value) {
            addCriterion("create_people like", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleNotLike(String value) {
            addCriterion("create_people not like", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleIn(List<String> values) {
            addCriterion("create_people in", values, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleNotIn(List<String> values) {
            addCriterion("create_people not in", values, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleBetween(String value1, String value2) {
            addCriterion("create_people between", value1, value2, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleNotBetween(String value1, String value2) {
            addCriterion("create_people not between", value1, value2, "createPeople");
            return (Criteria) this;
        }

        public Criteria andOperatePeopleIsNull() {
            addCriterion("operate_people is null");
            return (Criteria) this;
        }

        public Criteria andOperatePeopleIsNotNull() {
            addCriterion("operate_people is not null");
            return (Criteria) this;
        }

        public Criteria andOperatePeopleEqualTo(String value) {
            addCriterion("operate_people =", value, "operatePeople");
            return (Criteria) this;
        }

        public Criteria andOperatePeopleNotEqualTo(String value) {
            addCriterion("operate_people <>", value, "operatePeople");
            return (Criteria) this;
        }

        public Criteria andOperatePeopleGreaterThan(String value) {
            addCriterion("operate_people >", value, "operatePeople");
            return (Criteria) this;
        }

        public Criteria andOperatePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("operate_people >=", value, "operatePeople");
            return (Criteria) this;
        }

        public Criteria andOperatePeopleLessThan(String value) {
            addCriterion("operate_people <", value, "operatePeople");
            return (Criteria) this;
        }

        public Criteria andOperatePeopleLessThanOrEqualTo(String value) {
            addCriterion("operate_people <=", value, "operatePeople");
            return (Criteria) this;
        }

        public Criteria andOperatePeopleLike(String value) {
            addCriterion("operate_people like", value, "operatePeople");
            return (Criteria) this;
        }

        public Criteria andOperatePeopleNotLike(String value) {
            addCriterion("operate_people not like", value, "operatePeople");
            return (Criteria) this;
        }

        public Criteria andOperatePeopleIn(List<String> values) {
            addCriterion("operate_people in", values, "operatePeople");
            return (Criteria) this;
        }

        public Criteria andOperatePeopleNotIn(List<String> values) {
            addCriterion("operate_people not in", values, "operatePeople");
            return (Criteria) this;
        }

        public Criteria andOperatePeopleBetween(String value1, String value2) {
            addCriterion("operate_people between", value1, value2, "operatePeople");
            return (Criteria) this;
        }

        public Criteria andOperatePeopleNotBetween(String value1, String value2) {
            addCriterion("operate_people not between", value1, value2, "operatePeople");
            return (Criteria) this;
        }

        public Criteria andClRemarkIsNull() {
            addCriterion("cl_remark is null");
            return (Criteria) this;
        }

        public Criteria andClRemarkIsNotNull() {
            addCriterion("cl_remark is not null");
            return (Criteria) this;
        }

        public Criteria andClRemarkEqualTo(String value) {
            addCriterion("cl_remark =", value, "clRemark");
            return (Criteria) this;
        }

        public Criteria andClRemarkNotEqualTo(String value) {
            addCriterion("cl_remark <>", value, "clRemark");
            return (Criteria) this;
        }

        public Criteria andClRemarkGreaterThan(String value) {
            addCriterion("cl_remark >", value, "clRemark");
            return (Criteria) this;
        }

        public Criteria andClRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("cl_remark >=", value, "clRemark");
            return (Criteria) this;
        }

        public Criteria andClRemarkLessThan(String value) {
            addCriterion("cl_remark <", value, "clRemark");
            return (Criteria) this;
        }

        public Criteria andClRemarkLessThanOrEqualTo(String value) {
            addCriterion("cl_remark <=", value, "clRemark");
            return (Criteria) this;
        }

        public Criteria andClRemarkLike(String value) {
            addCriterion("cl_remark like", value, "clRemark");
            return (Criteria) this;
        }

        public Criteria andClRemarkNotLike(String value) {
            addCriterion("cl_remark not like", value, "clRemark");
            return (Criteria) this;
        }

        public Criteria andClRemarkIn(List<String> values) {
            addCriterion("cl_remark in", values, "clRemark");
            return (Criteria) this;
        }

        public Criteria andClRemarkNotIn(List<String> values) {
            addCriterion("cl_remark not in", values, "clRemark");
            return (Criteria) this;
        }

        public Criteria andClRemarkBetween(String value1, String value2) {
            addCriterion("cl_remark between", value1, value2, "clRemark");
            return (Criteria) this;
        }

        public Criteria andClRemarkNotBetween(String value1, String value2) {
            addCriterion("cl_remark not between", value1, value2, "clRemark");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
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