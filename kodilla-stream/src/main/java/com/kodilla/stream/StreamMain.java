package com.kodilla.stream;

import com.kodilla.stream.com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.com.kodilla.stream.com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10 ,5, (a,b) -> a-b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a+b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a*b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a/b);

        System.out.println();

        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(7,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        System.out.println();

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beutify("Ala ma Kota", (textBeauty) -> "Kot ma Ale");
        poemBeautifier.beutify("Programowanie nie jest takie trudne",(textBeauty) -> "Programming is " + "The Best");
        poemBeautifier.beutify("ALA MA KOTA",(textBeauty) -> textBeauty.toUpperCase());
        poemBeautifier.beutify("ala ma kota",(textBeauty) -> textBeauty.toLowerCase());
        poemBeautifier.beutify("ala ma kota",(textBeauty) -> textBeauty.substring(7));
        poemBeautifier.beutify("ala ma kota",(textBeauty) -> textBeauty.concat(" Tom'a"));

        System.out.println();

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generatorEven(20);
    }
}
