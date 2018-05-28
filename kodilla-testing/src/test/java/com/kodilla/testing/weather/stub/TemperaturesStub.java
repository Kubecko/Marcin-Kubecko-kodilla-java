package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {
    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<>();

        stubResult.put(0, 0.8);
        stubResult.put(1, 2.5);
        stubResult.put(2, 1.5);
        stubResult.put(3, 1.75);
        stubResult.put(4, 2.8);

        return stubResult;
    }
}
