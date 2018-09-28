package com.kodilla.patterns2.decorator.taxiportal.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = theOrder.getCosts();
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza", description);
    }

    @Test
    public void testPizzaDoubleCakeCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCakeDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCosts();
        //Then
        assertEquals( new BigDecimal(18), theCost);
    }

    @Test
    public void testPizzaDoubleCakeDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCakeDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza with double cake", description);
    }

    @Test
    public void testPizzaFullOptionsCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleSizeDecorator(theOrder);
        theOrder = new DoubleCakeDecorator(theOrder);
        theOrder = new VegetableRainbow(theOrder);
        theOrder = new HomeDeliveryInOurCityDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCosts();
        System.out.println(theCost);
        //Then
        assertEquals(new BigDecimal(39), theCost);
    }

    @Test
    public void testPizzaFullOptionsDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleSizeDecorator(theOrder);
        theOrder = new DoubleCakeDecorator(theOrder);
        theOrder = new VegetableRainbow(theOrder);
        theOrder = new HomeDeliveryInOurCityDecorator(theOrder);

        //When
        String description = theOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Basic pizza on a double size with double cake " +
                "+ Vegetables rainbow and home delivery in our city", description);
    }
}
