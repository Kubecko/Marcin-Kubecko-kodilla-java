package com.kodilla.good.patterns.Food2Door;

public interface SendMessage {
    void sendMessage(Client client);

    void messageNotSend(Client client);

    void messProducerSend(Producer producer);

    void messProducerNotSend(Producer producer);
}
