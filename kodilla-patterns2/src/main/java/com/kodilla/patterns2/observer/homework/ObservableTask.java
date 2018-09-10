package com.kodilla.patterns2.observer.homework;

public interface ObservableTask {
    void registerObserverTask(ObserverTask observerTask);
    void notifyObserversTask();
    void removeObserverTask(ObserverTask observerTask);
}
