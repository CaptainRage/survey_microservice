package de.provadis.microservicetemplate.application;

import de.provadis.microservicetemplate.application.ports.TodoPersistenceAdapter;
import de.provadis.microservicetemplate.domain.TodoList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TodoServiceTest {

    @Mock
    TodoPersistenceAdapter adapter;

    @Test
    void getTodoLists() {
        // Given
        List<TodoList> result = new ArrayList<>();
        result.add(new TodoList("123"));
        when(adapter.loadTodoLists()).thenReturn(result);
        TodoService service = new TodoService(adapter);

        // When
        List<TodoList> actual = service.getTodoLists();

        // Then
        assertEquals(1, actual.size());
    }
}