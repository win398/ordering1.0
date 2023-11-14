package cn.esileme.model;

import java.util.ArrayList;
import java.util.List;

public class OrderFoodExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    public OrderFoodExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
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

        public Criteria andOFIdIsNull() {
            addCriterion("o_f_id is null");
            return (Criteria) this;
        }

        public Criteria andOFIdIsNotNull() {
            addCriterion("o_f_id is not null");
            return (Criteria) this;
        }

        public Criteria andOFIdEqualTo(Integer value) {
            addCriterion("o_f_id =", value, "oFId");
            return (Criteria) this;
        }

        public Criteria andOFIdNotEqualTo(Integer value) {
            addCriterion("o_f_id <>", value, "oFId");
            return (Criteria) this;
        }

        public Criteria andOFIdGreaterThan(Integer value) {
            addCriterion("o_f_id >", value, "oFId");
            return (Criteria) this;
        }

        public Criteria andOFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_f_id >=", value, "oFId");
            return (Criteria) this;
        }

        public Criteria andOFIdLessThan(Integer value) {
            addCriterion("o_f_id <", value, "oFId");
            return (Criteria) this;
        }

        public Criteria andOFIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_f_id <=", value, "oFId");
            return (Criteria) this;
        }

        public Criteria andOFIdIn(List<Integer> values) {
            addCriterion("o_f_id in", values, "oFId");
            return (Criteria) this;
        }

        public Criteria andOFIdNotIn(List<Integer> values) {
            addCriterion("o_f_id not in", values, "oFId");
            return (Criteria) this;
        }

        public Criteria andOFIdBetween(Integer value1, Integer value2) {
            addCriterion("o_f_id between", value1, value2, "oFId");
            return (Criteria) this;
        }

        public Criteria andOFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_f_id not between", value1, value2, "oFId");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFnumIsNull() {
            addCriterion("fnum is null");
            return (Criteria) this;
        }

        public Criteria andFnumIsNotNull() {
            addCriterion("fnum is not null");
            return (Criteria) this;
        }

        public Criteria andFnumEqualTo(Integer value) {
            addCriterion("fnum =", value, "fnum");
            return (Criteria) this;
        }

        public Criteria andFnumNotEqualTo(Integer value) {
            addCriterion("fnum <>", value, "fnum");
            return (Criteria) this;
        }

        public Criteria andFnumGreaterThan(Integer value) {
            addCriterion("fnum >", value, "fnum");
            return (Criteria) this;
        }

        public Criteria andFnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("fnum >=", value, "fnum");
            return (Criteria) this;
        }

        public Criteria andFnumLessThan(Integer value) {
            addCriterion("fnum <", value, "fnum");
            return (Criteria) this;
        }

        public Criteria andFnumLessThanOrEqualTo(Integer value) {
            addCriterion("fnum <=", value, "fnum");
            return (Criteria) this;
        }

        public Criteria andFnumIn(List<Integer> values) {
            addCriterion("fnum in", values, "fnum");
            return (Criteria) this;
        }

        public Criteria andFnumNotIn(List<Integer> values) {
            addCriterion("fnum not in", values, "fnum");
            return (Criteria) this;
        }

        public Criteria andFnumBetween(Integer value1, Integer value2) {
            addCriterion("fnum between", value1, value2, "fnum");
            return (Criteria) this;
        }

        public Criteria andFnumNotBetween(Integer value1, Integer value2) {
            addCriterion("fnum not between", value1, value2, "fnum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_food
     *
     * @mbggenerated do_not_delete_during_merge Tue Dec 21 08:48:34 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
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