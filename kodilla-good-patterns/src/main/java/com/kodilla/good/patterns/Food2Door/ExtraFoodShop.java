package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Process {
    private static Map<String, Integer> productExtraFoodShop = new HashMap<>();
    static {
        productExtraFoodShop.put("Omlette", 10);
        productExtraFoodShop.put("Chicken", 15);
        productExtraFoodShop.put("Turkey", 7);
    }

    @Override
    public boolean process(Product product) {
        if(productExtraFoodShop.containsKey(product.getProductName())){
            final Integer quantity = productExtraFoodShop.get(product.getProductName());
            if(quantity > product.getQuantity()){
                return true;
            }
        }
        return false;
    }
}
