package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;

public final class World{
    private final HashSet<Continent> world = new HashSet<>();


    public void addContinent(Continent worlds){
        world.add(worlds);
    }


    public BigDecimal getPeopleQuantity(){
        return world.stream()
                .flatMap(countr -> countr.getConti().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current)-> sum = sum.add(current));
    }

}
