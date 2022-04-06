package com.company;

public  class fan {
        private final int SLOW = 1;
        private final int MEDIUM = 2;
        private final int FAST = 3;
        private  int speed = 1;
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

        public fan() {

        }

        public fan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        public int getSLOW() {
            return SLOW;
        }

        public int getMEDIUM() {
            return MEDIUM;
        }

        public int getFAST() {
            return FAST;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
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
            String st = " ";
            if(this.isOn()){
                st += "com.company.Main.Fan is on \n";
                st += (" Speed: " +this.speed );
            } else {
                st += "\n com.company.Main.Fan is off";
            }
            st += ("\n Color: " + this.color);
            st += ("\n Radius: " + this.radius);
            return st;
        }
    }



