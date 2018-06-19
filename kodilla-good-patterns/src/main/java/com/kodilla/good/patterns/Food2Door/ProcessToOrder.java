package com.kodilla.good.patterns.Food2Door;

import static com.kodilla.good.patterns.Food2Door.ShopRetriever.*;

public class ProcessToOrder {
    private Courier sendMessage;

    public ProcessToOrder(Courier sendMessage) { this.sendMessage = sendMessage; }

    public void process(final OrderRequest orderRequest) {

        ShopRetriever shopRetriever = new ShopRetriever();
        final Process processShop = shopRetriever.find(orderRequest.getProductOrder().getProductName());

        if (processShop != null) {
            System.out.println(orderRequest.getProductOrder().getProductName());
            boolean order = processShop.process(orderRequest.getProductOrder());
            if (order) {

                sendMessage.sendMessage(orderRequest.getClientCustomers());
            } else {
                sendMessage.messageNotSend(orderRequest.getClientCustomers());
            }
        } else {
            System.out.println(orderRequest.getProductOrder().getProductName());
            addProducer("Some Product", new ExtraFoodShop());
        }
    }
}