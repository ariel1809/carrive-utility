package com.manage.carriveutility.repository;

import com.manage.carrive.entity.Driver;
import com.manage.carrive.entity.PersonalDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonalDocumentRepository extends MongoRepository<PersonalDocument, String> {
    Optional<PersonalDocument> findByDriver(Driver driver);
}
