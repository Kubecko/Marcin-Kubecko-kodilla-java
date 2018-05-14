package com.kodilla.testing.collections1;
import com.kodilla.testing.collections.OddNumberExterminator;
import org.junit.*;
import java.util.ArrayList;

public class Collections1Test {
    @Before
    public void before(){
        System.out.println("The List begin: ");
    }

    @After
    public void after(){
        System.out.println("The List end: ");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> number4 = new ArrayList<>();

        //Given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        //When
        ArrayList <Integer> result = oddNumberExterminator.exterminate(number4);
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals(number4,result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> number3 = new ArrayList<>();
        number3.add(1);
        number3.add(2);
        number3.add(3);
        number3.add(4);
        number3.add(5);
        number3.add(6);
        number3.add(7);
        number3.add(8);
        number3.add(9);
        number3.add(10);

        ArrayList<Integer> number5 = new ArrayList<>();
        number5.add(2);
        number5.add(4);
        number5.add(6);
        number5.add(8);
        number5.add(10);
        //Given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        //When
        ArrayList <Integer> result1 = oddNumberExterminator.exterminate(number3);
        System.out.println("Testing: " + result1);
        //Then
        Assert.assertEquals(number5, result1);
    }

}