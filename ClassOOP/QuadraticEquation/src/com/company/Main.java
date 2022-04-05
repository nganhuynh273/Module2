package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter number b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter number c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("x1 = " + quadraticEquation.getRoot1());
            System.out.println("x2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("x= " + quadraticEquation.getRoot());
        } else {
            System.out.println( "The equation has no roots!");
        }
    }
}
class QuadraticEquation {
    private double a, b, c;
    public double delta;
    public double x, x1, x2;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        delta = b*b - 4*a*c;
        return delta;
    }
    public double getRoot1() {
        x1 = (-b-Math.sqrt(delta)/(2*a));
        return x1;
    }
    public double getRoot2() {
        x2 = (-b+Math.sqrt(delta)/(2*a));
        return x2;
    }
    public double getRoot() {
        x = -b / (2*a);
        return x;
    }
    }

