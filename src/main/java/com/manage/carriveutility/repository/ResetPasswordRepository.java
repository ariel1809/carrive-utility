package com.manage.carriveutility.repository;

import com.manage.carrive.entity.RegisterCode;
import com.manage.carrive.entity.ResetPassword;
import com.manage.carrive.entity.UserCarrive;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResetPasswordRepository extends MongoRepository<ResetPassword, String> {
    Optional<ResetPassword> findByCode(Integer code);
    Boolean existsByCode(Integer code);
    Optional<ResetPassword> findByUser(UserCarrive userCarrive);
}
