package com.straw.guide.repository;

import com.straw.guide.model.VersionEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */

public interface VersionRepository extends CrudRepository<VersionEntity,String> {
}
