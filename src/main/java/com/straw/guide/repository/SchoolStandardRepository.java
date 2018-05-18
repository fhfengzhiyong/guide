package com.straw.guide.repository;

import com.straw.guide.model.SchoolStandardEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
public interface SchoolStandardRepository extends CrudRepository<SchoolStandardEntity, String> {
    /**
     * 查询学校年度标准是否存在
     *
     * @param schoolId
     * @param year
     * @return
     */
    @Query(value = "SELECT * from l_school_standard t where t.school_id = ?1 and t.year =?2 ", nativeQuery = true)
    SchoolStandardEntity findAttr(String schoolId, String year);
}
