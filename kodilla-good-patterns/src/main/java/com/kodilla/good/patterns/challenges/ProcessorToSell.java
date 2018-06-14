package com.kodilla.good.patterns.challenges;

public class ProcessorToSell {
    private OrderService orderService;
    private SendMessage sendMessage;

    public ProcessorToSell(final OrderService orderService, final SendMessage sendMessage) {
        this.orderService = orderService;
        this.sendMessage = sendMessage;
    }
    public OrderDto process(final OrderRequest orderRequest){
        boolean order = orderService.order(orderRequest.getProductWithAllegro());
        if(order) {
            sendMessage.sendMessage(orderRequest.getUserAllegro());
            orderService.order(orderRequest.getProductWithAllegro());
            return new OrderDto(orderRequest.getUserAllegro(),true);
        } else {
            sendMessage.sendNotMessage(orderRequest.getUserAllegro());
            return new OrderDto(orderRequest.getUserAllegro(), false);
        }
    }
}
