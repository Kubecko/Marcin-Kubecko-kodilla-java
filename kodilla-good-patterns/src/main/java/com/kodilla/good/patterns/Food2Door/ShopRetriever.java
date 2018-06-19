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
        shops.put("Coconut", new SupleShop());
        shops.put("Ostrovit", new SupleShop());
        shops.put("Creatina", new SupleShop());
        System.out.println(shops.size());
    }


    public Process find(String product) {
        if (shops.containsKey(product)) {
            return shops.get(product);
        }
        return null;
    }
    public static void addProducer(String key, Process value){
        shops.put(key,value);
        System.out.println(shops.size());
    }
}