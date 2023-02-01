package de.provadis.microservicetemplate.adapters.out.persistence;

import de.provadis.microservicetemplate.application.ports.TodoPersistenceAdapter;
import de.provadis.microservicetemplate.domain.TodoList;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TodoMongoPersistenceAdapter implements TodoPersistenceAdapter {

    private final TodoMongoRepository repository;

    public TodoMongoPersistenceAdapter(TodoMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TodoList> loadTodoLists() {
        List<TodoListEntity> todos = repository.findAll();
        return todos.stream().map(TodoListEntity::toDomain).collect(Collectors.toList());
    }
}
