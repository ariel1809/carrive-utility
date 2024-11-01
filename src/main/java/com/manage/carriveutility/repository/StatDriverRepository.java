package com.manage.carriveutility.repository;

import com.manage.carrive.entity.StatDriver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatDriverRepository extends MongoRepository<StatDriver, String> {
}
