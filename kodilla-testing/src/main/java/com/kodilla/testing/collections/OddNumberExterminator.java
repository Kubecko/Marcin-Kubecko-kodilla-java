package com.kodilla.testing.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNumberExterminator {
    public OddNumberExterminator() {
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbers2 = new ArrayList();
        Iterator var3 = numbers.iterator();

        while(var3.hasNext()) {
            Integer numbersEvenOdd = (Integer)var3.next();
            if (numbersEvenOdd % 2 == 0) {
                numbers2.add(numbersEvenOdd);
            }
        }

        return numbers2;
    }
}
