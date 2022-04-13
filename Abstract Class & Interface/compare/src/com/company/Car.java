package com.company;

public class Car extends Machine implements Runable{
    public Car(){
    }

    public Car(String name){
        super(name);
    }
    @Override
    public String run() {
        return getName() + " running";
    }
}
