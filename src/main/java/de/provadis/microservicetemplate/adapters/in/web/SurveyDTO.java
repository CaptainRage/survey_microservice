package de.provadis.microservicetemplate.adapters.in.web;


import de.provadis.microservicetemplate.domain.Survey;
import de.provadis.microservicetemplate.domain.Task;
import de.provadis.microservicetemplate.domain.TodoList;

import java.util.List;
import java.util.stream.Collectors;

public class SurveyDTO {

    static public SurveyDTO fromDomain(Survey survey) {
        SurveyDTO surveyDTO = new SurveyDTO();
        surveyDTO.id = survey.getId();
        surveyDTO.title = survey.getTitle();
        return surveyDTO;
    }

    public String id;

    public String title;
}
