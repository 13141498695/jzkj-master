package com.com.jzkj.miservice.entity.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoadEntityExample {
    /**
     * sys_road
     */
    protected String orderByClause;

    /**
     * sys_road
     */
    protected boolean distinct;

    /**
     * sys_road
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Tue Jan 15 13:25:42 CST 2019
     */
    public RoadEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:25:42 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:25:42 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:25:42 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:25:42 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:25:42 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:25:42 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:25:42 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:25:42 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:25:42 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:25:42 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * sys_road Tue Jan 15 13:25:42 CST 2019
     */
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

        public Criteria andRoadIdIsNull() {
            addCriterion("road_id is null");
            return (Criteria) this;
        }

        public Criteria andRoadIdIsNotNull() {
            addCriterion("road_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoadIdEqualTo(String value) {
            addCriterion("road_id =", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdNotEqualTo(String value) {
            addCriterion("road_id <>", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdGreaterThan(String value) {
            addCriterion("road_id >", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdGreaterThanOrEqualTo(String value) {
            addCriterion("road_id >=", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdLessThan(String value) {
            addCriterion("road_id <", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdLessThanOrEqualTo(String value) {
            addCriterion("road_id <=", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdLike(String value) {
            addCriterion("road_id like", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdNotLike(String value) {
            addCriterion("road_id not like", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdIn(List<String> values) {
            addCriterion("road_id in", values, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdNotIn(List<String> values) {
            addCriterion("road_id not in", values, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdBetween(String value1, String value2) {
            addCriterion("road_id between", value1, value2, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdNotBetween(String value1, String value2) {
            addCriterion("road_id not between", value1, value2, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadNameIsNull() {
            addCriterion("road_name is null");
            return (Criteria) this;
        }

        public Criteria andRoadNameIsNotNull() {
            addCriterion("road_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoadNameEqualTo(String value) {
            addCriterion("road_name =", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotEqualTo(String value) {
            addCriterion("road_name <>", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameGreaterThan(String value) {
            addCriterion("road_name >", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameGreaterThanOrEqualTo(String value) {
            addCriterion("road_name >=", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameLessThan(String value) {
            addCriterion("road_name <", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameLessThanOrEqualTo(String value) {
            addCriterion("road_name <=", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameLike(String value) {
            addCriterion("road_name like", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotLike(String value) {
            addCriterion("road_name not like", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameIn(List<String> values) {
            addCriterion("road_name in", values, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotIn(List<String> values) {
            addCriterion("road_name not in", values, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameBetween(String value1, String value2) {
            addCriterion("road_name between", value1, value2, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotBetween(String value1, String value2) {
            addCriterion("road_name not between", value1, value2, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadDescIsNull() {
            addCriterion("road_desc is null");
            return (Criteria) this;
        }

        public Criteria andRoadDescIsNotNull() {
            addCriterion("road_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRoadDescEqualTo(String value) {
            addCriterion("road_desc =", value, "roadDesc");
            return (Criteria) this;
        }

        public Criteria andRoadDescNotEqualTo(String value) {
            addCriterion("road_desc <>", value, "roadDesc");
            return (Criteria) this;
        }

        public Criteria andRoadDescGreaterThan(String value) {
            addCriterion("road_desc >", value, "roadDesc");
            return (Criteria) this;
        }

        public Criteria andRoadDescGreaterThanOrEqualTo(String value) {
            addCriterion("road_desc >=", value, "roadDesc");
            return (Criteria) this;
        }

        public Criteria andRoadDescLessThan(String value) {
            addCriterion("road_desc <", value, "roadDesc");
            return (Criteria) this;
        }

        public Criteria andRoadDescLessThanOrEqualTo(String value) {
            addCriterion("road_desc <=", value, "roadDesc");
            return (Criteria) this;
        }

        public Criteria andRoadDescLike(String value) {
            addCriterion("road_desc like", value, "roadDesc");
            return (Criteria) this;
        }

        public Criteria andRoadDescNotLike(String value) {
            addCriterion("road_desc not like", value, "roadDesc");
            return (Criteria) this;
        }

        public Criteria andRoadDescIn(List<String> values) {
            addCriterion("road_desc in", values, "roadDesc");
            return (Criteria) this;
        }

        public Criteria andRoadDescNotIn(List<String> values) {
            addCriterion("road_desc not in", values, "roadDesc");
            return (Criteria) this;
        }

        public Criteria andRoadDescBetween(String value1, String value2) {
            addCriterion("road_desc between", value1, value2, "roadDesc");
            return (Criteria) this;
        }

        public Criteria andRoadDescNotBetween(String value1, String value2) {
            addCriterion("road_desc not between", value1, value2, "roadDesc");
            return (Criteria) this;
        }

        public Criteria andRoadBoxIdIsNull() {
            addCriterion("road_box_id is null");
            return (Criteria) this;
        }

        public Criteria andRoadBoxIdIsNotNull() {
            addCriterion("road_box_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoadBoxIdEqualTo(String value) {
            addCriterion("road_box_id =", value, "roadBoxId");
            return (Criteria) this;
        }

        public Criteria andRoadBoxIdNotEqualTo(String value) {
            addCriterion("road_box_id <>", value, "roadBoxId");
            return (Criteria) this;
        }

        public Criteria andRoadBoxIdGreaterThan(String value) {
            addCriterion("road_box_id >", value, "roadBoxId");
            return (Criteria) this;
        }

        public Criteria andRoadBoxIdGreaterThanOrEqualTo(String value) {
            addCriterion("road_box_id >=", value, "roadBoxId");
            return (Criteria) this;
        }

        public Criteria andRoadBoxIdLessThan(String value) {
            addCriterion("road_box_id <", value, "roadBoxId");
            return (Criteria) this;
        }

        public Criteria andRoadBoxIdLessThanOrEqualTo(String value) {
            addCriterion("road_box_id <=", value, "roadBoxId");
            return (Criteria) this;
        }

        public Criteria andRoadBoxIdLike(String value) {
            addCriterion("road_box_id like", value, "roadBoxId");
            return (Criteria) this;
        }

        public Criteria andRoadBoxIdNotLike(String value) {
            addCriterion("road_box_id not like", value, "roadBoxId");
            return (Criteria) this;
        }

        public Criteria andRoadBoxIdIn(List<String> values) {
            addCriterion("road_box_id in", values, "roadBoxId");
            return (Criteria) this;
        }

        public Criteria andRoadBoxIdNotIn(List<String> values) {
            addCriterion("road_box_id not in", values, "roadBoxId");
            return (Criteria) this;
        }

        public Criteria andRoadBoxIdBetween(String value1, String value2) {
            addCriterion("road_box_id between", value1, value2, "roadBoxId");
            return (Criteria) this;
        }

        public Criteria andRoadBoxIdNotBetween(String value1, String value2) {
            addCriterion("road_box_id not between", value1, value2, "roadBoxId");
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

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Byte value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Byte value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Byte value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Byte value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Byte value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Byte> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Byte> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Byte value1, Byte value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }
    }

    /**
     * sys_road
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sys_road Tue Jan 15 13:25:42 CST 2019
     */
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