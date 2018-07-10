package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    final List<String> tasks;

    public TaskList(boolean tasks) {
        this.tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }
    public void  addList(String list){
        tasks.add(list);
    }
}