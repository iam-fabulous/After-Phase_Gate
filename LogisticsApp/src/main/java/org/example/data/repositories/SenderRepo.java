package org.example.data.repositories;

import org.example.data.models.Sender;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SenderRepo extends MongoRepository<Sender, String> {
}
