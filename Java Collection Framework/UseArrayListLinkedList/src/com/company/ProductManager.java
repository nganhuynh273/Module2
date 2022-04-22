package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    public ArrayList<Product> productList;

    public ProductManager() {
        ArrayList<Product> productList = new ArrayList<>();
        this.productList = productList;

//        productList.add(new Product(1, "Áo LV", 1200000));
//        productList.add(new Product(2, "Quần Jean", 250000));
    }
//
//    public void showListProduct(){
//        for (Product p:productList) {
//            System.out.println(p);
//        }
//    }

    public boolean isThereAnyProductsOnTheList(Product product) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products == product)
                    return true;
            }
        }
        return false;
    }

    public boolean isIdInProductList(int id) {
        if (!productList.isEmpty()) {
            for (Product product : productList) {
                if (product.getId() == id)
                    return true;
            }
        }
        return false;
    }

    public boolean isNameAProductList(String name) {
        boolean flag = false;
        for (Product product : productList) {
            if (name == product.getName()) {
                flag = true;
                break;
            }

        }
        return flag;
    }

    public void addProduct() {
        String name;
        int id;
        double price;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Tên sản phẩm: ");
            name = input.nextLine();
            if (isNameAProductList(name))
                System.out.println("Sản phẩm này đã có trong danh sách sản phẩm!");
        } while (isNameAProductList(name));

        do {
            System.out.println("Id sản phẩm: ");
            id = input.nextInt();
            if (isIdInProductList(id)) {
                System.out.println("Id đã có trong danh sách sản phẩm!");
            }
        } while (isIdInProductList(id));

        System.out.println("Giá sản phẩm: ");
        price = input.nextDouble();
        Product newProduct = new Product(id, name, price);
        productList.add(newProduct);
    }

    public void setProductListWithId() {
        if (productList.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong danh sách!");
        } else {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Id sản phẩm cần chỉnh sửa: ");
//            int id = input.nextInt();
//            if (existProduct(id)) {
//                for (Product p : productList) {
//                    if (p.getId()==id){
//
//                    }
//                }
//            }else {
//                System.out.println("ko");
//            }
            Scanner input = new Scanner(System.in);
            System.out.println("Sản phẩm cần chỉnh sửa: ");
            int id = input.nextInt();

            if (isIdInProductList(id)) {
                for (Product product : productList) {
                    if (product.getId() == id) {
                        System.out.println("Sản phẩm có Id là " + id + " : " + product);
                        char choice;

                        do {
                            System.out.println("Menu chỉnh sửa sản phẩm");
                            System.out.println("1. Chỉnh sửa tên sản phẩm");
                            System.out.println("2. Chỉnh sửa Id sản phẩm");
                            System.out.println("3. Chỉnh sửa giá sản phẩm");
                            System.out.println("0. Thoát");
                            System.out.println("--------------------");
                            Scanner sc = new Scanner(System.in);
                            choice = sc.nextLine().charAt(0);


                            switch (choice) {
                                case '1' :
                                    System.out.print("Tên sản phẩm mới: ");
                                    String newName = sc.nextLine();
                                    product.setName(newName);
                                    break;
                                case '2' :
                                    System.out.print("Id mới: ");
                                    int newID = sc.nextInt();
                                    product.setId(newID);
                                    break;
                                case '3' :
                                    System.out.println("Giá mới : ");
                                    int newPrice = sc.nextInt();
                                    product.setPrice(newPrice);
                                    break;
                                case '0' :
                                    menuManager();
                                    break;
                            }
                        } while (choice !=0);
                    }
                }
            }
        }
    }

    public void findProductInProductWithName() {
        if (productList.isEmpty()) {
            System.out.println("Sản phẩm này không có trong danh sách");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Sản phẩm cần tìm là : ");
            String name = sc.nextLine();
            if (isNameAProductList(name)) {
                for (Product product : productList) {
                    if (product.getName().equalsIgnoreCase(name)) {
                        System.out.println(product);
                    } else {
                        System.out.println("Không có");
                    }
                }
            }
        }
    }

    public void deleteProductInProductWithId() {
        if (productList.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong danh sách! ");
        }
        else {
            Scanner input = new Scanner(System.in);
            System.out.println("Id sản phẩm cần xóa: ");
            int id = input.nextInt();
            if (isIdInProductList(id)) {
                for (Product product : productList) {
                    if (product.getId() == id) {
                        System.out.println("Sản phẩm cần xóa là: " + product.toString());
                        productList.remove(id);
                    }
                }
            } else {
                System.out.println("Id không có trong danh sách sản phẩm");
            }
        }
    }

    public void displayProduct() {
        if (productList.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong danh sách" );
        } else {
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ". " + product.toString());
                i++;
            }
        }
    }


    public void menuManager() {
        char choice = '?';
        while (choice != '0') {
            System.out.println("Quản lý sản phẩm ");
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Chỉnh sửa Id sản phẩm ");
            System.out.println("3. Tìm tên sản phẩm ");
            System.out.println("4. Xóa Id sản phẩm ");
            System.out.println("5. Hiển thị danh sách sản phẩm ");
            System.out.println("0. Thoát");
            System.out.println("------------------------");
            System.out.println("Chọn : ");
            Scanner change = new Scanner(System.in);
            choice = change.nextLine().charAt(0);

            switch (choice) {
                case '1' :
                    addProduct();
                    break;
                case '2' :
                    setProductListWithId();
                    break;
                case '3' :
                    findProductInProductWithName();
                    break;
                case '4' :
                    deleteProductInProductWithId();
                    break;
                case '5' :
                    displayProduct();
                    break;
                case '0' :
                    System.exit(0);
                    break;
                default:
                    throw new IllegalStateException("Xin mời chọn lại: " + choice);
            }
        }
    }

        }


//    public boolean existProduct(int id) {
//        for (Product p : productList) {
//            if (p.getId() == id) {
//                return true;
//            }
//        }
//        return false;
//    }

