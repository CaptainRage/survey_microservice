package de.provadis.microservicetemplate.adapters.in.web;

import de.provadis.microservicetemplate.application.TodoService;
import de.provadis.microservicetemplate.domain.TodoList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping("/todos")
    public List<TodoListDTO> getTodoLists() {
        List<TodoList> todos = service.getTodoLists();
        return todos.stream().map(TodoListDTO::fromDomain).collect(Collectors.toList());
    }
}
