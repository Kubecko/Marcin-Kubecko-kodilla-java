package com.kodilla.good.patterns.challenges;

public final class ProductWithAllegro {
    private final String productName;
    private final int productQuantity;

    public ProductWithAllegro(String productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
