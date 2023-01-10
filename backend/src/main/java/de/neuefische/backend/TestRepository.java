package de.neuefische.backend;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository extends MongoRepository<TestObject, String> {
}
