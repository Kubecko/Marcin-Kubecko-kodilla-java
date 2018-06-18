package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Process{
    private static Map<String, Integer> productGlutenFreeShop = new HashMap<>();
    static {
        productGlutenFreeShop.put("Bread", 8);
        productGlutenFreeShop.put("Roll", 16);
        productGlutenFreeShop.put("Cereals", 10);
    }

    @Override
    public boolean process(Product product) {
        if(productGlutenFreeShop.containsKey(product.getProductName())){
            final Integer quantity = productGlutenFreeShop.get(product.getProductName());
            if(quantity > product.getQuantity()){
                return true;
            }
        }
        return false;
    }
}
