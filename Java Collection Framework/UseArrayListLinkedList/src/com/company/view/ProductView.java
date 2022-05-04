package com.company.view;

import com.company.model.Product;
import com.company.service.ProductService;

import java.util.Scanner;

public class ProductView {
    ProductService productService = new ProductService();
    static Scanner input = new Scanner(System.in);
    public void run() {
        int choice;
        do {
            Menu.showMenu();
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                   addProduct();
                    break;
                case 2:
                    setProductListWithId();
                    break;
                case 3:
                    findByName();
                    break;
                case 4:
                    deleteProductInProductWithId();
                    break;
                case 5:
                    displayProduct();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Xin mời chọn lại: ");
            }
        }while (true);




    }

    private void displayProduct() {
        if (productService.productList.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong danh sách");
        } else {
            int i = 1;
            for (Product product : productService.productList) {
                System.out.println(i + ". " + product.toString());
                i++;
            }
        }
    }

    private void deleteProductInProductWithId() {
        if (productService.productList.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong danh sách! ");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.println("Id sản phẩm cần xóa: ");
            int id = input.nextInt();
            if (productService.isIdInProductList(id)) {
                for (Product product : productService.productList) {
                    if (product.getId() == id) {
                        System.out.println("Sản phẩm cần xóa là: " + product.toString());
                        productService.productList.remove(id);
                    }
                }
            } else {
                System.out.println("Id không có trong danh sách sản phẩm");
            }
        }
    }

    public void findByName() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sản phẩm cần tìm là : ");
        String name = sc.nextLine().toLowerCase();

        for (Product product : productService.productList) {
            if (product.getName().toLowerCase().contains(name)) {
                System.out.println(product);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Sản phẩm này không có trong danh sách");
        }


    }
    private void setProductListWithId() {
        if (productService.productList.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong danh sách!");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.println("Sản phẩm cần chỉnh sửa: ");
            int id = input.nextInt();

            if (productService.isIdInProductList(id)) {
                for (Product product : productService.productList) {
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
                                case '1':
                                    System.out.print("Tên sản phẩm mới: ");
                                    String newName = sc.nextLine();
                                    product.setName(newName);
                                    break;
                                case '2':
                                    System.out.print("Id mới: ");
                                    int newID = sc.nextInt();
                                    product.setId(newID);
                                    break;
                                case '3':
                                    System.out.println("Giá mới : ");
                                    int newPrice = sc.nextInt();
                                    product.setPrice(newPrice);
                                    break;
                                case '0':
                                    Menu.showMenu();
                                    break;
                            }
                        } while (choice != 0);
                    }
                }
            }
        }
    }


    private void addProduct() {
        String name;
        int id;
        double price;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Tên sản phẩm: ");
            name = input.nextLine();
            if (productService.isNameAProductList(name))
                System.out.println("Sản phẩm này đã có trong danh sách sản phẩm!");
        } while (productService.isNameAProductList(name));

        do {
            System.out.println("Id sản phẩm: ");
            id = input.nextInt();
            if (productService.isIdInProductList(id)) {
                System.out.println("Id đã có trong danh sách sản phẩm!");
            }
        } while (productService.isIdInProductList(id));

        System.out.println("Giá sản phẩm: ");
        price = input.nextDouble();
        Product newProduct = new Product(id, name, price);
        productService.addProduct(newProduct);
        System.out.println("Thanh cong");
    }
}
