package com.kodilla.testing.collections;

import java.util.ArrayList;

public class OddNumberExterminator {
    public ArrayList<Integer> exterminate(ArrayList <Integer> numbers){
        ArrayList<Integer> numbers2 = new ArrayList<>();
        for (Integer numbersEvenOdd : numbers) {
            if (numbersEvenOdd % 2 == 0) {
                numbers2.add(numbersEvenOdd);
            }
        }return numbers2;
    }
}
