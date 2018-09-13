package com.ynd.device.domain;

import java.util.ArrayList;
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDebtPowerTypeIsNull() {
            addCriterion("debt_power_type is null");
            return (Criteria) this;
        }

        public Criteria andDebtPowerTypeIsNotNull() {
            addCriterion("debt_power_type is not null");
            return (Criteria) this;
        }

        public Criteria andDebtPowerTypeEqualTo(Integer value) {
            addCriterion("debt_power_type =", value, "debtPowerType");
            return (Criteria) this;
        }

        public Criteria andDebtPowerTypeNotEqualTo(Integer value) {
            addCriterion("debt_power_type <>", value, "debtPowerType");
            return (Criteria) this;
        }

        public Criteria andDebtPowerTypeGreaterThan(Integer value) {
            addCriterion("debt_power_type >", value, "debtPowerType");
            return (Criteria) this;
        }

        public Criteria andDebtPowerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("debt_power_type >=", value, "debtPowerType");
            return (Criteria) this;
        }

        public Criteria andDebtPowerTypeLessThan(Integer value) {
            addCriterion("debt_power_type <", value, "debtPowerType");
            return (Criteria) this;
        }

        public Criteria andDebtPowerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("debt_power_type <=", value, "debtPowerType");
            return (Criteria) this;
        }

        public Criteria andDebtPowerTypeIn(List<Integer> values) {
            addCriterion("debt_power_type in", values, "debtPowerType");
            return (Criteria) this;
        }

        public Criteria andDebtPowerTypeNotIn(List<Integer> values) {
            addCriterion("debt_power_type not in", values, "debtPowerType");
            return (Criteria) this;
        }

        public Criteria andDebtPowerTypeBetween(Integer value1, Integer value2) {
            addCriterion("debt_power_type between", value1, value2, "debtPowerType");
            return (Criteria) this;
        }

        public Criteria andDebtPowerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("debt_power_type not between", value1, value2, "debtPowerType");
            return (Criteria) this;
        }

        public Criteria andYearEarnPercentIsNull() {
            addCriterion("year_earn_percent is null");
            return (Criteria) this;
        }

        public Criteria andYearEarnPercentIsNotNull() {
            addCriterion("year_earn_percent is not null");
            return (Criteria) this;
        }

        public Criteria andYearEarnPercentEqualTo(Integer value) {
            addCriterion("year_earn_percent =", value, "yearEarnPercent");
            return (Criteria) this;
        }

        public Criteria andYearEarnPercentNotEqualTo(Integer value) {
            addCriterion("year_earn_percent <>", value, "yearEarnPercent");
            return (Criteria) this;
        }

        public Criteria andYearEarnPercentGreaterThan(Integer value) {
            addCriterion("year_earn_percent >", value, "yearEarnPercent");
            return (Criteria) this;
        }

        public Criteria andYearEarnPercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_earn_percent >=", value, "yearEarnPercent");
            return (Criteria) this;
        }

        public Criteria andYearEarnPercentLessThan(Integer value) {
            addCriterion("year_earn_percent <", value, "yearEarnPercent");
            return (Criteria) this;
        }

        public Criteria andYearEarnPercentLessThanOrEqualTo(Integer value) {
            addCriterion("year_earn_percent <=", value, "yearEarnPercent");
            return (Criteria) this;
        }

        public Criteria andYearEarnPercentIn(List<Integer> values) {
            addCriterion("year_earn_percent in", values, "yearEarnPercent");
            return (Criteria) this;
        }

        public Criteria andYearEarnPercentNotIn(List<Integer> values) {
            addCriterion("year_earn_percent not in", values, "yearEarnPercent");
            return (Criteria) this;
        }

        public Criteria andYearEarnPercentBetween(Integer value1, Integer value2) {
            addCriterion("year_earn_percent between", value1, value2, "yearEarnPercent");
            return (Criteria) this;
        }

        public Criteria andYearEarnPercentNotBetween(Integer value1, Integer value2) {
            addCriterion("year_earn_percent not between", value1, value2, "yearEarnPercent");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Integer value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Integer value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Integer value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Integer value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Integer> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Integer> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Integer value1, Integer value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andStartMoneyIsNull() {
            addCriterion("start_money is null");
            return (Criteria) this;
        }

        public Criteria andStartMoneyIsNotNull() {
            addCriterion("start_money is not null");
            return (Criteria) this;
        }

        public Criteria andStartMoneyEqualTo(Long value) {
            addCriterion("start_money =", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyNotEqualTo(Long value) {
            addCriterion("start_money <>", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyGreaterThan(Long value) {
            addCriterion("start_money >", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("start_money >=", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyLessThan(Long value) {
            addCriterion("start_money <", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyLessThanOrEqualTo(Long value) {
            addCriterion("start_money <=", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyIn(List<Long> values) {
            addCriterion("start_money in", values, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyNotIn(List<Long> values) {
            addCriterion("start_money not in", values, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyBetween(Long value1, Long value2) {
            addCriterion("start_money between", value1, value2, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyNotBetween(Long value1, Long value2) {
            addCriterion("start_money not between", value1, value2, "startMoney");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNull() {
            addCriterion("total_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("total_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(Long value) {
            addCriterion("total_money =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(Long value) {
            addCriterion("total_money <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(Long value) {
            addCriterion("total_money >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("total_money >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(Long value) {
            addCriterion("total_money <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(Long value) {
            addCriterion("total_money <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<Long> values) {
            addCriterion("total_money in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<Long> values) {
            addCriterion("total_money not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(Long value1, Long value2) {
            addCriterion("total_money between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(Long value1, Long value2) {
            addCriterion("total_money not between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyIsNull() {
            addCriterion("get_money is null");
            return (Criteria) this;
        }

        public Criteria andGetMoneyIsNotNull() {
            addCriterion("get_money is not null");
            return (Criteria) this;
        }

        public Criteria andGetMoneyEqualTo(Long value) {
            addCriterion("get_money =", value, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyNotEqualTo(Long value) {
            addCriterion("get_money <>", value, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyGreaterThan(Long value) {
            addCriterion("get_money >", value, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("get_money >=", value, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyLessThan(Long value) {
            addCriterion("get_money <", value, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyLessThanOrEqualTo(Long value) {
            addCriterion("get_money <=", value, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyIn(List<Long> values) {
            addCriterion("get_money in", values, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyNotIn(List<Long> values) {
            addCriterion("get_money not in", values, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyBetween(Long value1, Long value2) {
            addCriterion("get_money between", value1, value2, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyNotBetween(Long value1, Long value2) {
            addCriterion("get_money not between", value1, value2, "getMoney");
            return (Criteria) this;
        }

        public Criteria andPresentationIsNull() {
            addCriterion("presentation is null");
            return (Criteria) this;
        }

        public Criteria andPresentationIsNotNull() {
            addCriterion("presentation is not null");
            return (Criteria) this;
        }

        public Criteria andPresentationEqualTo(String value) {
            addCriterion("presentation =", value, "presentation");
            return (Criteria) this;
        }

        public Criteria andPresentationNotEqualTo(String value) {
            addCriterion("presentation <>", value, "presentation");
            return (Criteria) this;
        }

        public Criteria andPresentationGreaterThan(String value) {
            addCriterion("presentation >", value, "presentation");
            return (Criteria) this;
        }

        public Criteria andPresentationGreaterThanOrEqualTo(String value) {
            addCriterion("presentation >=", value, "presentation");
            return (Criteria) this;
        }

        public Criteria andPresentationLessThan(String value) {
            addCriterion("presentation <", value, "presentation");
            return (Criteria) this;
        }

        public Criteria andPresentationLessThanOrEqualTo(String value) {
            addCriterion("presentation <=", value, "presentation");
            return (Criteria) this;
        }

        public Criteria andPresentationLike(String value) {
            addCriterion("presentation like", value, "presentation");
            return (Criteria) this;
        }

        public Criteria andPresentationNotLike(String value) {
            addCriterion("presentation not like", value, "presentation");
            return (Criteria) this;
        }

        public Criteria andPresentationIn(List<String> values) {
            addCriterion("presentation in", values, "presentation");
            return (Criteria) this;
        }

        public Criteria andPresentationNotIn(List<String> values) {
            addCriterion("presentation not in", values, "presentation");
            return (Criteria) this;
        }

        public Criteria andPresentationBetween(String value1, String value2) {
            addCriterion("presentation between", value1, value2, "presentation");
            return (Criteria) this;
        }

        public Criteria andPresentationNotBetween(String value1, String value2) {
            addCriterion("presentation not between", value1, value2, "presentation");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNull() {
            addCriterion("audit_type is null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNotNull() {
            addCriterion("audit_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeEqualTo(Integer value) {
            addCriterion("audit_type =", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotEqualTo(Integer value) {
            addCriterion("audit_type <>", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThan(Integer value) {
            addCriterion("audit_type >", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_type >=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThan(Integer value) {
            addCriterion("audit_type <", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThanOrEqualTo(Integer value) {
            addCriterion("audit_type <=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIn(List<Integer> values) {
            addCriterion("audit_type in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotIn(List<Integer> values) {
            addCriterion("audit_type not in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeBetween(Integer value1, Integer value2) {
            addCriterion("audit_type between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_type not between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditFailReasonIsNull() {
            addCriterion("audit_fail_reason is null");
            return (Criteria) this;
        }

        public Criteria andAuditFailReasonIsNotNull() {
            addCriterion("audit_fail_reason is not null");
            return (Criteria) this;
        }

        public Criteria andAuditFailReasonEqualTo(String value) {
            addCriterion("audit_fail_reason =", value, "auditFailReason");
            return (Criteria) this;
        }

        public Criteria andAuditFailReasonNotEqualTo(String value) {
            addCriterion("audit_fail_reason <>", value, "auditFailReason");
            return (Criteria) this;
        }

        public Criteria andAuditFailReasonGreaterThan(String value) {
            addCriterion("audit_fail_reason >", value, "auditFailReason");
            return (Criteria) this;
        }

        public Criteria andAuditFailReasonGreaterThanOrEqualTo(String value) {
            addCriterion("audit_fail_reason >=", value, "auditFailReason");
            return (Criteria) this;
        }

        public Criteria andAuditFailReasonLessThan(String value) {
            addCriterion("audit_fail_reason <", value, "auditFailReason");
            return (Criteria) this;
        }

        public Criteria andAuditFailReasonLessThanOrEqualTo(String value) {
            addCriterion("audit_fail_reason <=", value, "auditFailReason");
            return (Criteria) this;
        }

        public Criteria andAuditFailReasonLike(String value) {
            addCriterion("audit_fail_reason like", value, "auditFailReason");
            return (Criteria) this;
        }

        public Criteria andAuditFailReasonNotLike(String value) {
            addCriterion("audit_fail_reason not like", value, "auditFailReason");
            return (Criteria) this;
        }

        public Criteria andAuditFailReasonIn(List<String> values) {
            addCriterion("audit_fail_reason in", values, "auditFailReason");
            return (Criteria) this;
        }

        public Criteria andAuditFailReasonNotIn(List<String> values) {
            addCriterion("audit_fail_reason not in", values, "auditFailReason");
            return (Criteria) this;
        }

        public Criteria andAuditFailReasonBetween(String value1, String value2) {
            addCriterion("audit_fail_reason between", value1, value2, "auditFailReason");
            return (Criteria) this;
        }

        public Criteria andAuditFailReasonNotBetween(String value1, String value2) {
            addCriterion("audit_fail_reason not between", value1, value2, "auditFailReason");
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