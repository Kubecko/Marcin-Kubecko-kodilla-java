package com.kodilla.spring.portfolio;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new  AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When & Then
        board.getToDoList();
        board.getInProgressList();
        board.getDoneList();
    }
}
/*
        W katalogu src/test/java utwórz pakiet com.kodilla.spring.portfolio, a w nim zestaw testów BoardTestSuite.
        Utwórz też test testTaskAdd(), który doda do każdej z list po jednym zadaniu (wcześniej uzyskując dostęp do
            Beana klasy Board). Test powinien sprawdzać czy dodane zadania da się odczytać.*/
