package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList();

    public ShapeCollector() {
    }

    public void addFigure(Shape shape) {
        this.shapes.add(shape);
    }

    boolean removeFigure(Shape shape) {
        return this.shapes.remove(shape);
    }

    Shape getFigure(int n) {
        return n < this.shapes.size() && n > 0 ? (Shape)this.shapes.get(n) : null;
    }

    String showFigures() {
        String names = "";

        Shape show;
        for(Iterator var2 = this.shapes.iterator(); var2.hasNext(); names = names + show.getShapeName()) {
            show = (Shape)var2.next();
        }

        return names;
    }

    int getSize() {
        return this.shapes.size();
    }
}