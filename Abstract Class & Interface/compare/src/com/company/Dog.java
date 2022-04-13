package com.company;

public class Dog extends Animal implements  Barkable, Runable {
    public Dog(){
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String run() {
        return getName() + " running";
    }

    @Override
    public String makeSound() {
        return getName() +  ": Bark woof woof!";
    }
}
