package com.kodilla.good.patterns.Food2Door;

public final class ProducerRequest {
    private final Producer producer;
    private final ProductProducer productProducer;

    public ProducerRequest(Producer producer, ProductProducer productProducer) {
        this.producer = producer;
        this.productProducer = productProducer;
    }

    public Producer getProducer() {
        return producer;
    }

    public ProductProducer getProductProducer() {
        return productProducer;
    }

}
