package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String name;
    private double half;
    private double hight;
    private double side;

    public Triangle(String name, double half, double hight, double side) {
        this.name = name;
        this.half = half;
        this.hight = hight;
        this.side = side;
    }

    public String getShapeName() {
        return this.name;
    }

    public double getField() {
        return this.half * this.side * this.hight;
    }
}
