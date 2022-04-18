package com.company;

public class Dog extends Animal implements Barkable, Runnable {
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + ": Bark woof woof!");
    }

    @Override
    public void run() {
        System.out.println(getName() + " running");
    }

//    @Override
//    public void makeSound() {
//        return getName() +  ": Bark woof woof!";
//    }
}
