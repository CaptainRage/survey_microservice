package de.provadis.microservicetemplate.application.ports;

import de.provadis.microservicetemplate.domain.SurveyList;
import de.provadis.microservicetemplate.domain.TodoList;

import java.util.List;

public interface SurveyPersistenceAdapter {

    List<SurveyList> loadSurveyList();
}
