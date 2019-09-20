package com.com.jzkj.miservice.entity.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoxEntityExample {
    /**
     * sys_box
     */
    protected String orderByClause;

    /**
     * sys_box
     */
    protected boolean distinct;

    /**
     * sys_box
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Tue Jan 15 13:25:42 CST 2019
     */
    public BoxEntityExample() {
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
     * sys_box Tue Jan 15 13:25:42 CST 2019
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

        public Criteria andBoxIdIsNull() {
            addCriterion("box_id is null");
            return (Criteria) this;
        }

        public Criteria andBoxIdIsNotNull() {
            addCriterion("box_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoxIdEqualTo(String value) {
            addCriterion("box_id =", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdNotEqualTo(String value) {
            addCriterion("box_id <>", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdGreaterThan(String value) {
            addCriterion("box_id >", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdGreaterThanOrEqualTo(String value) {
            addCriterion("box_id >=", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdLessThan(String value) {
            addCriterion("box_id <", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdLessThanOrEqualTo(String value) {
            addCriterion("box_id <=", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdLike(String value) {
            addCriterion("box_id like", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdNotLike(String value) {
            addCriterion("box_id not like", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdIn(List<String> values) {
            addCriterion("box_id in", values, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdNotIn(List<String> values) {
            addCriterion("box_id not in", values, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdBetween(String value1, String value2) {
            addCriterion("box_id between", value1, value2, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdNotBetween(String value1, String value2) {
            addCriterion("box_id not between", value1, value2, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxVersionIsNull() {
            addCriterion("box_version is null");
            return (Criteria) this;
        }

        public Criteria andBoxVersionIsNotNull() {
            addCriterion("box_version is not null");
            return (Criteria) this;
        }

        public Criteria andBoxVersionEqualTo(String value) {
            addCriterion("box_version =", value, "boxVersion");
            return (Criteria) this;
        }

        public Criteria andBoxVersionNotEqualTo(String value) {
            addCriterion("box_version <>", value, "boxVersion");
            return (Criteria) this;
        }

        public Criteria andBoxVersionGreaterThan(String value) {
            addCriterion("box_version >", value, "boxVersion");
            return (Criteria) this;
        }

        public Criteria andBoxVersionGreaterThanOrEqualTo(String value) {
            addCriterion("box_version >=", value, "boxVersion");
            return (Criteria) this;
        }

        public Criteria andBoxVersionLessThan(String value) {
            addCriterion("box_version <", value, "boxVersion");
            return (Criteria) this;
        }

        public Criteria andBoxVersionLessThanOrEqualTo(String value) {
            addCriterion("box_version <=", value, "boxVersion");
            return (Criteria) this;
        }

        public Criteria andBoxVersionLike(String value) {
            addCriterion("box_version like", value, "boxVersion");
            return (Criteria) this;
        }

        public Criteria andBoxVersionNotLike(String value) {
            addCriterion("box_version not like", value, "boxVersion");
            return (Criteria) this;
        }

        public Criteria andBoxVersionIn(List<String> values) {
            addCriterion("box_version in", values, "boxVersion");
            return (Criteria) this;
        }

        public Criteria andBoxVersionNotIn(List<String> values) {
            addCriterion("box_version not in", values, "boxVersion");
            return (Criteria) this;
        }

        public Criteria andBoxVersionBetween(String value1, String value2) {
            addCriterion("box_version between", value1, value2, "boxVersion");
            return (Criteria) this;
        }

        public Criteria andBoxVersionNotBetween(String value1, String value2) {
            addCriterion("box_version not between", value1, value2, "boxVersion");
            return (Criteria) this;
        }

        public Criteria andBoxFactoryIsNull() {
            addCriterion("box_factory is null");
            return (Criteria) this;
        }

        public Criteria andBoxFactoryIsNotNull() {
            addCriterion("box_factory is not null");
            return (Criteria) this;
        }

        public Criteria andBoxFactoryEqualTo(String value) {
            addCriterion("box_factory =", value, "boxFactory");
            return (Criteria) this;
        }

        public Criteria andBoxFactoryNotEqualTo(String value) {
            addCriterion("box_factory <>", value, "boxFactory");
            return (Criteria) this;
        }

        public Criteria andBoxFactoryGreaterThan(String value) {
            addCriterion("box_factory >", value, "boxFactory");
            return (Criteria) this;
        }

        public Criteria andBoxFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("box_factory >=", value, "boxFactory");
            return (Criteria) this;
        }

        public Criteria andBoxFactoryLessThan(String value) {
            addCriterion("box_factory <", value, "boxFactory");
            return (Criteria) this;
        }

        public Criteria andBoxFactoryLessThanOrEqualTo(String value) {
            addCriterion("box_factory <=", value, "boxFactory");
            return (Criteria) this;
        }

        public Criteria andBoxFactoryLike(String value) {
            addCriterion("box_factory like", value, "boxFactory");
            return (Criteria) this;
        }

        public Criteria andBoxFactoryNotLike(String value) {
            addCriterion("box_factory not like", value, "boxFactory");
            return (Criteria) this;
        }

        public Criteria andBoxFactoryIn(List<String> values) {
            addCriterion("box_factory in", values, "boxFactory");
            return (Criteria) this;
        }

        public Criteria andBoxFactoryNotIn(List<String> values) {
            addCriterion("box_factory not in", values, "boxFactory");
            return (Criteria) this;
        }

        public Criteria andBoxFactoryBetween(String value1, String value2) {
            addCriterion("box_factory between", value1, value2, "boxFactory");
            return (Criteria) this;
        }

        public Criteria andBoxFactoryNotBetween(String value1, String value2) {
            addCriterion("box_factory not between", value1, value2, "boxFactory");
            return (Criteria) this;
        }

        public Criteria andBoxConpanyIsNull() {
            addCriterion("box_conpany is null");
            return (Criteria) this;
        }

        public Criteria andBoxConpanyIsNotNull() {
            addCriterion("box_conpany is not null");
            return (Criteria) this;
        }

        public Criteria andBoxConpanyEqualTo(String value) {
            addCriterion("box_conpany =", value, "boxConpany");
            return (Criteria) this;
        }

        public Criteria andBoxConpanyNotEqualTo(String value) {
            addCriterion("box_conpany <>", value, "boxConpany");
            return (Criteria) this;
        }

        public Criteria andBoxConpanyGreaterThan(String value) {
            addCriterion("box_conpany >", value, "boxConpany");
            return (Criteria) this;
        }

        public Criteria andBoxConpanyGreaterThanOrEqualTo(String value) {
            addCriterion("box_conpany >=", value, "boxConpany");
            return (Criteria) this;
        }

        public Criteria andBoxConpanyLessThan(String value) {
            addCriterion("box_conpany <", value, "boxConpany");
            return (Criteria) this;
        }

        public Criteria andBoxConpanyLessThanOrEqualTo(String value) {
            addCriterion("box_conpany <=", value, "boxConpany");
            return (Criteria) this;
        }

        public Criteria andBoxConpanyLike(String value) {
            addCriterion("box_conpany like", value, "boxConpany");
            return (Criteria) this;
        }

        public Criteria andBoxConpanyNotLike(String value) {
            addCriterion("box_conpany not like", value, "boxConpany");
            return (Criteria) this;
        }

        public Criteria andBoxConpanyIn(List<String> values) {
            addCriterion("box_conpany in", values, "boxConpany");
            return (Criteria) this;
        }

        public Criteria andBoxConpanyNotIn(List<String> values) {
            addCriterion("box_conpany not in", values, "boxConpany");
            return (Criteria) this;
        }

        public Criteria andBoxConpanyBetween(String value1, String value2) {
            addCriterion("box_conpany between", value1, value2, "boxConpany");
            return (Criteria) this;
        }

        public Criteria andBoxConpanyNotBetween(String value1, String value2) {
            addCriterion("box_conpany not between", value1, value2, "boxConpany");
            return (Criteria) this;
        }

        public Criteria andBoxAddressIsNull() {
            addCriterion("box_address is null");
            return (Criteria) this;
        }

        public Criteria andBoxAddressIsNotNull() {
            addCriterion("box_address is not null");
            return (Criteria) this;
        }

        public Criteria andBoxAddressEqualTo(String value) {
            addCriterion("box_address =", value, "boxAddress");
            return (Criteria) this;
        }

        public Criteria andBoxAddressNotEqualTo(String value) {
            addCriterion("box_address <>", value, "boxAddress");
            return (Criteria) this;
        }

        public Criteria andBoxAddressGreaterThan(String value) {
            addCriterion("box_address >", value, "boxAddress");
            return (Criteria) this;
        }

        public Criteria andBoxAddressGreaterThanOrEqualTo(String value) {
            addCriterion("box_address >=", value, "boxAddress");
            return (Criteria) this;
        }

        public Criteria andBoxAddressLessThan(String value) {
            addCriterion("box_address <", value, "boxAddress");
            return (Criteria) this;
        }

        public Criteria andBoxAddressLessThanOrEqualTo(String value) {
            addCriterion("box_address <=", value, "boxAddress");
            return (Criteria) this;
        }

        public Criteria andBoxAddressLike(String value) {
            addCriterion("box_address like", value, "boxAddress");
            return (Criteria) this;
        }

        public Criteria andBoxAddressNotLike(String value) {
            addCriterion("box_address not like", value, "boxAddress");
            return (Criteria) this;
        }

        public Criteria andBoxAddressIn(List<String> values) {
            addCriterion("box_address in", values, "boxAddress");
            return (Criteria) this;
        }

        public Criteria andBoxAddressNotIn(List<String> values) {
            addCriterion("box_address not in", values, "boxAddress");
            return (Criteria) this;
        }

        public Criteria andBoxAddressBetween(String value1, String value2) {
            addCriterion("box_address between", value1, value2, "boxAddress");
            return (Criteria) this;
        }

        public Criteria andBoxAddressNotBetween(String value1, String value2) {
            addCriterion("box_address not between", value1, value2, "boxAddress");
            return (Criteria) this;
        }

        public Criteria andBoxNameIsNull() {
            addCriterion("box_name is null");
            return (Criteria) this;
        }

        public Criteria andBoxNameIsNotNull() {
            addCriterion("box_name is not null");
            return (Criteria) this;
        }

        public Criteria andBoxNameEqualTo(String value) {
            addCriterion("box_name =", value, "boxName");
            return (Criteria) this;
        }

        public Criteria andBoxNameNotEqualTo(String value) {
            addCriterion("box_name <>", value, "boxName");
            return (Criteria) this;
        }

        public Criteria andBoxNameGreaterThan(String value) {
            addCriterion("box_name >", value, "boxName");
            return (Criteria) this;
        }

        public Criteria andBoxNameGreaterThanOrEqualTo(String value) {
            addCriterion("box_name >=", value, "boxName");
            return (Criteria) this;
        }

        public Criteria andBoxNameLessThan(String value) {
            addCriterion("box_name <", value, "boxName");
            return (Criteria) this;
        }

        public Criteria andBoxNameLessThanOrEqualTo(String value) {
            addCriterion("box_name <=", value, "boxName");
            return (Criteria) this;
        }

        public Criteria andBoxNameLike(String value) {
            addCriterion("box_name like", value, "boxName");
            return (Criteria) this;
        }

        public Criteria andBoxNameNotLike(String value) {
            addCriterion("box_name not like", value, "boxName");
            return (Criteria) this;
        }

        public Criteria andBoxNameIn(List<String> values) {
            addCriterion("box_name in", values, "boxName");
            return (Criteria) this;
        }

        public Criteria andBoxNameNotIn(List<String> values) {
            addCriterion("box_name not in", values, "boxName");
            return (Criteria) this;
        }

        public Criteria andBoxNameBetween(String value1, String value2) {
            addCriterion("box_name between", value1, value2, "boxName");
            return (Criteria) this;
        }

        public Criteria andBoxNameNotBetween(String value1, String value2) {
            addCriterion("box_name not between", value1, value2, "boxName");
            return (Criteria) this;
        }

        public Criteria andBoxTypeIsNull() {
            addCriterion("box_type is null");
            return (Criteria) this;
        }

        public Criteria andBoxTypeIsNotNull() {
            addCriterion("box_type is not null");
            return (Criteria) this;
        }

        public Criteria andBoxTypeEqualTo(Integer value) {
            addCriterion("box_type =", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeNotEqualTo(Integer value) {
            addCriterion("box_type <>", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeGreaterThan(Integer value) {
            addCriterion("box_type >", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("box_type >=", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeLessThan(Integer value) {
            addCriterion("box_type <", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeLessThanOrEqualTo(Integer value) {
            addCriterion("box_type <=", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeIn(List<Integer> values) {
            addCriterion("box_type in", values, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeNotIn(List<Integer> values) {
            addCriterion("box_type not in", values, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeBetween(Integer value1, Integer value2) {
            addCriterion("box_type between", value1, value2, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("box_type not between", value1, value2, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxImageIsNull() {
            addCriterion("box_image is null");
            return (Criteria) this;
        }

        public Criteria andBoxImageIsNotNull() {
            addCriterion("box_image is not null");
            return (Criteria) this;
        }

        public Criteria andBoxImageEqualTo(String value) {
            addCriterion("box_image =", value, "boxImage");
            return (Criteria) this;
        }

        public Criteria andBoxImageNotEqualTo(String value) {
            addCriterion("box_image <>", value, "boxImage");
            return (Criteria) this;
        }

        public Criteria andBoxImageGreaterThan(String value) {
            addCriterion("box_image >", value, "boxImage");
            return (Criteria) this;
        }

        public Criteria andBoxImageGreaterThanOrEqualTo(String value) {
            addCriterion("box_image >=", value, "boxImage");
            return (Criteria) this;
        }

        public Criteria andBoxImageLessThan(String value) {
            addCriterion("box_image <", value, "boxImage");
            return (Criteria) this;
        }

        public Criteria andBoxImageLessThanOrEqualTo(String value) {
            addCriterion("box_image <=", value, "boxImage");
            return (Criteria) this;
        }

        public Criteria andBoxImageLike(String value) {
            addCriterion("box_image like", value, "boxImage");
            return (Criteria) this;
        }

        public Criteria andBoxImageNotLike(String value) {
            addCriterion("box_image not like", value, "boxImage");
            return (Criteria) this;
        }

        public Criteria andBoxImageIn(List<String> values) {
            addCriterion("box_image in", values, "boxImage");
            return (Criteria) this;
        }

        public Criteria andBoxImageNotIn(List<String> values) {
            addCriterion("box_image not in", values, "boxImage");
            return (Criteria) this;
        }

        public Criteria andBoxImageBetween(String value1, String value2) {
            addCriterion("box_image between", value1, value2, "boxImage");
            return (Criteria) this;
        }

        public Criteria andBoxImageNotBetween(String value1, String value2) {
            addCriterion("box_image not between", value1, value2, "boxImage");
            return (Criteria) this;
        }

        public Criteria andProcessDrawingIsNull() {
            addCriterion("process_drawing is null");
            return (Criteria) this;
        }

        public Criteria andProcessDrawingIsNotNull() {
            addCriterion("process_drawing is not null");
            return (Criteria) this;
        }

        public Criteria andProcessDrawingEqualTo(String value) {
            addCriterion("process_drawing =", value, "processDrawing");
            return (Criteria) this;
        }

        public Criteria andProcessDrawingNotEqualTo(String value) {
            addCriterion("process_drawing <>", value, "processDrawing");
            return (Criteria) this;
        }

        public Criteria andProcessDrawingGreaterThan(String value) {
            addCriterion("process_drawing >", value, "processDrawing");
            return (Criteria) this;
        }

        public Criteria andProcessDrawingGreaterThanOrEqualTo(String value) {
            addCriterion("process_drawing >=", value, "processDrawing");
            return (Criteria) this;
        }

        public Criteria andProcessDrawingLessThan(String value) {
            addCriterion("process_drawing <", value, "processDrawing");
            return (Criteria) this;
        }

        public Criteria andProcessDrawingLessThanOrEqualTo(String value) {
            addCriterion("process_drawing <=", value, "processDrawing");
            return (Criteria) this;
        }

        public Criteria andProcessDrawingLike(String value) {
            addCriterion("process_drawing like", value, "processDrawing");
            return (Criteria) this;
        }

        public Criteria andProcessDrawingNotLike(String value) {
            addCriterion("process_drawing not like", value, "processDrawing");
            return (Criteria) this;
        }

        public Criteria andProcessDrawingIn(List<String> values) {
            addCriterion("process_drawing in", values, "processDrawing");
            return (Criteria) this;
        }

        public Criteria andProcessDrawingNotIn(List<String> values) {
            addCriterion("process_drawing not in", values, "processDrawing");
            return (Criteria) this;
        }

        public Criteria andProcessDrawingBetween(String value1, String value2) {
            addCriterion("process_drawing between", value1, value2, "processDrawing");
            return (Criteria) this;
        }

        public Criteria andProcessDrawingNotBetween(String value1, String value2) {
            addCriterion("process_drawing not between", value1, value2, "processDrawing");
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
    }

    /**
     * sys_box
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sys_box Tue Jan 15 13:25:42 CST 2019
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