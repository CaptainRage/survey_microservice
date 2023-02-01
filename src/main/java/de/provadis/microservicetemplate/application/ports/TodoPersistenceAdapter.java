package de.provadis.microservicetemplate.application.ports;

import de.provadis.microservicetemplate.domain.TodoList;

import java.util.List;

public interface TodoPersistenceAdapter {

    List<TodoList> loadTodoLists();
}
