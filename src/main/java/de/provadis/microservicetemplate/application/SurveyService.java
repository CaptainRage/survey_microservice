package de.provadis.microservicetemplate.application;

import de.provadis.microservicetemplate.application.ports.SurveyPersistenceAdapter;
import de.provadis.microservicetemplate.application.ports.TodoPersistenceAdapter;
import de.provadis.microservicetemplate.domain.SurveyList;
import de.provadis.microservicetemplate.domain.TodoList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {

    private final SurveyPersistenceAdapter repository;

    public SurveyService(SurveyPersistenceAdapter repository) {
        this.repository = repository;
    }

    public List<SurveyList> getSurveyList() {
        return repository.loadSurveyList();
    }
}
