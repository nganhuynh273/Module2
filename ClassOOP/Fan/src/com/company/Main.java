package com.company;

public class Main {

    public static void main(String[] args) {
        fan fan1 = new fan(3, true, 10.0, "red");
        fan fan2 = new fan(2, false, 5.0, "yellow");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

        System.out.println(" ");
        System.out.println("* * * * * * * * * * * * * * * * * *");
        System.out.println("*              com.company.Main.Fan                *");
        System.out.println("* * * * * * * * * * * * * * * * * *");
        System.out.println("*  - speed: int = 1               *");
        System.out.println("*  - on: boolean = false          *");
        System.out.println("*  - radius: double = 5           *");
        System.out.println("*  - color: String = 'blue'       *");
        System.out.println("* * * * * * * * * * * * * * * * * *");
        System.out.println("*  + com.company.Main.Fan()                        *");
        System.out.println("*  + com.company.Main.Fan(speed,on,color,radius)   *");
        System.out.println("*  + getColor()                   *");
        System.out.println("*  + getRadius()                  *");
        System.out.println("*  + getSeep()                    *");
        System.out.println("*  + getOn()                      *");
        System.out.println("* * * * * * * * * * * * * * * * * *");
    }
}

