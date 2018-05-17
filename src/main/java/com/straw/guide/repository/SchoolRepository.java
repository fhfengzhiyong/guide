package com.straw.guide.repository;

import com.straw.guide.model.SchoolEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
public interface SchoolRepository extends CrudRepository<SchoolEntity, String> {
    /**
     * 根据学校名称查询
     *
     * @param schoolName
     * @return
     */
    @Query(value = "SELECT * from l_school t where t.school_name = ?1 limit 1", nativeQuery = true)
    SchoolEntity findBySchoolName(String schoolName);
}
