package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return taskName + " " + color + " " + whatToPaint;
       // System.out.println(taskName + color + whatToPaint);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {

        boolean taskExecuted = Boolean.parseBoolean(taskName + " " + color + " " + whatToPaint);
        if(taskExecuted == equals(Task.class)){
            return true;
        } else {
            return false;
        }
    }
}
