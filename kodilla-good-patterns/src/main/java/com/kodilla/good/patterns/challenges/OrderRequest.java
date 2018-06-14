package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private UserAllegro userAllegro;
    private ProductWithAllegro productWithAllegro;

    public OrderRequest(UserAllegro userAllegro, ProductWithAllegro productWithAllegro) {
        this.userAllegro = userAllegro;
        this.productWithAllegro = productWithAllegro;
    }

    public UserAllegro getUserAllegro() {
        return userAllegro;
    }

    public ProductWithAllegro getProductWithAllegro() {
        return productWithAllegro;
    }
}
