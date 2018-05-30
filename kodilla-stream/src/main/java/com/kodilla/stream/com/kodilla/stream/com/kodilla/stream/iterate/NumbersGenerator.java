package com.kodilla.stream.com.kodilla.stream.com.kodilla.stream.iterate;

import java.util.stream.*;

public final class NumbersGenerator {

    public static void generatorEven(int max){
        Stream.iterate(1, n -> n + 1)
                .limit(max)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
