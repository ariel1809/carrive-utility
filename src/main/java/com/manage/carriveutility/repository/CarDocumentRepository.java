package com.manage.carriveutility.repository;

import com.manage.carrive.entity.CarDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDocumentRepository extends MongoRepository<CarDocument, String> {
}
