package com.jzkj.miservice.entity;

import java.util.ArrayList;
import java.util.List;

public class SysPaperFactoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPaperFactoryExample() {
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

        public Criteria andSyspaperIdIsNull() {
            addCriterion("syspaper_id is null");
            return (Criteria) this;
        }

        public Criteria andSyspaperIdIsNotNull() {
            addCriterion("syspaper_id is not null");
            return (Criteria) this;
        }

        public Criteria andSyspaperIdEqualTo(String value) {
            addCriterion("syspaper_id =", value, "syspaperId");
            return (Criteria) this;
        }

        public Criteria andSyspaperIdNotEqualTo(String value) {
            addCriterion("syspaper_id <>", value, "syspaperId");
            return (Criteria) this;
        }

        public Criteria andSyspaperIdGreaterThan(String value) {
            addCriterion("syspaper_id >", value, "syspaperId");
            return (Criteria) this;
        }

        public Criteria andSyspaperIdGreaterThanOrEqualTo(String value) {
            addCriterion("syspaper_id >=", value, "syspaperId");
            return (Criteria) this;
        }

        public Criteria andSyspaperIdLessThan(String value) {
            addCriterion("syspaper_id <", value, "syspaperId");
            return (Criteria) this;
        }

        public Criteria andSyspaperIdLessThanOrEqualTo(String value) {
            addCriterion("syspaper_id <=", value, "syspaperId");
            return (Criteria) this;
        }

        public Criteria andSyspaperIdLike(String value) {
            addCriterion("syspaper_id like", value, "syspaperId");
            return (Criteria) this;
        }

        public Criteria andSyspaperIdNotLike(String value) {
            addCriterion("syspaper_id not like", value, "syspaperId");
            return (Criteria) this;
        }

        public Criteria andSyspaperIdIn(List<String> values) {
            addCriterion("syspaper_id in", values, "syspaperId");
            return (Criteria) this;
        }

        public Criteria andSyspaperIdNotIn(List<String> values) {
            addCriterion("syspaper_id not in", values, "syspaperId");
            return (Criteria) this;
        }

        public Criteria andSyspaperIdBetween(String value1, String value2) {
            addCriterion("syspaper_id between", value1, value2, "syspaperId");
            return (Criteria) this;
        }

        public Criteria andSyspaperIdNotBetween(String value1, String value2) {
            addCriterion("syspaper_id not between", value1, value2, "syspaperId");
            return (Criteria) this;
        }

        public Criteria andSyspaperNameIsNull() {
            addCriterion("syspaper_name is null");
            return (Criteria) this;
        }

        public Criteria andSyspaperNameIsNotNull() {
            addCriterion("syspaper_name is not null");
            return (Criteria) this;
        }

        public Criteria andSyspaperNameEqualTo(String value) {
            addCriterion("syspaper_name =", value, "syspaperName");
            return (Criteria) this;
        }

        public Criteria andSyspaperNameNotEqualTo(String value) {
            addCriterion("syspaper_name <>", value, "syspaperName");
            return (Criteria) this;
        }

        public Criteria andSyspaperNameGreaterThan(String value) {
            addCriterion("syspaper_name >", value, "syspaperName");
            return (Criteria) this;
        }

        public Criteria andSyspaperNameGreaterThanOrEqualTo(String value) {
            addCriterion("syspaper_name >=", value, "syspaperName");
            return (Criteria) this;
        }

        public Criteria andSyspaperNameLessThan(String value) {
            addCriterion("syspaper_name <", value, "syspaperName");
            return (Criteria) this;
        }

        public Criteria andSyspaperNameLessThanOrEqualTo(String value) {
            addCriterion("syspaper_name <=", value, "syspaperName");
            return (Criteria) this;
        }

        public Criteria andSyspaperNameLike(String value) {
            addCriterion("syspaper_name like", value, "syspaperName");
            return (Criteria) this;
        }

        public Criteria andSyspaperNameNotLike(String value) {
            addCriterion("syspaper_name not like", value, "syspaperName");
            return (Criteria) this;
        }

        public Criteria andSyspaperNameIn(List<String> values) {
            addCriterion("syspaper_name in", values, "syspaperName");
            return (Criteria) this;
        }

