package com.company;

public class MachineTest {
    public static void main(String[] args) {
        Machine[] machines = new Machine[2];
        machines[0] = new Car("McQueen");
        machines[1] = new Planes("Siddeley");

        for (Machine machine : machines) {
            if (machine instanceof Car) {
                System.out.println(((Car) machine).run());
            } else {
                System.out.println(((Planes) machine).fly());
            }
        }
    }

}
