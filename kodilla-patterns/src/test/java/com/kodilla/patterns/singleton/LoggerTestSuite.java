package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void testMethogLog(){
        Logger.getInstance().log("logging of performed operations");
    }

    @Test
    public void getLastLog(){
        //Given
        //When
        String nameLog = Logger.getInstance().getLastLog();
        // Then
        Assert.assertEquals("logging of performed operations",nameLog);
    }
}
