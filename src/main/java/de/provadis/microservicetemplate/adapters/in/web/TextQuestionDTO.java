package de.provadis.microservicetemplate.adapters.in.web;


import de.provadis.microservicetemplate.domain.Task;
import de.provadis.microservicetemplate.domain.TextQuestion;
import de.provadis.microservicetemplate.domain.TodoList;

import java.util.List;
import java.util.stream.Collectors;

public class TextQuestionDTO {

    static public TextQuestionDTO fromDomain(TextQuestion textQuestion) {
        TextQuestionDTO textQuestionDTO = new TextQuestionDTO();
        textQuestionDTO.id = textQuestion.getId();
        textQuestionDTO.question = textQuestion.getQuestion();
        return textQuestionDTO;
    }

    public String id;

    public String question;
}
