package org.example.data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface PackageRepo extends MongoRepository<Package, String> {
}
