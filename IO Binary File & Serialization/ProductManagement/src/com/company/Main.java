package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Product> products = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        System.out.println("chọn chức năng: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        switch (number) {
            case 1:
                add();
            case 2:
                show();
            case 3:
                searchName();
            default:
                System.out.println("Nhập không đúng");

        }
        List<Product> productDataFromFile = readDataFromFile("product.txt");
        for (Product product : productDataFromFile) {
            System.out.println(product);
        }

    }

    public static void menu() {
        System.out.println("1. thêm sản phẩm");
        System.out.println("2. hiển thị sản phẩm");
        System.out.println("3. tìm kiếm sản phẩm");

    }

    public static void add() {
        System.out.println("Nhập mã sản phẩm: ");
        int code = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String brand = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm: ");
        String description = scanner.nextLine();
        products.add(new Product(code, name, brand, price, description));
        writeToObject("product.txt", products);
    }

    public static void show() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public static void searchName() {
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    public static void writeToObject(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}
