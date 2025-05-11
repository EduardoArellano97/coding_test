package com.eduardo_arellano.ToDoList.service;

import com.eduardo_arellano.ToDoList.model.Task;
import com.eduardo_arellano.ToDoList.repository.ITaskRepository;

import java.util.ArrayList;
import java.util.List;

// Contains logic for performing task-related CRUD operations using the repository.
public class TaskServiceImplementation implements  ITaskService {

    private final ITaskRepository repository;

    // Allows injecting the task repository.
    public TaskServiceImplementation(ITaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public Task addTask(String title) {
        Task task = new Task(title);
        int id = task.getId();
        repository.put(id, task);
        return task;
    }

    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(repository.values());
    }


    @Override
    public boolean toggleTaskCompleted(int id) {
        Task task = repository.get(id);
        if (task != null) {
            task.setCompleted(!task.isCompleted());
            return true;
        }
        return false; // returns false since the function cannot alter an unexisting item.
    }

    @Override
    public boolean deleteTask(int id) {
        return repository.remove(id) != null;
    }

}
