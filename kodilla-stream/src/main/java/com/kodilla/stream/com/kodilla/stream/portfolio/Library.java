package com.kodilla.stream.com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class Library {
    private final List<String> books = new ArrayList<>();

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

    public static void main(String[] args) {
        byte b = 10;
        int c = 129;
        if(c <= Byte.MAX_VALUE && c >= Byte.MIN_VALUE) {
            b = (byte) c;
        }
        System.out.println("c: " + c);
        System.out.println("b: " + b);
    }

}
