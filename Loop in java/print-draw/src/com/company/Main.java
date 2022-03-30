package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;

        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Draw the rectangle");
                    for (int i = 4; i >= 1; i--) {
                        for (int j = 0; j <= 8; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;


                case 2:
                    System.out.println("2. Draw the square triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;

                case 3:
                    System.out.println("3. Draw the isosceles triangle");
                    for (int i = 0; i <= 6; i++) {
                        for (int space = 7 - i; space >= 1; space--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i * 2 + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }

                case 0:
                    System.out.println("0. Exit");
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
