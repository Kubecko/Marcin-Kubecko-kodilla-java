package com.kodilla.exception.test;

import java.util.HashMap;

public class ClassRunner {
    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight1 = new Flight("Katowice", "Brazil");
        LogicImitatingFlightSearch search = new LogicImitatingFlightSearch();
        try {
            search.findFilght(flight1);
        } catch (RouteNotFoundException e){
            System.out.println("Problem");
        }
    }
}
