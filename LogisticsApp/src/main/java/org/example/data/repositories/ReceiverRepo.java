package org.example.data.repositories;

import org.example.data.models.Receiver;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReceiverRepo extends MongoRepository<Receiver, String> {
}
