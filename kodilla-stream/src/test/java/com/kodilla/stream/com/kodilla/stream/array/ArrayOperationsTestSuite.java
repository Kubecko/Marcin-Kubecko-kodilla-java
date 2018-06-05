package com.kodilla.stream.com.kodilla.stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;



public class ArrayOperationsTestSuite implements ArrayOperations {
    @Test
    public void testGetAverage(){
        //Given
        int tabStream[] = new int[20];
        tabStream[0] = 1;
        tabStream[1] = 5;
        tabStream[2] = 6;
        tabStream[3] = 12;
        tabStream[4] = 32;
        tabStream[5] = 22;
        tabStream[6] = 1;
        tabStream[7] = 2;
        tabStream[8] = 1;
        tabStream[9] = 85;
        tabStream[10] = 1;
        tabStream[11] = 1;
        tabStream[12] = 75;
        tabStream[13] = 2;
        tabStream[14] = 4;
        tabStream[15] = 0;
        tabStream[16] = 3;
        tabStream[17] = 72;
        tabStream[18] = 8;
        tabStream[19] = 15;
        //When
        double averageResult = ArrayOperations.getAverage(tabStream);
        //Then
        Assert.assertEquals(17.4, averageResult,0.1);
    }
}
