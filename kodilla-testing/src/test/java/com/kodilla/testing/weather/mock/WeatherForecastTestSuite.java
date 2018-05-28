package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {

    @Test
    public void TestWeatherForecastWitchMock() {
        //Given

        Temperatures temperaturesMock = mock(Temperatures.class);

        HashMap<Integer, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put(0, 0.8);
        temperaturesMap.put(1, 2.5);
        temperaturesMap.put(2, 1.5);
        temperaturesMap.put(3, 1.75);
        temperaturesMap.put(4, 2.8);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //Then
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //When
        Assert.assertEquals(5, quantityOfSensors);
    }
}
