package com.company;

public class MachineTest {
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
    }

}
