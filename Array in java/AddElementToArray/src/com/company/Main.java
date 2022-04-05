package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 20;
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = -1;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 3;
        int n = 5;
        System.out.println("Enter number");
        int x = scanner.nextInt();

        System.out.println("Enter index you want ínerting");
        int index = scanner.nextInt();
        System.out.print("Truoc khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        n = insert(arr, size, n, x, index);
        System.out.print("\nSau khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    static int insert(int[] arr, int size, int n, int x,int index) {

        if (n >= size) {
            return n;
        }

        if (index < 0 || index > n) {
            return n;
        }

        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
        return n + 1;
    }
    }

