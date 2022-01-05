package net.wattever.models;

import org.springframework.web.bind.annotation.ModelAttribute;


public class Subscription {

    private String name;
    private String email;
    private int id;
    private static int nextId = 1;

    public Subscription(String aName, String anEmail){
        this.name = aName;
        this.email = anEmail;
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}
