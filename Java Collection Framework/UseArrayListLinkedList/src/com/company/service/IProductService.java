package com.company.service;

import com.company.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getProducts();
   boolean isThereAnyProductsOnTheList(Product product);
    boolean isIdInProductList(int id);
    boolean isNameAProductList(String name);
    void addProduct(Product newProduct);

    void setProductListWithId();
    void findByName();
    void deleteProductInProductWithId();
    void displayProduct();
}

