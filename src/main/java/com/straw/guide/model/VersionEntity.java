package com.straw.guide.model;

import javax.persistence.*;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
@Entity
@Table(name = "m_version", schema = "guide", catalog = "")
public class VersionEntity {
    private String id;
    private String name;
    private Integer versionNo;
    private Integer activity;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "version_no")
    public Integer getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }

    @Basic
    @Column(name = "activity")
    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VersionEntity that = (VersionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (versionNo != null ? !versionNo.equals(that.versionNo) : that.versionNo != null) return false;
        if (activity != null ? !activity.equals(that.activity) : that.activity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (versionNo != null ? versionNo.hashCode() : 0);
        result = 31 * result + (activity != null ? activity.hashCode() : 0);
        return result;
    }
}
