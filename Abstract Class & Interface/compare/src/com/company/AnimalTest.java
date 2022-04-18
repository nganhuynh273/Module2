package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Bolt");
        animals[1] = new Bird("AngryBird");
        animals[2] = new Fish("Nemo");
//        for (Animal animal : animals) {
//            if (animal instanceof Dog) {
//                System.out.println(animal.makeSound());
//                System.out.println(((Dog) animal).run());
//            } else if (animal instanceof Fish) {
//                System.out.println(((Fish) animal).swim());
//                System.out.println(animal.makeSound());
//            } else {
//                System.out.println(((Bird) animal).fly());
//                System.out.println(animal.makeSound()
//                );
//            }
//        }

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                ((Dog) animal).bark();
                ((Dog) animal).run();
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim();
            } else {
                ((Bird) animal).fly();
                ((Bird) animal).fly();

            }
        }

    }
}

