package com.shop.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogisticsExample() {
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

        public Criteria andLoidIsNull() {
            addCriterion("LOID is null");
            return (Criteria) this;
        }

        public Criteria andLoidIsNotNull() {
            addCriterion("LOID is not null");
            return (Criteria) this;
        }

        public Criteria andLoidEqualTo(String value) {
            addCriterion("LOID =", value, "loid");
            return (Criteria) this;
        }

        public Criteria andLoidNotEqualTo(String value) {
            addCriterion("LOID <>", value, "loid");
            return (Criteria) this;
        }

        public Criteria andLoidGreaterThan(String value) {
            addCriterion("LOID >", value, "loid");
            return (Criteria) this;
        }

        public Criteria andLoidGreaterThanOrEqualTo(String value) {
            addCriterion("LOID >=", value, "loid");
            return (Criteria) this;
        }

        public Criteria andLoidLessThan(String value) {
            addCriterion("LOID <", value, "loid");
            return (Criteria) this;
        }

        public Criteria andLoidLessThanOrEqualTo(String value) {
            addCriterion("LOID <=", value, "loid");
            return (Criteria) this;
        }

        public Criteria andLoidLike(String value) {
            addCriterion("LOID like", value, "loid");
            return (Criteria) this;
        }

        public Criteria andLoidNotLike(String value) {
            addCriterion("LOID not like", value, "loid");
            return (Criteria) this;
        }

        public Criteria andLoidIn(List<String> values) {
            addCriterion("LOID in", values, "loid");
            return (Criteria) this;
        }

        public Criteria andLoidNotIn(List<String> values) {
            addCriterion("LOID not in", values, "loid");
            return (Criteria) this;
        }

        public Criteria andLoidBetween(String value1, String value2) {
            addCriterion("LOID between", value1, value2, "loid");
            return (Criteria) this;
        }

        public Criteria andLoidNotBetween(String value1, String value2) {
            addCriterion("LOID not between", value1, value2, "loid");
            return (Criteria) this;
        }

        public Criteria andLodateIsNull() {
            addCriterion("LODATE is null");
            return (Criteria) this;
        }

        public Criteria andLodateIsNotNull() {
            addCriterion("LODATE is not null");
            return (Criteria) this;
        }

        public Criteria andLodateEqualTo(Date value) {
            addCriterion("LODATE =", value, "lodate");
            return (Criteria) this;
        }

        public Criteria andLodateNotEqualTo(Date value) {
            addCriterion("LODATE <>", value, "lodate");
            return (Criteria) this;
        }

        public Criteria andLodateGreaterThan(Date value) {
            addCriterion("LODATE >", value, "lodate");
            return (Criteria) this;
        }

        public Criteria andLodateGreaterThanOrEqualTo(Date value) {
            addCriterion("LODATE >=", value, "lodate");
            return (Criteria) this;
        }

        public Criteria andLodateLessThan(Date value) {
            addCriterion("LODATE <", value, "lodate");
            return (Criteria) this;
        }

        public Criteria andLodateLessThanOrEqualTo(Date value) {
            addCriterion("LODATE <=", value, "lodate");
            return (Criteria) this;
        }

        public Criteria andLodateIn(List<Date> values) {
            addCriterion("LODATE in", values, "lodate");
            return (Criteria) this;
        }

        public Criteria andLodateNotIn(List<Date> values) {
            addCriterion("LODATE not in", values, "lodate");
            return (Criteria) this;
        }

        public Criteria andLodateBetween(Date value1, Date value2) {
            addCriterion("LODATE between", value1, value2, "lodate");
            return (Criteria) this;
        }

        public Criteria andLodateNotBetween(Date value1, Date value2) {
            addCriterion("LODATE not between", value1, value2, "lodate");
            return (Criteria) this;
        }

        public Criteria andLoaddressIsNull() {
            addCriterion("LOADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andLoaddressIsNotNull() {
            addCriterion("LOADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andLoaddressEqualTo(String value) {
            addCriterion("LOADDRESS =", value, "loaddress");
            return (Criteria) this;
        }

        public Criteria andLoaddressNotEqualTo(String value) {
            addCriterion("LOADDRESS <>", value, "loaddress");
            return (Criteria) this;
        }

        public Criteria andLoaddressGreaterThan(String value) {
            addCriterion("LOADDRESS >", value, "loaddress");
            return (Criteria) this;
        }

        public Criteria andLoaddressGreaterThanOrEqualTo(String value) {
            addCriterion("LOADDRESS >=", value, "loaddress");
            return (Criteria) this;
        }

        public Criteria andLoaddressLessThan(String value) {
            addCriterion("LOADDRESS <", value, "loaddress");
            return (Criteria) this;
        }

        public Criteria andLoaddressLessThanOrEqualTo(String value) {
            addCriterion("LOADDRESS <=", value, "loaddress");
            return (Criteria) this;
        }

        public Criteria andLoaddressLike(String value) {
            addCriterion("LOADDRESS like", value, "loaddress");
            return (Criteria) this;
        }

        public Criteria andLoaddressNotLike(String value) {
            addCriterion("LOADDRESS not like", value, "loaddress");
            return (Criteria) this;
        }

        public Criteria andLoaddressIn(List<String> values) {
            addCriterion("LOADDRESS in", values, "loaddress");
            return (Criteria) this;
        }

        public Criteria andLoaddressNotIn(List<String> values) {
            addCriterion("LOADDRESS not in", values, "loaddress");
            return (Criteria) this;
        }

        public Criteria andLoaddressBetween(String value1, String value2) {
            addCriterion("LOADDRESS between", value1, value2, "loaddress");
            return (Criteria) this;
        }

        public Criteria andLoaddressNotBetween(String value1, String value2) {
            addCriterion("LOADDRESS not between", value1, value2, "loaddress");
            return (Criteria) this;
        }

        public Criteria andLostateIsNull() {
            addCriterion("LOSTATE is null");
            return (Criteria) this;
        }

        public Criteria andLostateIsNotNull() {
            addCriterion("LOSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andLostateEqualTo(BigDecimal value) {
            addCriterion("LOSTATE =", value, "lostate");
            return (Criteria) this;
        }

        public Criteria andLostateNotEqualTo(BigDecimal value) {
            addCriterion("LOSTATE <>", value, "lostate");
            return (Criteria) this;
        }

        public Criteria andLostateGreaterThan(BigDecimal value) {
            addCriterion("LOSTATE >", value, "lostate");
            return (Criteria) this;
        }

        public Criteria andLostateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOSTATE >=", value, "lostate");
            return (Criteria) this;
        }

        public Criteria andLostateLessThan(BigDecimal value) {
            addCriterion("LOSTATE <", value, "lostate");
            return (Criteria) this;
        }

        public Criteria andLostateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOSTATE <=", value, "lostate");
            return (Criteria) this;
        }

        public Criteria andLostateIn(List<BigDecimal> values) {
            addCriterion("LOSTATE in", values, "lostate");
            return (Criteria) this;
        }

        public Criteria andLostateNotIn(List<BigDecimal> values) {
            addCriterion("LOSTATE not in", values, "lostate");
            return (Criteria) this;
        }

        public Criteria andLostateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOSTATE between", value1, value2, "lostate");
            return (Criteria) this;
        }

        public Criteria andLostateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOSTATE not between", value1, value2, "lostate");
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