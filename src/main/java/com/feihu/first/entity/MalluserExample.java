package com.feihu.first.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MalluserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MalluserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andWxnameIsNull() {
            addCriterion("wxname is null");
            return (Criteria) this;
        }

        public Criteria andWxnameIsNotNull() {
            addCriterion("wxname is not null");
            return (Criteria) this;
        }

        public Criteria andWxnameEqualTo(String value) {
            addCriterion("wxname =", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameNotEqualTo(String value) {
            addCriterion("wxname <>", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameGreaterThan(String value) {
            addCriterion("wxname >", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameGreaterThanOrEqualTo(String value) {
            addCriterion("wxname >=", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameLessThan(String value) {
            addCriterion("wxname <", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameLessThanOrEqualTo(String value) {
            addCriterion("wxname <=", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameLike(String value) {
            addCriterion("wxname like", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameNotLike(String value) {
            addCriterion("wxname not like", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameIn(List<String> values) {
            addCriterion("wxname in", values, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameNotIn(List<String> values) {
            addCriterion("wxname not in", values, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameBetween(String value1, String value2) {
            addCriterion("wxname between", value1, value2, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameNotBetween(String value1, String value2) {
            addCriterion("wxname not between", value1, value2, "wxname");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andMemberrankIsNull() {
            addCriterion("memberRank is null");
            return (Criteria) this;
        }

        public Criteria andMemberrankIsNotNull() {
            addCriterion("memberRank is not null");
            return (Criteria) this;
        }

        public Criteria andMemberrankEqualTo(Integer value) {
            addCriterion("memberRank =", value, "memberrank");
            return (Criteria) this;
        }

        public Criteria andMemberrankNotEqualTo(Integer value) {
            addCriterion("memberRank <>", value, "memberrank");
            return (Criteria) this;
        }

        public Criteria andMemberrankGreaterThan(Integer value) {
            addCriterion("memberRank >", value, "memberrank");
            return (Criteria) this;
        }

        public Criteria andMemberrankGreaterThanOrEqualTo(Integer value) {
            addCriterion("memberRank >=", value, "memberrank");
            return (Criteria) this;
        }

        public Criteria andMemberrankLessThan(Integer value) {
            addCriterion("memberRank <", value, "memberrank");
            return (Criteria) this;
        }

        public Criteria andMemberrankLessThanOrEqualTo(Integer value) {
            addCriterion("memberRank <=", value, "memberrank");
            return (Criteria) this;
        }

        public Criteria andMemberrankIn(List<Integer> values) {
            addCriterion("memberRank in", values, "memberrank");
            return (Criteria) this;
        }

        public Criteria andMemberrankNotIn(List<Integer> values) {
            addCriterion("memberRank not in", values, "memberrank");
            return (Criteria) this;
        }

        public Criteria andMemberrankBetween(Integer value1, Integer value2) {
            addCriterion("memberRank between", value1, value2, "memberrank");
            return (Criteria) this;
        }

        public Criteria andMemberrankNotBetween(Integer value1, Integer value2) {
            addCriterion("memberRank not between", value1, value2, "memberrank");
            return (Criteria) this;
        }

        public Criteria andRecommjfIsNull() {
            addCriterion("recommJF is null");
            return (Criteria) this;
        }

        public Criteria andRecommjfIsNotNull() {
            addCriterion("recommJF is not null");
            return (Criteria) this;
        }

        public Criteria andRecommjfEqualTo(Double value) {
            addCriterion("recommJF =", value, "recommjf");
            return (Criteria) this;
        }

        public Criteria andRecommjfNotEqualTo(Double value) {
            addCriterion("recommJF <>", value, "recommjf");
            return (Criteria) this;
        }

        public Criteria andRecommjfGreaterThan(Double value) {
            addCriterion("recommJF >", value, "recommjf");
            return (Criteria) this;
        }

        public Criteria andRecommjfGreaterThanOrEqualTo(Double value) {
            addCriterion("recommJF >=", value, "recommjf");
            return (Criteria) this;
        }

        public Criteria andRecommjfLessThan(Double value) {
            addCriterion("recommJF <", value, "recommjf");
            return (Criteria) this;
        }

        public Criteria andRecommjfLessThanOrEqualTo(Double value) {
            addCriterion("recommJF <=", value, "recommjf");
            return (Criteria) this;
        }

        public Criteria andRecommjfIn(List<Double> values) {
            addCriterion("recommJF in", values, "recommjf");
            return (Criteria) this;
        }

        public Criteria andRecommjfNotIn(List<Double> values) {
            addCriterion("recommJF not in", values, "recommjf");
            return (Criteria) this;
        }

        public Criteria andRecommjfBetween(Double value1, Double value2) {
            addCriterion("recommJF between", value1, value2, "recommjf");
            return (Criteria) this;
        }

        public Criteria andRecommjfNotBetween(Double value1, Double value2) {
            addCriterion("recommJF not between", value1, value2, "recommjf");
            return (Criteria) this;
        }

        public Criteria andGoodjfIsNull() {
            addCriterion("goodJF is null");
            return (Criteria) this;
        }

        public Criteria andGoodjfIsNotNull() {
            addCriterion("goodJF is not null");
            return (Criteria) this;
        }

        public Criteria andGoodjfEqualTo(Double value) {
            addCriterion("goodJF =", value, "goodjf");
            return (Criteria) this;
        }

        public Criteria andGoodjfNotEqualTo(Double value) {
            addCriterion("goodJF <>", value, "goodjf");
            return (Criteria) this;
        }

        public Criteria andGoodjfGreaterThan(Double value) {
            addCriterion("goodJF >", value, "goodjf");
            return (Criteria) this;
        }

        public Criteria andGoodjfGreaterThanOrEqualTo(Double value) {
            addCriterion("goodJF >=", value, "goodjf");
            return (Criteria) this;
        }

        public Criteria andGoodjfLessThan(Double value) {
            addCriterion("goodJF <", value, "goodjf");
            return (Criteria) this;
        }

        public Criteria andGoodjfLessThanOrEqualTo(Double value) {
            addCriterion("goodJF <=", value, "goodjf");
            return (Criteria) this;
        }

        public Criteria andGoodjfIn(List<Double> values) {
            addCriterion("goodJF in", values, "goodjf");
            return (Criteria) this;
        }

        public Criteria andGoodjfNotIn(List<Double> values) {
            addCriterion("goodJF not in", values, "goodjf");
            return (Criteria) this;
        }

        public Criteria andGoodjfBetween(Double value1, Double value2) {
            addCriterion("goodJF between", value1, value2, "goodjf");
            return (Criteria) this;
        }

        public Criteria andGoodjfNotBetween(Double value1, Double value2) {
            addCriterion("goodJF not between", value1, value2, "goodjf");
            return (Criteria) this;
        }

        public Criteria andCashtotalmoneyIsNull() {
            addCriterion("cashTotalMoney is null");
            return (Criteria) this;
        }

        public Criteria andCashtotalmoneyIsNotNull() {
            addCriterion("cashTotalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andCashtotalmoneyEqualTo(Double value) {
            addCriterion("cashTotalMoney =", value, "cashtotalmoney");
            return (Criteria) this;
        }

        public Criteria andCashtotalmoneyNotEqualTo(Double value) {
            addCriterion("cashTotalMoney <>", value, "cashtotalmoney");
            return (Criteria) this;
        }

        public Criteria andCashtotalmoneyGreaterThan(Double value) {
            addCriterion("cashTotalMoney >", value, "cashtotalmoney");
            return (Criteria) this;
        }

        public Criteria andCashtotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cashTotalMoney >=", value, "cashtotalmoney");
            return (Criteria) this;
        }

        public Criteria andCashtotalmoneyLessThan(Double value) {
            addCriterion("cashTotalMoney <", value, "cashtotalmoney");
            return (Criteria) this;
        }

        public Criteria andCashtotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("cashTotalMoney <=", value, "cashtotalmoney");
            return (Criteria) this;
        }

        public Criteria andCashtotalmoneyIn(List<Double> values) {
            addCriterion("cashTotalMoney in", values, "cashtotalmoney");
            return (Criteria) this;
        }

        public Criteria andCashtotalmoneyNotIn(List<Double> values) {
            addCriterion("cashTotalMoney not in", values, "cashtotalmoney");
            return (Criteria) this;
        }

        public Criteria andCashtotalmoneyBetween(Double value1, Double value2) {
            addCriterion("cashTotalMoney between", value1, value2, "cashtotalmoney");
            return (Criteria) this;
        }

        public Criteria andCashtotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("cashTotalMoney not between", value1, value2, "cashtotalmoney");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andIsparentIsNull() {
            addCriterion("isparent is null");
            return (Criteria) this;
        }

        public Criteria andIsparentIsNotNull() {
            addCriterion("isparent is not null");
            return (Criteria) this;
        }

        public Criteria andIsparentEqualTo(Integer value) {
            addCriterion("isparent =", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentNotEqualTo(Integer value) {
            addCriterion("isparent <>", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentGreaterThan(Integer value) {
            addCriterion("isparent >", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentGreaterThanOrEqualTo(Integer value) {
            addCriterion("isparent >=", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentLessThan(Integer value) {
            addCriterion("isparent <", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentLessThanOrEqualTo(Integer value) {
            addCriterion("isparent <=", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentIn(List<Integer> values) {
            addCriterion("isparent in", values, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentNotIn(List<Integer> values) {
            addCriterion("isparent not in", values, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentBetween(Integer value1, Integer value2) {
            addCriterion("isparent between", value1, value2, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentNotBetween(Integer value1, Integer value2) {
            addCriterion("isparent not between", value1, value2, "isparent");
            return (Criteria) this;
        }

        public Criteria andRegtimerIsNull() {
            addCriterion("Regtimer is null");
            return (Criteria) this;
        }

        public Criteria andRegtimerIsNotNull() {
            addCriterion("Regtimer is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimerEqualTo(Date value) {
            addCriterionForJDBCDate("Regtimer =", value, "regtimer");
            return (Criteria) this;
        }

        public Criteria andRegtimerNotEqualTo(Date value) {
            addCriterionForJDBCDate("Regtimer <>", value, "regtimer");
            return (Criteria) this;
        }

        public Criteria andRegtimerGreaterThan(Date value) {
            addCriterionForJDBCDate("Regtimer >", value, "regtimer");
            return (Criteria) this;
        }

        public Criteria andRegtimerGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Regtimer >=", value, "regtimer");
            return (Criteria) this;
        }

        public Criteria andRegtimerLessThan(Date value) {
            addCriterionForJDBCDate("Regtimer <", value, "regtimer");
            return (Criteria) this;
        }

        public Criteria andRegtimerLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Regtimer <=", value, "regtimer");
            return (Criteria) this;
        }

        public Criteria andRegtimerIn(List<Date> values) {
            addCriterionForJDBCDate("Regtimer in", values, "regtimer");
            return (Criteria) this;
        }

        public Criteria andRegtimerNotIn(List<Date> values) {
            addCriterionForJDBCDate("Regtimer not in", values, "regtimer");
            return (Criteria) this;
        }

        public Criteria andRegtimerBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Regtimer between", value1, value2, "regtimer");
            return (Criteria) this;
        }

        public Criteria andRegtimerNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Regtimer not between", value1, value2, "regtimer");
            return (Criteria) this;
        }

        public Criteria andCertinumIsNull() {
            addCriterion("certiNum is null");
            return (Criteria) this;
        }

        public Criteria andCertinumIsNotNull() {
            addCriterion("certiNum is not null");
            return (Criteria) this;
        }

        public Criteria andCertinumEqualTo(String value) {
            addCriterion("certiNum =", value, "certinum");
            return (Criteria) this;
        }

        public Criteria andCertinumNotEqualTo(String value) {
            addCriterion("certiNum <>", value, "certinum");
            return (Criteria) this;
        }

        public Criteria andCertinumGreaterThan(String value) {
            addCriterion("certiNum >", value, "certinum");
            return (Criteria) this;
        }

        public Criteria andCertinumGreaterThanOrEqualTo(String value) {
            addCriterion("certiNum >=", value, "certinum");
            return (Criteria) this;
        }

        public Criteria andCertinumLessThan(String value) {
            addCriterion("certiNum <", value, "certinum");
            return (Criteria) this;
        }

        public Criteria andCertinumLessThanOrEqualTo(String value) {
            addCriterion("certiNum <=", value, "certinum");
            return (Criteria) this;
        }

        public Criteria andCertinumLike(String value) {
            addCriterion("certiNum like", value, "certinum");
            return (Criteria) this;
        }

        public Criteria andCertinumNotLike(String value) {
            addCriterion("certiNum not like", value, "certinum");
            return (Criteria) this;
        }

        public Criteria andCertinumIn(List<String> values) {
            addCriterion("certiNum in", values, "certinum");
            return (Criteria) this;
        }

        public Criteria andCertinumNotIn(List<String> values) {
            addCriterion("certiNum not in", values, "certinum");
            return (Criteria) this;
        }

        public Criteria andCertinumBetween(String value1, String value2) {
            addCriterion("certiNum between", value1, value2, "certinum");
            return (Criteria) this;
        }

        public Criteria andCertinumNotBetween(String value1, String value2) {
            addCriterion("certiNum not between", value1, value2, "certinum");
            return (Criteria) this;
        }

        public Criteria andCertifrontIsNull() {
            addCriterion("certiFront is null");
            return (Criteria) this;
        }

        public Criteria andCertifrontIsNotNull() {
            addCriterion("certiFront is not null");
            return (Criteria) this;
        }

        public Criteria andCertifrontEqualTo(String value) {
            addCriterion("certiFront =", value, "certifront");
            return (Criteria) this;
        }

        public Criteria andCertifrontNotEqualTo(String value) {
            addCriterion("certiFront <>", value, "certifront");
            return (Criteria) this;
        }

        public Criteria andCertifrontGreaterThan(String value) {
            addCriterion("certiFront >", value, "certifront");
            return (Criteria) this;
        }

        public Criteria andCertifrontGreaterThanOrEqualTo(String value) {
            addCriterion("certiFront >=", value, "certifront");
            return (Criteria) this;
        }

        public Criteria andCertifrontLessThan(String value) {
            addCriterion("certiFront <", value, "certifront");
            return (Criteria) this;
        }

        public Criteria andCertifrontLessThanOrEqualTo(String value) {
            addCriterion("certiFront <=", value, "certifront");
            return (Criteria) this;
        }

        public Criteria andCertifrontLike(String value) {
            addCriterion("certiFront like", value, "certifront");
            return (Criteria) this;
        }

        public Criteria andCertifrontNotLike(String value) {
            addCriterion("certiFront not like", value, "certifront");
            return (Criteria) this;
        }

        public Criteria andCertifrontIn(List<String> values) {
            addCriterion("certiFront in", values, "certifront");
            return (Criteria) this;
        }

        public Criteria andCertifrontNotIn(List<String> values) {
            addCriterion("certiFront not in", values, "certifront");
            return (Criteria) this;
        }

        public Criteria andCertifrontBetween(String value1, String value2) {
            addCriterion("certiFront between", value1, value2, "certifront");
            return (Criteria) this;
        }

        public Criteria andCertifrontNotBetween(String value1, String value2) {
            addCriterion("certiFront not between", value1, value2, "certifront");
            return (Criteria) this;
        }

        public Criteria andCertireverseIsNull() {
            addCriterion("certiReverse is null");
            return (Criteria) this;
        }

        public Criteria andCertireverseIsNotNull() {
            addCriterion("certiReverse is not null");
            return (Criteria) this;
        }

        public Criteria andCertireverseEqualTo(String value) {
            addCriterion("certiReverse =", value, "certireverse");
            return (Criteria) this;
        }

        public Criteria andCertireverseNotEqualTo(String value) {
            addCriterion("certiReverse <>", value, "certireverse");
            return (Criteria) this;
        }

        public Criteria andCertireverseGreaterThan(String value) {
            addCriterion("certiReverse >", value, "certireverse");
            return (Criteria) this;
        }

        public Criteria andCertireverseGreaterThanOrEqualTo(String value) {
            addCriterion("certiReverse >=", value, "certireverse");
            return (Criteria) this;
        }

        public Criteria andCertireverseLessThan(String value) {
            addCriterion("certiReverse <", value, "certireverse");
            return (Criteria) this;
        }

        public Criteria andCertireverseLessThanOrEqualTo(String value) {
            addCriterion("certiReverse <=", value, "certireverse");
            return (Criteria) this;
        }

        public Criteria andCertireverseLike(String value) {
            addCriterion("certiReverse like", value, "certireverse");
            return (Criteria) this;
        }

        public Criteria andCertireverseNotLike(String value) {
            addCriterion("certiReverse not like", value, "certireverse");
            return (Criteria) this;
        }

        public Criteria andCertireverseIn(List<String> values) {
            addCriterion("certiReverse in", values, "certireverse");
            return (Criteria) this;
        }

        public Criteria andCertireverseNotIn(List<String> values) {
            addCriterion("certiReverse not in", values, "certireverse");
            return (Criteria) this;
        }

        public Criteria andCertireverseBetween(String value1, String value2) {
            addCriterion("certiReverse between", value1, value2, "certireverse");
            return (Criteria) this;
        }

        public Criteria andCertireverseNotBetween(String value1, String value2) {
            addCriterion("certiReverse not between", value1, value2, "certireverse");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andHeadimgIsNull() {
            addCriterion("headImg is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgIsNotNull() {
            addCriterion("headImg is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgEqualTo(String value) {
            addCriterion("headImg =", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotEqualTo(String value) {
            addCriterion("headImg <>", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThan(String value) {
            addCriterion("headImg >", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThanOrEqualTo(String value) {
            addCriterion("headImg >=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThan(String value) {
            addCriterion("headImg <", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThanOrEqualTo(String value) {
            addCriterion("headImg <=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLike(String value) {
            addCriterion("headImg like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotLike(String value) {
            addCriterion("headImg not like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgIn(List<String> values) {
            addCriterion("headImg in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotIn(List<String> values) {
            addCriterion("headImg not in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgBetween(String value1, String value2) {
            addCriterion("headImg between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotBetween(String value1, String value2) {
            addCriterion("headImg not between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andWeekIsNull() {
            addCriterion("week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(Integer value) {
            addCriterion("week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(Integer value) {
            addCriterion("week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(Integer value) {
            addCriterion("week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(Integer value) {
            addCriterion("week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(Integer value) {
            addCriterion("week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<Integer> values) {
            addCriterion("week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<Integer> values) {
            addCriterion("week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(Integer value1, Integer value2) {
            addCriterion("week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("week not between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Integer value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Integer value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Integer value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Integer value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Integer value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Integer> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Integer> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Integer value1, Integer value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Integer value1, Integer value2) {
            addCriterion("day not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andYuliuinterIsNull() {
            addCriterion("yuliuInter is null");
            return (Criteria) this;
        }

        public Criteria andYuliuinterIsNotNull() {
            addCriterion("yuliuInter is not null");
            return (Criteria) this;
        }

        public Criteria andYuliuinterEqualTo(Double value) {
            addCriterion("yuliuInter =", value, "yuliuinter");
            return (Criteria) this;
        }

        public Criteria andYuliuinterNotEqualTo(Double value) {
            addCriterion("yuliuInter <>", value, "yuliuinter");
            return (Criteria) this;
        }

        public Criteria andYuliuinterGreaterThan(Double value) {
            addCriterion("yuliuInter >", value, "yuliuinter");
            return (Criteria) this;
        }

        public Criteria andYuliuinterGreaterThanOrEqualTo(Double value) {
            addCriterion("yuliuInter >=", value, "yuliuinter");
            return (Criteria) this;
        }

        public Criteria andYuliuinterLessThan(Double value) {
            addCriterion("yuliuInter <", value, "yuliuinter");
            return (Criteria) this;
        }

        public Criteria andYuliuinterLessThanOrEqualTo(Double value) {
            addCriterion("yuliuInter <=", value, "yuliuinter");
            return (Criteria) this;
        }

        public Criteria andYuliuinterIn(List<Double> values) {
            addCriterion("yuliuInter in", values, "yuliuinter");
            return (Criteria) this;
        }

        public Criteria andYuliuinterNotIn(List<Double> values) {
            addCriterion("yuliuInter not in", values, "yuliuinter");
            return (Criteria) this;
        }

        public Criteria andYuliuinterBetween(Double value1, Double value2) {
            addCriterion("yuliuInter between", value1, value2, "yuliuinter");
            return (Criteria) this;
        }

        public Criteria andYuliuinterNotBetween(Double value1, Double value2) {
            addCriterion("yuliuInter not between", value1, value2, "yuliuinter");
            return (Criteria) this;
        }

        public Criteria andIseexaminIsNull() {
            addCriterion("isEexamin is null");
            return (Criteria) this;
        }

        public Criteria andIseexaminIsNotNull() {
            addCriterion("isEexamin is not null");
            return (Criteria) this;
        }

        public Criteria andIseexaminEqualTo(Integer value) {
            addCriterion("isEexamin =", value, "iseexamin");
            return (Criteria) this;
        }

        public Criteria andIseexaminNotEqualTo(Integer value) {
            addCriterion("isEexamin <>", value, "iseexamin");
            return (Criteria) this;
        }

        public Criteria andIseexaminGreaterThan(Integer value) {
            addCriterion("isEexamin >", value, "iseexamin");
            return (Criteria) this;
        }

        public Criteria andIseexaminGreaterThanOrEqualTo(Integer value) {
            addCriterion("isEexamin >=", value, "iseexamin");
            return (Criteria) this;
        }

        public Criteria andIseexaminLessThan(Integer value) {
            addCriterion("isEexamin <", value, "iseexamin");
            return (Criteria) this;
        }

        public Criteria andIseexaminLessThanOrEqualTo(Integer value) {
            addCriterion("isEexamin <=", value, "iseexamin");
            return (Criteria) this;
        }

        public Criteria andIseexaminIn(List<Integer> values) {
            addCriterion("isEexamin in", values, "iseexamin");
            return (Criteria) this;
        }

        public Criteria andIseexaminNotIn(List<Integer> values) {
            addCriterion("isEexamin not in", values, "iseexamin");
            return (Criteria) this;
        }

        public Criteria andIseexaminBetween(Integer value1, Integer value2) {
            addCriterion("isEexamin between", value1, value2, "iseexamin");
            return (Criteria) this;
        }

        public Criteria andIseexaminNotBetween(Integer value1, Integer value2) {
            addCriterion("isEexamin not between", value1, value2, "iseexamin");
            return (Criteria) this;
        }

        public Criteria andBankdepositIsNull() {
            addCriterion("bankDeposit is null");
            return (Criteria) this;
        }

        public Criteria andBankdepositIsNotNull() {
            addCriterion("bankDeposit is not null");
            return (Criteria) this;
        }

        public Criteria andBankdepositEqualTo(String value) {
            addCriterion("bankDeposit =", value, "bankdeposit");
            return (Criteria) this;
        }

        public Criteria andBankdepositNotEqualTo(String value) {
            addCriterion("bankDeposit <>", value, "bankdeposit");
            return (Criteria) this;
        }

        public Criteria andBankdepositGreaterThan(String value) {
            addCriterion("bankDeposit >", value, "bankdeposit");
            return (Criteria) this;
        }

        public Criteria andBankdepositGreaterThanOrEqualTo(String value) {
            addCriterion("bankDeposit >=", value, "bankdeposit");
            return (Criteria) this;
        }

        public Criteria andBankdepositLessThan(String value) {
            addCriterion("bankDeposit <", value, "bankdeposit");
            return (Criteria) this;
        }

        public Criteria andBankdepositLessThanOrEqualTo(String value) {
            addCriterion("bankDeposit <=", value, "bankdeposit");
            return (Criteria) this;
        }

        public Criteria andBankdepositLike(String value) {
            addCriterion("bankDeposit like", value, "bankdeposit");
            return (Criteria) this;
        }

        public Criteria andBankdepositNotLike(String value) {
            addCriterion("bankDeposit not like", value, "bankdeposit");
            return (Criteria) this;
        }

        public Criteria andBankdepositIn(List<String> values) {
            addCriterion("bankDeposit in", values, "bankdeposit");
            return (Criteria) this;
        }

        public Criteria andBankdepositNotIn(List<String> values) {
            addCriterion("bankDeposit not in", values, "bankdeposit");
            return (Criteria) this;
        }

        public Criteria andBankdepositBetween(String value1, String value2) {
            addCriterion("bankDeposit between", value1, value2, "bankdeposit");
            return (Criteria) this;
        }

        public Criteria andBankdepositNotBetween(String value1, String value2) {
            addCriterion("bankDeposit not between", value1, value2, "bankdeposit");
            return (Criteria) this;
        }

        public Criteria andBankholderIsNull() {
            addCriterion("bankHolder is null");
            return (Criteria) this;
        }

        public Criteria andBankholderIsNotNull() {
            addCriterion("bankHolder is not null");
            return (Criteria) this;
        }

        public Criteria andBankholderEqualTo(String value) {
            addCriterion("bankHolder =", value, "bankholder");
            return (Criteria) this;
        }

        public Criteria andBankholderNotEqualTo(String value) {
            addCriterion("bankHolder <>", value, "bankholder");
            return (Criteria) this;
        }

        public Criteria andBankholderGreaterThan(String value) {
            addCriterion("bankHolder >", value, "bankholder");
            return (Criteria) this;
        }

        public Criteria andBankholderGreaterThanOrEqualTo(String value) {
            addCriterion("bankHolder >=", value, "bankholder");
            return (Criteria) this;
        }

        public Criteria andBankholderLessThan(String value) {
            addCriterion("bankHolder <", value, "bankholder");
            return (Criteria) this;
        }

        public Criteria andBankholderLessThanOrEqualTo(String value) {
            addCriterion("bankHolder <=", value, "bankholder");
            return (Criteria) this;
        }

        public Criteria andBankholderLike(String value) {
            addCriterion("bankHolder like", value, "bankholder");
            return (Criteria) this;
        }

        public Criteria andBankholderNotLike(String value) {
            addCriterion("bankHolder not like", value, "bankholder");
            return (Criteria) this;
        }

        public Criteria andBankholderIn(List<String> values) {
            addCriterion("bankHolder in", values, "bankholder");
            return (Criteria) this;
        }

        public Criteria andBankholderNotIn(List<String> values) {
            addCriterion("bankHolder not in", values, "bankholder");
            return (Criteria) this;
        }

        public Criteria andBankholderBetween(String value1, String value2) {
            addCriterion("bankHolder between", value1, value2, "bankholder");
            return (Criteria) this;
        }

        public Criteria andBankholderNotBetween(String value1, String value2) {
            addCriterion("bankHolder not between", value1, value2, "bankholder");
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