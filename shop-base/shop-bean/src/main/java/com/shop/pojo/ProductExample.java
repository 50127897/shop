package com.shop.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andPnameIsNull() {
            addCriterion("PNAME is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("PNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("PNAME =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("PNAME <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("PNAME >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("PNAME >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("PNAME <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("PNAME <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("PNAME like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("PNAME not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("PNAME in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("PNAME not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("PNAME between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("PNAME not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNull() {
            addCriterion("SHOP_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNotNull() {
            addCriterion("SHOP_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andShopPriceEqualTo(BigDecimal value) {
            addCriterion("SHOP_PRICE =", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotEqualTo(BigDecimal value) {
            addCriterion("SHOP_PRICE <>", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThan(BigDecimal value) {
            addCriterion("SHOP_PRICE >", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOP_PRICE >=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThan(BigDecimal value) {
            addCriterion("SHOP_PRICE <", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOP_PRICE <=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceIn(List<BigDecimal> values) {
            addCriterion("SHOP_PRICE in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotIn(List<BigDecimal> values) {
            addCriterion("SHOP_PRICE not in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOP_PRICE between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOP_PRICE not between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("MARKET_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("MARKET_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("MARKET_PRICE =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("MARKET_PRICE <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("MARKET_PRICE >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MARKET_PRICE >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("MARKET_PRICE <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MARKET_PRICE <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("MARKET_PRICE in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("MARKET_PRICE not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARKET_PRICE between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARKET_PRICE not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andPdateIsNull() {
            addCriterion("PDATE is null");
            return (Criteria) this;
        }

        public Criteria andPdateIsNotNull() {
            addCriterion("PDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPdateEqualTo(Date value) {
            addCriterion("PDATE =", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateNotEqualTo(Date value) {
            addCriterion("PDATE <>", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateGreaterThan(Date value) {
            addCriterion("PDATE >", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PDATE >=", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateLessThan(Date value) {
            addCriterion("PDATE <", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateLessThanOrEqualTo(Date value) {
            addCriterion("PDATE <=", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateIn(List<Date> values) {
            addCriterion("PDATE in", values, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateNotIn(List<Date> values) {
            addCriterion("PDATE not in", values, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateBetween(Date value1, Date value2) {
            addCriterion("PDATE between", value1, value2, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateNotBetween(Date value1, Date value2) {
            addCriterion("PDATE not between", value1, value2, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdescIsNull() {
            addCriterion("PDESC is null");
            return (Criteria) this;
        }

        public Criteria andPdescIsNotNull() {
            addCriterion("PDESC is not null");
            return (Criteria) this;
        }

        public Criteria andPdescEqualTo(String value) {
            addCriterion("PDESC =", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescNotEqualTo(String value) {
            addCriterion("PDESC <>", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescGreaterThan(String value) {
            addCriterion("PDESC >", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescGreaterThanOrEqualTo(String value) {
            addCriterion("PDESC >=", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescLessThan(String value) {
            addCriterion("PDESC <", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescLessThanOrEqualTo(String value) {
            addCriterion("PDESC <=", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescLike(String value) {
            addCriterion("PDESC like", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescNotLike(String value) {
            addCriterion("PDESC not like", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescIn(List<String> values) {
            addCriterion("PDESC in", values, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescNotIn(List<String> values) {
            addCriterion("PDESC not in", values, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescBetween(String value1, String value2) {
            addCriterion("PDESC between", value1, value2, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescNotBetween(String value1, String value2) {
            addCriterion("PDESC not between", value1, value2, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPflagIsNull() {
            addCriterion("PFLAG is null");
            return (Criteria) this;
        }

        public Criteria andPflagIsNotNull() {
            addCriterion("PFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPflagEqualTo(BigDecimal value) {
            addCriterion("PFLAG =", value, "pflag");
            return (Criteria) this;
        }

        public Criteria andPflagNotEqualTo(BigDecimal value) {
            addCriterion("PFLAG <>", value, "pflag");
            return (Criteria) this;
        }

        public Criteria andPflagGreaterThan(BigDecimal value) {
            addCriterion("PFLAG >", value, "pflag");
            return (Criteria) this;
        }

        public Criteria andPflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PFLAG >=", value, "pflag");
            return (Criteria) this;
        }

        public Criteria andPflagLessThan(BigDecimal value) {
            addCriterion("PFLAG <", value, "pflag");
            return (Criteria) this;
        }

        public Criteria andPflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PFLAG <=", value, "pflag");
            return (Criteria) this;
        }

        public Criteria andPflagIn(List<BigDecimal> values) {
            addCriterion("PFLAG in", values, "pflag");
            return (Criteria) this;
        }

        public Criteria andPflagNotIn(List<BigDecimal> values) {
            addCriterion("PFLAG not in", values, "pflag");
            return (Criteria) this;
        }

        public Criteria andPflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PFLAG between", value1, value2, "pflag");
            return (Criteria) this;
        }

        public Criteria andPflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PFLAG not between", value1, value2, "pflag");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("CID is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("CID is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("CID =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("CID <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("CID >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("CID >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("CID <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("CID <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("CID like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("CID not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("CID in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("CID not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("CID between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("CID not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andPsaleIsNull() {
            addCriterion("PSALE is null");
            return (Criteria) this;
        }

        public Criteria andPsaleIsNotNull() {
            addCriterion("PSALE is not null");
            return (Criteria) this;
        }

        public Criteria andPsaleEqualTo(BigDecimal value) {
            addCriterion("PSALE =", value, "psale");
            return (Criteria) this;
        }

        public Criteria andPsaleNotEqualTo(BigDecimal value) {
            addCriterion("PSALE <>", value, "psale");
            return (Criteria) this;
        }

        public Criteria andPsaleGreaterThan(BigDecimal value) {
            addCriterion("PSALE >", value, "psale");
            return (Criteria) this;
        }

        public Criteria andPsaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PSALE >=", value, "psale");
            return (Criteria) this;
        }

        public Criteria andPsaleLessThan(BigDecimal value) {
            addCriterion("PSALE <", value, "psale");
            return (Criteria) this;
        }

        public Criteria andPsaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PSALE <=", value, "psale");
            return (Criteria) this;
        }

        public Criteria andPsaleIn(List<BigDecimal> values) {
            addCriterion("PSALE in", values, "psale");
            return (Criteria) this;
        }

        public Criteria andPsaleNotIn(List<BigDecimal> values) {
            addCriterion("PSALE not in", values, "psale");
            return (Criteria) this;
        }

        public Criteria andPsaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PSALE between", value1, value2, "psale");
            return (Criteria) this;
        }

        public Criteria andPsaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PSALE not between", value1, value2, "psale");
            return (Criteria) this;
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

        public Criteria andSearchinformationIsNull() {
            addCriterion("SEARCHINFORMATION is null");
            return (Criteria) this;
        }

        public Criteria andSearchinformationIsNotNull() {
            addCriterion("SEARCHINFORMATION is not null");
            return (Criteria) this;
        }

        public Criteria andSearchinformationEqualTo(String value) {
            addCriterion("SEARCHINFORMATION =", value, "searchinformation");
            return (Criteria) this;
        }

        public Criteria andSearchinformationNotEqualTo(String value) {
            addCriterion("SEARCHINFORMATION <>", value, "searchinformation");
            return (Criteria) this;
        }

        public Criteria andSearchinformationGreaterThan(String value) {
            addCriterion("SEARCHINFORMATION >", value, "searchinformation");
            return (Criteria) this;
        }

        public Criteria andSearchinformationGreaterThanOrEqualTo(String value) {
            addCriterion("SEARCHINFORMATION >=", value, "searchinformation");
            return (Criteria) this;
        }

        public Criteria andSearchinformationLessThan(String value) {
            addCriterion("SEARCHINFORMATION <", value, "searchinformation");
            return (Criteria) this;
        }

        public Criteria andSearchinformationLessThanOrEqualTo(String value) {
            addCriterion("SEARCHINFORMATION <=", value, "searchinformation");
            return (Criteria) this;
        }

        public Criteria andSearchinformationLike(String value) {
            addCriterion("SEARCHINFORMATION like", value, "searchinformation");
            return (Criteria) this;
        }

        public Criteria andSearchinformationNotLike(String value) {
            addCriterion("SEARCHINFORMATION not like", value, "searchinformation");
            return (Criteria) this;
        }

        public Criteria andSearchinformationIn(List<String> values) {
            addCriterion("SEARCHINFORMATION in", values, "searchinformation");
            return (Criteria) this;
        }

        public Criteria andSearchinformationNotIn(List<String> values) {
            addCriterion("SEARCHINFORMATION not in", values, "searchinformation");
            return (Criteria) this;
        }

        public Criteria andSearchinformationBetween(String value1, String value2) {
            addCriterion("SEARCHINFORMATION between", value1, value2, "searchinformation");
            return (Criteria) this;
        }

        public Criteria andSearchinformationNotBetween(String value1, String value2) {
            addCriterion("SEARCHINFORMATION not between", value1, value2, "searchinformation");
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