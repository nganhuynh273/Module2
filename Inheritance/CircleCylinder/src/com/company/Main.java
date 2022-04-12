package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(2.4,"red");
        System.out.println(circle);
        circle1.DrowUML();

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        Cylinder cylinder2 = new Cylinder(2.3, 3.2,"green");
        System.out.println(cylinder);
        cylinder2.drawUML();

    }
    }

