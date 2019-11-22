package com.shop.pojo;

import java.util.ArrayList;
import java.util.List;

public class TakeDeliveryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TakeDeliveryExample() {
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

        public Criteria andTdIdIsNull() {
            addCriterion("TD_ID is null");
            return (Criteria) this;
        }

        public Criteria andTdIdIsNotNull() {
            addCriterion("TD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTdIdEqualTo(String value) {
            addCriterion("TD_ID =", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdNotEqualTo(String value) {
            addCriterion("TD_ID <>", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdGreaterThan(String value) {
            addCriterion("TD_ID >", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdGreaterThanOrEqualTo(String value) {
            addCriterion("TD_ID >=", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdLessThan(String value) {
            addCriterion("TD_ID <", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdLessThanOrEqualTo(String value) {
            addCriterion("TD_ID <=", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdLike(String value) {
            addCriterion("TD_ID like", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdNotLike(String value) {
            addCriterion("TD_ID not like", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdIn(List<String> values) {
            addCriterion("TD_ID in", values, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdNotIn(List<String> values) {
            addCriterion("TD_ID not in", values, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdBetween(String value1, String value2) {
            addCriterion("TD_ID between", value1, value2, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdNotBetween(String value1, String value2) {
            addCriterion("TD_ID not between", value1, value2, "tdId");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTdNameIsNull() {
            addCriterion("TD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTdNameIsNotNull() {
            addCriterion("TD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTdNameEqualTo(String value) {
            addCriterion("TD_NAME =", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameNotEqualTo(String value) {
            addCriterion("TD_NAME <>", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameGreaterThan(String value) {
            addCriterion("TD_NAME >", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameGreaterThanOrEqualTo(String value) {
            addCriterion("TD_NAME >=", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameLessThan(String value) {
            addCriterion("TD_NAME <", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameLessThanOrEqualTo(String value) {
            addCriterion("TD_NAME <=", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameLike(String value) {
            addCriterion("TD_NAME like", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameNotLike(String value) {
            addCriterion("TD_NAME not like", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameIn(List<String> values) {
            addCriterion("TD_NAME in", values, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameNotIn(List<String> values) {
            addCriterion("TD_NAME not in", values, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameBetween(String value1, String value2) {
            addCriterion("TD_NAME between", value1, value2, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameNotBetween(String value1, String value2) {
            addCriterion("TD_NAME not between", value1, value2, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdAddressIsNull() {
            addCriterion("TD_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andTdAddressIsNotNull() {
            addCriterion("TD_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andTdAddressEqualTo(String value) {
            addCriterion("TD_ADDRESS =", value, "tdAddress");
            return (Criteria) this;
        }

        public Criteria andTdAddressNotEqualTo(String value) {
            addCriterion("TD_ADDRESS <>", value, "tdAddress");
            return (Criteria) this;
        }

        public Criteria andTdAddressGreaterThan(String value) {
            addCriterion("TD_ADDRESS >", value, "tdAddress");
            return (Criteria) this;
        }

        public Criteria andTdAddressGreaterThanOrEqualTo(String value) {
            addCriterion("TD_ADDRESS >=", value, "tdAddress");
            return (Criteria) this;
        }

        public Criteria andTdAddressLessThan(String value) {
            addCriterion("TD_ADDRESS <", value, "tdAddress");
            return (Criteria) this;
        }

        public Criteria andTdAddressLessThanOrEqualTo(String value) {
            addCriterion("TD_ADDRESS <=", value, "tdAddress");
            return (Criteria) this;
        }

        public Criteria andTdAddressLike(String value) {
            addCriterion("TD_ADDRESS like", value, "tdAddress");
            return (Criteria) this;
        }

        public Criteria andTdAddressNotLike(String value) {
            addCriterion("TD_ADDRESS not like", value, "tdAddress");
            return (Criteria) this;
        }

        public Criteria andTdAddressIn(List<String> values) {
            addCriterion("TD_ADDRESS in", values, "tdAddress");
            return (Criteria) this;
        }

        public Criteria andTdAddressNotIn(List<String> values) {
            addCriterion("TD_ADDRESS not in", values, "tdAddress");
            return (Criteria) this;
        }

        public Criteria andTdAddressBetween(String value1, String value2) {
            addCriterion("TD_ADDRESS between", value1, value2, "tdAddress");
            return (Criteria) this;
        }

        public Criteria andTdAddressNotBetween(String value1, String value2) {
            addCriterion("TD_ADDRESS not between", value1, value2, "tdAddress");
            return (Criteria) this;
        }

        public Criteria andTdTelephoneIsNull() {
            addCriterion("TD_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTdTelephoneIsNotNull() {
            addCriterion("TD_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTdTelephoneEqualTo(String value) {
            addCriterion("TD_TELEPHONE =", value, "tdTelephone");
            return (Criteria) this;
        }

        public Criteria andTdTelephoneNotEqualTo(String value) {
            addCriterion("TD_TELEPHONE <>", value, "tdTelephone");
            return (Criteria) this;
        }

        public Criteria andTdTelephoneGreaterThan(String value) {
            addCriterion("TD_TELEPHONE >", value, "tdTelephone");
            return (Criteria) this;
        }

        public Criteria andTdTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TD_TELEPHONE >=", value, "tdTelephone");
            return (Criteria) this;
        }

        public Criteria andTdTelephoneLessThan(String value) {
            addCriterion("TD_TELEPHONE <", value, "tdTelephone");
            return (Criteria) this;
        }

        public Criteria andTdTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TD_TELEPHONE <=", value, "tdTelephone");
            return (Criteria) this;
        }

        public Criteria andTdTelephoneLike(String value) {
            addCriterion("TD_TELEPHONE like", value, "tdTelephone");
            return (Criteria) this;
        }

        public Criteria andTdTelephoneNotLike(String value) {
            addCriterion("TD_TELEPHONE not like", value, "tdTelephone");
            return (Criteria) this;
        }

        public Criteria andTdTelephoneIn(List<String> values) {
            addCriterion("TD_TELEPHONE in", values, "tdTelephone");
            return (Criteria) this;
        }

        public Criteria andTdTelephoneNotIn(List<String> values) {
            addCriterion("TD_TELEPHONE not in", values, "tdTelephone");
            return (Criteria) this;
        }

        public Criteria andTdTelephoneBetween(String value1, String value2) {
            addCriterion("TD_TELEPHONE between", value1, value2, "tdTelephone");
            return (Criteria) this;
        }

        public Criteria andTdTelephoneNotBetween(String value1, String value2) {
            addCriterion("TD_TELEPHONE not between", value1, value2, "tdTelephone");
            return (Criteria) this;
        }

        public Criteria andTdstateIsNull() {
            addCriterion("TDSTATE is null");
            return (Criteria) this;
        }

        public Criteria andTdstateIsNotNull() {
            addCriterion("TDSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andTdstateEqualTo(String value) {
            addCriterion("TDSTATE =", value, "tdstate");
            return (Criteria) this;
        }

        public Criteria andTdstateNotEqualTo(String value) {
            addCriterion("TDSTATE <>", value, "tdstate");
            return (Criteria) this;
        }

        public Criteria andTdstateGreaterThan(String value) {
            addCriterion("TDSTATE >", value, "tdstate");
            return (Criteria) this;
        }

        public Criteria andTdstateGreaterThanOrEqualTo(String value) {
            addCriterion("TDSTATE >=", value, "tdstate");
            return (Criteria) this;
        }

        public Criteria andTdstateLessThan(String value) {
            addCriterion("TDSTATE <", value, "tdstate");
            return (Criteria) this;
        }

        public Criteria andTdstateLessThanOrEqualTo(String value) {
            addCriterion("TDSTATE <=", value, "tdstate");
            return (Criteria) this;
        }

        public Criteria andTdstateLike(String value) {
            addCriterion("TDSTATE like", value, "tdstate");
            return (Criteria) this;
        }

        public Criteria andTdstateNotLike(String value) {
            addCriterion("TDSTATE not like", value, "tdstate");
            return (Criteria) this;
        }

        public Criteria andTdstateIn(List<String> values) {
            addCriterion("TDSTATE in", values, "tdstate");
            return (Criteria) this;
        }

        public Criteria andTdstateNotIn(List<String> values) {
            addCriterion("TDSTATE not in", values, "tdstate");
            return (Criteria) this;
        }

        public Criteria andTdstateBetween(String value1, String value2) {
            addCriterion("TDSTATE between", value1, value2, "tdstate");
            return (Criteria) this;
        }

        public Criteria andTdstateNotBetween(String value1, String value2) {
            addCriterion("TDSTATE not between", value1, value2, "tdstate");
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