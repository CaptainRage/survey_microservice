package de.provadis.microservicetemplate.adapters.in.web;


import de.provadis.microservicetemplate.domain.RatingQuestion;
import de.provadis.microservicetemplate.domain.Task;
import de.provadis.microservicetemplate.domain.TodoList;

import java.util.List;
import java.util.stream.Collectors;

public class RatingQuestionDTO {

    static public RatingQuestionDTO fromDomain(RatingQuestion ratingQuestion) {
        RatingQuestionDTO ratingQuestionDTO = new RatingQuestionDTO();
        ratingQuestionDTO.id = ratingQuestion.getId();
        ratingQuestionDTO.question = ratingQuestion.getQuestion();
        ratingQuestionDTO.min = ratingQuestion.getMin();
        ratingQuestionDTO.max = ratingQuestion.getMax();
        return ratingQuestionDTO;
    }

    public String id;

    public String question;

    public int min;

    public int max;
}
