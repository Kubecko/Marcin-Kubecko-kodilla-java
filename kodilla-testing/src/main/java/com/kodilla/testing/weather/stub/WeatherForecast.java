package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public HashMap<Integer, Double> calculateForecast(){
        HashMap<Integer, Double> resultMap = new HashMap<Integer, Double>();


        // adding 1 celsius degree to current value
        // as a temporary weather forecast
        for(Map.Entry<Integer, Double> temperature : temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(),temperature.getValue());

        }return resultMap;
    }
}
