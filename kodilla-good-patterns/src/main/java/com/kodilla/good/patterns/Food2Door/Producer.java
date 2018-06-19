package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class Producer {
    private String nameProduct;
    private int productQuantity;
    private static Map<String, Integer> listProducts = new HashMap<>();

    public Producer(String nameProduct, int productQuantity) {
        this.nameProduct = nameProduct;
        this.productQuantity = productQuantity;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public static Map<String, Integer> getListProducts() {
        return listProducts;
    }
}
