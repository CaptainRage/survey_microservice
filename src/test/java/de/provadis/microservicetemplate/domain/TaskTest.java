package de.provadis.microservicetemplate.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void finish() {
        // Given
        Task task = new Task("todo 1");

        // When
        task.finish();

        // Assert
        assertTrue(task.finished);
    }
}