package com.company;

import java.util.Arrays;

public class TestAnimal {
    public static void main(String[] args) {
        Animal Elephant = new Animal();
        Elephant.setName("Elephant");
        Elephant.setWeight(10.5f);
        Elephant.getSay();
        Animal Rabbit = new Animal("Rabbit",6.5f);
        Rabbit.setName("Mouse");
        System.out.println(Elephant.toString());
        System.out.println(Rabbit.toString());




    }


}
