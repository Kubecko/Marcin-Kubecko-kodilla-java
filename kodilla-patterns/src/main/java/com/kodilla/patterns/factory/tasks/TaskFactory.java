package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String DRIVINGTASK = "DRIVING TASK";
    public static final String SHOPPINGTASK = " SHOPPING TASK";

    public final Task makeTask(final String taskClass){
        switch(taskClass) {
            case PAINTINGTASK :
                return new PaintingTask("Pictures","Blue","Niagara");
            case DRIVINGTASK :
                return new DrivingTask("Win the race", "Track Argentyna","using my car");
            case SHOPPINGTASK :
                return new ShoppingTask("Opportunity", "Buy dress", 3);
            default:
                return null;
        }
    }
}
