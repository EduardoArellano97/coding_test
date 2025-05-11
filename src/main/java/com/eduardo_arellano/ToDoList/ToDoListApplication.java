package com.eduardo_arellano.ToDoList;

import com.eduardo_arellano.ToDoList.controller.TaskController;
import com.eduardo_arellano.ToDoList.repository.ITaskRepository;
import com.eduardo_arellano.ToDoList.service.ITaskService;
import com.eduardo_arellano.ToDoList.service.TaskRepositoryImplementation;
import com.eduardo_arellano.ToDoList.service.TaskServiceImplementation;
import com.eduardo_arellano.ToDoList.ui.MenuRenderer;

/*
  * Requirements:
 * - The application should allow a user to add, view, delete, and mark tasks as complete.
 * - Each task should have a title and a status (pending or completed).
 * - The tasks should be stored in a list, and the application should keep running until the user chooses
 * to exit.
 * - Include proper error handling for invalid inputs.
 */
public class ToDoListApplication {
    public static void main(String[] args) {
        // To manage task data in memory
        ITaskRepository repository = new TaskRepositoryImplementation();
        // Service layer  using repository
        ITaskService taskService = new TaskServiceImplementation(repository);
        // UI handler for input/output operations
        MenuRenderer menuRenderer = new MenuRenderer();
        // Controller to coordinate UI and service actions
        TaskController controller = new TaskController(taskService, menuRenderer);
        // Start the application
        controller.run();
    }
}

