package com.kodilla.good.patterns.Food2Door;

public class Food2Door {
    public static void main(String[] args) {
        OrderClient orderClient = new OrderClient();
        OrderRequest orderRequest = orderClient.retrieve();

        ProducentRetrieve producentRetrieve = new ProducentRetrieve();
        ProducerRequest producerRequest = producentRetrieve.retrievePr();

        ProcessToOrder processToOrder = new ProcessToOrder(new Courier());
        processToOrder.process(orderRequest);

        ProcessToProducent processToProducent = new ProcessToProducent(new Courier());
        processToProducent.processPr(producerRequest);
    }
}