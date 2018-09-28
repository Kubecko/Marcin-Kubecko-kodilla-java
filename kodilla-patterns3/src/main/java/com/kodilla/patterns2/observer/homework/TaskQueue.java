package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements ObservableTask{
    private final List<ObserverTask> observersTask;
    private final List<String> tasks;
    private final String name;

    public TaskQueue(String name) {
        observersTask = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObserversTask();
    }

    @Override
    public void registerObserverTask(ObserverTask observerTask) {
        observersTask.add(observerTask);
    }

    @Override
    public void notifyObserversTask() {
        for(ObserverTask observerTask : observersTask) {
            observerTask.updateTask(this);
        }
    }

    @Override
    public void removeObserverTask(ObserverTask observerTask) {
        observersTask.remove(observerTask);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
