package com.manage.carriveutility.repository;

import com.manage.carrive.entity.Passenger;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PassengerRepository extends MongoRepository<Passenger, String> {
    boolean existsByEmail(String email);
    Optional<Passenger> findByEmail(String email);
}
