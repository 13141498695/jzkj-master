package com.com.jzkj.miservice.entity.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModelEntityExample {
    /**
     * sys_model
     */
    protected String orderByClause;

    /**
     * sys_model
     */
    protected boolean distinct;

    /**
     * sys_model
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Tue Jan 15 13:25:42 CST 2019
     */
    public ModelEntityExample() {
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
     * sys_model Tue Jan 15 13:25:42 CST 2019
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

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(String value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(String value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(String value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(String value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(String value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(String value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLike(String value) {
            addCriterion("model_id like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotLike(String value) {
            addCriterion("model_id not like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<String> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<String> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(String value1, String value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(String value1, String value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNull() {
            addCriterion("model_name is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("model_name is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("model_name =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("model_name <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("model_name >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("model_name >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("model_name <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("model_name <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("model_name like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("model_name not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("model_name in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("model_name not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("model_name between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("model_name not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelIdentificationIsNull() {
            addCriterion("model_identification is null");
            return (Criteria) this;
        }

        public Criteria andModelIdentificationIsNotNull() {
            addCriterion("model_identification is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdentificationEqualTo(String value) {
            addCriterion("model_identification =", value, "modelIdentification");
            return (Criteria) this;
        }

        public Criteria andModelIdentificationNotEqualTo(String value) {
            addCriterion("model_identification <>", value, "modelIdentification");
            return (Criteria) this;
        }

        public Criteria andModelIdentificationGreaterThan(String value) {
            addCriterion("model_identification >", value, "modelIdentification");
            return (Criteria) this;
        }

        public Criteria andModelIdentificationGreaterThanOrEqualTo(String value) {
            addCriterion("model_identification >=", value, "modelIdentification");
            return (Criteria) this;
        }

        public Criteria andModelIdentificationLessThan(String value) {
            addCriterion("model_identification <", value, "modelIdentification");
            return (Criteria) this;
        }

        public Criteria andModelIdentificationLessThanOrEqualTo(String value) {
            addCriterion("model_identification <=", value, "modelIdentification");
            return (Criteria) this;
        }

        public Criteria andModelIdentificationLike(String value) {
            addCriterion("model_identification like", value, "modelIdentification");
            return (Criteria) this;
        }

        public Criteria andModelIdentificationNotLike(String value) {
            addCriterion("model_identification not like", value, "modelIdentification");
            return (Criteria) this;
        }

        public Criteria andModelIdentificationIn(List<String> values) {
            addCriterion("model_identification in", values, "modelIdentification");
            return (Criteria) this;
        }

        public Criteria andModelIdentificationNotIn(List<String> values) {
            addCriterion("model_identification not in", values, "modelIdentification");
            return (Criteria) this;
        }

        public Criteria andModelIdentificationBetween(String value1, String value2) {
            addCriterion("model_identification between", value1, value2, "modelIdentification");
            return (Criteria) this;
        }

        public Criteria andModelIdentificationNotBetween(String value1, String value2) {
            addCriterion("model_identification not between", value1, value2, "modelIdentification");
            return (Criteria) this;
        }

        public Criteria andModelDatatypeIsNull() {
            addCriterion("model_datatype is null");
            return (Criteria) this;
        }

        public Criteria andModelDatatypeIsNotNull() {
            addCriterion("model_datatype is not null");
            return (Criteria) this;
        }

        public Criteria andModelDatatypeEqualTo(String value) {
            addCriterion("model_datatype =", value, "modelDatatype");
            return (Criteria) this;
        }

        public Criteria andModelDatatypeNotEqualTo(String value) {
            addCriterion("model_datatype <>", value, "modelDatatype");
            return (Criteria) this;
        }

        public Criteria andModelDatatypeGreaterThan(String value) {
            addCriterion("model_datatype >", value, "modelDatatype");
            return (Criteria) this;
        }

        public Criteria andModelDatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("model_datatype >=", value, "modelDatatype");
            return (Criteria) this;
        }

        public Criteria andModelDatatypeLessThan(String value) {
            addCriterion("model_datatype <", value, "modelDatatype");
            return (Criteria) this;
        }

        public Criteria andModelDatatypeLessThanOrEqualTo(String value) {
            addCriterion("model_datatype <=", value, "modelDatatype");
            return (Criteria) this;
        }

        public Criteria andModelDatatypeLike(String value) {
            addCriterion("model_datatype like", value, "modelDatatype");
            return (Criteria) this;
        }

        public Criteria andModelDatatypeNotLike(String value) {
            addCriterion("model_datatype not like", value, "modelDatatype");
            return (Criteria) this;
        }

        public Criteria andModelDatatypeIn(List<String> values) {
            addCriterion("model_datatype in", values, "modelDatatype");
            return (Criteria) this;
        }

        public Criteria andModelDatatypeNotIn(List<String> values) {
            addCriterion("model_datatype not in", values, "modelDatatype");
            return (Criteria) this;
        }

        public Criteria andModelDatatypeBetween(String value1, String value2) {
            addCriterion("model_datatype between", value1, value2, "modelDatatype");
            return (Criteria) this;
        }

        public Criteria andModelDatatypeNotBetween(String value1, String value2) {
            addCriterion("model_datatype not between", value1, value2, "modelDatatype");
            return (Criteria) this;
        }

        public Criteria andModelSpamIsNull() {
            addCriterion("model_spam is null");
            return (Criteria) this;
        }

        public Criteria andModelSpamIsNotNull() {
            addCriterion("model_spam is not null");
            return (Criteria) this;
        }

        public Criteria andModelSpamEqualTo(String value) {
            addCriterion("model_spam =", value, "modelSpam");
            return (Criteria) this;
        }

        public Criteria andModelSpamNotEqualTo(String value) {
            addCriterion("model_spam <>", value, "modelSpam");
            return (Criteria) this;
        }

        public Criteria andModelSpamGreaterThan(String value) {
            addCriterion("model_spam >", value, "modelSpam");
            return (Criteria) this;
        }

        public Criteria andModelSpamGreaterThanOrEqualTo(String value) {
            addCriterion("model_spam >=", value, "modelSpam");
            return (Criteria) this;
        }

        public Criteria andModelSpamLessThan(String value) {
            addCriterion("model_spam <", value, "modelSpam");
            return (Criteria) this;
        }

        public Criteria andModelSpamLessThanOrEqualTo(String value) {
            addCriterion("model_spam <=", value, "modelSpam");
            return (Criteria) this;
        }

        public Criteria andModelSpamLike(String value) {
            addCriterion("model_spam like", value, "modelSpam");
            return (Criteria) this;
        }

        public Criteria andModelSpamNotLike(String value) {
            addCriterion("model_spam not like", value, "modelSpam");
            return (Criteria) this;
        }

        public Criteria andModelSpamIn(List<String> values) {
            addCriterion("model_spam in", values, "modelSpam");
            return (Criteria) this;
        }

        public Criteria andModelSpamNotIn(List<String> values) {
            addCriterion("model_spam not in", values, "modelSpam");
            return (Criteria) this;
        }

        public Criteria andModelSpamBetween(String value1, String value2) {
            addCriterion("model_spam between", value1, value2, "modelSpam");
            return (Criteria) this;
        }

        public Criteria andModelSpamNotBetween(String value1, String value2) {
            addCriterion("model_spam not between", value1, value2, "modelSpam");
            return (Criteria) this;
        }

        public Criteria andModelUnitIsNull() {
            addCriterion("model_unit is null");
            return (Criteria) this;
        }

        public Criteria andModelUnitIsNotNull() {
            addCriterion("model_unit is not null");
            return (Criteria) this;
        }

        public Criteria andModelUnitEqualTo(String value) {
            addCriterion("model_unit =", value, "modelUnit");
            return (Criteria) this;
        }

        public Criteria andModelUnitNotEqualTo(String value) {
            addCriterion("model_unit <>", value, "modelUnit");
            return (Criteria) this;
        }

        public Criteria andModelUnitGreaterThan(String value) {
            addCriterion("model_unit >", value, "modelUnit");
            return (Criteria) this;
        }

        public Criteria andModelUnitGreaterThanOrEqualTo(String value) {
            addCriterion("model_unit >=", value, "modelUnit");
            return (Criteria) this;
        }

        public Criteria andModelUnitLessThan(String value) {
            addCriterion("model_unit <", value, "modelUnit");
            return (Criteria) this;
        }

        public Criteria andModelUnitLessThanOrEqualTo(String value) {
            addCriterion("model_unit <=", value, "modelUnit");
            return (Criteria) this;
        }

        public Criteria andModelUnitLike(String value) {
            addCriterion("model_unit like", value, "modelUnit");
            return (Criteria) this;
        }

        public Criteria andModelUnitNotLike(String value) {
            addCriterion("model_unit not like", value, "modelUnit");
            return (Criteria) this;
        }

        public Criteria andModelUnitIn(List<String> values) {
            addCriterion("model_unit in", values, "modelUnit");
            return (Criteria) this;
        }

        public Criteria andModelUnitNotIn(List<String> values) {
            addCriterion("model_unit not in", values, "modelUnit");
            return (Criteria) this;
        }

        public Criteria andModelUnitBetween(String value1, String value2) {
            addCriterion("model_unit between", value1, value2, "modelUnit");
            return (Criteria) this;
        }

        public Criteria andModelUnitNotBetween(String value1, String value2) {
            addCriterion("model_unit not between", value1, value2, "modelUnit");
            return (Criteria) this;
        }

        public Criteria andModelReadorwriteIsNull() {
            addCriterion("model_readorwrite is null");
            return (Criteria) this;
        }

        public Criteria andModelReadorwriteIsNotNull() {
            addCriterion("model_readorwrite is not null");
            return (Criteria) this;
        }

        public Criteria andModelReadorwriteEqualTo(Integer value) {
            addCriterion("model_readorwrite =", value, "modelReadorwrite");
            return (Criteria) this;
        }

        public Criteria andModelReadorwriteNotEqualTo(Integer value) {
            addCriterion("model_readorwrite <>", value, "modelReadorwrite");
            return (Criteria) this;
        }

        public Criteria andModelReadorwriteGreaterThan(Integer value) {
            addCriterion("model_readorwrite >", value, "modelReadorwrite");
            return (Criteria) this;
        }

        public Criteria andModelReadorwriteGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_readorwrite >=", value, "modelReadorwrite");
            return (Criteria) this;
        }

        public Criteria andModelReadorwriteLessThan(Integer value) {
            addCriterion("model_readorwrite <", value, "modelReadorwrite");
            return (Criteria) this;
        }

        public Criteria andModelReadorwriteLessThanOrEqualTo(Integer value) {
            addCriterion("model_readorwrite <=", value, "modelReadorwrite");
            return (Criteria) this;
        }

        public Criteria andModelReadorwriteIn(List<Integer> values) {
            addCriterion("model_readorwrite in", values, "modelReadorwrite");
            return (Criteria) this;
        }

        public Criteria andModelReadorwriteNotIn(List<Integer> values) {
            addCriterion("model_readorwrite not in", values, "modelReadorwrite");
            return (Criteria) this;
        }

        public Criteria andModelReadorwriteBetween(Integer value1, Integer value2) {
            addCriterion("model_readorwrite between", value1, value2, "modelReadorwrite");
            return (Criteria) this;
        }

        public Criteria andModelReadorwriteNotBetween(Integer value1, Integer value2) {
            addCriterion("model_readorwrite not between", value1, value2, "modelReadorwrite");
            return (Criteria) this;
        }

        public Criteria andModelDescIsNull() {
            addCriterion("model_desc is null");
            return (Criteria) this;
        }

        public Criteria andModelDescIsNotNull() {
            addCriterion("model_desc is not null");
            return (Criteria) this;
        }

        public Criteria andModelDescEqualTo(String value) {
            addCriterion("model_desc =", value, "modelDesc");
            return (Criteria) this;
        }

        public Criteria andModelDescNotEqualTo(String value) {
            addCriterion("model_desc <>", value, "modelDesc");
            return (Criteria) this;
        }

        public Criteria andModelDescGreaterThan(String value) {
            addCriterion("model_desc >", value, "modelDesc");
            return (Criteria) this;
        }

        public Criteria andModelDescGreaterThanOrEqualTo(String value) {
            addCriterion("model_desc >=", value, "modelDesc");
            return (Criteria) this;
        }

        public Criteria andModelDescLessThan(String value) {
            addCriterion("model_desc <", value, "modelDesc");
            return (Criteria) this;
        }

        public Criteria andModelDescLessThanOrEqualTo(String value) {
            addCriterion("model_desc <=", value, "modelDesc");
            return (Criteria) this;
        }

        public Criteria andModelDescLike(String value) {
            addCriterion("model_desc like", value, "modelDesc");
            return (Criteria) this;
        }

        public Criteria andModelDescNotLike(String value) {
            addCriterion("model_desc not like", value, "modelDesc");
            return (Criteria) this;
        }

        public Criteria andModelDescIn(List<String> values) {
            addCriterion("model_desc in", values, "modelDesc");
            return (Criteria) this;
        }

        public Criteria andModelDescNotIn(List<String> values) {
            addCriterion("model_desc not in", values, "modelDesc");
            return (Criteria) this;
        }

        public Criteria andModelDescBetween(String value1, String value2) {
            addCriterion("model_desc between", value1, value2, "modelDesc");
            return (Criteria) this;
        }

        public Criteria andModelDescNotBetween(String value1, String value2) {
            addCriterion("model_desc not between", value1, value2, "modelDesc");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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
     * sys_model
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sys_model Tue Jan 15 13:25:42 CST 2019
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