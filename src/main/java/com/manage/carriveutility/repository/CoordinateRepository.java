package com.manage.carriveutility.repository;

import com.manage.carrive.entity.Coordinate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinateRepository extends MongoRepository<Coordinate, String> {
}
