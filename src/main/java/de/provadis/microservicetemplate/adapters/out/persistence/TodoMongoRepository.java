package de.provadis.microservicetemplate.adapters.out.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TodoMongoRepository extends MongoRepository<TodoListEntity, String> {
    List<TodoListEntity> findAll();
}
