package com.company;

public class Bird extends Animal implements Flyable {
    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }
    public void fly() {
        System.out.println(getName() + " flying!");
    }
//    @Override
//    public String makeSound() {
//        return getName() + ": Laugh hahaha";
//    }


}
