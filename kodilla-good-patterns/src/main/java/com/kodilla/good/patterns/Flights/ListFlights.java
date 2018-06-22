package com.kodilla.good.patterns.Flights;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ListFlights {

    private static Set<Flights> listFlights = new HashSet<>();

    static {
        listFlights.add(new Flights("Barcelona", "Canada"));
        listFlights.add(new Flights("Chicago", "Katowice"));
        listFlights.add(new Flights("New York", "Krakow"));
        listFlights.add(new Flights("Rome", "Canada"));
        listFlights.add(new Flights("Katowice", "Brazil"));
        listFlights.add(new Flights("San Francisco", "Canada"));
        listFlights.add(new Flights("Barcelona", "Krakow"));
        listFlights.add(new Flights("Canada", "Warsaw"));
        listFlights.add(new Flights("Warsaw", "Canada"));
        listFlights.add(new Flights("Krakow", "Warsaw"));
    }

    public Set<Flights> findFrom(String fly) {
        return listFlights.stream()
                .filter(flys -> flys.getDeparture().equals(fly))
                .collect(Collectors.toSet());
    }
    public Set<Flights> findTo(String fly){
        return listFlights.stream()
                .filter(flys -> flys.getArrival().equals(fly))
                .collect(Collectors.toSet());
    }
    public Set<Flights> findFlyBeetwen (String flyDepart, String flyArr) {
        Set<Flights> depart = listFlights.stream()
                .filter(fly -> fly.getDeparture().equals(flyDepart))
                .collect(Collectors.toSet());
        Set<Flights> arrival = listFlights.stream()
                .filter(fly -> fly.getArrival().equals(flyArr))
                .collect(Collectors.toSet());
        return arrival.stream()
              .filter(fly -> fly.getArrival().equals(flyArr))
                .collect(Collectors.toSet());
    }
}



