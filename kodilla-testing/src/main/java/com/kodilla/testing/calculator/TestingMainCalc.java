package com.kodilla.testing.calculator;

import com.kodilla.testing.calculator.Calculator;

import java.util.HashMap;

public class TestingMainCalc {
    public static void main(String[] args){

        Calculator calcAdd = new Calculator();
        Calculator calcSubstract = new Calculator();

        int result = calcAdd.add(2,3);
        int result1 = calcSubstract.substract(3,2);

        if(result > 2){
            System.out.println("Result for adding: " + result +   " Test OK");
        } else {
            System.out.println("Result for adding: " + result + " Error");
        }

        if(result1 > 3){
            System.out.println("Result for substraction: " + result1 + " Test OK");
        } else {
            System.out.println("Result for substraction: " + result1 + " Error");
        }

        HashMap<String, String> student = new HashMap<>();
        student.put("uczen1","uczen1");
        student.put("uczen1","uczen2");
        student.put(null,"uczen1");
        student.put("uczen4","uczen1");
    }
}