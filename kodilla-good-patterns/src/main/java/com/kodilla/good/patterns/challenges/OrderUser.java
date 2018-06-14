package com.kodilla.good.patterns.challenges;

public class OrderUser {

    public OrderRequest retrieve() {

        UserAllegro userAllegro = new UserAllegro("Marcin", "MKubecko@gmail.com");

        ProductWithAllegro productWithAllegro = new ProductWithAllegro("Washer", 7);

        return new OrderRequest(userAllegro, productWithAllegro);
    }
}
