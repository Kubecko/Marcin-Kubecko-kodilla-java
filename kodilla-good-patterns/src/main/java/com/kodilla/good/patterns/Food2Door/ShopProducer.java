package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ShopProducer implements ProducerProcess{
    private static List<String> listProducer = new ArrayList<>();
    static {
        listProducer.add("HealthyShop");
        listProducer.add("GlutenFreeShop");
        listProducer.add("ExtraFoodShop");
    }
    public void addProducer(String producer){
        listProducer.add(producer);
    }

    public ProducerProcess prFind (String producers) {
        if (listProducer.contains(producers)) {
            listProducer.add(producers);
        }
        return null;
    }

    @Override
    public boolean findPr(Producer producer) {
        System.out.println(producer.getNameProducer());
        System.out.println(listProducer);
        if(listProducer.contains(producer.getNameProducer())){
            return listProducer.add(producer.getNameProducer());
        }
        return false;
    }
}
