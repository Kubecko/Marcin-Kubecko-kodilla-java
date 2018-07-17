package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WeatherForecast {
    Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public HashMap<Integer, Double> calculateForecast() {
        HashMap<Integer, Double> resultMap = new HashMap();
        Iterator var2 = this.temperatures.getTemperatures().entrySet().iterator();

        while(var2.hasNext()) {
            Map.Entry<Integer, Double> temperature = (Map.Entry)var2.next();
            resultMap.put(temperature.getKey(), temperature.getValue());
        }

        return resultMap;
    }
}
