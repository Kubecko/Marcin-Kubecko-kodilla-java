package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class TaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public TaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        //hardcode stub cost = 35
        return super.getCost().add(new BigDecimal(35));
    }

    @Override
    public String getDesctription() {
        return super.getDesctription() + " by Taxi Network";
    }
}