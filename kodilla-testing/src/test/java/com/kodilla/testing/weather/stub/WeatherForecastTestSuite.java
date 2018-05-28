package com.kodilla.testing.weather.stub;
import org.junit.*;


import org.junit.Test;

public class WeatherForecastTestSuite {

    @Test
    public void WeatherForecastWithStub() {
        //Given
            Temperatures temperatures = new TemperaturesStub();
            WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //Then
            int quantityOfSensors = weatherForecast.calculateForecast().size();

        //When
            Assert.assertEquals(5, quantityOfSensors);
    }
}
