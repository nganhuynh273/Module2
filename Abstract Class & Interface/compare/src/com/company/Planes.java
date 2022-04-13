package com.company;

public class Planes extends Machine implements Flyable{
    public Planes() {}
    public Planes(String name) {
        super(name);
    }

    @Override
    public String fly() {
        return getName() + " flying";
    }
}
