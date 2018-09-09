package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;

public class DoubleSizeDecorator extends AbstractPizzaOrderDecorator {
    protected DoubleSizeDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCosts() {
        return super.getCosts().add(new BigDecimal(6));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " on a double size";
    }
}
