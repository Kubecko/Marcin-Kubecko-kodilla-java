package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ShopRetriever {
    private static Map<String, Process> shops = new HashMap<>();
    static {
        shops.put("Omlette", new ExtraFoodShop());
        shops.put("Chicken", new ExtraFoodShop());
        shops.put("Turkey", new ExtraFoodShop());
        shops.put("Swanson", new HealthyShop());
        shops.put("Omega 3", new HealthyShop());
        shops.put("B-right", new HealthyShop());
        shops.put("Bread", new GlutenFreeShop());
        shops.put("Roll", new GlutenFreeShop());
        shops.put("Cereals", new GlutenFreeShop());
    }
    public Process find(String product){
        if(shops.containsKey(product)) {
            return shops.get(product);
        }
        return null;
    }
}
