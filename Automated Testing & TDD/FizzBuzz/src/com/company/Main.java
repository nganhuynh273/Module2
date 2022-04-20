package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            boolean check = true;
            do {
                System.out.print("Enter the number: ");
                int number = scanner.nextInt();
                if (number % 3 == 0)
                    System.out.println("Fizz");
                else if (number % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println("FizzBuzz");
            } while (check);
        }
    }

