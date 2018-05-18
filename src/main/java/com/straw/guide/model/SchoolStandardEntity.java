package com.straw.guide.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author straw(fengzy)
 * @description
 * @date {DATE}
 */
@Entity
@Table(name = "l_school_standard", schema = "guide", catalog = "")
public class SchoolStandardEntity {
    private String id;
    private Integer year;
    private Integer lowestScore;
    private Integer headCount;
    private String schoolId;

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
    @Column(name = "lowest_score")
    public Integer getLowestScore() {
        return lowestScore;
    }

    public void setLowestScore(Integer lowestScore) {
        this.lowestScore = lowestScore;
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
        SchoolStandardEntity that = (SchoolStandardEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(year, that.year) &&
                Objects.equals(lowestScore, that.lowestScore) &&
                Objects.equals(headCount, that.headCount);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, year, lowestScore, headCount);
    }

    @Basic
    @Column(name = "school_id")
    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }
}
