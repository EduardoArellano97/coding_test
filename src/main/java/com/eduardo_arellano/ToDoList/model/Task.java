package com.eduardo_arellano.ToDoList.model;

// Model, establishes task properties
public class Task {
    private static int counter = 0; // Counter to assign unique IDs
    private final int id;
    private String title;
    private boolean completed; // To handle status

    public Task(String title) {
        this.id = ++counter; // Increases each time a new Task is created
        this.title = title;
        this.completed = false; // New tasks are not completed by default
    }
    // Getter section
    public int getId() { return id; }
    public String getTitle() { return title; }
    public boolean isCompleted() { return completed; }

    // Setter section
    public void setTitle(String title) { this.title = title; }
    public void setCompleted(boolean completed) { this.completed = completed; }

    @Override
    public String toString() {
        return "[" + (completed ? "X" : " ") + "] " + id + ": " + title;
    }

}
