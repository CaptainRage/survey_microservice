package de.provadis.microservicetemplate.adapters.in.web;


import de.provadis.microservicetemplate.domain.MultipleChoiceQuestion;
import de.provadis.microservicetemplate.domain.Task;
import de.provadis.microservicetemplate.domain.TodoList;

import java.util.List;
import java.util.stream.Collectors;

public class MultipleChoiceQuestionDTO {

    static public MultipleChoiceQuestionDTO fromDomain(MultipleChoiceQuestion multipleChoiceQuestion) {
        MultipleChoiceQuestionDTO multipleChoiceQuestionDTO = new MultipleChoiceQuestionDTO();
        multipleChoiceQuestionDTO.id = multipleChoiceQuestion.getId();
        multipleChoiceQuestionDTO.question = multipleChoiceQuestion.getQuestion();
        multipleChoiceQuestionDTO.answerChoices = multipleChoiceQuestion.getAnswerChoices();
        return multipleChoiceQuestionDTO;
    }

    public String id;

    public String question;

    public String[] answerChoices;
}
