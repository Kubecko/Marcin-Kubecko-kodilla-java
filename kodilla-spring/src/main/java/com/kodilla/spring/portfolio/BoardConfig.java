package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("ToDoList")
    TaskList taskList;

    @Bean
    public Board getBoard(){
        return new Board(taskList);
    }
    @Bean(name = "ToDoList")
    @Scope("prototype")
    public TaskList getDoList(){ return new TaskList(taskList.tasks.add("write this program")); }
}