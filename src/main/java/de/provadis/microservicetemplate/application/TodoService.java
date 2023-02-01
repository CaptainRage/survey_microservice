package de.provadis.microservicetemplate.application;

import de.provadis.microservicetemplate.application.ports.TodoPersistenceAdapter;
import de.provadis.microservicetemplate.domain.TodoList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoPersistenceAdapter repository;

    public TodoService(TodoPersistenceAdapter repository) {
        this.repository = repository;
    }

    public List<TodoList> getTodoLists() {
        return repository.loadTodoLists();
    }
}
