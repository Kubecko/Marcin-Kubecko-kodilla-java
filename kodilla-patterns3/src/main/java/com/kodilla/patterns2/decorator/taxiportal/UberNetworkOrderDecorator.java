package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class UberNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    protected UberNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        //hardcode stub cost - 20
        return super.getCost().add(new BigDecimal(20));
    }

    @Override
    public String getDesctription() {
        return super.getDesctription() + " by Uber Network";
    }
}
