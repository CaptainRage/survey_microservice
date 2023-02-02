package de.provadis.microservicetemplate.domain;

import javax.annotation.processing.Generated;

public class TextQuestion {

    String id;

    String question;

    public TextQuestion(String id, String question) {
        this.id = id;
        this.question = question;
    }

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }
}
