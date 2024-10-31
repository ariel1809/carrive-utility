package com.manage.carriveutility.repository;

import com.manage.carrive.entity.Conversation;
import com.manage.carrive.entity.Driver;
import com.manage.carrive.entity.Passenger;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConversationRepository extends MongoRepository<Conversation, String> {
    Optional<Conversation> findByUser1AndUser2(Driver user1, Passenger user2);
    List<Conversation> findByUser1(Driver user1);
    List<Conversation> findByUser2(Passenger user2);
}
