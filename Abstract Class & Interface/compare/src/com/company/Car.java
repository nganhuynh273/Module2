package com.company;

public class Car extends Machine implements Runnable {
    public Car() {
    }

    public Car(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " running");
    }
}
