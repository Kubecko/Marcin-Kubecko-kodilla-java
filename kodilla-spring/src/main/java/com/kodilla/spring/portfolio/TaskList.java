package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    final List<TaskList> tasks;

    public TaskList(List<TaskList> tasks) {
        this.tasks = new ArrayList<>();
    }

}
