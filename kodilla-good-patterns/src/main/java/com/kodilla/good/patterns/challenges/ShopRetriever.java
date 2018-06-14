package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class ShopRetriever {

    private static Map<String, OrderService> shops = new HashMap<>();

    static {
        shops.put("Fridge", new AGDOrderService());
        shops.put("Washer", new AGDOrderService());
        shops.put("TV", new RTVOrderService());
        shops.put("Netbook", new RTVOrderService());
    }

    public OrderService find(String product) {
        if (shops.containsKey(product)) {
            return shops.get(product);
        }
        return null;
    }
}
