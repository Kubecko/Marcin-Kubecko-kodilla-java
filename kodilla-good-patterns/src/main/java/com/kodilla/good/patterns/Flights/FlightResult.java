package com.kodilla.good.patterns.Flights;

public class FlightResult {
    public static void main(String[] args) {
        ListFlights listFlights = new ListFlights();
        System.out.println(listFlights.findFrom("Barcelona")+"\n");

        System.out.println(listFlights.findTo("Canada")+ "\n");

        System.out.println(listFlights.findFlyBeetwen("Barcelona","Warsaw"));
    }
}
