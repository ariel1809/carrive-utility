package com.manage.carriveutility.repository;

import com.manage.carrive.entity.ResetPassword;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResetPasswordRepository extends MongoRepository<ResetPassword, String> {
}
