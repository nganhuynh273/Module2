package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[4];
        int[] array2 = new int[4];
        System.out.println("Enter input array 1:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter input array 2:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }
            int i = array1.length + array2.length;
            int[] arr = new int[i];
            int count = 0;
            for (int j = 0; j < array1.length; j++) {
                arr[j] = array1[j];
                count++;
            }
            for (int j = 0; j < array2.length; j++) {
                arr[count++] = array2[j];
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
        }
    }

