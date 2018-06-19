package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class SupleShop implements Process{
    private static Map<String, Integer> supleShop = new HashMap<>();
    static{
        supleShop.put("Ostrovit", 15);
        supleShop.put("Creatina", 25);
        supleShop.put("Coconut", 8);
    }

    @Override
    public boolean process(Product product) {
        if(supleShop.containsKey(product.getProductName())) {
            final Integer quantity = supleShop.get(product.getProductName());
            if (quantity > product.getQuantity()) {
                return true;
            }
        }
        return false;
    }
}

