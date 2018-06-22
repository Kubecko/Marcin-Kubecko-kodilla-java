package com.kodilla.good.patterns.Flights;

public class ClientAskRetriever {

    public ObjectClientAirport retrieve(){
        Client client = new Client("Martin", "MKubecko@gmail.com");
        Airport airport = new Airport("Warsaw","Canada");
        return new ObjectClientAirport(client,airport);
    }
}
