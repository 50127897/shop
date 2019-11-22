package com.shop.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andEhiretimeIsNull() {
            addCriterion("EHIRETIME is null");
            return (Criteria) this;
        }

        public Criteria andEhiretimeIsNotNull() {
            addCriterion("EHIRETIME is not null");
            return (Criteria) this;
        }

        public Criteria andEhiretimeEqualTo(Date value) {
            addCriterionForJDBCDate("EHIRETIME =", value, "ehiretime");
            return (Criteria) this;
        }

        public Criteria andEhiretimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EHIRETIME <>", value, "ehiretime");
            return (Criteria) this;
        }

        public Criteria andEhiretimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EHIRETIME >", value, "ehiretime");
            return (Criteria) this;
        }

        public Criteria andEhiretimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EHIRETIME >=", value, "ehiretime");
            return (Criteria) this;
        }

        public Criteria andEhiretimeLessThan(Date value) {
            addCriterionForJDBCDate("EHIRETIME <", value, "ehiretime");
            return (Criteria) this;
        }

        public Criteria andEhiretimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EHIRETIME <=", value, "ehiretime");
            return (Criteria) this;
        }

        public Criteria andEhiretimeIn(List<Date> values) {
            addCriterionForJDBCDate("EHIRETIME in", values, "ehiretime");
            return (Criteria) this;
        }

        public Criteria andEhiretimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EHIRETIME not in", values, "ehiretime");
            return (Criteria) this;
        }

        public Criteria andEhiretimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EHIRETIME between", value1, value2, "ehiretime");
            return (Criteria) this;
        }

        public Criteria andEhiretimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EHIRETIME not between", value1, value2, "ehiretime");
            return (Criteria) this;
        }

        public Criteria andEpasswordIsNull() {
            addCriterion("EPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andEpasswordIsNotNull() {
            addCriterion("EPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andEpasswordEqualTo(String value) {
            addCriterion("EPASSWORD =", value, "epassword");
            return (Criteria) this;
        }

        public Criteria andEpasswordNotEqualTo(String value) {
            addCriterion("EPASSWORD <>", value, "epassword");
            return (Criteria) this;
        }

        public Criteria andEpasswordGreaterThan(String value) {
            addCriterion("EPASSWORD >", value, "epassword");
            return (Criteria) this;
        }

        public Criteria andEpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("EPASSWORD >=", value, "epassword");
            return (Criteria) this;
        }

        public Criteria andEpasswordLessThan(String value) {
            addCriterion("EPASSWORD <", value, "epassword");
            return (Criteria) this;
        }

        public Criteria andEpasswordLessThanOrEqualTo(String value) {
            addCriterion("EPASSWORD <=", value, "epassword");
            return (Criteria) this;
        }

        public Criteria andEpasswordLike(String value) {
            addCriterion("EPASSWORD like", value, "epassword");
            return (Criteria) this;
        }

        public Criteria andEpasswordNotLike(String value) {
            addCriterion("EPASSWORD not like", value, "epassword");
            return (Criteria) this;
        }

        public Criteria andEpasswordIn(List<String> values) {
            addCriterion("EPASSWORD in", values, "epassword");
            return (Criteria) this;
        }

        public Criteria andEpasswordNotIn(List<String> values) {
            addCriterion("EPASSWORD not in", values, "epassword");
            return (Criteria) this;
        }

        public Criteria andEpasswordBetween(String value1, String value2) {
            addCriterion("EPASSWORD between", value1, value2, "epassword");
            return (Criteria) this;
        }

        public Criteria andEpasswordNotBetween(String value1, String value2) {
            addCriterion("EPASSWORD not between", value1, value2, "epassword");
            return (Criteria) this;
        }

        public Criteria andEstateIsNull() {
            addCriterion("ESTATE is null");
            return (Criteria) this;
        }

        public Criteria andEstateIsNotNull() {
            addCriterion("ESTATE is not null");
            return (Criteria) this;
        }

        public Criteria andEstateEqualTo(BigDecimal value) {
            addCriterion("ESTATE =", value, "estate");
            return (Criteria) this;
        }

        public Criteria andEstateNotEqualTo(BigDecimal value) {
            addCriterion("ESTATE <>", value, "estate");
            return (Criteria) this;
        }

        public Criteria andEstateGreaterThan(BigDecimal value) {
            addCriterion("ESTATE >", value, "estate");
            return (Criteria) this;
        }

        public Criteria andEstateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ESTATE >=", value, "estate");
            return (Criteria) this;
        }

        public Criteria andEstateLessThan(BigDecimal value) {
            addCriterion("ESTATE <", value, "estate");
            return (Criteria) this;
        }

        public Criteria andEstateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ESTATE <=", value, "estate");
            return (Criteria) this;
        }

        public Criteria andEstateIn(List<BigDecimal> values) {
            addCriterion("ESTATE in", values, "estate");
            return (Criteria) this;
        }

        public Criteria andEstateNotIn(List<BigDecimal> values) {
            addCriterion("ESTATE not in", values, "estate");
            return (Criteria) this;
        }

        public Criteria andEstateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ESTATE between", value1, value2, "estate");
            return (Criteria) this;
        }

        public Criteria andEstateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ESTATE not between", value1, value2, "estate");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ENAME is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ENAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ENAME =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ENAME <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ENAME >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ENAME >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ENAME <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ENAME <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ENAME like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ENAME not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ENAME in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ENAME not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ENAME between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ENAME not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEtelephoneIsNull() {
            addCriterion("ETELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andEtelephoneIsNotNull() {
            addCriterion("ETELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andEtelephoneEqualTo(String value) {
            addCriterion("ETELEPHONE =", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneNotEqualTo(String value) {
            addCriterion("ETELEPHONE <>", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneGreaterThan(String value) {
            addCriterion("ETELEPHONE >", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("ETELEPHONE >=", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneLessThan(String value) {
            addCriterion("ETELEPHONE <", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneLessThanOrEqualTo(String value) {
            addCriterion("ETELEPHONE <=", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneLike(String value) {
            addCriterion("ETELEPHONE like", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneNotLike(String value) {
            addCriterion("ETELEPHONE not like", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneIn(List<String> values) {
            addCriterion("ETELEPHONE in", values, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneNotIn(List<String> values) {
            addCriterion("ETELEPHONE not in", values, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneBetween(String value1, String value2) {
            addCriterion("ETELEPHONE between", value1, value2, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneNotBetween(String value1, String value2) {
            addCriterion("ETELEPHONE not between", value1, value2, "etelephone");
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