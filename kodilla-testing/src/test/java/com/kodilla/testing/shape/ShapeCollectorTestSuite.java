package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;

import java.util.ArrayList;


public class ShapeCollectorTestSuite {
    public static int  testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the begininnig of tests.");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finisched.");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure(){
        //Given
        Square square = new Square("Square", 2);

        //When
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);

        //Then
        Assert.assertEquals(1, shapeCollector.getSize());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        Square square = new Square("Square", 2);
        Circle circle = new Circle("Circle", 3.14, 5);

        //When
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        boolean result = shapeCollector.removeFigure(square);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(1, shapeCollector.getSize());
    }
    @Test
    public void testGetFigure(){
        //Given
        Square square = new Square("Square", 2);
        Circle circle = new Circle("Circle", 3.14, 5);
        Triangle triangle = new Triangle("Triangle", 0.5, 8, 4);

        //When
        ShapeCollector retrievedShapeCollector = new ShapeCollector();
        retrievedShapeCollector.addFigure(circle);
        retrievedShapeCollector.addFigure(square);
        retrievedShapeCollector.addFigure(triangle);
        Shape returned = retrievedShapeCollector.getFigure(2);

        //Then
        Assert.assertEquals(triangle, returned);
    }
    @Test
    public void testShowFigures(){
        //Given
        Square square = new Square("Square", 2);
        Circle circle = new Circle("Circle", 3.14, 5);
        Triangle triangle = new Triangle("Triangle", 0.5, 8, 4);

        //When
        ShapeCollector showMeFigures = new ShapeCollector();
        showMeFigures.addFigure(square);
        showMeFigures.addFigure(circle);
        showMeFigures.addFigure(triangle);

        //Then
        Assert.assertEquals("SquareCircleTriangle", showMeFigures.showFigures());
    }
}
