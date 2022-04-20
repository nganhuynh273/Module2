package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      int month;
      int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month: ");
        month = scanner.nextInt();
        System.out.println("Enter the year: ");
        year = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Month has 30 days");
                break;
            case 2:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                    System.out.println("Month has 29 days");
                else
                    System.out.println("Month has 28 days");
                break;

        }
    }
}
