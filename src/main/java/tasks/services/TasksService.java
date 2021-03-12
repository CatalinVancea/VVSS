package tasks.services;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import tasks.model.ArrayTaskList;
import tasks.model.Task;
import tasks.model.TaskListInterface;
import tasks.model.TasksOperations;

import java.util.Date;

public class TasksService implements TasksServiceInterface{

    private TaskListInterface tasks;

    public TasksService(TaskListInterface tasks){
        this.tasks = tasks;
    }

    @Override
    public ObservableList<Task> getObservableList(){
        return FXCollections.observableArrayList(tasks.getAll());
    }

    @Override
    public String getIntervalInHours(Task task){
        int seconds = task.getRepeatInterval();
        int minutes = seconds / DateTimeService.SECONDS_IN_MINUTE;
        int hours = minutes / DateTimeService.MINUTES_IN_HOUR;
        minutes = minutes % DateTimeService.MINUTES_IN_HOUR;
        return DateTimeService.formTimeUnit(hours) + ":" + DateTimeService.formTimeUnit(minutes);//hh:MM
    }

    @Override
    public Iterable<Task> filterTasks(Date start, Date end){
        TasksOperations tasksOps = new TasksOperations(getObservableList());
        Iterable<Task> filtered = tasksOps.incoming(start,end);
        //Iterable<Task> filtered = tasks.incoming(start, end);

        return filtered;
    }
}
