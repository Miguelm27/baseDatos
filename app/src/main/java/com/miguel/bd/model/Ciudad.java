package com.miguel.bd.model;

public class Ciudad {
    private int id;
    public String name;
    public Ciudad(){}
    public Ciudad(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
