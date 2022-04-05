package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
            System.out.print("Eter the number:");
            int n = scanner.nextInt();
            System.out.printf("Tat ca cac so nguyen to nho hon n la: \n", n);
            if (n >= 2) {
                System.out.print(2);
            }
            for (int i = 3; i < n; i+=2) {
                if (isPrimeNumber(i)) {
                    System.out.print(" " + i);
                }
            }
        }
        public static boolean isPrimeNumber(int n) {
            if (n < 2) {
                return false;
            }
            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

