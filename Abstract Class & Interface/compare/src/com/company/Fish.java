package com.company;

public class Fish extends Animal implements Swimable{
    public Fish(){
    }

    public Fish(String name){
        super(name);
    }

    @Override
    public String makeSound() {
        return getName() + ": Keep swimming!" ;
    }

    @Override
    public String swim() {
        return getName() + " swimming";
    }
}
