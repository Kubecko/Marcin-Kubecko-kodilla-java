package com.kodilla.good.patterns.Flights;

public class ProcessToFly {
    private Terminal sendMessage;

    public ProcessToFly(Terminal sendMessage) {
        this.sendMessage = sendMessage;
    }

    public void process(ObjectClientAirport objectClientAirport) {
        ListFlights listFlights = new ListFlights();
        final String nameFly = listFlights.find(objectClientAirport.getAirport().getDeparture());
        if (nameFly != null) {
            System.out.println(objectClientAirport.getAirport().getDeparture());
            boolean fly = listFlights.process(objectClientAirport.getAirport());
            if (fly) {
                sendMessage.sendMessage(objectClientAirport.getClient());
            } else {
                sendMessage.sendNotMessage(objectClientAirport.getClient());
            }
        }else {
            System.out.println("No proper store");
        }
    }
}