package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu n: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap vao mang cac so nguyen:");
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + (i + 1) + " la: ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Mang vua nhap la:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + "\t");
        }
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Phan tu nho nhat mang la:" + min);
    }
}
