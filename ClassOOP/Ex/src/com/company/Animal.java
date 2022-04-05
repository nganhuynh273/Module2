package com.company;

public class Animal {
    String name;
    Float weight;

    public Animal() {

    }

    public Animal(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public float getWeight() {

        return this.weight;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setWeight(float weight) {

        this.weight = weight;
    }

    public String getSay() {

        return "Name: " + name + ", weight: " + weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';



    }
}



