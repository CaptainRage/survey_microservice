package de.provadis.microservicetemplate.domain;

public class Survey {

    String id;

    String title;

    public Survey(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
