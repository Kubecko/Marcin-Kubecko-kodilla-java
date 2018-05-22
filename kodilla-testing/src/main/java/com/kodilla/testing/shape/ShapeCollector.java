package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();


        void addFigure(Shape shape){
            shapes.add(shape);
        }

        boolean removeFigure (Shape shape){
            return shapes.remove(shape);
        }

        Shape getFigure (int n){
            if(n < shapes.size() && n > 0){
                return shapes.get(n);
            } return null;
        }

        String showFigures () {
            String names = "";
            for (Shape show : shapes){
                names = names + show.getShapeName();
            } return names;
        }
        int getSize(){ return shapes.size();}
}

