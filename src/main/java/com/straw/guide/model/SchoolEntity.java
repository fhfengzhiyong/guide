package com.straw.guide.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/17/2018
 */
@Entity
@Table(name = "l_school", schema = "guide", catalog = "")
public class SchoolEntity {
    private String id;
    private String schoolName;
    private String province;
    private String city;
    private String region;
    private Integer star;
    private String describe;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "school_name")
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Basic
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "star")
    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    @Basic
    @Column(name = "describe")
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolEntity that = (SchoolEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(schoolName, that.schoolName) &&
                Objects.equals(province, that.province) &&
                Objects.equals(city, that.city) &&
                Objects.equals(region, that.region) &&
                Objects.equals(star, that.star) &&
                Objects.equals(describe, that.describe);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, schoolName, province, city, region, star, describe);
    }
}
