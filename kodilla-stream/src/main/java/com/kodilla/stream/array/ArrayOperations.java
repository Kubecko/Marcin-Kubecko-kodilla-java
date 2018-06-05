package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream streamIntSubstract1 = IntStream.range(0, numbers.length);
        System.out.println(streamIntSubstract1);

        double streamIntAverage = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();
            return streamIntAverage;
    }
}