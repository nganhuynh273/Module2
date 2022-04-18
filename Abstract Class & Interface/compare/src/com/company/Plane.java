package com.company;

public class Plane extends Machine implements Flyable {
    public Plane() {
    }

    public Plane(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flying");
    }
}
