package ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class MeetingExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMeetingnameIsNull() {
            addCriterion("meetingname is null");
            return (Criteria) this;
        }

        public Criteria andMeetingnameIsNotNull() {
            addCriterion("meetingname is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingnameEqualTo(String value) {
            addCriterion("meetingname =", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotEqualTo(String value) {
            addCriterion("meetingname <>", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameGreaterThan(String value) {
            addCriterion("meetingname >", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameGreaterThanOrEqualTo(String value) {
            addCriterion("meetingname >=", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameLessThan(String value) {
            addCriterion("meetingname <", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameLessThanOrEqualTo(String value) {
            addCriterion("meetingname <=", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameLike(String value) {
            addCriterion("meetingname like", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotLike(String value) {
            addCriterion("meetingname not like", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameIn(List<String> values) {
            addCriterion("meetingname in", values, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotIn(List<String> values) {
            addCriterion("meetingname not in", values, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameBetween(String value1, String value2) {
            addCriterion("meetingname between", value1, value2, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotBetween(String value1, String value2) {
            addCriterion("meetingname not between", value1, value2, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingcontentIsNull() {
            addCriterion("meetingcontent is null");
            return (Criteria) this;
        }

        public Criteria andMeetingcontentIsNotNull() {
            addCriterion("meetingcontent is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingcontentEqualTo(String value) {
            addCriterion("meetingcontent =", value, "meetingcontent");
            return (Criteria) this;
        }

        public Criteria andMeetingcontentNotEqualTo(String value) {
            addCriterion("meetingcontent <>", value, "meetingcontent");
            return (Criteria) this;
        }

        public Criteria andMeetingcontentGreaterThan(String value) {
            addCriterion("meetingcontent >", value, "meetingcontent");
            return (Criteria) this;
        }

        public Criteria andMeetingcontentGreaterThanOrEqualTo(String value) {
            addCriterion("meetingcontent >=", value, "meetingcontent");
            return (Criteria) this;
        }

        public Criteria andMeetingcontentLessThan(String value) {
            addCriterion("meetingcontent <", value, "meetingcontent");
            return (Criteria) this;
        }

        public Criteria andMeetingcontentLessThanOrEqualTo(String value) {
            addCriterion("meetingcontent <=", value, "meetingcontent");
            return (Criteria) this;
        }

        public Criteria andMeetingcontentLike(String value) {
            addCriterion("meetingcontent like", value, "meetingcontent");
            return (Criteria) this;
        }

        public Criteria andMeetingcontentNotLike(String value) {
            addCriterion("meetingcontent not like", value, "meetingcontent");
            return (Criteria) this;
        }

        public Criteria andMeetingcontentIn(List<String> values) {
            addCriterion("meetingcontent in", values, "meetingcontent");
            return (Criteria) this;
        }

        public Criteria andMeetingcontentNotIn(List<String> values) {
            addCriterion("meetingcontent not in", values, "meetingcontent");
            return (Criteria) this;
        }

        public Criteria andMeetingcontentBetween(String value1, String value2) {
            addCriterion("meetingcontent between", value1, value2, "meetingcontent");
            return (Criteria) this;
        }

        public Criteria andMeetingcontentNotBetween(String value1, String value2) {
            addCriterion("meetingcontent not between", value1, value2, "meetingcontent");
            return (Criteria) this;
        }

        public Criteria andPublisheridIsNull() {
            addCriterion("publisherid is null");
            return (Criteria) this;
        }

        public Criteria andPublisheridIsNotNull() {
            addCriterion("publisherid is not null");
            return (Criteria) this;
        }

        public Criteria andPublisheridEqualTo(Integer value) {
            addCriterion("publisherid =", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridNotEqualTo(Integer value) {
            addCriterion("publisherid <>", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridGreaterThan(Integer value) {
            addCriterion("publisherid >", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("publisherid >=", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridLessThan(Integer value) {
            addCriterion("publisherid <", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridLessThanOrEqualTo(Integer value) {
            addCriterion("publisherid <=", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridIn(List<Integer> values) {
            addCriterion("publisherid in", values, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridNotIn(List<Integer> values) {
            addCriterion("publisherid not in", values, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridBetween(Integer value1, Integer value2) {
            addCriterion("publisherid between", value1, value2, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridNotBetween(Integer value1, Integer value2) {
            addCriterion("publisherid not between", value1, value2, "publisherid");
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