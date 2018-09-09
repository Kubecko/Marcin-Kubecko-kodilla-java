package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;

public class VegetableRainbow extends AbstractPizzaOrderDecorator {
    protected VegetableRainbow(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCosts() {
        return super.getCosts().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Vegetables rainbow";
    }
}
