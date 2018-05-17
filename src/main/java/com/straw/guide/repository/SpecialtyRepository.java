package com.straw.guide.repository;

import com.straw.guide.model.ProjectItemEntity;
import com.straw.guide.model.SpecialtyEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
public interface SpecialtyRepository extends CrudRepository<SpecialtyEntity,String> {
}
