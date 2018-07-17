package com.kodilla.testing.shape;

public class Circle implements Shape{
    private String name;
    private double pi;
    private double radius;

    public Circle(String name, double pi, double radius) {
        this.name = name;
        this.pi = pi;
        this.radius = radius;
    }

    public String getShapeName() {
        return this.name;
    }

    public double getField() {
        return this.pi * this.radius * this.radius;
    }
}
