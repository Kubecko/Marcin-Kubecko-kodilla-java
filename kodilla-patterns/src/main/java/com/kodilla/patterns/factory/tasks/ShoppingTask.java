package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
       return  taskName +" " + whatToBuy + " " + quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean taskExecuted = Boolean.parseBoolean(taskName +" " + whatToBuy + " " + quantity);
        if(taskExecuted == equals(Task.class)){
            return true;
        } else {
            return false;
        }
    }
}
