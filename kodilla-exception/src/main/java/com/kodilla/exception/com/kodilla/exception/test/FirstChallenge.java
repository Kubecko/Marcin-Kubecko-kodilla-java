package com.kodilla.exception.com.kodilla.exception.test;

import java.io.IOException;
import java.util.stream.Stream;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        try {
            if (b == 0){}
        } catch (ArithmeticException e) {
            System.out.println("Oh no! Something went wrong!" + e);
        } finally {
            System.out.println("I am gonna be here.... always!");
        }
        return a/b;
    }


    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3,0);
        System.out.println(result);
    }

}
