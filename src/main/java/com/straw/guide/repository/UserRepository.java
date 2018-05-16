package com.straw.guide.repository;

import com.straw.guide.model.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
public interface UserRepository extends CrudRepository<UserEntity,String> {
    Page<UserEntity> findAll(Pageable pageable);

}
