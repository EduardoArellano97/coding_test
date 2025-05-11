package com.eduardo_arellano.ToDoList.service;

import com.eduardo_arellano.ToDoList.model.Task;

import java.util.List;

// Interface for task-related CRUD operations.
public interface ITaskService {
    Task  addTask(String title);
    List<Task> getAllTasks();
    // Return feedback if operation has been successfully completed
    boolean toggleTaskCompleted(int id);
    boolean deleteTask(int id);
}
