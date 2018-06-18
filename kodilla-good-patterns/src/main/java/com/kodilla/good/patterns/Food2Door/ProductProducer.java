package com.kodilla.good.patterns.Food2Door;

public final class ProductProducer {
    private final String nameProduct;
    private final int quantityProdProducent;

    public ProductProducer(final String nameProduct, final int quantityProdProducent) {
        this.nameProduct = nameProduct;
        this.quantityProdProducent = quantityProdProducent;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getQuantityProdProducent() {
        return quantityProdProducent;
    }
}
