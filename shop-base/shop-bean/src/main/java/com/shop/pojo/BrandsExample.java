package com.shop.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BrandsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandsExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("BID is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("BID is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(BigDecimal value) {
            addCriterion("BID =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(BigDecimal value) {
            addCriterion("BID <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(BigDecimal value) {
            addCriterion("BID >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BID >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(BigDecimal value) {
            addCriterion("BID <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BID <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<BigDecimal> values) {
            addCriterion("BID in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<BigDecimal> values) {
            addCriterion("BID not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BID between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BID not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBnameIsNull() {
            addCriterion("BNAME is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("BNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("BNAME =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("BNAME <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("BNAME >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("BNAME >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("BNAME <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("BNAME <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("BNAME like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("BNAME not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("BNAME in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("BNAME not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("BNAME between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("BNAME not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBrRouteIsNull() {
            addCriterion("BR_ROUTE is null");
            return (Criteria) this;
        }

        public Criteria andBrRouteIsNotNull() {
            addCriterion("BR_ROUTE is not null");
            return (Criteria) this;
        }

        public Criteria andBrRouteEqualTo(String value) {
            addCriterion("BR_ROUTE =", value, "brRoute");
            return (Criteria) this;
        }

        public Criteria andBrRouteNotEqualTo(String value) {
            addCriterion("BR_ROUTE <>", value, "brRoute");
            return (Criteria) this;
        }

        public Criteria andBrRouteGreaterThan(String value) {
            addCriterion("BR_ROUTE >", value, "brRoute");
            return (Criteria) this;
        }

        public Criteria andBrRouteGreaterThanOrEqualTo(String value) {
            addCriterion("BR_ROUTE >=", value, "brRoute");
            return (Criteria) this;
        }

        public Criteria andBrRouteLessThan(String value) {
            addCriterion("BR_ROUTE <", value, "brRoute");
            return (Criteria) this;
        }

        public Criteria andBrRouteLessThanOrEqualTo(String value) {
            addCriterion("BR_ROUTE <=", value, "brRoute");
            return (Criteria) this;
        }

        public Criteria andBrRouteLike(String value) {
            addCriterion("BR_ROUTE like", value, "brRoute");
            return (Criteria) this;
        }

        public Criteria andBrRouteNotLike(String value) {
            addCriterion("BR_ROUTE not like", value, "brRoute");
            return (Criteria) this;
        }

        public Criteria andBrRouteIn(List<String> values) {
            addCriterion("BR_ROUTE in", values, "brRoute");
            return (Criteria) this;
        }

        public Criteria andBrRouteNotIn(List<String> values) {
            addCriterion("BR_ROUTE not in", values, "brRoute");
            return (Criteria) this;
        }

        public Criteria andBrRouteBetween(String value1, String value2) {
            addCriterion("BR_ROUTE between", value1, value2, "brRoute");
            return (Criteria) this;
        }

        public Criteria andBrRouteNotBetween(String value1, String value2) {
            addCriterion("BR_ROUTE not between", value1, value2, "brRoute");
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