package com.company;

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product Váy = new Product(1,"Váy hoa", 5500000);
        Product Áo = new Product( 2, "Áo thun nam",10000000);
        Product Đầm = new Product( 3, "Đầm trơn nữ", 7000000);
        productManager.productList.add(Váy);
        productManager.productList.add(Áo);
        productManager.productList.add(Đầm);
        productManager.menuManager();
    }
    }

