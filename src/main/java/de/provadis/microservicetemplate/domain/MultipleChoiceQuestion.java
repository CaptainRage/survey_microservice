package de.provadis.microservicetemplate.domain;

public class MultipleChoiceQuestion {

    String id;

    String question;

    String[] answerChoices;

    public MultipleChoiceQuestion(String id, String question, String[] answerChoices) {
        this.id = id;
        this.question = question;
        this.answerChoices = answerChoices;
    }

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswerChoices() {
        return answerChoices;
    }
}
