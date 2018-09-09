package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost(){
        //Given
        BasicTaxiOrder basicTaxiOrder = new BasicTaxiOrder();
        //When
        BigDecimal calculateCost =basicTaxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(5.00), calculateCost);

    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        BasicTaxiOrder basicTaxiOrder = new BasicTaxiOrder();
        //When
        String description = basicTaxiOrder.getDesctription();
        //Then
        assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //Then
        BigDecimal theCoast = theOrder.getCost();
        //When
        assertEquals(new BigDecimal(40), theCoast);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //When
        String description = theOrder.getDesctription();
        //Then
        assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(39),theCost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        String desctription = theOrder.getDesctription();
        //Then
        assertEquals("Drive a course by MyTaxi Network + child seat + child seat",desctription);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(57),theCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        System.out.println(theOrder.getDesctription());
        //When
        String description = theOrder.getDesctription();
        //Then
        assertEquals("Drive a course by Taxi Network " +
                "express service + child seat variant VIP",description);
    }
}
