package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;

public class DoubleCakeDecorator extends AbstractPizzaOrderDecorator{
    protected DoubleCakeDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCosts() {
        return super.getCosts().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                " with double cake";
    }
}
