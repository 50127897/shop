package com.shop.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessagesExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("MID is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("MID is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(BigDecimal value) {
            addCriterion("MID =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(BigDecimal value) {
            addCriterion("MID <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(BigDecimal value) {
            addCriterion("MID >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MID >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(BigDecimal value) {
            addCriterion("MID <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MID <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<BigDecimal> values) {
            addCriterion("MID in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<BigDecimal> values) {
            addCriterion("MID not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MID between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MID not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("CUSTOMER_ID like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("CUSTOMER_ID not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
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

        public Criteria andPidEqualTo(Date value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Date value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Date value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Date value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Date value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Date value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Date> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Date> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Date value1, Date value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Date value1, Date value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andMcontentIsNull() {
            addCriterion("MCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andMcontentIsNotNull() {
            addCriterion("MCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andMcontentEqualTo(String value) {
            addCriterion("MCONTENT =", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentNotEqualTo(String value) {
            addCriterion("MCONTENT <>", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentGreaterThan(String value) {
            addCriterion("MCONTENT >", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentGreaterThanOrEqualTo(String value) {
            addCriterion("MCONTENT >=", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentLessThan(String value) {
            addCriterion("MCONTENT <", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentLessThanOrEqualTo(String value) {
            addCriterion("MCONTENT <=", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentLike(String value) {
            addCriterion("MCONTENT like", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentNotLike(String value) {
            addCriterion("MCONTENT not like", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentIn(List<String> values) {
            addCriterion("MCONTENT in", values, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentNotIn(List<String> values) {
            addCriterion("MCONTENT not in", values, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentBetween(String value1, String value2) {
            addCriterion("MCONTENT between", value1, value2, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentNotBetween(String value1, String value2) {
            addCriterion("MCONTENT not between", value1, value2, "mcontent");
            return (Criteria) this;
        }

        public Criteria andEidIsNull() {
            addCriterion("EID is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("EID is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(String value) {
            addCriterion("EID =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(String value) {
            addCriterion("EID <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(String value) {
            addCriterion("EID >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(String value) {
            addCriterion("EID >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(String value) {
            addCriterion("EID <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(String value) {
            addCriterion("EID <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLike(String value) {
            addCriterion("EID like", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotLike(String value) {
            addCriterion("EID not like", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<String> values) {
            addCriterion("EID in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<String> values) {
            addCriterion("EID not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(String value1, String value2) {
            addCriterion("EID between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(String value1, String value2) {
            addCriterion("EID not between", value1, value2, "eid");
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