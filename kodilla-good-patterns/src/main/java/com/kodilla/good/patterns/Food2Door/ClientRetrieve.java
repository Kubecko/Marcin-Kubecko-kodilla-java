package com.kodilla.good.patterns.Food2Door;

public class ClientRetrieve {

    public OrderRequest retrieve (){

        Client client = new Client("Marcin", "MKubecko@gmail.com");
        Product product = new Product("Creatina4", 2);

        return new OrderRequest(client, product);
    }
}
