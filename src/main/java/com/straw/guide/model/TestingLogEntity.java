package com.straw.guide.model;

import javax.persistence.*;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
@Entity
@Table(name = "f_testing_log", schema = "guide", catalog = "")
public class TestingLogEntity {
    private String id;
    private String testingId;
    private String questionId;
    private String questionOptionId;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "testing_id")
    public String getTestingId() {
        return testingId;
    }

    public void setTestingId(String testingId) {
        this.testingId = testingId;
    }

    @Basic
    @Column(name = "question_id")
    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    @Basic
    @Column(name = "question_option_id")
    public String getQuestionOptionId() {
        return questionOptionId;
    }

    public void setQuestionOptionId(String questionOptionId) {
        this.questionOptionId = questionOptionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestingLogEntity that = (TestingLogEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (testingId != null ? !testingId.equals(that.testingId) : that.testingId != null) return false;
        if (questionId != null ? !questionId.equals(that.questionId) : that.questionId != null) return false;
        if (questionOptionId != null ? !questionOptionId.equals(that.questionOptionId) : that.questionOptionId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (testingId != null ? testingId.hashCode() : 0);
        result = 31 * result + (questionId != null ? questionId.hashCode() : 0);
        result = 31 * result + (questionOptionId != null ? questionOptionId.hashCode() : 0);
        return result;
    }
}
