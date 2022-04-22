package com.company;

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product nokia = new Product(1,"Váy hoa", 5500000);
        Product iphone = new Product( 2, "Áo thun nam",10000000);
        Product samsung = new Product( 3, "Đầm trơn nữ", 7000000);
        productManager.productList.add();
        productManager.productList.add();
        productManager.productList.add();
        productManager.menuManager();
    }
    }

