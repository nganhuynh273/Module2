package com.company;

public abstract class Machine {
    private String name;
    public Machine(){}
    public Machine(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
