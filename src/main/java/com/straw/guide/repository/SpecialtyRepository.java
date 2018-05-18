package com.straw.guide.repository;

import com.straw.guide.model.ProjectItemEntity;
import com.straw.guide.model.SpecialtyEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
public interface SpecialtyRepository extends CrudRepository<SpecialtyEntity, String> {
    /**
     *
     * @param xk
     * @param zylb
     * @param zy
     * @param zl
     * @return
     */
    @Query(value = "SELECT t.* from l_specialty t where t.school_id=?1 and t.subject = ?2 and t.category =?3 and t.specialty_name = ?4 and t.type = ?5 ",nativeQuery = true)
    SpecialtyEntity findByAttr(String schoolId,String xk, String zylb, String zy, String zl);
}
