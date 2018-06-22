package com.kodilla.good.patterns.Flights;

import java.util.HashMap;
import java.util.Map;

public class ListFlights implements Process{

        public static Map<String, String> listFlights = new HashMap<>();
        static {
            listFlights.put("Barcelona", "Katowice");
            listFlights.put("Chicago", "Katowice");
            listFlights.put("New York", "Krakow");
            listFlights.put("Rome", "Katowice");
            listFlights.put("Katowice", "Brazil");
            listFlights.put("San Francisco", "Krakow");
            listFlights.put("Florida", "Krakow");
            listFlights.put("Canada", "Warsaw");
            listFlights.put("Warsaw", "Krakow");
            listFlights.put("Krakow", "Katowice");
    }

    public String find (String fly){
        if(listFlights.containsKey(fly)){
            return listFlights.get(fly);
        }
        return null;
    }

    @Override
    public boolean process(Airport airport) {
            if(listFlights.containsKey(airport.getDeparture())){
                listFlights.get(airport.getDeparture());
                return true;
            }
        return false;
    }
}

