package de.provadis.microservicetemplate.domain;

public class Task {

    String content;
    boolean finished;

    public Task(String content) {
        this.content = content;
        this.finished = false;
    }

    public void finish() {
        this.finished = true;
    }

    public String getContent() {
        return content;
    }
}
