package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class AGDOrderService implements OrderService{

    private static Map<String, Integer> products = new HashMap<>();
    static {
        products.put("Fridge", 3);
        products.put("Washer", 8);
    }

    @Override
    public boolean order(ProductWithAllegro productWithAllegro) {
        if(products.containsKey(productWithAllegro.getProductName())){
            final Integer quantity = products.get(productWithAllegro.getProductName());
            if(quantity > productWithAllegro.getProductQuantity()){
                return true;
            }
        }
        return false;
    }
}
