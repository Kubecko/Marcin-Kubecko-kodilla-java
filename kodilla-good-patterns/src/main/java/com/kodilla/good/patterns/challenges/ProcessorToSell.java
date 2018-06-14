package com.kodilla.good.patterns.challenges;

public class ProcessorToSell {
    private OrderService orderService;
    private SendMessage sendMessage;

    public ProcessorToSell(final OrderService orderService, final SendMessage sendMessage) {
        this.orderService = orderService;
        this.sendMessage = sendMessage;
    }

    /*Czy metoda process powinna być typu void ? W tym przypadku działa mi na 2-óch sklepach, natomiast jeśli jest typu
     OrderDto, klamre w 27 linijce mi podkreśla, że metoda powinna być typu void i returny muszę usunąć jak jest teraz.*/

    public void process(final OrderRequest orderRequest) {
        ShopRetriever shopRetriever = new ShopRetriever();
        final OrderService orderService = shopRetriever.find(orderRequest.getProductWithAllegro().getProductName());

        if (orderService != null) {
            boolean order = orderService.order(orderRequest.getProductWithAllegro());
            if (order) {
                sendMessage.sendMessage(orderRequest.getUserAllegro());
                orderService.order(orderRequest.getProductWithAllegro());
                //return new OrderDto(orderRequest.getUserAllegro(), true);
            } else {
                sendMessage.sendNotMessage(orderRequest.getUserAllegro());
                //return new OrderDto(orderRequest.getUserAllegro(), false);
            }
        } else System.out.println("No proper store.");
    }
}
