package com.straw.guide.model;

import javax.persistence.*;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
@Entity
@Table(name = "q_question_project", schema = "guide", catalog = "")
public class QuestionProjectEntity {
    private String id;
    private String optionId;
    private String projectItemId;
    private Double score;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "option_id")
    public String getOptionId() {
        return optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }

    @Basic
    @Column(name = "project_item_id")
    public String getProjectItemId() {
        return projectItemId;
    }

    public void setProjectItemId(String projectItemId) {
        this.projectItemId = projectItemId;
    }

    @Basic
    @Column(name = "score")
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionProjectEntity that = (QuestionProjectEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (optionId != null ? !optionId.equals(that.optionId) : that.optionId != null) return false;
        if (projectItemId != null ? !projectItemId.equals(that.projectItemId) : that.projectItemId != null)
            return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (optionId != null ? optionId.hashCode() : 0);
        result = 31 * result + (projectItemId != null ? projectItemId.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }
}
