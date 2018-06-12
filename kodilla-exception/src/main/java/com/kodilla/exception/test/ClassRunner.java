package com.kodilla.exception.test;

public class ClassRunner {
    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight1 = new Flight("Katowice", "Brazil");
        LogicImitatingFlightSearch search = new LogicImitatingFlightSearch();
        try {
            Boolean resSearch = search.findFilght(flight1);
            System.out.println(resSearch);
        } catch (RouteNotFoundException e){
            System.out.println("Problem");
        }
    }
}
