package com.straw.guide.repository;

import com.straw.guide.model.ProjectItemEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
public interface ProjectItemRepository extends CrudRepository<ProjectItemEntity,String> {
}
