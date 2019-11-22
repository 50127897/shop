package com.shop.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductSpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSpecExample() {
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

        public Criteria andPsIdIsNull() {
            addCriterion("PS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPsIdIsNotNull() {
            addCriterion("PS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPsIdEqualTo(BigDecimal value) {
            addCriterion("PS_ID =", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotEqualTo(BigDecimal value) {
            addCriterion("PS_ID <>", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThan(BigDecimal value) {
            addCriterion("PS_ID >", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PS_ID >=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThan(BigDecimal value) {
            addCriterion("PS_ID <", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PS_ID <=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdIn(List<BigDecimal> values) {
            addCriterion("PS_ID in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotIn(List<BigDecimal> values) {
            addCriterion("PS_ID not in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PS_ID between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PS_ID not between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("PID like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("PID not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPsSpecIsNull() {
            addCriterion("PS_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andPsSpecIsNotNull() {
            addCriterion("PS_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andPsSpecEqualTo(String value) {
            addCriterion("PS_SPEC =", value, "psSpec");
            return (Criteria) this;
        }

        public Criteria andPsSpecNotEqualTo(String value) {
            addCriterion("PS_SPEC <>", value, "psSpec");
            return (Criteria) this;
        }

        public Criteria andPsSpecGreaterThan(String value) {
            addCriterion("PS_SPEC >", value, "psSpec");
            return (Criteria) this;
        }

        public Criteria andPsSpecGreaterThanOrEqualTo(String value) {
            addCriterion("PS_SPEC >=", value, "psSpec");
            return (Criteria) this;
        }

        public Criteria andPsSpecLessThan(String value) {
            addCriterion("PS_SPEC <", value, "psSpec");
            return (Criteria) this;
        }

        public Criteria andPsSpecLessThanOrEqualTo(String value) {
            addCriterion("PS_SPEC <=", value, "psSpec");
            return (Criteria) this;
        }

        public Criteria andPsSpecLike(String value) {
            addCriterion("PS_SPEC like", value, "psSpec");
            return (Criteria) this;
        }

        public Criteria andPsSpecNotLike(String value) {
            addCriterion("PS_SPEC not like", value, "psSpec");
            return (Criteria) this;
        }

        public Criteria andPsSpecIn(List<String> values) {
            addCriterion("PS_SPEC in", values, "psSpec");
            return (Criteria) this;
        }

        public Criteria andPsSpecNotIn(List<String> values) {
            addCriterion("PS_SPEC not in", values, "psSpec");
            return (Criteria) this;
        }

        public Criteria andPsSpecBetween(String value1, String value2) {
            addCriterion("PS_SPEC between", value1, value2, "psSpec");
            return (Criteria) this;
        }

        public Criteria andPsSpecNotBetween(String value1, String value2) {
            addCriterion("PS_SPEC not between", value1, value2, "psSpec");
            return (Criteria) this;
        }

        public Criteria andPsStoreIsNull() {
            addCriterion("PS_STORE is null");
            return (Criteria) this;
        }

        public Criteria andPsStoreIsNotNull() {
            addCriterion("PS_STORE is not null");
            return (Criteria) this;
        }

        public Criteria andPsStoreEqualTo(BigDecimal value) {
            addCriterion("PS_STORE =", value, "psStore");
            return (Criteria) this;
        }

        public Criteria andPsStoreNotEqualTo(BigDecimal value) {
            addCriterion("PS_STORE <>", value, "psStore");
            return (Criteria) this;
        }

        public Criteria andPsStoreGreaterThan(BigDecimal value) {
            addCriterion("PS_STORE >", value, "psStore");
            return (Criteria) this;
        }

        public Criteria andPsStoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PS_STORE >=", value, "psStore");
            return (Criteria) this;
        }

        public Criteria andPsStoreLessThan(BigDecimal value) {
            addCriterion("PS_STORE <", value, "psStore");
            return (Criteria) this;
        }

        public Criteria andPsStoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PS_STORE <=", value, "psStore");
            return (Criteria) this;
        }

        public Criteria andPsStoreIn(List<BigDecimal> values) {
            addCriterion("PS_STORE in", values, "psStore");
            return (Criteria) this;
        }

        public Criteria andPsStoreNotIn(List<BigDecimal> values) {
            addCriterion("PS_STORE not in", values, "psStore");
            return (Criteria) this;
        }

        public Criteria andPsStoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PS_STORE between", value1, value2, "psStore");
            return (Criteria) this;
        }

        public Criteria andPsStoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PS_STORE not between", value1, value2, "psStore");
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