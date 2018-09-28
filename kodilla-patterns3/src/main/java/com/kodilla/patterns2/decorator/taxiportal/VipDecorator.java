package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class VipDecorator extends AbstractTaxiOrderDecorator {
    protected VipDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDesctription() {
        return super.getDesctription() + " variant VIP";
    }
}
