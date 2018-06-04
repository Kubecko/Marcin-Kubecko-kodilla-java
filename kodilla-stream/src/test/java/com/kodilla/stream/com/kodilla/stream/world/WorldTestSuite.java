package com.kodilla.stream.com.kodilla.stream.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void CountryTest(){
        //Given
        List<Country> country = new ArrayList<>();
        country.add(new Country("Poland",new BigDecimal("38000000")));
        country.add(new Country("Germany", new BigDecimal("82000000")));
        //When
        BigDecimal expect = country.stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) ->sum = sum.add(current));
        //Then
        BigDecimal expected = new BigDecimal("120000000");
        Assert.assertEquals(expected,expect);
    }
    @Test
    public void ContinentTest(){
        //Give
        Country country1 = new Country("Poland",new BigDecimal("38000000"));
        Country country2 = new Country("Germany", new BigDecimal("82000000"));
        Country country3 = new Country("France", new BigDecimal("65000000"));
        Country country4 = new Country("Russia", new BigDecimal("144000000"));
        Country country5 = new Country("Mongolia", new BigDecimal("3100000"));
        Country country6 = new Country("China", new BigDecimal("1333000456"));

        Continent continent1 = new Continent("Europa");
        Continent continent2 = new Continent("Asia");
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent2.addCountry(country4);
        continent2.addCountry(country5);
        continent2.addCountry(country6);

        World worlds = new World();
        worlds.addContinent(continent1);
        worlds.addContinent(continent2);

        //When
        BigDecimal totality = worlds.getPeopleQuantity();
        //Then
        BigDecimal totalQuantity = new BigDecimal("1665100456");
        Assert.assertEquals(totalQuantity,totality);
    }
}
