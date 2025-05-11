package com.eduardo_arellano.ToDoList.repository;

import com.eduardo_arellano.ToDoList.model.Task;

import java.util.Map;

/*
 * Interface representing a task repository.
 * Extends Map with Integer as key and Task as value. Handles persistence and retrieval of Tasks
 */
public interface ITaskRepository extends Map<Integer, Task> {
}
