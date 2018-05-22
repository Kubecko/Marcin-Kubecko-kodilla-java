package com.kodilla.testing.shape;


import java.util.ArrayList;

public class Triangle implements Shape{
    private String name;
    private double half;
    private double hight;
    private double side;

    public Triangle(String name, double half, double hight, double side){
        this.name = name;
        this.half = half;
        this.hight = hight;
        this.side = side;
    }

    @Override
    public String getShapeName(){
        return this.name;
    }

    @Override
    public double getField() {
        return this.half * (side * hight);
    }
}