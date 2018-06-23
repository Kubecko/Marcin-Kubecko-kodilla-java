package com.kodilla.spring.intro.Shape;

public class Drawer {
       final Shape shape;

    public Drawer(Shape shape) {
        this.shape = shape;
    }
    public String doDrawing() {
        return shape.draw();
    }
}
