package com.straw.guide.repository;

import com.straw.guide.model.TestingProjectEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
public interface TestingProjectRepository extends CrudRepository<TestingProjectEntity,String> {
}
