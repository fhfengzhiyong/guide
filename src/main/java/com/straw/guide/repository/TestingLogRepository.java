package com.straw.guide.repository;

import com.straw.guide.model.TestingLogEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
public interface TestingLogRepository extends CrudRepository<TestingLogEntity,String> {
}
