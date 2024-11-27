package org.example.data.repositories;

import org.example.data.models.TrackingLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrackingLogRepo extends MongoRepository<TrackingLog, String> {
}
