package com.company.model;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    static Scanner input = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("Quản lý sản phẩm ");
        System.out.println("1. Thêm sản phẩm ");
        System.out.println("2. Chỉnh sửa Id sản phẩm ");
        System.out.println("3. Tìm tên sản phẩm ");
        System.out.println("4. Xóa Id sản phẩm ");
        System.out.println("5. Hiển thị danh sách sản phẩm ");
        System.out.println("0. Thoát");
        System.out.println("------------------------");
        System.out.println("Chọn : ");
    }

    private final ArrayList<Product> productList = new ArrayList<>();

    public ProductManager() {

        productList.add(new Product(1, "Áo LV", 1200000));
        productList.add(new Product(2, "Quần Jean", 250000));
    }


    public void renderProduct() {
        System.out.printf("%-20s %-20s %-20s %-20s \n", "ID", "Product", "Price");
        System.out.println("------------------------------------------------------------------------------");
        for (Product product : productList) {
            System.out.printf("%-20s %-20s %-20s %-20s \n", product.getId(), product.getName(), product.getPrice() + "đ");
        }
        System.out.println();
    }

    public void addProduct() {
        String name;
        int id;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.println("Tên sản phẩm: ");
        name = input.nextLine();
        System.out.println("Id sản phẩm: ");
        id = input.nextInt();
        System.out.println("Giá sản phẩm: ");
        price = input.nextDouble();
        Product newProduct = new Product(id, name, price);
        productList.add(newProduct);
    }

    public void setProductListWithId() {
        if (productList.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong danh sách!");
        } else {
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Sản phẩm cần chỉnh sửa: ");
        int id = input.nextInt();
    }

    public void findByName() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sản phẩm cần tìm là : ");
        String name = sc.nextLine().toLowerCase();
    }

    public void deleteProductInProductWithId() {
        if (productList.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong danh sách! ");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.println("Id sản phẩm cần xóa: ");
            int id = input.nextInt();
        }
    }

}
