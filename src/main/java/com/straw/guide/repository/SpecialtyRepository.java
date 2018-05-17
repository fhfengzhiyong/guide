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
    @Query(value = "SELECT t.* from l_specialty t where t.subject = ?1 and t.category =?2 and t.specialty_name = ?3 and t.type = ?4 ",nativeQuery = true)
    SpecialtyEntity findByAttr(String xk, String zylb, String zy, String zl);
}
