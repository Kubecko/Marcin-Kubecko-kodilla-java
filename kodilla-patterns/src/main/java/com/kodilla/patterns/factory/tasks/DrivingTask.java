package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task{
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return taskName + " " + where + " " + using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {

        boolean taskExecuted = Boolean.parseBoolean(taskName + " " + where + " " + using);
        if(taskExecuted == equals(Task.class)){
            return true;
        } else {
            return false;
        }
    }
}
