package de.provadis.microservicetemplate.adapters.in.web;

import de.provadis.microservicetemplate.application.SurveyService;
import de.provadis.microservicetemplate.application.TodoService;
import de.provadis.microservicetemplate.domain.TodoList;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SurveyController {

    private final SurveyService service;

    public SurveyController(SurveyService service) {
        this.service = service;
    }

    @GetMapping("/surveys")
    public List<TodoListDTO> getSurveyList() {
        List<TodoList> todos = service.getTodoLists();
        return todos.stream().map(TodoListDTO::fromDomain).collect(Collectors.toList());
    }

    @PostMapping("/surveys")
    public List<TodoListDTO> createSurvey(@RequestParam("title") String title) {
        List<TodoList> todos = service.getTodoLists();
        return todos.stream().map(TodoListDTO::fromDomain).collect(Collectors.toList());
    }

    @GetMapping("/surveys/{survey-id}")
    public List<TodoListDTO> getSurvey(@PathParam("survey-id") int surveyId) {
        List<TodoList> todos = service.getTodoLists();
        return todos.stream().map(TodoListDTO::fromDomain).collect(Collectors.toList());
    }

    @PutMapping ("/surveys/{survey-id}")
    public List<TodoListDTO> modifySurvey(@PathParam("survey-id") int surveyId,
                                           @RequestParam(value = "start", required = false) int start,
                                           @RequestParam(value = "end", required = false) int end,
                                           @RequestParam(value = "published", required = false) boolean published) {
        List<TodoList> todos = service.getTodoLists();
        return todos.stream().map(TodoListDTO::fromDomain).collect(Collectors.toList());
    }

    @DeleteMapping("/surveys/{survey-id}")
    public List<TodoListDTO> deleteSurvey(@PathParam("survey-id") int surveyId) {
        List<TodoList> todos = service.getTodoLists();
        return todos.stream().map(TodoListDTO::fromDomain).collect(Collectors.toList());
    }

    @PostMapping ("/surveys/{survey-id}/questions")
    public List<TodoListDTO> createQuestion(@PathParam("survey-id") int surveyId,
                                           @RequestParam("question") String question) {
        List<TodoList> todos = service.getTodoLists();
        return todos.stream().map(TodoListDTO::fromDomain).collect(Collectors.toList());
    }

    @GetMapping ("/surveys/{survey-id}/questions/{question-id}")
    public List<TodoListDTO> getQuestion(@PathParam("survey-id") int surveyId, @PathParam("question-id") int questionId) {
        List<TodoList> todos = service.getTodoLists();
        return todos.stream().map(TodoListDTO::fromDomain).collect(Collectors.toList());
    }

    @DeleteMapping ("/surveys/{survey-id}/questions/{question-id}")
    public List<TodoListDTO> deleteQuestion(@PathParam("survey-id") int surveyId, @PathParam("question-id") int questionId) {
        List<TodoList> todos = service.getTodoLists();
        return todos.stream().map(TodoListDTO::fromDomain).collect(Collectors.toList());
    }
}
