package com.kodilla.good.patterns.Flights;

public class Flights {
    public static void main(String[] args) {
    ClientAskRetriever clientAskRetriever = new ClientAskRetriever();
    ObjectClientAirport objectClientAirport = clientAskRetriever.retrieve();

    //ProcessToFly processToFly = new ProcessToFly(new Terminal());
    //processToFly.process(objectClientAirport);

        ListFlights.listFlights.keySet().stream()
                .filter(fly -> objectClientAirport.getAirport().getDeparture() == fly)
                .forEach(System.out::println);
    }
}
