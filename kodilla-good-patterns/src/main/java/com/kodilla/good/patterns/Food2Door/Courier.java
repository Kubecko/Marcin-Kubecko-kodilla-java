package com.kodilla.good.patterns.Food2Door;

public class Courier implements SendMessage{
    @Override
    public void sendMessage(Client client) {
        System.out.println("The package will be delivered " + client.getEmail());
    }

    @Override
    public void messageNotSend(Client client) {
        System.out.println("The package will not be delivered " + client.getEmail());
    }

    @Override
    public void messProducerSend(Producer producer) {
        System.out.println("We have this Producer " + producer.getNameProducer());
    }

    @Override
    public void messProducerNotSend(Producer producer) {
        System.out.println("We don't have this Producer " + producer.getNameProducer());
    }
}
