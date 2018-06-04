package com.kodilla.stream.world;
import java.util.HashSet;

public final class Continent{
        private final String nameContinent;
        private final HashSet<Country> conti = new HashSet<>();

    public Continent(String nameContinent) {
        this.nameContinent = nameContinent;
    }
    public void addCountry(Country country){
        conti.add(country);
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public HashSet<Country> getConti() {
        return conti;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "nameContinent='" + nameContinent + '\'' +
                '}';
    }

}
