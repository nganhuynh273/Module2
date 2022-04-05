package com.company;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
//    constructor to initialize the varialble
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
//    static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }
//    Method to display value
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}