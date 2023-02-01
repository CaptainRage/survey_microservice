package de.provadis.microservicetemplate.adapters.out.persistence;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import de.provadis.microservicetemplate.domain.TodoList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Import({TodoMongoPersistenceAdapter.class})
@TestPropertySource(properties = "spring.mongodb.embedded.version=3.5.5")
@DataMongoTest
@ExtendWith(SpringExtension.class)
class TodoMongoPersistenceAdapterTest {

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    TodoMongoPersistenceAdapter adapter;

    @Test
    void loadTodoLists() {
        // given
        DBObject objectToSave = BasicDBObjectBuilder.start()
                .add("id", "40329A7F-98AD-48CB-9F66-0AB714CECB71")
                .add("tasks", List.of("Add unit tests", "Write Rest API"))
                .get();
        mongoTemplate.save(objectToSave, "todos");

        // when
        List<TodoList> todos = adapter.loadTodoLists();

        // then
        assertEquals(1, todos.size());
    }
}