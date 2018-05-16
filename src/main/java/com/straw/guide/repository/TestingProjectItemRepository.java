package com.straw.guide.repository;

import com.straw.guide.model.TestingProjectItemEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
public interface TestingProjectItemRepository extends CrudRepository<TestingProjectItemEntity,String > {
}
