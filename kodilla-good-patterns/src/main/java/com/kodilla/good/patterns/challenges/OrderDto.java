package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public UserAllegro userAllegro;
    public boolean order;

    public OrderDto(final UserAllegro userAllegro, final boolean order) {
        this.userAllegro = userAllegro;
        this.order = order;
    }

    public UserAllegro getUserAllegro() {
        return userAllegro;
    }

    public boolean isOrder() {
        return order;
    }
}
