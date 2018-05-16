package com.straw.guide.model;

import javax.persistence.*;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
@Entity
@Table(name = "m_project_item", schema = "guide", catalog = "")
public class ProjectItemEntity {
    private String id;
    private String projectItemId;
    private String name;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "name_")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectItemEntity that = (ProjectItemEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (projectItemId != null ? !projectItemId.equals(that.projectItemId) : that.projectItemId != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (projectItemId != null ? projectItemId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
