package com.kodilla.good.patterns.Food2Door;

public final class OrderRequest {
    private final Client clientCustomers;
    private final Product productOrder;



    public OrderRequest(final Client clientCustomers, final Product productOrder) {
        this.clientCustomers = clientCustomers;
        this.productOrder = productOrder;
    }



    public Client getClientCustomers() {
        return clientCustomers;
    }

    public Product getProductOrder() {
        return productOrder;
    }
}
