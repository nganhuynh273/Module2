package com.company;

public class Bird extends Animal implements Flyable{
    public Bird() {}
    public Bird(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return getName() + ": Laugh hahaha";
    }

    @Override
    public String fly() {
        return getName() + " flying!";
    }
}
