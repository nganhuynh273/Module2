package com.company;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(3,5);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(2,3,10,20);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());

    }
    }

