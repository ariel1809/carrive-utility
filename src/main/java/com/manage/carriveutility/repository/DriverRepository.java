package com.manage.carriveutility.repository;

import com.manage.carrive.entity.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends MongoRepository<Driver, String> {
    boolean existsByEmail(String email);
    Optional<Driver> findByEmail(String email);
}
