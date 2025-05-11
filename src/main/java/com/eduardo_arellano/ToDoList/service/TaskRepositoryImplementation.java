package com.eduardo_arellano.ToDoList.service;

import com.eduardo_arellano.ToDoList.model.Task;
import com.eduardo_arellano.ToDoList.repository.ITaskRepository;

import java.util.HashMap;
/*
 * Concrete implementation of the task repository using a HashMap.
 * Inherits all key-value operations from HashMap.
 */
public class TaskRepositoryImplementation extends HashMap<Integer, Task> implements ITaskRepository {
}