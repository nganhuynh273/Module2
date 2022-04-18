package com.company;

public class Main {
    public static void main(String[] args) {
        Machine[] machines = new Machine[2];
        machines[0] = new Car("McQueen");
        machines[1] = new Plane("Siddeley");

        for (Machine machine : machines) {
            if (machine instanceof Car) {
                ((Car) machine).run();
            } else {
                ((Plane) machine).fly();
            }
        }

        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Bolt");
        animals[1] = new Bird("AngryBird");
        animals[2] = new Fish("Nemo");

        for (Animal animal : animals) {
            if (animal instanceof Barkable) {
                ((Barkable) animal).bark();
            }
            if (animal instanceof Swimable) {
                ((Swimable) animal).swim();
            }
            if (animal instanceof Flyable)
                ((Flyable) animal).fly();
//                if (animal instanceof Dog) {
//                    ((Dog) animal).bark();
//                    ((Dog) animal).run();
//                } else if (animal instanceof Fish) {
//                    ((Fish) animal).swim();
//                } else {
//                    ((Bird) animal).fly();
//                    ((Bird) animal).fly();
//                }
        }
    }
}
