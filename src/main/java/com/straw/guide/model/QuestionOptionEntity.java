package com.straw.guide.model;

import javax.persistence.*;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
@Entity
@Table(name = "q_question_option", schema = "guide", catalog = "")
public class QuestionOptionEntity {
    private String id;
    private String questionId;
    private String name;
    private String option;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "name_")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "option_")
    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionOptionEntity that = (QuestionOptionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (questionId != null ? !questionId.equals(that.questionId) : that.questionId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (option != null ? !option.equals(that.option) : that.option != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (questionId != null ? questionId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (option != null ? option.hashCode() : 0);
        return result;
    }
}
