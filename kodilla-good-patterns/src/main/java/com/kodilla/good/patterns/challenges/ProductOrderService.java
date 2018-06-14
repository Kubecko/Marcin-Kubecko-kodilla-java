package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        OrderUser orderUser = new OrderUser();
        OrderRequest orderRequest = orderUser.retrieve();

        ProcessorToSell processorToSell = new ProcessorToSell(new SendMessageEmail());
        processorToSell.process(orderRequest);
    }
}
