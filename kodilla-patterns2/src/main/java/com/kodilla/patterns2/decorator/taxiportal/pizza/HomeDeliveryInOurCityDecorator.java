package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;

public class HomeDeliveryInOurCityDecorator extends AbstractPizzaOrderDecorator {
    public HomeDeliveryInOurCityDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCosts() {
        return super.getCosts().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and home delivery in our city";
    }
}
