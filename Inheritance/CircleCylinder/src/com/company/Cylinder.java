package com.company;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height,double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPrementer() {
        return super.getPrementer();
    }

    @Override
    public String toString() {
        return "A Cylinder with volume = "
                + getVolume()
                + ", which is a subclass of "
                + super.toString();
    }

    public void drawUML() {
        System.out.println("Cylinder");
        System.out.println("- height : double");
        System.out.println("+ getVolume()");
        System.out.println("+ getArea() : double");
        System.out.println("+ getPrementer() : double");
    }

}

