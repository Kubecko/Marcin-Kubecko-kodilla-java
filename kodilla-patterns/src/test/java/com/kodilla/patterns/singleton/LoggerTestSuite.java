package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger = new Logger();
    @BeforeClass
    public static void testMethogLog(){
        logger = new Logger();
        logger.log("logging of performed operations");
    }

    @Test
    public void getLastLog(){
        //Given
        //When
        String nameLog = logger.getLastLog();
        // Then
        Assert.assertEquals("logging of performed operations",nameLog);
    }
}
