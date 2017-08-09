package com.lbh360.platform.base.dao.domain.merch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MerchBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchBaseInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAfterTimesIsNull() {
            addCriterion("aftertimes is null");
            return (Criteria) this;
        }

        public Criteria andAfterTimesIsNotNull() {
            addCriterion("aftertimes is not null");
            return (Criteria) this;
        }

        public Criteria andAfterTimesEqualTo(Integer value) {
            addCriterion("aftertimes =", value, "afterTimes");
            return (Criteria) this;
        }

        public Criteria andAfterTimesNotEqualTo(Integer value) {
            addCriterion("aftertimes <>", value, "afterTimes");
            return (Criteria) this;
        }

        public Criteria andAfterTimesGreaterThan(Integer value) {
            addCriterion("aftertimes >", value, "afterTimes");
            return (Criteria) this;
        }

        public Criteria andAfterTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("aftertimes >=", value, "afterTimes");
            return (Criteria) this;
        }

        public Criteria andAfterTimesLessThan(Integer value) {
            addCriterion("aftertimes <", value, "afterTimes");
            return (Criteria) this;
        }

        public Criteria andAfterTimesLessThanOrEqualTo(Integer value) {
            addCriterion("aftertimes <=", value, "afterTimes");
            return (Criteria) this;
        }

        public Criteria andAfterTimesIn(List<Integer> values) {
            addCriterion("aftertimes in", values, "afterTimes");
            return (Criteria) this;
        }

        public Criteria andAfterTimesNotIn(List<Integer> values) {
            addCriterion("aftertimes not in", values, "afterTimes");
            return (Criteria) this;
        }

        public Criteria andAfterTimesBetween(Integer value1, Integer value2) {
            addCriterion("aftertimes between", value1, value2, "afterTimes");
            return (Criteria) this;
        }

        public Criteria andAfterTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("aftertimes not between", value1, value2, "afterTimes");
            return (Criteria) this;
        }

        public Criteria andBeforeTimesIsNull() {
            addCriterion("beforetimes is null");
            return (Criteria) this;
        }

        public Criteria andBeforeTimesIsNotNull() {
            addCriterion("beforetimes is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeTimesEqualTo(Integer value) {
            addCriterion("beforetimes =", value, "beforeTimes");
            return (Criteria) this;
        }

        public Criteria andBeforeTimesNotEqualTo(Integer value) {
            addCriterion("beforetimes <>", value, "beforeTimes");
            return (Criteria) this;
        }

        public Criteria andBeforeTimesGreaterThan(Integer value) {
            addCriterion("beforetimes >", value, "beforeTimes");
            return (Criteria) this;
        }

        public Criteria andBeforeTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("beforetimes >=", value, "beforeTimes");
            return (Criteria) this;
        }

        public Criteria andBeforeTimesLessThan(Integer value) {
            addCriterion("beforetimes <", value, "beforeTimes");
            return (Criteria) this;
        }

        public Criteria andBeforeTimesLessThanOrEqualTo(Integer value) {
            addCriterion("beforetimes <=", value, "beforeTimes");
            return (Criteria) this;
        }

        public Criteria andBeforeTimesIn(List<Integer> values) {
            addCriterion("beforetimes in", values, "beforeTimes");
            return (Criteria) this;
        }

        public Criteria andBeforeTimesNotIn(List<Integer> values) {
            addCriterion("beforetimes not in", values, "beforeTimes");
            return (Criteria) this;
        }

        public Criteria andBeforeTimesBetween(Integer value1, Integer value2) {
            addCriterion("beforetimes between", value1, value2, "beforeTimes");
            return (Criteria) this;
        }

        public Criteria andBeforeTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("beforetimes not between", value1, value2, "beforeTimes");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andCompidIsNull() {
            addCriterion("compid is null");
            return (Criteria) this;
        }

        public Criteria andCompidIsNotNull() {
            addCriterion("compid is not null");
            return (Criteria) this;
        }

        public Criteria andCompidEqualTo(String value) {
            addCriterion("compid =", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidNotEqualTo(String value) {
            addCriterion("compid <>", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidGreaterThan(String value) {
            addCriterion("compid >", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidGreaterThanOrEqualTo(String value) {
            addCriterion("compid >=", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidLessThan(String value) {
            addCriterion("compid <", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidLessThanOrEqualTo(String value) {
            addCriterion("compid <=", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidLike(String value) {
            addCriterion("compid like", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidNotLike(String value) {
            addCriterion("compid not like", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidIn(List<String> values) {
            addCriterion("compid in", values, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidNotIn(List<String> values) {
            addCriterion("compid not in", values, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidBetween(String value1, String value2) {
            addCriterion("compid between", value1, value2, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidNotBetween(String value1, String value2) {
            addCriterion("compid not between", value1, value2, "compid");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("costprice is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("costprice is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("costprice =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("costprice <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("costprice >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("costprice >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("costprice <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("costprice <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("costprice in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("costprice not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("costprice between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("costprice not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("createtime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("createtime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("createtime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("createtime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("createtime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("createtime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("createtime like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("createtime not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("createtime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("createtime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("createtime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("createtime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDayofhourIsNull() {
            addCriterion("dayofhour is null");
            return (Criteria) this;
        }

        public Criteria andDayofhourIsNotNull() {
            addCriterion("dayofhour is not null");
            return (Criteria) this;
        }

        public Criteria andDayofhourEqualTo(Integer value) {
            addCriterion("dayofhour =", value, "dayofhour");
            return (Criteria) this;
        }

        public Criteria andDayofhourNotEqualTo(Integer value) {
            addCriterion("dayofhour <>", value, "dayofhour");
            return (Criteria) this;
        }

        public Criteria andDayofhourGreaterThan(Integer value) {
            addCriterion("dayofhour >", value, "dayofhour");
            return (Criteria) this;
        }

        public Criteria andDayofhourGreaterThanOrEqualTo(Integer value) {
            addCriterion("dayofhour >=", value, "dayofhour");
            return (Criteria) this;
        }

        public Criteria andDayofhourLessThan(Integer value) {
            addCriterion("dayofhour <", value, "dayofhour");
            return (Criteria) this;
        }

        public Criteria andDayofhourLessThanOrEqualTo(Integer value) {
            addCriterion("dayofhour <=", value, "dayofhour");
            return (Criteria) this;
        }

        public Criteria andDayofhourIn(List<Integer> values) {
            addCriterion("dayofhour in", values, "dayofhour");
            return (Criteria) this;
        }

        public Criteria andDayofhourNotIn(List<Integer> values) {
            addCriterion("dayofhour not in", values, "dayofhour");
            return (Criteria) this;
        }

        public Criteria andDayofhourBetween(Integer value1, Integer value2) {
            addCriterion("dayofhour between", value1, value2, "dayofhour");
            return (Criteria) this;
        }

        public Criteria andDayofhourNotBetween(Integer value1, Integer value2) {
            addCriterion("dayofhour not between", value1, value2, "dayofhour");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNull() {
            addCriterion("descript is null");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNotNull() {
            addCriterion("descript is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptEqualTo(String value) {
            addCriterion("descript =", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotEqualTo(String value) {
            addCriterion("descript <>", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThan(String value) {
            addCriterion("descript >", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("descript >=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThan(String value) {
            addCriterion("descript <", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThanOrEqualTo(String value) {
            addCriterion("descript <=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLike(String value) {
            addCriterion("descript like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotLike(String value) {
            addCriterion("descript not like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptIn(List<String> values) {
            addCriterion("descript in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotIn(List<String> values) {
            addCriterion("descript not in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptBetween(String value1, String value2) {
            addCriterion("descript between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotBetween(String value1, String value2) {
            addCriterion("descript not between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andHeadURLIsNull() {
            addCriterion("headurl is null");
            return (Criteria) this;
        }

        public Criteria andHeadURLIsNotNull() {
            addCriterion("headurl is not null");
            return (Criteria) this;
        }

        public Criteria andHeadURLEqualTo(String value) {
            addCriterion("headurl =", value, "headURL");
            return (Criteria) this;
        }

        public Criteria andHeadURLNotEqualTo(String value) {
            addCriterion("headurl <>", value, "headURL");
            return (Criteria) this;
        }

        public Criteria andHeadURLGreaterThan(String value) {
            addCriterion("headurl >", value, "headURL");
            return (Criteria) this;
        }

        public Criteria andHeadURLGreaterThanOrEqualTo(String value) {
            addCriterion("headurl >=", value, "headURL");
            return (Criteria) this;
        }

        public Criteria andHeadURLLessThan(String value) {
            addCriterion("headurl <", value, "headURL");
            return (Criteria) this;
        }

        public Criteria andHeadURLLessThanOrEqualTo(String value) {
            addCriterion("headurl <=", value, "headURL");
            return (Criteria) this;
        }

        public Criteria andHeadURLLike(String value) {
            addCriterion("headurl like", value, "headURL");
            return (Criteria) this;
        }

        public Criteria andHeadURLNotLike(String value) {
            addCriterion("headurl not like", value, "headURL");
            return (Criteria) this;
        }

        public Criteria andHeadURLIn(List<String> values) {
            addCriterion("headurl in", values, "headURL");
            return (Criteria) this;
        }

        public Criteria andHeadURLNotIn(List<String> values) {
            addCriterion("headurl not in", values, "headURL");
            return (Criteria) this;
        }

        public Criteria andHeadURLBetween(String value1, String value2) {
            addCriterion("headurl between", value1, value2, "headURL");
            return (Criteria) this;
        }

        public Criteria andHeadURLNotBetween(String value1, String value2) {
            addCriterion("headurl not between", value1, value2, "headURL");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNull() {
            addCriterion("isonline is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNotNull() {
            addCriterion("isonline is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineEqualTo(Integer value) {
            addCriterion("isonline =", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotEqualTo(Integer value) {
            addCriterion("isonline <>", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThan(Integer value) {
            addCriterion("isonline >", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("isonline >=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThan(Integer value) {
            addCriterion("isonline <", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("isonline <=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIn(List<Integer> values) {
            addCriterion("isonline in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotIn(List<Integer> values) {
            addCriterion("isonline not in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineBetween(Integer value1, Integer value2) {
            addCriterion("isonline between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("isonline not between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsTransIsNull() {
            addCriterion("istrans is null");
            return (Criteria) this;
        }

        public Criteria andIsTransIsNotNull() {
            addCriterion("istrans is not null");
            return (Criteria) this;
        }

        public Criteria andIsTransEqualTo(Integer value) {
            addCriterion("istrans =", value, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransNotEqualTo(Integer value) {
            addCriterion("istrans <>", value, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransGreaterThan(Integer value) {
            addCriterion("istrans >", value, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransGreaterThanOrEqualTo(Integer value) {
            addCriterion("istrans >=", value, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransLessThan(Integer value) {
            addCriterion("istrans <", value, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransLessThanOrEqualTo(Integer value) {
            addCriterion("istrans <=", value, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransIn(List<Integer> values) {
            addCriterion("istrans in", values, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransNotIn(List<Integer> values) {
            addCriterion("istrans not in", values, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransBetween(Integer value1, Integer value2) {
            addCriterion("istrans between", value1, value2, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransNotBetween(Integer value1, Integer value2) {
            addCriterion("istrans not between", value1, value2, "isTrans");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeIsNull() {
            addCriterion("level1code is null");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeIsNotNull() {
            addCriterion("level1code is not null");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeEqualTo(String value) {
            addCriterion("level1code =", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeNotEqualTo(String value) {
            addCriterion("level1code <>", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeGreaterThan(String value) {
            addCriterion("level1code >", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeGreaterThanOrEqualTo(String value) {
            addCriterion("level1code >=", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeLessThan(String value) {
            addCriterion("level1code <", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeLessThanOrEqualTo(String value) {
            addCriterion("level1code <=", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeLike(String value) {
            addCriterion("level1code like", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeNotLike(String value) {
            addCriterion("level1code not like", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeIn(List<String> values) {
            addCriterion("level1code in", values, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeNotIn(List<String> values) {
            addCriterion("level1code not in", values, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeBetween(String value1, String value2) {
            addCriterion("level1code between", value1, value2, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeNotBetween(String value1, String value2) {
            addCriterion("level1code not between", value1, value2, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeIsNull() {
            addCriterion("level2code is null");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeIsNotNull() {
            addCriterion("level2code is not null");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeEqualTo(String value) {
            addCriterion("level2code =", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeNotEqualTo(String value) {
            addCriterion("level2code <>", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeGreaterThan(String value) {
            addCriterion("level2code >", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeGreaterThanOrEqualTo(String value) {
            addCriterion("level2code >=", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeLessThan(String value) {
            addCriterion("level2code <", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeLessThanOrEqualTo(String value) {
            addCriterion("level2code <=", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeLike(String value) {
            addCriterion("level2code like", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeNotLike(String value) {
            addCriterion("level2code not like", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeIn(List<String> values) {
            addCriterion("level2code in", values, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeNotIn(List<String> values) {
            addCriterion("level2code not in", values, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeBetween(String value1, String value2) {
            addCriterion("level2code between", value1, value2, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeNotBetween(String value1, String value2) {
            addCriterion("level2code not between", value1, value2, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLimitNumIsNull() {
            addCriterion("limitnum is null");
            return (Criteria) this;
        }

        public Criteria andLimitNumIsNotNull() {
            addCriterion("limitnum is not null");
            return (Criteria) this;
        }

        public Criteria andLimitNumEqualTo(BigDecimal value) {
            addCriterion("limitnum =", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumNotEqualTo(BigDecimal value) {
            addCriterion("limitnum <>", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumGreaterThan(BigDecimal value) {
            addCriterion("limitnum >", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("limitnum >=", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumLessThan(BigDecimal value) {
            addCriterion("limitnum <", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("limitnum <=", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumIn(List<BigDecimal> values) {
            addCriterion("limitnum in", values, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumNotIn(List<BigDecimal> values) {
            addCriterion("limitnum not in", values, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limitnum between", value1, value2, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limitnum not between", value1, value2, "limitNum");
            return (Criteria) this;
        }

        public Criteria andMarkPriceIsNull() {
            addCriterion("markprice is null");
            return (Criteria) this;
        }

        public Criteria andMarkPriceIsNotNull() {
            addCriterion("markprice is not null");
            return (Criteria) this;
        }

        public Criteria andMarkPriceEqualTo(BigDecimal value) {
            addCriterion("markprice =", value, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceNotEqualTo(BigDecimal value) {
            addCriterion("markprice <>", value, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceGreaterThan(BigDecimal value) {
            addCriterion("markprice >", value, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("markprice >=", value, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceLessThan(BigDecimal value) {
            addCriterion("markprice <", value, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("markprice <=", value, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceIn(List<BigDecimal> values) {
            addCriterion("markprice in", values, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceNotIn(List<BigDecimal> values) {
            addCriterion("markprice not in", values, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("markprice between", value1, value2, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("markprice not between", value1, value2, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMinNumIsNull() {
            addCriterion("minnum is null");
            return (Criteria) this;
        }

        public Criteria andMinNumIsNotNull() {
            addCriterion("minnum is not null");
            return (Criteria) this;
        }

        public Criteria andMinNumEqualTo(BigDecimal value) {
            addCriterion("minnum =", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumNotEqualTo(BigDecimal value) {
            addCriterion("minnum <>", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumGreaterThan(BigDecimal value) {
            addCriterion("minnum >", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("minnum >=", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumLessThan(BigDecimal value) {
            addCriterion("minnum <", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("minnum <=", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumIn(List<BigDecimal> values) {
            addCriterion("minnum in", values, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumNotIn(List<BigDecimal> values) {
            addCriterion("minnum not in", values, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minnum between", value1, value2, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minnum not between", value1, value2, "minNum");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPackSizeIsNull() {
            addCriterion("packsize is null");
            return (Criteria) this;
        }

        public Criteria andPackSizeIsNotNull() {
            addCriterion("packsize is not null");
            return (Criteria) this;
        }

        public Criteria andPackSizeEqualTo(String value) {
            addCriterion("packsize =", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeNotEqualTo(String value) {
            addCriterion("packsize <>", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeGreaterThan(String value) {
            addCriterion("packsize >", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeGreaterThanOrEqualTo(String value) {
            addCriterion("packsize >=", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeLessThan(String value) {
            addCriterion("packsize <", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeLessThanOrEqualTo(String value) {
            addCriterion("packsize <=", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeLike(String value) {
            addCriterion("packsize like", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeNotLike(String value) {
            addCriterion("packsize not like", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeIn(List<String> values) {
            addCriterion("packsize in", values, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeNotIn(List<String> values) {
            addCriterion("packsize not in", values, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeBetween(String value1, String value2) {
            addCriterion("packsize between", value1, value2, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeNotBetween(String value1, String value2) {
            addCriterion("packsize not between", value1, value2, "packSize");
            return (Criteria) this;
        }

        public Criteria andPathsIsNull() {
            addCriterion("paths is null");
            return (Criteria) this;
        }

        public Criteria andPathsIsNotNull() {
            addCriterion("paths is not null");
            return (Criteria) this;
        }

        public Criteria andPathsEqualTo(String value) {
            addCriterion("paths =", value, "paths");
            return (Criteria) this;
        }

        public Criteria andPathsNotEqualTo(String value) {
            addCriterion("paths <>", value, "paths");
            return (Criteria) this;
        }

        public Criteria andPathsGreaterThan(String value) {
            addCriterion("paths >", value, "paths");
            return (Criteria) this;
        }

        public Criteria andPathsGreaterThanOrEqualTo(String value) {
            addCriterion("paths >=", value, "paths");
            return (Criteria) this;
        }

        public Criteria andPathsLessThan(String value) {
            addCriterion("paths <", value, "paths");
            return (Criteria) this;
        }

        public Criteria andPathsLessThanOrEqualTo(String value) {
            addCriterion("paths <=", value, "paths");
            return (Criteria) this;
        }

        public Criteria andPathsLike(String value) {
            addCriterion("paths like", value, "paths");
            return (Criteria) this;
        }

        public Criteria andPathsNotLike(String value) {
            addCriterion("paths not like", value, "paths");
            return (Criteria) this;
        }

        public Criteria andPathsIn(List<String> values) {
            addCriterion("paths in", values, "paths");
            return (Criteria) this;
        }

        public Criteria andPathsNotIn(List<String> values) {
            addCriterion("paths not in", values, "paths");
            return (Criteria) this;
        }

        public Criteria andPathsBetween(String value1, String value2) {
            addCriterion("paths between", value1, value2, "paths");
            return (Criteria) this;
        }

        public Criteria andPathsNotBetween(String value1, String value2) {
            addCriterion("paths not between", value1, value2, "paths");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("starttime =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("starttime <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("starttime >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("starttime >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("starttime <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("starttime <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("starttime like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("starttime not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("starttime in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("starttime not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("starttime between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("starttime not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("totalnum is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("totalnum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(BigDecimal value) {
            addCriterion("totalnum =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(BigDecimal value) {
            addCriterion("totalnum <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(BigDecimal value) {
            addCriterion("totalnum >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalnum >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(BigDecimal value) {
            addCriterion("totalnum <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalnum <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<BigDecimal> values) {
            addCriterion("totalnum in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<BigDecimal> values) {
            addCriterion("totalnum not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalnum between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalnum not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("unitname is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unitname is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unitname =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unitname <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unitname >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unitname >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unitname <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unitname <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unitname like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unitname not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unitname in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unitname not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unitname between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unitname not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andVerderIsNull() {
            addCriterion("verder is null");
            return (Criteria) this;
        }

        public Criteria andVerderIsNotNull() {
            addCriterion("verder is not null");
            return (Criteria) this;
        }

        public Criteria andVerderEqualTo(String value) {
            addCriterion("verder =", value, "verder");
            return (Criteria) this;
        }

        public Criteria andVerderNotEqualTo(String value) {
            addCriterion("verder <>", value, "verder");
            return (Criteria) this;
        }

        public Criteria andVerderGreaterThan(String value) {
            addCriterion("verder >", value, "verder");
            return (Criteria) this;
        }

        public Criteria andVerderGreaterThanOrEqualTo(String value) {
            addCriterion("verder >=", value, "verder");
            return (Criteria) this;
        }

        public Criteria andVerderLessThan(String value) {
            addCriterion("verder <", value, "verder");
            return (Criteria) this;
        }

        public Criteria andVerderLessThanOrEqualTo(String value) {
            addCriterion("verder <=", value, "verder");
            return (Criteria) this;
        }

        public Criteria andVerderLike(String value) {
            addCriterion("verder like", value, "verder");
            return (Criteria) this;
        }

        public Criteria andVerderNotLike(String value) {
            addCriterion("verder not like", value, "verder");
            return (Criteria) this;
        }

        public Criteria andVerderIn(List<String> values) {
            addCriterion("verder in", values, "verder");
            return (Criteria) this;
        }

        public Criteria andVerderNotIn(List<String> values) {
            addCriterion("verder not in", values, "verder");
            return (Criteria) this;
        }

        public Criteria andVerderBetween(String value1, String value2) {
            addCriterion("verder between", value1, value2, "verder");
            return (Criteria) this;
        }

        public Criteria andVerderNotBetween(String value1, String value2) {
            addCriterion("verder not between", value1, value2, "verder");
            return (Criteria) this;
        }

        public Criteria andSecUnitNameIsNull() {
            addCriterion("secunitName is null");
            return (Criteria) this;
        }

        public Criteria andSecUnitNameIsNotNull() {
            addCriterion("secunitName is not null");
            return (Criteria) this;
        }

        public Criteria andSecUnitNameEqualTo(String value) {
            addCriterion("secunitName =", value, "secUnitName");
            return (Criteria) this;
        }

        public Criteria andSecUnitNameNotEqualTo(String value) {
            addCriterion("secunitName <>", value, "secUnitName");
            return (Criteria) this;
        }

        public Criteria andSecUnitNameGreaterThan(String value) {
            addCriterion("secunitName >", value, "secUnitName");
            return (Criteria) this;
        }

        public Criteria andSecUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("secunitName >=", value, "secUnitName");
            return (Criteria) this;
        }

        public Criteria andSecUnitNameLessThan(String value) {
            addCriterion("secunitName <", value, "secUnitName");
            return (Criteria) this;
        }

        public Criteria andSecUnitNameLessThanOrEqualTo(String value) {
            addCriterion("secunitName <=", value, "secUnitName");
            return (Criteria) this;
        }

        public Criteria andSecUnitNameLike(String value) {
            addCriterion("secunitName like", value, "secUnitName");
            return (Criteria) this;
        }

        public Criteria andSecUnitNameNotLike(String value) {
            addCriterion("secunitName not like", value, "secUnitName");
            return (Criteria) this;
        }

        public Criteria andSecUnitNameIn(List<String> values) {
            addCriterion("secunitName in", values, "secUnitName");
            return (Criteria) this;
        }

        public Criteria andSecUnitNameNotIn(List<String> values) {
            addCriterion("secunitName not in", values, "secUnitName");
            return (Criteria) this;
        }

        public Criteria andSecUnitNameBetween(String value1, String value2) {
            addCriterion("secunitName between", value1, value2, "secUnitName");
            return (Criteria) this;
        }

        public Criteria andSecUnitNameNotBetween(String value1, String value2) {
            addCriterion("secunitName not between", value1, value2, "secUnitName");
            return (Criteria) this;
        }

        public Criteria andSecPriceIsNull() {
            addCriterion("secPrice is null");
            return (Criteria) this;
        }

        public Criteria andSecPriceIsNotNull() {
            addCriterion("secPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSecPriceEqualTo(BigDecimal value) {
            addCriterion("secPrice =", value, "secPrice");
            return (Criteria) this;
        }

        public Criteria andSecPriceNotEqualTo(BigDecimal value) {
            addCriterion("secPrice <>", value, "secPrice");
            return (Criteria) this;
        }

        public Criteria andSecPriceGreaterThan(BigDecimal value) {
            addCriterion("secPrice >", value, "secPrice");
            return (Criteria) this;
        }

        public Criteria andSecPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("secPrice >=", value, "secPrice");
            return (Criteria) this;
        }

        public Criteria andSecPriceLessThan(BigDecimal value) {
            addCriterion("secPrice <", value, "secPrice");
            return (Criteria) this;
        }

        public Criteria andSecPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("secPrice <=", value, "secPrice");
            return (Criteria) this;
        }

        public Criteria andSecPriceIn(List<BigDecimal> values) {
            addCriterion("secPrice in", values, "secPrice");
            return (Criteria) this;
        }

        public Criteria andSecPriceNotIn(List<BigDecimal> values) {
            addCriterion("secPrice not in", values, "secPrice");
            return (Criteria) this;
        }

        public Criteria andSecPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("secPrice between", value1, value2, "secPrice");
            return (Criteria) this;
        }

        public Criteria andSecPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("secPrice not between", value1, value2, "secPrice");
            return (Criteria) this;
        }

        public Criteria andSmallHeadURLIsNull() {
            addCriterion("smallheadurl is null");
            return (Criteria) this;
        }

        public Criteria andSmallHeadURLIsNotNull() {
            addCriterion("smallheadurl is not null");
            return (Criteria) this;
        }

        public Criteria andSmallHeadURLEqualTo(String value) {
            addCriterion("smallheadurl =", value, "smallHeadURL");
            return (Criteria) this;
        }

        public Criteria andSmallHeadURLNotEqualTo(String value) {
            addCriterion("smallheadurl <>", value, "smallHeadURL");
            return (Criteria) this;
        }

        public Criteria andSmallHeadURLGreaterThan(String value) {
            addCriterion("smallheadurl >", value, "smallHeadURL");
            return (Criteria) this;
        }

        public Criteria andSmallHeadURLGreaterThanOrEqualTo(String value) {
            addCriterion("smallheadurl >=", value, "smallHeadURL");
            return (Criteria) this;
        }

        public Criteria andSmallHeadURLLessThan(String value) {
            addCriterion("smallheadurl <", value, "smallHeadURL");
            return (Criteria) this;
        }

        public Criteria andSmallHeadURLLessThanOrEqualTo(String value) {
            addCriterion("smallheadurl <=", value, "smallHeadURL");
            return (Criteria) this;
        }

        public Criteria andSmallHeadURLLike(String value) {
            addCriterion("smallheadurl like", value, "smallHeadURL");
            return (Criteria) this;
        }

        public Criteria andSmallHeadURLNotLike(String value) {
            addCriterion("smallheadurl not like", value, "smallHeadURL");
            return (Criteria) this;
        }

        public Criteria andSmallHeadURLIn(List<String> values) {
            addCriterion("smallheadurl in", values, "smallHeadURL");
            return (Criteria) this;
        }

        public Criteria andSmallHeadURLNotIn(List<String> values) {
            addCriterion("smallheadurl not in", values, "smallHeadURL");
            return (Criteria) this;
        }

        public Criteria andSmallHeadURLBetween(String value1, String value2) {
            addCriterion("smallheadurl between", value1, value2, "smallHeadURL");
            return (Criteria) this;
        }

        public Criteria andSmallHeadURLNotBetween(String value1, String value2) {
            addCriterion("smallheadurl not between", value1, value2, "smallHeadURL");
            return (Criteria) this;
        }

        public Criteria andIsStandIsNull() {
            addCriterion("isStand is null");
            return (Criteria) this;
        }

        public Criteria andIsStandIsNotNull() {
            addCriterion("isStand is not null");
            return (Criteria) this;
        }

        public Criteria andIsStandEqualTo(Byte value) {
            addCriterion("isStand =", value, "isStand");
            return (Criteria) this;
        }

        public Criteria andIsStandNotEqualTo(Byte value) {
            addCriterion("isStand <>", value, "isStand");
            return (Criteria) this;
        }

        public Criteria andIsStandGreaterThan(Byte value) {
            addCriterion("isStand >", value, "isStand");
            return (Criteria) this;
        }

        public Criteria andIsStandGreaterThanOrEqualTo(Byte value) {
            addCriterion("isStand >=", value, "isStand");
            return (Criteria) this;
        }

        public Criteria andIsStandLessThan(Byte value) {
            addCriterion("isStand <", value, "isStand");
            return (Criteria) this;
        }

        public Criteria andIsStandLessThanOrEqualTo(Byte value) {
            addCriterion("isStand <=", value, "isStand");
            return (Criteria) this;
        }

        public Criteria andIsStandIn(List<Byte> values) {
            addCriterion("isStand in", values, "isStand");
            return (Criteria) this;
        }

        public Criteria andIsStandNotIn(List<Byte> values) {
            addCriterion("isStand not in", values, "isStand");
            return (Criteria) this;
        }

        public Criteria andIsStandBetween(Byte value1, Byte value2) {
            addCriterion("isStand between", value1, value2, "isStand");
            return (Criteria) this;
        }

        public Criteria andIsStandNotBetween(Byte value1, Byte value2) {
            addCriterion("isStand not between", value1, value2, "isStand");
            return (Criteria) this;
        }

        public Criteria andLinkMerchIdIsNull() {
            addCriterion("linkMerchId is null");
            return (Criteria) this;
        }

        public Criteria andLinkMerchIdIsNotNull() {
            addCriterion("linkMerchId is not null");
            return (Criteria) this;
        }

        public Criteria andLinkMerchIdEqualTo(Long value) {
            addCriterion("linkMerchId =", value, "linkMerchId");
            return (Criteria) this;
        }

        public Criteria andLinkMerchIdNotEqualTo(Long value) {
            addCriterion("linkMerchId <>", value, "linkMerchId");
            return (Criteria) this;
        }

        public Criteria andLinkMerchIdGreaterThan(Long value) {
            addCriterion("linkMerchId >", value, "linkMerchId");
            return (Criteria) this;
        }

        public Criteria andLinkMerchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("linkMerchId >=", value, "linkMerchId");
            return (Criteria) this;
        }

        public Criteria andLinkMerchIdLessThan(Long value) {
            addCriterion("linkMerchId <", value, "linkMerchId");
            return (Criteria) this;
        }

        public Criteria andLinkMerchIdLessThanOrEqualTo(Long value) {
            addCriterion("linkMerchId <=", value, "linkMerchId");
            return (Criteria) this;
        }

        public Criteria andLinkMerchIdIn(List<Long> values) {
            addCriterion("linkMerchId in", values, "linkMerchId");
            return (Criteria) this;
        }

        public Criteria andLinkMerchIdNotIn(List<Long> values) {
            addCriterion("linkMerchId not in", values, "linkMerchId");
            return (Criteria) this;
        }

        public Criteria andLinkMerchIdBetween(Long value1, Long value2) {
            addCriterion("linkMerchId between", value1, value2, "linkMerchId");
            return (Criteria) this;
        }

        public Criteria andLinkMerchIdNotBetween(Long value1, Long value2) {
            addCriterion("linkMerchId not between", value1, value2, "linkMerchId");
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