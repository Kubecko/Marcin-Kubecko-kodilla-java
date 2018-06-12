package com.kodilla.exception.com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws ArithmeticException {
        try {
            if (x >= 2 || x < 1 || y == 1.5) ;
        } catch (ArithmeticException e) {

            throw new FileNumberException();
        }
        return "Done!";
    }
}
