package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }
}
/*
        Utwórz również klasę TaskList w tym samym pakiecie - powinna ona zawierać
        właściwość List<String> tasks. Jej zawartość powinna być inicjowana w konstruktorze przy pomocy polecenia
        tasks = new ArrayList<>();*/