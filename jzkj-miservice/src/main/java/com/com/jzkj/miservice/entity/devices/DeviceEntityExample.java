package com.com.jzkj.miservice.entity.devices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceEntityExample {
    /**
     * sys_device
     */
    protected String orderByClause;

    /**
     * sys_device
     */
    protected boolean distinct;

    /**
     * sys_device
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Tue Jan 15 13:24:48 CST 2019
     */
    public DeviceEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:24:48 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:24:48 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:24:48 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:24:48 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:24:48 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:24:48 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:24:48 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:24:48 CST 2019
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
     * @mbg.generated Tue Jan 15 13:24:48 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Tue Jan 15 13:24:48 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * sys_device Tue Jan 15 13:24:48 CST 2019
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

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("device_id like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("device_id not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("device_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("device_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(Integer value) {
            addCriterion("device_type =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(Integer value) {
            addCriterion("device_type <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(Integer value) {
            addCriterion("device_type >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_type >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(Integer value) {
            addCriterion("device_type <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("device_type <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<Integer> values) {
            addCriterion("device_type in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<Integer> values) {
            addCriterion("device_type not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(Integer value1, Integer value2) {
            addCriterion("device_type between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_type not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIsNull() {
            addCriterion("device_status is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIsNotNull() {
            addCriterion("device_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusEqualTo(Integer value) {
            addCriterion("device_status =", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotEqualTo(Integer value) {
            addCriterion("device_status <>", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusGreaterThan(Integer value) {
            addCriterion("device_status >", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_status >=", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusLessThan(Integer value) {
            addCriterion("device_status <", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("device_status <=", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIn(List<Integer> values) {
            addCriterion("device_status in", values, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotIn(List<Integer> values) {
            addCriterion("device_status not in", values, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusBetween(Integer value1, Integer value2) {
            addCriterion("device_status between", value1, value2, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("device_status not between", value1, value2, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceDtuidIsNull() {
            addCriterion("device_dtuid is null");
            return (Criteria) this;
        }

        public Criteria andDeviceDtuidIsNotNull() {
            addCriterion("device_dtuid is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceDtuidEqualTo(String value) {
            addCriterion("device_dtuid =", value, "deviceDtuid");
            return (Criteria) this;
        }

        public Criteria andDeviceDtuidNotEqualTo(String value) {
            addCriterion("device_dtuid <>", value, "deviceDtuid");
            return (Criteria) this;
        }

        public Criteria andDeviceDtuidGreaterThan(String value) {
            addCriterion("device_dtuid >", value, "deviceDtuid");
            return (Criteria) this;
        }

        public Criteria andDeviceDtuidGreaterThanOrEqualTo(String value) {
            addCriterion("device_dtuid >=", value, "deviceDtuid");
            return (Criteria) this;
        }

        public Criteria andDeviceDtuidLessThan(String value) {
            addCriterion("device_dtuid <", value, "deviceDtuid");
            return (Criteria) this;
        }

        public Criteria andDeviceDtuidLessThanOrEqualTo(String value) {
            addCriterion("device_dtuid <=", value, "deviceDtuid");
            return (Criteria) this;
        }

        public Criteria andDeviceDtuidLike(String value) {
            addCriterion("device_dtuid like", value, "deviceDtuid");
            return (Criteria) this;
        }

        public Criteria andDeviceDtuidNotLike(String value) {
            addCriterion("device_dtuid not like", value, "deviceDtuid");
            return (Criteria) this;
        }

        public Criteria andDeviceDtuidIn(List<String> values) {
            addCriterion("device_dtuid in", values, "deviceDtuid");
            return (Criteria) this;
        }

        public Criteria andDeviceDtuidNotIn(List<String> values) {
            addCriterion("device_dtuid not in", values, "deviceDtuid");
            return (Criteria) this;
        }

        public Criteria andDeviceDtuidBetween(String value1, String value2) {
            addCriterion("device_dtuid between", value1, value2, "deviceDtuid");
            return (Criteria) this;
        }

        public Criteria andDeviceDtuidNotBetween(String value1, String value2) {
            addCriterion("device_dtuid not between", value1, value2, "deviceDtuid");
            return (Criteria) this;
        }

        public Criteria andSysDeviceModelllistIsNull() {
            addCriterion("sys_device_modelLlist is null");
            return (Criteria) this;
        }

        public Criteria andSysDeviceModelllistIsNotNull() {
            addCriterion("sys_device_modelLlist is not null");
            return (Criteria) this;
        }

        public Criteria andSysDeviceModelllistEqualTo(String value) {
            addCriterion("sys_device_modelLlist =", value, "sysDeviceModelllist");
            return (Criteria) this;
        }

        public Criteria andSysDeviceModelllistNotEqualTo(String value) {
            addCriterion("sys_device_modelLlist <>", value, "sysDeviceModelllist");
            return (Criteria) this;
        }

        public Criteria andSysDeviceModelllistGreaterThan(String value) {
            addCriterion("sys_device_modelLlist >", value, "sysDeviceModelllist");
            return (Criteria) this;
        }

        public Criteria andSysDeviceModelllistGreaterThanOrEqualTo(String value) {
            addCriterion("sys_device_modelLlist >=", value, "sysDeviceModelllist");
            return (Criteria) this;
        }

        public Criteria andSysDeviceModelllistLessThan(String value) {
            addCriterion("sys_device_modelLlist <", value, "sysDeviceModelllist");
            return (Criteria) this;
        }

        public Criteria andSysDeviceModelllistLessThanOrEqualTo(String value) {
            addCriterion("sys_device_modelLlist <=", value, "sysDeviceModelllist");
            return (Criteria) this;
        }

        public Criteria andSysDeviceModelllistLike(String value) {
            addCriterion("sys_device_modelLlist like", value, "sysDeviceModelllist");
            return (Criteria) this;
        }

        public Criteria andSysDeviceModelllistNotLike(String value) {
            addCriterion("sys_device_modelLlist not like", value, "sysDeviceModelllist");
            return (Criteria) this;
        }

        public Criteria andSysDeviceModelllistIn(List<String> values) {
            addCriterion("sys_device_modelLlist in", values, "sysDeviceModelllist");
            return (Criteria) this;
        }

        public Criteria andSysDeviceModelllistNotIn(List<String> values) {
            addCriterion("sys_device_modelLlist not in", values, "sysDeviceModelllist");
            return (Criteria) this;
        }

        public Criteria andSysDeviceModelllistBetween(String value1, String value2) {
            addCriterion("sys_device_modelLlist between", value1, value2, "sysDeviceModelllist");
            return (Criteria) this;
        }

        public Criteria andSysDeviceModelllistNotBetween(String value1, String value2) {
            addCriterion("sys_device_modelLlist not between", value1, value2, "sysDeviceModelllist");
            return (Criteria) this;
        }

        public Criteria andDeviceRoadIdIsNull() {
            addCriterion("device_road_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceRoadIdIsNotNull() {
            addCriterion("device_road_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceRoadIdEqualTo(String value) {
            addCriterion("device_road_id =", value, "deviceRoadId");
            return (Criteria) this;
        }

        public Criteria andDeviceRoadIdNotEqualTo(String value) {
            addCriterion("device_road_id <>", value, "deviceRoadId");
            return (Criteria) this;
        }

        public Criteria andDeviceRoadIdGreaterThan(String value) {
            addCriterion("device_road_id >", value, "deviceRoadId");
            return (Criteria) this;
        }

        public Criteria andDeviceRoadIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_road_id >=", value, "deviceRoadId");
            return (Criteria) this;
        }

        public Criteria andDeviceRoadIdLessThan(String value) {
            addCriterion("device_road_id <", value, "deviceRoadId");
            return (Criteria) this;
        }

        public Criteria andDeviceRoadIdLessThanOrEqualTo(String value) {
            addCriterion("device_road_id <=", value, "deviceRoadId");
            return (Criteria) this;
        }

        public Criteria andDeviceRoadIdLike(String value) {
            addCriterion("device_road_id like", value, "deviceRoadId");
            return (Criteria) this;
        }

        public Criteria andDeviceRoadIdNotLike(String value) {
            addCriterion("device_road_id not like", value, "deviceRoadId");
            return (Criteria) this;
        }

        public Criteria andDeviceRoadIdIn(List<String> values) {
            addCriterion("device_road_id in", values, "deviceRoadId");
            return (Criteria) this;
        }

        public Criteria andDeviceRoadIdNotIn(List<String> values) {
            addCriterion("device_road_id not in", values, "deviceRoadId");
            return (Criteria) this;
        }

        public Criteria andDeviceRoadIdBetween(String value1, String value2) {
            addCriterion("device_road_id between", value1, value2, "deviceRoadId");
            return (Criteria) this;
        }

        public Criteria andDeviceRoadIdNotBetween(String value1, String value2) {
            addCriterion("device_road_id not between", value1, value2, "deviceRoadId");
            return (Criteria) this;
        }

        public Criteria andDeviceSysnameIsNull() {
            addCriterion("device_sysname is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSysnameIsNotNull() {
            addCriterion("device_sysname is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSysnameEqualTo(String value) {
            addCriterion("device_sysname =", value, "deviceSysname");
            return (Criteria) this;
        }

        public Criteria andDeviceSysnameNotEqualTo(String value) {
            addCriterion("device_sysname <>", value, "deviceSysname");
            return (Criteria) this;
        }

        public Criteria andDeviceSysnameGreaterThan(String value) {
            addCriterion("device_sysname >", value, "deviceSysname");
            return (Criteria) this;
        }

        public Criteria andDeviceSysnameGreaterThanOrEqualTo(String value) {
            addCriterion("device_sysname >=", value, "deviceSysname");
            return (Criteria) this;
        }

        public Criteria andDeviceSysnameLessThan(String value) {
            addCriterion("device_sysname <", value, "deviceSysname");
            return (Criteria) this;
        }

        public Criteria andDeviceSysnameLessThanOrEqualTo(String value) {
            addCriterion("device_sysname <=", value, "deviceSysname");
            return (Criteria) this;
        }

        public Criteria andDeviceSysnameLike(String value) {
            addCriterion("device_sysname like", value, "deviceSysname");
            return (Criteria) this;
        }

        public Criteria andDeviceSysnameNotLike(String value) {
            addCriterion("device_sysname not like", value, "deviceSysname");
            return (Criteria) this;
        }

        public Criteria andDeviceSysnameIn(List<String> values) {
            addCriterion("device_sysname in", values, "deviceSysname");
            return (Criteria) this;
        }

        public Criteria andDeviceSysnameNotIn(List<String> values) {
            addCriterion("device_sysname not in", values, "deviceSysname");
            return (Criteria) this;
        }

        public Criteria andDeviceSysnameBetween(String value1, String value2) {
            addCriterion("device_sysname between", value1, value2, "deviceSysname");
            return (Criteria) this;
        }

        public Criteria andDeviceSysnameNotBetween(String value1, String value2) {
            addCriterion("device_sysname not between", value1, value2, "deviceSysname");
            return (Criteria) this;
        }

        public Criteria andDeviceSimIsNull() {
            addCriterion("device_sim is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSimIsNotNull() {
            addCriterion("device_sim is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSimEqualTo(String value) {
            addCriterion("device_sim =", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimNotEqualTo(String value) {
            addCriterion("device_sim <>", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimGreaterThan(String value) {
            addCriterion("device_sim >", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimGreaterThanOrEqualTo(String value) {
            addCriterion("device_sim >=", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimLessThan(String value) {
            addCriterion("device_sim <", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimLessThanOrEqualTo(String value) {
            addCriterion("device_sim <=", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimLike(String value) {
            addCriterion("device_sim like", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimNotLike(String value) {
            addCriterion("device_sim not like", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimIn(List<String> values) {
            addCriterion("device_sim in", values, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimNotIn(List<String> values) {
            addCriterion("device_sim not in", values, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimBetween(String value1, String value2) {
            addCriterion("device_sim between", value1, value2, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimNotBetween(String value1, String value2) {
            addCriterion("device_sim not between", value1, value2, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceDatatablenameIsNull() {
            addCriterion("device_datatableName is null");
            return (Criteria) this;
        }

        public Criteria andDeviceDatatablenameIsNotNull() {
            addCriterion("device_datatableName is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceDatatablenameEqualTo(String value) {
            addCriterion("device_datatableName =", value, "deviceDatatablename");
            return (Criteria) this;
        }

        public Criteria andDeviceDatatablenameNotEqualTo(String value) {
            addCriterion("device_datatableName <>", value, "deviceDatatablename");
            return (Criteria) this;
        }

        public Criteria andDeviceDatatablenameGreaterThan(String value) {
            addCriterion("device_datatableName >", value, "deviceDatatablename");
            return (Criteria) this;
        }

        public Criteria andDeviceDatatablenameGreaterThanOrEqualTo(String value) {
            addCriterion("device_datatableName >=", value, "deviceDatatablename");
            return (Criteria) this;
        }

        public Criteria andDeviceDatatablenameLessThan(String value) {
            addCriterion("device_datatableName <", value, "deviceDatatablename");
            return (Criteria) this;
        }

        public Criteria andDeviceDatatablenameLessThanOrEqualTo(String value) {
            addCriterion("device_datatableName <=", value, "deviceDatatablename");
            return (Criteria) this;
        }

        public Criteria andDeviceDatatablenameLike(String value) {
            addCriterion("device_datatableName like", value, "deviceDatatablename");
            return (Criteria) this;
        }

        public Criteria andDeviceDatatablenameNotLike(String value) {
            addCriterion("device_datatableName not like", value, "deviceDatatablename");
            return (Criteria) this;
        }

        public Criteria andDeviceDatatablenameIn(List<String> values) {
            addCriterion("device_datatableName in", values, "deviceDatatablename");
            return (Criteria) this;
        }

        public Criteria andDeviceDatatablenameNotIn(List<String> values) {
            addCriterion("device_datatableName not in", values, "deviceDatatablename");
            return (Criteria) this;
        }

        public Criteria andDeviceDatatablenameBetween(String value1, String value2) {
            addCriterion("device_datatableName between", value1, value2, "deviceDatatablename");
            return (Criteria) this;
        }

        public Criteria andDeviceDatatablenameNotBetween(String value1, String value2) {
            addCriterion("device_datatableName not between", value1, value2, "deviceDatatablename");
            return (Criteria) this;
        }

        public Criteria andDevicePicPhoneIsNull() {
            addCriterion("device_pic_phone is null");
            return (Criteria) this;
        }

        public Criteria andDevicePicPhoneIsNotNull() {
            addCriterion("device_pic_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDevicePicPhoneEqualTo(String value) {
            addCriterion("device_pic_phone =", value, "devicePicPhone");
            return (Criteria) this;
        }

        public Criteria andDevicePicPhoneNotEqualTo(String value) {
            addCriterion("device_pic_phone <>", value, "devicePicPhone");
            return (Criteria) this;
        }

        public Criteria andDevicePicPhoneGreaterThan(String value) {
            addCriterion("device_pic_phone >", value, "devicePicPhone");
            return (Criteria) this;
        }

        public Criteria andDevicePicPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("device_pic_phone >=", value, "devicePicPhone");
            return (Criteria) this;
        }

        public Criteria andDevicePicPhoneLessThan(String value) {
            addCriterion("device_pic_phone <", value, "devicePicPhone");
            return (Criteria) this;
        }

        public Criteria andDevicePicPhoneLessThanOrEqualTo(String value) {
            addCriterion("device_pic_phone <=", value, "devicePicPhone");
            return (Criteria) this;
        }

        public Criteria andDevicePicPhoneLike(String value) {
            addCriterion("device_pic_phone like", value, "devicePicPhone");
            return (Criteria) this;
        }

        public Criteria andDevicePicPhoneNotLike(String value) {
            addCriterion("device_pic_phone not like", value, "devicePicPhone");
            return (Criteria) this;
        }

        public Criteria andDevicePicPhoneIn(List<String> values) {
            addCriterion("device_pic_phone in", values, "devicePicPhone");
            return (Criteria) this;
        }

        public Criteria andDevicePicPhoneNotIn(List<String> values) {
            addCriterion("device_pic_phone not in", values, "devicePicPhone");
            return (Criteria) this;
        }

        public Criteria andDevicePicPhoneBetween(String value1, String value2) {
            addCriterion("device_pic_phone between", value1, value2, "devicePicPhone");
            return (Criteria) this;
        }

        public Criteria andDevicePicPhoneNotBetween(String value1, String value2) {
            addCriterion("device_pic_phone not between", value1, value2, "devicePicPhone");
            return (Criteria) this;
        }

        public Criteria andDevicePicEmailIsNull() {
            addCriterion("device_pic_email is null");
            return (Criteria) this;
        }

        public Criteria andDevicePicEmailIsNotNull() {
            addCriterion("device_pic_email is not null");
            return (Criteria) this;
        }

        public Criteria andDevicePicEmailEqualTo(String value) {
            addCriterion("device_pic_email =", value, "devicePicEmail");
            return (Criteria) this;
        }

        public Criteria andDevicePicEmailNotEqualTo(String value) {
            addCriterion("device_pic_email <>", value, "devicePicEmail");
            return (Criteria) this;
        }

        public Criteria andDevicePicEmailGreaterThan(String value) {
            addCriterion("device_pic_email >", value, "devicePicEmail");
            return (Criteria) this;
        }

        public Criteria andDevicePicEmailGreaterThanOrEqualTo(String value) {
            addCriterion("device_pic_email >=", value, "devicePicEmail");
            return (Criteria) this;
        }

        public Criteria andDevicePicEmailLessThan(String value) {
            addCriterion("device_pic_email <", value, "devicePicEmail");
            return (Criteria) this;
        }

        public Criteria andDevicePicEmailLessThanOrEqualTo(String value) {
            addCriterion("device_pic_email <=", value, "devicePicEmail");
            return (Criteria) this;
        }

        public Criteria andDevicePicEmailLike(String value) {
            addCriterion("device_pic_email like", value, "devicePicEmail");
            return (Criteria) this;
        }

        public Criteria andDevicePicEmailNotLike(String value) {
            addCriterion("device_pic_email not like", value, "devicePicEmail");
            return (Criteria) this;
        }

        public Criteria andDevicePicEmailIn(List<String> values) {
            addCriterion("device_pic_email in", values, "devicePicEmail");
            return (Criteria) this;
        }

        public Criteria andDevicePicEmailNotIn(List<String> values) {
            addCriterion("device_pic_email not in", values, "devicePicEmail");
            return (Criteria) this;
        }

        public Criteria andDevicePicEmailBetween(String value1, String value2) {
            addCriterion("device_pic_email between", value1, value2, "devicePicEmail");
            return (Criteria) this;
        }

        public Criteria andDevicePicEmailNotBetween(String value1, String value2) {
            addCriterion("device_pic_email not between", value1, value2, "devicePicEmail");
            return (Criteria) this;
        }

        public Criteria andDevicePicWeixinIsNull() {
            addCriterion("device_pic_weixin is null");
            return (Criteria) this;
        }

        public Criteria andDevicePicWeixinIsNotNull() {
            addCriterion("device_pic_weixin is not null");
            return (Criteria) this;
        }

        public Criteria andDevicePicWeixinEqualTo(String value) {
            addCriterion("device_pic_weixin =", value, "devicePicWeixin");
            return (Criteria) this;
        }

        public Criteria andDevicePicWeixinNotEqualTo(String value) {
            addCriterion("device_pic_weixin <>", value, "devicePicWeixin");
            return (Criteria) this;
        }

        public Criteria andDevicePicWeixinGreaterThan(String value) {
            addCriterion("device_pic_weixin >", value, "devicePicWeixin");
            return (Criteria) this;
        }

        public Criteria andDevicePicWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("device_pic_weixin >=", value, "devicePicWeixin");
            return (Criteria) this;
        }

        public Criteria andDevicePicWeixinLessThan(String value) {
            addCriterion("device_pic_weixin <", value, "devicePicWeixin");
            return (Criteria) this;
        }

        public Criteria andDevicePicWeixinLessThanOrEqualTo(String value) {
            addCriterion("device_pic_weixin <=", value, "devicePicWeixin");
            return (Criteria) this;
        }

        public Criteria andDevicePicWeixinLike(String value) {
            addCriterion("device_pic_weixin like", value, "devicePicWeixin");
            return (Criteria) this;
        }

        public Criteria andDevicePicWeixinNotLike(String value) {
            addCriterion("device_pic_weixin not like", value, "devicePicWeixin");
            return (Criteria) this;
        }

        public Criteria andDevicePicWeixinIn(List<String> values) {
            addCriterion("device_pic_weixin in", values, "devicePicWeixin");
            return (Criteria) this;
        }

        public Criteria andDevicePicWeixinNotIn(List<String> values) {
            addCriterion("device_pic_weixin not in", values, "devicePicWeixin");
            return (Criteria) this;
        }

        public Criteria andDevicePicWeixinBetween(String value1, String value2) {
            addCriterion("device_pic_weixin between", value1, value2, "devicePicWeixin");
            return (Criteria) this;
        }

        public Criteria andDevicePicWeixinNotBetween(String value1, String value2) {
            addCriterion("device_pic_weixin not between", value1, value2, "devicePicWeixin");
            return (Criteria) this;
        }

        public Criteria andDeviceUniquenoIsNull() {
            addCriterion("device_uniqueNo is null");
            return (Criteria) this;
        }

        public Criteria andDeviceUniquenoIsNotNull() {
            addCriterion("device_uniqueNo is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceUniquenoEqualTo(String value) {
            addCriterion("device_uniqueNo =", value, "deviceUniqueno");
            return (Criteria) this;
        }

        public Criteria andDeviceUniquenoNotEqualTo(String value) {
            addCriterion("device_uniqueNo <>", value, "deviceUniqueno");
            return (Criteria) this;
        }

        public Criteria andDeviceUniquenoGreaterThan(String value) {
            addCriterion("device_uniqueNo >", value, "deviceUniqueno");
            return (Criteria) this;
        }

        public Criteria andDeviceUniquenoGreaterThanOrEqualTo(String value) {
            addCriterion("device_uniqueNo >=", value, "deviceUniqueno");
            return (Criteria) this;
        }

        public Criteria andDeviceUniquenoLessThan(String value) {
            addCriterion("device_uniqueNo <", value, "deviceUniqueno");
            return (Criteria) this;
        }

        public Criteria andDeviceUniquenoLessThanOrEqualTo(String value) {
            addCriterion("device_uniqueNo <=", value, "deviceUniqueno");
            return (Criteria) this;
        }

        public Criteria andDeviceUniquenoLike(String value) {
            addCriterion("device_uniqueNo like", value, "deviceUniqueno");
            return (Criteria) this;
        }

        public Criteria andDeviceUniquenoNotLike(String value) {
            addCriterion("device_uniqueNo not like", value, "deviceUniqueno");
            return (Criteria) this;
        }

        public Criteria andDeviceUniquenoIn(List<String> values) {
            addCriterion("device_uniqueNo in", values, "deviceUniqueno");
            return (Criteria) this;
        }

        public Criteria andDeviceUniquenoNotIn(List<String> values) {
            addCriterion("device_uniqueNo not in", values, "deviceUniqueno");
            return (Criteria) this;
        }

        public Criteria andDeviceUniquenoBetween(String value1, String value2) {
            addCriterion("device_uniqueNo between", value1, value2, "deviceUniqueno");
            return (Criteria) this;
        }

        public Criteria andDeviceUniquenoNotBetween(String value1, String value2) {
            addCriterion("device_uniqueNo not between", value1, value2, "deviceUniqueno");
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
     * sys_device
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sys_device Tue Jan 15 13:24:48 CST 2019
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