package com.company;

public class Circle {
    private double radius;
    private String color;
    public Circle () {
        this.radius = 1.0;
        this.color = "red";
    }
     public Circle (double radius) {
         this.radius = radius;
         this.color = "red";
     }
      public Circle (double raidus, String color) {
          this.radius = raidus;
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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}




