package com.kodilla.stream.com.kodilla.stream.beautifier;

public class PoemBeautifier{

    public void beutify(String textBeauty,PoemDecorator poemDecorator) {
        String resText = poemDecorator.decorate(textBeauty);
        System.out.println("Beautified text: " + resText);
    }
}
