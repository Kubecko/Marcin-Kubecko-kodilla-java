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
        painting.executeTask();
        //Then
        Assert.assertEquals("Pictures",painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }
    @Test
    public void testFactoryShoopingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shopping.executeTask();
        //Then
        Assert.assertEquals("Opportunity",shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }
    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);
        driving.executeTask();
        //Then
        Assert.assertEquals("Win the race", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }
}
