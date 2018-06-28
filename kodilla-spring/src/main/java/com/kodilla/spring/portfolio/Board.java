package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {
    final TaskList toDoList;

    public Board(TaskList toDoList) {
        this.toDoList = toDoList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

}
