package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;
    private boolean executed;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        executed = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(executed == equals(Task.class)){
            return true;
        } else {
            return false;
        }
    }
}
