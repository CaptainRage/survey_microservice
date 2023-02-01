package de.provadis.microservicetemplate.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TodoListTest {

    @Test
    void addTodoThrowsExceptionWhenInputNull() {
        // Given
        TodoList todos = new TodoList("123");

        // When, Then
        assertThrows(IllegalArgumentException.class, () -> todos.add(null));
    }

    @Test
    void addTodoAddsTodoToList() {
        // Given
        TodoList todos = new TodoList("123");
        Task task = new Task("todo 1");

        // When
        todos.add(task);

        // Then
        assertEquals(1, todos.tasks.size());
    }

    @Test
    void getOpenTasks() {
        // Given
        TodoList todos = new TodoList("123");
        Task task1 = new Task("todo 1");
        Task task2 = new Task("todo 2");
        task2.finish();
        Task task3 = new Task("todo 3");
        todos.add(task1);
        todos.add(task2);
        todos.add(task3);

        // When
        List<Task> tasks = todos.getOpenTasks();

        // Then
        assertEquals(2, tasks.size());
    }
}