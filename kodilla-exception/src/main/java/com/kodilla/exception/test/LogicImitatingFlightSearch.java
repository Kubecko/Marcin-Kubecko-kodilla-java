package com.kodilla.exception.test;

import java.util.HashMap;

public class LogicImitatingFlightSearch {
    public Boolean findFilght(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> airportName = new HashMap<>();
        airportName.put("Katowice",true);
        airportName.put("Warsaw", false);
        if( ! airportName.get(flight.getDepartureAirport())){
            throw new RouteNotFoundException();
        }
            return airportName.get(flight.getDepartureAirport());
        }
    }
