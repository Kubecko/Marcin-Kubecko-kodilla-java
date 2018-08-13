package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("ToDoList")
    TaskList taskList;

    @Bean
    public Board board(){
        return new Board(toDoList(),inProgress(),doneList());
    }

    @Bean(name="ToDoList")
    @Scope("prototype")
    public  TaskList toDoList(){
        return new TaskList();
    }

    @Bean(name = "InProgress")
    @Scope("prototype")
    public TaskList inProgress(){
        return new TaskList();
    }

    @Bean(name = "DoneList")
    @Scope("prototype")
    public TaskList doneList(){
        return new TaskList();
    }
}
/* Napisz klasę konfigurującą Beany o nazwie BoardConfig, która utworzy trzy różne Beany reprezentujące listy
        zadań i wstrzyknie je do Beana klasy Board.*/