package com.kodilla.good.patterns.Food2Door;

public class ProducentRetrieve {

    public ProducerRequest retrievePr (){

        Producer producer = new Producer("HealthyShop");
        ProductProducer productProducer = new ProductProducer("Swanson",5);

        return new ProducerRequest(producer, productProducer);
    }
}
