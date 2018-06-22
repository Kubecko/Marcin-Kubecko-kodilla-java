package com.kodilla.good.patterns.Flights;

import java.util.Objects;

public class Airport {
    private final String departure;
    private final String arrival;

    public Airport(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(departure, airport.departure) &&
                Objects.equals(arrival, airport.arrival);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departure, arrival);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
