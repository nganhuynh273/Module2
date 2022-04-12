package com.company;

public class Circle {
    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPrementer() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Cricle with color of "
                +getColor()
                + " and "
                +getRadius();
    }
    public void DrowUML() {
        System.out.println("Circle");
        System.out.println("- radius : double        ");
        System.out.println("- color : String         ");
        System.out.println("  Circle()");
        System.out.println("+ getRadius() : double   ");
        System.out.println("+ getColor() : String    ");
        System.out.println("+ getArea() : double     ");
        System.out.println("+ getPrimenter() : double");
    }
}
