package com.manage.carriveutility.repository;

import com.manage.carrive.entity.RegisterCode;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RegisterCodeRepository extends MongoRepository<RegisterCode, String> {
    Optional<RegisterCode> findByCode(Integer code);
    Boolean existsByCode(Integer code);
}
