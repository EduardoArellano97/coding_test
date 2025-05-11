package com.eduardo_arellano.ToDoList.controller;

import com.eduardo_arellano.ToDoList.model.Task;
import com.eduardo_arellano.ToDoList.service.ITaskService;
import com.eduardo_arellano.ToDoList.ui.MenuRenderer;

import java.util.List;

// Coordinates user actions with the service layer
public class TaskController {
    private final ITaskService taskService;
    private final MenuRenderer renderer;
    private boolean running = true;

    public TaskController(ITaskService taskService, MenuRenderer renderer) {
        this.taskService = taskService;
        this.renderer = renderer;
    }

    public void run() {
        while (running) {
            renderer.showMainMenu();
            handleOption(renderer.getInput());
        }
    }

    private void handleOption(String option) {
        switch (option) {
            case "1":
                renderer.print("Enter the task title: ");
                String title = renderer.getInput();
                if (title.isBlank()) {
                    renderer.print("Invalid title.");
                } else {
                    Task task = taskService.addTask(title);
                    renderer.print("Task added: " + task);
                }
                break;
            case "2":
                List<Task> tasks = taskService.getAllTasks();
                if (tasks.isEmpty()) {
                    renderer.print("No tasks found.");
                } else {
                    renderer.print("Tasks:");
                    tasks.forEach(task -> renderer.print(task.toString()));
                }
                break;
            case "3":
                renderer.print("Enter task ID to mark as complete: ");
                int completeId = renderer.getIntInput();
                if (taskService.toggleTaskCompleted(completeId)) {
                    renderer.print("Task marked as complete!");
                } else {
                    renderer.print("Task not found.");
                }
                break;
            case "4":
                renderer.print("Enter task ID to delete: ");
                int deleteId = renderer.getIntInput();
                if (taskService.deleteTask(deleteId)) {
                    renderer.print("Task deleted successfully.");
                } else {
                    renderer.print("Task not found.");
                }
                break;
            case "5":
                renderer.print("Goodbye!");
                running = false;
                break;
            default:
                renderer.print("Invalid option. Please try again.");
        }
    }
}
