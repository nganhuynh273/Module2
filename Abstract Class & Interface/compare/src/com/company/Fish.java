package com.company;

public class Fish extends Animal implements Swimable {
    public Fish() {
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swimming");
    }
//    @Override
//    public String makeSound() {
//        return getName() + ": Keep swimming!" ;
//    }


}
