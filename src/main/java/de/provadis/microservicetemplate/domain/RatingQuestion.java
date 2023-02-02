package de.provadis.microservicetemplate.domain;

public class RatingQuestion {

    String id;

    String question;

    int min;

    int max;

    public RatingQuestion(String id, String question, int min, int max) {
        this.id = id;
        this.question = question;
        this.min = min;
        this.max = max;
    }

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public int getMin() { return min; }

    public int getMax() { return max; }
}
