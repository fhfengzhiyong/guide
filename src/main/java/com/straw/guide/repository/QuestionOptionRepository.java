package com.straw.guide.repository;

import com.straw.guide.model.QuestionOptionEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
public interface QuestionOptionRepository extends CrudRepository<QuestionOptionEntity,String> {
}
