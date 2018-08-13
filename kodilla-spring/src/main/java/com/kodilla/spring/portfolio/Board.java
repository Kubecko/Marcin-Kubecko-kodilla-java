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

    public void getToDoList() {
        System.out.println("toDoList: "+ toDoList.getTasks());
    }

    public void getInProgressList() {
        System.out.println("inProgressList: "+ inProgressList.getTasks());
    }

    public void getDoneList() {
        System.out.println("doneList: "+ doneList.getTasks());
    }
}