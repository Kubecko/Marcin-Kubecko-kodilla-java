package com.kodilla.good.patterns.Food2Door;

public class Food2Door {
    public static void main(String[] args) {
        ClientRetrieve clientRetrieve = new ClientRetrieve();
        OrderRequest orderRequest = clientRetrieve.retrieve();

        ProcessToOrder processToOrder = new ProcessToOrder(new Courier());
        processToOrder.process(orderRequest);
    }
}