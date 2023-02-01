package de.provadis.microservicetemplate.adapters.in.web;

import de.provadis.microservicetemplate.application.TodoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TodoControllerTest {

    @InjectMocks
    TodoController todoController;

    @Mock
    TodoService todoService;

    @Test
    public void getTodoLists() {
        // Given
        when(todoService.getTodoLists()).thenReturn(new ArrayList<>());

        // When
        List<TodoListDTO> actual = todoController.getTodoLists();

        // Then
        assertEquals(0,actual.size());
    }
}