        public Criteria andSyspaperNameNotIn(List<String> values) {
            addCriterion("syspaper_name not in", values, "syspaperName");
            return (Criteria) this;
        }

        public Criteria andSyspaperNameBetween(String value1, String value2) {
            addCriterion("syspaper_name between", value1, value2, "syspaperName");
            return (Criteria) this;
        }

        public Criteria andSyspaperNameNotBetween(String value1, String value2) {
            addCriterion("syspaper_name not between", value1, value2, "syspaperName");
            return (Criteria) this;
        }

        public Criteria andSyspaperLongitudeIsNull() {
            addCriterion("syspaper_longitude is null");
            return (Criteria) this;
        }

        public Criteria andSyspaperLongitudeIsNotNull() {
            addCriterion("syspaper_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andSyspaperLongitudeEqualTo(String value) {
            addCriterion("syspaper_longitude =", value, "syspaperLongitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLongitudeNotEqualTo(String value) {
            addCriterion("syspaper_longitude <>", value, "syspaperLongitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLongitudeGreaterThan(String value) {
            addCriterion("syspaper_longitude >", value, "syspaperLongitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("syspaper_longitude >=", value, "syspaperLongitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLongitudeLessThan(String value) {
            addCriterion("syspaper_longitude <", value, "syspaperLongitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLongitudeLessThanOrEqualTo(String value) {
            addCriterion("syspaper_longitude <=", value, "syspaperLongitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLongitudeLike(String value) {
            addCriterion("syspaper_longitude like", value, "syspaperLongitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLongitudeNotLike(String value) {
            addCriterion("syspaper_longitude not like", value, "syspaperLongitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLongitudeIn(List<String> values) {
            addCriterion("syspaper_longitude in", values, "syspaperLongitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLongitudeNotIn(List<String> values) {
            addCriterion("syspaper_longitude not in", values, "syspaperLongitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLongitudeBetween(String value1, String value2) {
            addCriterion("syspaper_longitude between", value1, value2, "syspaperLongitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLongitudeNotBetween(String value1, String value2) {
            addCriterion("syspaper_longitude not between", value1, value2, "syspaperLongitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLatitudeIsNull() {
            addCriterion("syspaper_latitude is null");
            return (Criteria) this;
        }

        public Criteria andSyspaperLatitudeIsNotNull() {
            addCriterion("syspaper_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andSyspaperLatitudeEqualTo(String value) {
            addCriterion("syspaper_latitude =", value, "syspaperLatitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLatitudeNotEqualTo(String value) {
            addCriterion("syspaper_latitude <>", value, "syspaperLatitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLatitudeGreaterThan(String value) {
            addCriterion("syspaper_latitude >", value, "syspaperLatitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("syspaper_latitude >=", value, "syspaperLatitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLatitudeLessThan(String value) {
            addCriterion("syspaper_latitude <", value, "syspaperLatitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLatitudeLessThanOrEqualTo(String value) {
            addCriterion("syspaper_latitude <=", value, "syspaperLatitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLatitudeLike(String value) {
            addCriterion("syspaper_latitude like", value, "syspaperLatitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLatitudeNotLike(String value) {
            addCriterion("syspaper_latitude not like", value, "syspaperLatitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLatitudeIn(List<String> values) {
            addCriterion("syspaper_latitude in", values, "syspaperLatitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLatitudeNotIn(List<String> values) {
            addCriterion("syspaper_latitude not in", values, "syspaperLatitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLatitudeBetween(String value1, String value2) {
            addCriterion("syspaper_latitude between", value1, value2, "syspaperLatitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperLatitudeNotBetween(String value1, String value2) {
            addCriterion("syspaper_latitude not between", value1, value2, "syspaperLatitude");
            return (Criteria) this;
        }

        public Criteria andSyspaperPhoneIsNull() {
            addCriterion("syspaper_phone is null");
            return (Criteria) this;
        }

        public Criteria andSyspaperPhoneIsNotNull() {
            addCriterion("syspaper_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSyspaperPhoneEqualTo(String value) {
            addCriterion("syspaper_phone =", value, "syspaperPhone");
            return (Criteria) this;
        }

        public Criteria andSyspaperPhoneNotEqualTo(String value) {
            addCriterion("syspaper_phone <>", value, "syspaperPhone");
            return (Criteria) this;
        }

        public Criteria andSyspaperPhoneGreaterThan(String value) {
            addCriterion("syspaper_phone >", value, "syspaperPhone");
            return (Criteria) this;
        }

        public Criteria andSyspaperPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("syspaper_phone >=", value, "syspaperPhone");
            return (Criteria) this;
        }

        public Criteria andSyspaperPhoneLessThan(String value) {
            addCriterion("syspaper_phone <", value, "syspaperPhone");
            return (Criteria) this;
        }

        public Criteria andSyspaperPhoneLessThanOrEqualTo(String value) {
            addCriterion("syspaper_phone <=", value, "syspaperPhone");
            return (Criteria) this;
        }

        public Criteria andSyspaperPhoneLike(String value) {
            addCriterion("syspaper_phone like", value, "syspaperPhone");
            return (Criteria) this;
        }

        public Criteria andSyspaperPhoneNotLike(String value) {
            addCriterion("syspaper_phone not like", value, "syspaperPhone");
            return (Criteria) this;
        }

        public Criteria andSyspaperPhoneIn(List<String> values) {
            addCriterion("syspaper_phone in", values, "syspaperPhone");
            return (Criteria) this;
        }

        public Criteria andSyspaperPhoneNotIn(List<String> values) {
            addCriterion("syspaper_phone not in", values, "syspaperPhone");
            return (Criteria) this;
        }

        public Criteria andSyspaperPhoneBetween(String value1, String value2) {
            addCriterion("syspaper_phone between", value1, value2, "syspaperPhone");
            return (Criteria) this;
        }

        public Criteria andSyspaperPhoneNotBetween(String value1, String value2) {
            addCriterion("syspaper_phone not between", value1, value2, "syspaperPhone");
            return (Criteria) this;
        }

        public Criteria andSyspaperWxIsNull() {
            addCriterion("syspaper_wx is null");
            return (Criteria) this;
        }

        public Criteria andSyspaperWxIsNotNull() {
            addCriterion("syspaper_wx is not null");
            return (Criteria) this;
        }

        public Criteria andSyspaperWxEqualTo(String value) {
            addCriterion("syspaper_wx =", value, "syspaperWx");
            return (Criteria) this;
        }

        public Criteria andSyspaperWxNotEqualTo(String value) {
            addCriterion("syspaper_wx <>", value, "syspaperWx");
            return (Criteria) this;
        }

        public Criteria andSyspaperWxGreaterThan(String value) {
            addCriterion("syspaper_wx >", value, "syspaperWx");
            return (Criteria) this;
        }

        public Criteria andSyspaperWxGreaterThanOrEqualTo(String value) {
            addCriterion("syspaper_wx >=", value, "syspaperWx");
            return (Criteria) this;
        }

        public Criteria andSyspaperWxLessThan(String value) {
            addCriterion("syspaper_wx <", value, "syspaperWx");
            return (Criteria) this;
        }

        public Criteria andSyspaperWxLessThanOrEqualTo(String value) {
            addCriterion("syspaper_wx <=", value, "syspaperWx");
            return (Criteria) this;
        }

        public Criteria andSyspaperWxLike(String value) {
            addCriterion("syspaper_wx like", value, "syspaperWx");
            return (Criteria) this;
        }

        public Criteria andSyspaperWxNotLike(String value) {
            addCriterion("syspaper_wx not like", value, "syspaperWx");
            return (Criteria) this;
        }

        public Criteria andSyspaperWxIn(List<String> values) {
            addCriterion("syspaper_wx in", values, "syspaperWx");
            return (Criteria) this;
        }

        public Criteria andSyspaperWxNotIn(List<String> values) {
            addCriterion("syspaper_wx not in", values, "syspaperWx");
            return (Criteria) this;
        }

        public Criteria andSyspaperWxBetween(String value1, String value2) {
            addCriterion("syspaper_wx between", value1, value2, "syspaperWx");
            return (Criteria) this;
        }

        public Criteria andSyspaperWxNotBetween(String value1, String value2) {
            addCriterion("syspaper_wx not between", value1, value2, "syspaperWx");
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