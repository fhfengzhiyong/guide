package com.straw.guide.repository;

import com.straw.guide.model.AdmissionCriteriaEntity;
import com.straw.guide.model.SchoolStandardEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
public interface AdmissionCriteriaRepository extends CrudRepository<AdmissionCriteriaEntity, String> {
    /**
     * 由专业id，年份，录取批次查询
     *
     * @param specialtyId
     * @param year
     * @param pc
     * @return
     */
    @Query(value = "SELECT * from l_admission_criteria t where t.specialty_id = ?1 and t.year = ?2 and t.batch = ?3", nativeQuery = true)
    AdmissionCriteriaEntity findAttr(String specialtyId, String year, String pc);
}
