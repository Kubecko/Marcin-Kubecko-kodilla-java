package com.kodilla.good.patterns.Flights;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.*;

import static java.util.stream.Collectors.toSet;

public class ListFlights {

    private static Set<Flights> listFlights = new HashSet<>();

    static {
        listFlights.add(new Flights("Barcelona", "Canada"));
        listFlights.add(new Flights("Chicago", "Katowice"));
        listFlights.add(new Flights("New York", "Krakow"));
        listFlights.add(new Flights("Rome", "Canada"));
        listFlights.add(new Flights("Barcelona", "Brazil"));
        listFlights.add(new Flights("San Francisco", "Canada"));
        listFlights.add(new Flights("Barcelona", "Krakow"));
        listFlights.add(new Flights("Canada", "Warsaw"));
        listFlights.add(new Flights("Warsaw", "Canada"));
        listFlights.add(new Flights("Krakow", "Warsaw"));
    }

    public Set<Flights> findFrom(String fly) {
        return listFlights.stream()
                .filter(flys -> flys.getDeparture().equals(fly))
                .collect(toSet());
    }

    public Set<Flights> findTo(String fly) {
        return listFlights.stream()
                .filter(flys -> flys.getArrival().equals(fly))
                .collect(toSet());
    }

    public void findFlyBeetwen(String flyDepart, String flyArr) {
        Set<Flights> depart = listFlights.stream()
                .filter(fly -> fly.getDeparture().equals(flyDepart))
                .collect(toSet());
        Set<Flights> arrival = listFlights.stream()
                .filter(fly -> fly.getArrival().equals(flyArr))
                .collect(toSet());

        for (Flights result : depart) {
            for(Flights resultOne : arrival){
                if(result.getArrival().equals(resultOne.getDeparture())) {
                    System.out.println(resultOne);
                    System.out.println(result);
               }
            }
        }
    }
}




