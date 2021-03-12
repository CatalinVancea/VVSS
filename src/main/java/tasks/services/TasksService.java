package tasks.services;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import tasks.model.Task;
import tasks.model.TaskListInterface;
import tasks.model.TasksOperations;

import java.util.Date;

public interface TasksService {

    ObservableList<Task> getObservableList();
    String getIntervalInHours(Task task);
    Iterable<Task> filterTasks(Date start, Date end);
}
