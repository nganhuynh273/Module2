package com.company;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("circle");
        System.out.println("Result: " + shape.draw());

        Shape shape2 = shapeFactory.getShape("square");
        System.out.println("Result: " + shape2.draw());
    }
}
