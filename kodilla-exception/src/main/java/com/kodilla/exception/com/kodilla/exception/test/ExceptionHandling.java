package com.kodilla.exception.com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2,3);
        } catch (FileNumberException e){
            System.out.println("Problem");
        }
    }
}
