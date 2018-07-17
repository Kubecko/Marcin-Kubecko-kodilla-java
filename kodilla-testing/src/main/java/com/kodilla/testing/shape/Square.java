package com.kodilla.testing.shape;

public class Square implements Shape{
    private String name;
    private double side;

    public Square(String name, double side) {
        this.name = name;
        this.side = side;
    }

    public String getShapeName() {
        return this.name;
    }

    public double getField() {
        return this.side * this.side;
    }
}
