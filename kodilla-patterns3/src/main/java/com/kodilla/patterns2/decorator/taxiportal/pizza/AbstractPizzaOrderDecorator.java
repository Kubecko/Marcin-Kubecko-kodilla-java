package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;

public class AbstractPizzaOrderDecorator implements PizzaOrder {
    private final PizzaOrder pizzaOrder;

    protected  AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCosts() {
        return pizzaOrder.getCosts();
    }

    @Override
    public String getDescription() {
        return pizzaOrder.getDescription();
    }
}
