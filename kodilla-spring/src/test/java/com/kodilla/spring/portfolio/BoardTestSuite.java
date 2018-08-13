package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new  AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        boolean toDoList = context.containsBean("ToDoList");
        boolean inProgress = context.containsBean("InProgress");
        boolean doneList = context.containsBean("DoneList");
        //Then
        System.out.println("Bean ToDoList was found in the container: " + toDoList);
        System.out.println("Bean InProgress was found in the container: " + inProgress);
        System.out.println("Bean DoneList was found in the container: " + doneList);
    }
}
