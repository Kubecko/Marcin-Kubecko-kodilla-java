package com.kodilla.spring.portfolio;

public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }
    public void toDoList(){
        System.out.println("The List(toDoList): " + toDoList.getTasks());
    }

    public void inProgressList(){
        System.out.println("The List(inProgressList): " + inProgressList.getTasks());
    }

    public void doneList(){
        System.out.println("The List: " + doneList.getTasks());
    }
}
    /*Utwórz w katalogu src/main/java pakiet com.kodilla.spring.portfolio, a w nim klasę Board posiadającą trzy pola:
        toDoList, inProgressList oraz doneList.
        Pola te powinny być typu TaskList.*/