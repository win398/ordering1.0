package cn.esileme.model;

import java.util.ArrayList;
import java.util.List;

public class FoodExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
     */
    public FoodExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
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
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
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

        public Criteria andFnameIsNull() {
            addCriterion("fname is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fname is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fname =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fname <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fname >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fname >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fname <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fname <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fname like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fname not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fname in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fname not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fname between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fname not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFtitleIsNull() {
            addCriterion("ftitle is null");
            return (Criteria) this;
        }

        public Criteria andFtitleIsNotNull() {
            addCriterion("ftitle is not null");
            return (Criteria) this;
        }

        public Criteria andFtitleEqualTo(String value) {
            addCriterion("ftitle =", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotEqualTo(String value) {
            addCriterion("ftitle <>", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleGreaterThan(String value) {
            addCriterion("ftitle >", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleGreaterThanOrEqualTo(String value) {
            addCriterion("ftitle >=", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLessThan(String value) {
            addCriterion("ftitle <", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLessThanOrEqualTo(String value) {
            addCriterion("ftitle <=", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLike(String value) {
            addCriterion("ftitle like", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotLike(String value) {
            addCriterion("ftitle not like", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleIn(List<String> values) {
            addCriterion("ftitle in", values, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotIn(List<String> values) {
            addCriterion("ftitle not in", values, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleBetween(String value1, String value2) {
            addCriterion("ftitle between", value1, value2, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotBetween(String value1, String value2) {
            addCriterion("ftitle not between", value1, value2, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFsalesIsNull() {
            addCriterion("fsales is null");
            return (Criteria) this;
        }

        public Criteria andFsalesIsNotNull() {
            addCriterion("fsales is not null");
            return (Criteria) this;
        }

        public Criteria andFsalesEqualTo(Integer value) {
            addCriterion("fsales =", value, "fsales");
            return (Criteria) this;
        }

        public Criteria andFsalesNotEqualTo(Integer value) {
            addCriterion("fsales <>", value, "fsales");
            return (Criteria) this;
        }

        public Criteria andFsalesGreaterThan(Integer value) {
            addCriterion("fsales >", value, "fsales");
            return (Criteria) this;
        }

        public Criteria andFsalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("fsales >=", value, "fsales");
            return (Criteria) this;
        }

        public Criteria andFsalesLessThan(Integer value) {
            addCriterion("fsales <", value, "fsales");
            return (Criteria) this;
        }

        public Criteria andFsalesLessThanOrEqualTo(Integer value) {
            addCriterion("fsales <=", value, "fsales");
            return (Criteria) this;
        }

        public Criteria andFsalesIn(List<Integer> values) {
            addCriterion("fsales in", values, "fsales");
            return (Criteria) this;
        }

        public Criteria andFsalesNotIn(List<Integer> values) {
            addCriterion("fsales not in", values, "fsales");
            return (Criteria) this;
        }

        public Criteria andFsalesBetween(Integer value1, Integer value2) {
            addCriterion("fsales between", value1, value2, "fsales");
            return (Criteria) this;
        }

        public Criteria andFsalesNotBetween(Integer value1, Integer value2) {
            addCriterion("fsales not between", value1, value2, "fsales");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPpriceIsNull() {
            addCriterion("pprice is null");
            return (Criteria) this;
        }

        public Criteria andPpriceIsNotNull() {
            addCriterion("pprice is not null");
            return (Criteria) this;
        }

        public Criteria andPpriceEqualTo(Float value) {
            addCriterion("pprice =", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotEqualTo(Float value) {
            addCriterion("pprice <>", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceGreaterThan(Float value) {
            addCriterion("pprice >", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("pprice >=", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceLessThan(Float value) {
            addCriterion("pprice <", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceLessThanOrEqualTo(Float value) {
            addCriterion("pprice <=", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceIn(List<Float> values) {
            addCriterion("pprice in", values, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotIn(List<Float> values) {
            addCriterion("pprice not in", values, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceBetween(Float value1, Float value2) {
            addCriterion("pprice between", value1, value2, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotBetween(Float value1, Float value2) {
            addCriterion("pprice not between", value1, value2, "pprice");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andFpicIsNull() {
            addCriterion("fpic is null");
            return (Criteria) this;
        }

        public Criteria andFpicIsNotNull() {
            addCriterion("fpic is not null");
            return (Criteria) this;
        }

        public Criteria andFpicEqualTo(String value) {
            addCriterion("fpic =", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicNotEqualTo(String value) {
            addCriterion("fpic <>", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicGreaterThan(String value) {
            addCriterion("fpic >", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicGreaterThanOrEqualTo(String value) {
            addCriterion("fpic >=", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicLessThan(String value) {
            addCriterion("fpic <", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicLessThanOrEqualTo(String value) {
            addCriterion("fpic <=", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicLike(String value) {
            addCriterion("fpic like", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicNotLike(String value) {
            addCriterion("fpic not like", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicIn(List<String> values) {
            addCriterion("fpic in", values, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicNotIn(List<String> values) {
            addCriterion("fpic not in", values, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicBetween(String value1, String value2) {
            addCriterion("fpic between", value1, value2, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicNotBetween(String value1, String value2) {
            addCriterion("fpic not between", value1, value2, "fpic");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table food
     *
     * @mbggenerated do_not_delete_during_merge Fri Dec 17 19:50:47 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table food
     *
     * @mbggenerated Fri Dec 17 19:50:47 CST 2021
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