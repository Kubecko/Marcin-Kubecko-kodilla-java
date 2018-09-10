package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KodillaMentorTestSuit {
    @Test
    public void testMentorTask() {
        //Given
        TaskQueue martin = new Martin();
        TaskQueue andre = new Andre();
        Mentor paweł = new Mentor("Paweł Pluta");
        Mentor kowalski = new Mentor("Jan Kowalski");
        martin.registerObserverTask(paweł);
        andre.registerObserverTask(kowalski);
        martin.registerObserverTask(kowalski);
        //When
        martin.addTask("Introduction to software testing");
        martin.addTask("Stream or functional iteration");
        andre.addTask("Project patterns");
        andre.addTask("Extension of the application with views");
        andre.addTask("Database JDBC");
        //Then
        assertEquals(2,paweł.getUpdateCount());
        assertEquals(5,kowalski.getUpdateCount());
    }
}
