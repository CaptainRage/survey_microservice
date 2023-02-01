package de.provadis.microservicetemplate.adapters.in.web;


import de.provadis.microservicetemplate.domain.Task;
import de.provadis.microservicetemplate.domain.TodoList;

import java.util.List;
import java.util.stream.Collectors;

public class TodoListDTO {

    static public TodoListDTO fromDomain(TodoList todoList) {
        TodoListDTO todoListDTO = new TodoListDTO();
        todoListDTO.id = todoList.getId();
        todoListDTO.tasks = todoList.getOpenTasks().stream().map(Task::getContent).collect(Collectors.toList());
        return todoListDTO;
    }

    public String id;

    public List<String> tasks;
}
