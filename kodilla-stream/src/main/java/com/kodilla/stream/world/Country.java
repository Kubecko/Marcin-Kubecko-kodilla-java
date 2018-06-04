package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String nameCountry;
    private final BigDecimal peopleCountryOfQuantity;


    public Country(String nameCountry, BigDecimal peopleCountryOfQuantity) {
        this.nameCountry = nameCountry;
        this.peopleCountryOfQuantity = peopleCountryOfQuantity;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public BigDecimal getPeopleCountryOfQuantity() {
        return peopleCountryOfQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                '}';
    }
    public final BigDecimal getPeopleQuantity(){
        return peopleCountryOfQuantity;
    }
}
