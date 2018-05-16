package com.straw.guide.model;

import javax.persistence.*;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
@Entity
@Table(name = "f_testing_project_item", schema = "guide", catalog = "")
public class TestingProjectItemEntity {
    private String id;
    private String testingId;
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
    @Column(name = "testing_id")
    public String getTestingId() {
        return testingId;
    }

    public void setTestingId(String testingId) {
        this.testingId = testingId;
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

        TestingProjectItemEntity that = (TestingProjectItemEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (testingId != null ? !testingId.equals(that.testingId) : that.testingId != null) return false;
        if (projectItemId != null ? !projectItemId.equals(that.projectItemId) : that.projectItemId != null)
            return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (testingId != null ? testingId.hashCode() : 0);
        result = 31 * result + (projectItemId != null ? projectItemId.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }
}
