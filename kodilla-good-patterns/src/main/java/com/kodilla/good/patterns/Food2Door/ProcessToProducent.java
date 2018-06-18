package com.kodilla.good.patterns.Food2Door;

public class ProcessToProducent {
    private Courier sendForProd;

    public ProcessToProducent(Courier sendForProd) { this.sendForProd = sendForProd; }

    public void processPr(final ProducerRequest producerRequest){
        ShopProducer shopProducer = new ShopProducer();
        final ProducerProcess prodPros = shopProducer.prFind(producerRequest.getProducer().getNameProducer());

        if(prodPros != null){
            boolean order = prodPros.findPr(producerRequest.getProducer());
            if (order){
                sendForProd.messProducerSend(producerRequest.getProducer());
                prodPros.findPr(producerRequest.getProducer());
            } else{
                sendForProd.messProducerNotSend(producerRequest.getProducer());
            }
        } else{
            System.out.println("Problems");
        }
    }
}