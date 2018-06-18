package com.kodilla.good.patterns.challenges;

public class ProcessorToSell {

    private SendMessage sendMessage;

    public ProcessorToSell(final SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    public void process(final OrderRequest orderRequest) {
        ShopRetriever shopRetriever = new ShopRetriever();
        final OrderService orderService = shopRetriever.find(orderRequest.getProductWithAllegro().getProductName());

        if (orderService != null) {
            boolean order = orderService.order(orderRequest.getProductWithAllegro());
            if (order) {
                sendMessage.sendMessage(orderRequest.getUserAllegro());
                orderService.order(orderRequest.getProductWithAllegro());
            } else {
                sendMessage.sendNotMessage(orderRequest.getUserAllegro());
            }
        } else System.out.println("No proper store.");
    }
}
