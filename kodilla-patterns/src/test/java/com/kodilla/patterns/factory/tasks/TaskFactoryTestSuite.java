package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryPaitingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Pictures Blue Niagara",painting.executeTask());
        Assert.assertEquals("Pictures",painting.getTaskName());
    }
    @Test
    public void testFactoryShoopingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Opportunity Buy dress 3.0", shopping.executeTask());
        Assert.assertEquals("Opportunity",shopping.getTaskName());
    }
    @Test
    public void testFactoryDrivingTest(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Win the race Track Argentyna using my car",driving.executeTask());
        Assert.assertEquals("Win the race", driving.getTaskName());
    }
}
