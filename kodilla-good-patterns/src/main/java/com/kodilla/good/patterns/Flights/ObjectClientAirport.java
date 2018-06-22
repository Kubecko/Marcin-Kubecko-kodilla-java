package com.kodilla.good.patterns.Flights;

public class ObjectClientAirport {
    private final Client client;
    private final Airport airport;

    public ObjectClientAirport(Client client, Airport airport) {
        this.client = client;
        this.airport = airport;
    }

    public Client getClient() {
        return client;
    }

    public Airport getAirport() {
        return airport;
    }
}
