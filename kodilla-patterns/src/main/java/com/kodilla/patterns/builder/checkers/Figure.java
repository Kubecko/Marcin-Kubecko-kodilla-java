package com.kodilla.patterns.builder.checkers;

public class Figure {
    public final static String WHITE = "WHITE";
    public final static String BLACK = "BLACK";
    public final String color;

    public Figure (String color) {
        if (color.equals(WHITE) || color.equals(BLACK)) {
            this.color = color;
        } else {
            throw new IllegalStateException("Figures of checkers should be BLACK or WHITE!");
        }
    }
    public String getColor(){
        return color;
    }
}
