package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Process{
    private static Map<String, Integer> productHealthyShop = new HashMap<>();
    static {
        productHealthyShop.put("Swanson", 100);
        productHealthyShop.put("Omega 3", 245);
        productHealthyShop.put("B-right", 180);
    }


    @Override
    public boolean process(Product product) {
        if(productHealthyShop.containsKey(product.getProductName())){
            final Integer quantity = productHealthyShop.get(product.getProductName());
                if(quantity > product.getQuantity()){
                    return true;
                }
        }
        return false;
    }
}
