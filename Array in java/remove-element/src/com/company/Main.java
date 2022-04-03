package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, i;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao phan tu can xoa:");
            n = scanner.nextInt();
        } while (n <= 0);
        int A[] = new int[n];

        System.out.println("Nhap cac phan tu cho mang: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            A[i] = scanner.nextInt();
        }
    }
}
