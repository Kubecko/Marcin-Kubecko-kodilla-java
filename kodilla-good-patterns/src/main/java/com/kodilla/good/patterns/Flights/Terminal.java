package com.kodilla.good.patterns.Flights;

public class Terminal implements SendMessage{
    @Override
    public void sendMessage(Client client) {
        System.out.println("The selected flight is possible " + client.getEmail());
    }

    @Override
    public void sendNotMessage(Client client) {
        System.out.println("The selected flight is not possible " + client.getEmail());

    }
}
