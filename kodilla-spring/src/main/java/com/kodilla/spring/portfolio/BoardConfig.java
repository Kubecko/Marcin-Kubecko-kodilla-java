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
    TaskList taskList1;
    @Autowired
    @Qualifier("InProgress")
    TaskList taskList2;
    @Autowired
    @Qualifier("DoneList")
    TaskList taskList3;

    @Bean
    @Scope("prototype")
    public Board board(){
        return new Board(taskList1,taskList2,taskList3);
    }

    @Bean(name="ToDoList")
    @Scope("prototype")
    public  TaskList toDoList(){ return new TaskList(); }

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