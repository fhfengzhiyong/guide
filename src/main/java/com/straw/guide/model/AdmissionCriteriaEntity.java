package com.straw.guide.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/17/2018
 */
@Entity
@Table(name = "l_admission_criteria", schema = "guide", catalog = "")
public class AdmissionCriteriaEntity {
    private String id;
    private Integer year;
    private Integer lowestSrore;
    private String batch;
    private Integer headCount;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "year")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Basic
    @Column(name = "lowest_srore")
    public Integer getLowestSrore() {
        return lowestSrore;
    }

    public void setLowestSrore(Integer lowestSrore) {
        this.lowestSrore = lowestSrore;
    }

    @Basic
    @Column(name = "batch")
    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Basic
    @Column(name = "head_count")
    public Integer getHeadCount() {
        return headCount;
    }

    public void setHeadCount(Integer headCount) {
        this.headCount = headCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdmissionCriteriaEntity that = (AdmissionCriteriaEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(year, that.year) &&
                Objects.equals(lowestSrore, that.lowestSrore) &&
                Objects.equals(batch, that.batch) &&
                Objects.equals(headCount, that.headCount);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, year, lowestSrore, batch, headCount);
    }
}
