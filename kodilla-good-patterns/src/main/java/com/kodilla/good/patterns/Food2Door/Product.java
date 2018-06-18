package com.kodilla.good.patterns.Food2Door;

public final class Product {
    private final String productName;
    private final int quantity;

    public Product(final String productName, final int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
