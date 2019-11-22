package com.shop.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderitemExample() {
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

        public Criteria andOiIdIsNull() {
            addCriterion("OI_ID is null");
            return (Criteria) this;
        }

        public Criteria andOiIdIsNotNull() {
            addCriterion("OI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOiIdEqualTo(String value) {
            addCriterion("OI_ID =", value, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdNotEqualTo(String value) {
            addCriterion("OI_ID <>", value, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdGreaterThan(String value) {
            addCriterion("OI_ID >", value, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdGreaterThanOrEqualTo(String value) {
            addCriterion("OI_ID >=", value, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdLessThan(String value) {
            addCriterion("OI_ID <", value, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdLessThanOrEqualTo(String value) {
            addCriterion("OI_ID <=", value, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdLike(String value) {
            addCriterion("OI_ID like", value, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdNotLike(String value) {
            addCriterion("OI_ID not like", value, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdIn(List<String> values) {
            addCriterion("OI_ID in", values, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdNotIn(List<String> values) {
            addCriterion("OI_ID not in", values, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdBetween(String value1, String value2) {
            addCriterion("OI_ID between", value1, value2, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdNotBetween(String value1, String value2) {
            addCriterion("OI_ID not between", value1, value2, "oiId");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(BigDecimal value) {
            addCriterion("QUANTITY =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(BigDecimal value) {
            addCriterion("QUANTITY >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(BigDecimal value) {
            addCriterion("QUANTITY <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<BigDecimal> values) {
            addCriterion("QUANTITY in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<BigDecimal> values) {
            addCriterion("QUANTITY not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andOiTotalIsNull() {
            addCriterion("OI_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andOiTotalIsNotNull() {
            addCriterion("OI_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andOiTotalEqualTo(BigDecimal value) {
            addCriterion("OI_TOTAL =", value, "oiTotal");
            return (Criteria) this;
        }

        public Criteria andOiTotalNotEqualTo(BigDecimal value) {
            addCriterion("OI_TOTAL <>", value, "oiTotal");
            return (Criteria) this;
        }

        public Criteria andOiTotalGreaterThan(BigDecimal value) {
            addCriterion("OI_TOTAL >", value, "oiTotal");
            return (Criteria) this;
        }

        public Criteria andOiTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OI_TOTAL >=", value, "oiTotal");
            return (Criteria) this;
        }

        public Criteria andOiTotalLessThan(BigDecimal value) {
            addCriterion("OI_TOTAL <", value, "oiTotal");
            return (Criteria) this;
        }

        public Criteria andOiTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OI_TOTAL <=", value, "oiTotal");
            return (Criteria) this;
        }

        public Criteria andOiTotalIn(List<BigDecimal> values) {
            addCriterion("OI_TOTAL in", values, "oiTotal");
            return (Criteria) this;
        }

        public Criteria andOiTotalNotIn(List<BigDecimal> values) {
            addCriterion("OI_TOTAL not in", values, "oiTotal");
            return (Criteria) this;
        }

        public Criteria andOiTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OI_TOTAL between", value1, value2, "oiTotal");
            return (Criteria) this;
        }

        public Criteria andOiTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OI_TOTAL not between", value1, value2, "oiTotal");
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

        public Criteria andOrderidIsNull() {
            addCriterion("ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("ORDERID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("ORDERID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("ORDERID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("ORDERID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("ORDERID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("ORDERID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("ORDERID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("ORDERID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("ORDERID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("ORDERID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("ORDERID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andCommentflagIsNull() {
            addCriterion("COMMENTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCommentflagIsNotNull() {
            addCriterion("COMMENTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCommentflagEqualTo(String value) {
            addCriterion("COMMENTFLAG =", value, "commentflag");
            return (Criteria) this;
        }

        public Criteria andCommentflagNotEqualTo(String value) {
            addCriterion("COMMENTFLAG <>", value, "commentflag");
            return (Criteria) this;
        }

        public Criteria andCommentflagGreaterThan(String value) {
            addCriterion("COMMENTFLAG >", value, "commentflag");
            return (Criteria) this;
        }

        public Criteria andCommentflagGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTFLAG >=", value, "commentflag");
            return (Criteria) this;
        }

        public Criteria andCommentflagLessThan(String value) {
            addCriterion("COMMENTFLAG <", value, "commentflag");
            return (Criteria) this;
        }

        public Criteria andCommentflagLessThanOrEqualTo(String value) {
            addCriterion("COMMENTFLAG <=", value, "commentflag");
            return (Criteria) this;
        }

        public Criteria andCommentflagLike(String value) {
            addCriterion("COMMENTFLAG like", value, "commentflag");
            return (Criteria) this;
        }

        public Criteria andCommentflagNotLike(String value) {
            addCriterion("COMMENTFLAG not like", value, "commentflag");
            return (Criteria) this;
        }

        public Criteria andCommentflagIn(List<String> values) {
            addCriterion("COMMENTFLAG in", values, "commentflag");
            return (Criteria) this;
        }

        public Criteria andCommentflagNotIn(List<String> values) {
            addCriterion("COMMENTFLAG not in", values, "commentflag");
            return (Criteria) this;
        }

        public Criteria andCommentflagBetween(String value1, String value2) {
            addCriterion("COMMENTFLAG between", value1, value2, "commentflag");
            return (Criteria) this;
        }

        public Criteria andCommentflagNotBetween(String value1, String value2) {
            addCriterion("COMMENTFLAG not between", value1, value2, "commentflag");
            return (Criteria) this;
        }

        public Criteria andProductspecIsNull() {
            addCriterion("PRODUCTSPEC is null");
            return (Criteria) this;
        }

        public Criteria andProductspecIsNotNull() {
            addCriterion("PRODUCTSPEC is not null");
            return (Criteria) this;
        }

        public Criteria andProductspecEqualTo(String value) {
            addCriterion("PRODUCTSPEC =", value, "productspec");
            return (Criteria) this;
        }

        public Criteria andProductspecNotEqualTo(String value) {
            addCriterion("PRODUCTSPEC <>", value, "productspec");
            return (Criteria) this;
        }

        public Criteria andProductspecGreaterThan(String value) {
            addCriterion("PRODUCTSPEC >", value, "productspec");
            return (Criteria) this;
        }

        public Criteria andProductspecGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTSPEC >=", value, "productspec");
            return (Criteria) this;
        }

        public Criteria andProductspecLessThan(String value) {
            addCriterion("PRODUCTSPEC <", value, "productspec");
            return (Criteria) this;
        }

        public Criteria andProductspecLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTSPEC <=", value, "productspec");
            return (Criteria) this;
        }

        public Criteria andProductspecLike(String value) {
            addCriterion("PRODUCTSPEC like", value, "productspec");
            return (Criteria) this;
        }

        public Criteria andProductspecNotLike(String value) {
            addCriterion("PRODUCTSPEC not like", value, "productspec");
            return (Criteria) this;
        }

        public Criteria andProductspecIn(List<String> values) {
            addCriterion("PRODUCTSPEC in", values, "productspec");
            return (Criteria) this;
        }

        public Criteria andProductspecNotIn(List<String> values) {
            addCriterion("PRODUCTSPEC not in", values, "productspec");
            return (Criteria) this;
        }

        public Criteria andProductspecBetween(String value1, String value2) {
            addCriterion("PRODUCTSPEC between", value1, value2, "productspec");
            return (Criteria) this;
        }

        public Criteria andProductspecNotBetween(String value1, String value2) {
            addCriterion("PRODUCTSPEC not between", value1, value2, "productspec");
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