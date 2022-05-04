package com.company.service;

import com.company.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner input = new Scanner(System.in);
    public final ArrayList<Product> productList = new ArrayList<>();

    public ProductService() {
        productList.add(new Product(1, "Áo LV", 1200000));
        productList.add(new Product(2, "Quần Jean", 250000));
    }

    @Override
    public List<Product> getProducts() {
        return productList;
    }

    public boolean isThereAnyProductsOnTheList(Product product) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products == product) return true;
            }
        }
        return false;
    }

    @Override
    public boolean isIdInProductList(int id) {
        if (!productList.isEmpty()) {
            for (Product product : productList) {
                if (product.getId() == id) return true;
            }
        }
        return false;
    }

    @Override
    public boolean isNameAProductList(String name) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products.getName().equalsIgnoreCase(name)) return true;
            }
        }
        return false;
    }

    @Override
    public void addProduct(Product newProduct) {
        productList.add(newProduct);
    }

    @Override
    public void setProductListWithId() {
//        if (productList.isEmpty()) {
//            System.out.println("Không có sản phẩm nào trong danh sách!");
//            return;
//        }
        Scanner input = new Scanner(System.in);
        System.out.println("Sản phẩm cần chỉnh sửa: ");
        int id = input.nextInt();
        if (!isIdInProductList(id)) {
            System.out.println("Không có sản phẩm  trong danh sách!");
            return;
        }
            for (Product product : productList) {
                if (product.getId() == id) {

                }
            }
    }


    @Override
    public void findByName() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sản phẩm cần tìm là : ");
        String name = sc.nextLine().toLowerCase();

        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(name)) {
                System.out.println(product);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Sản phẩm này không có trong danh sách");
        }

    }

    @Override
    public void deleteProductInProductWithId() {

    }

    @Override
    public void displayProduct() {

    }
}
