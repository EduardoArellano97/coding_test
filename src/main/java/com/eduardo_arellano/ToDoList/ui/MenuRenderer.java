package com.eduardo_arellano.ToDoList.ui;

import java.util.Scanner;

// Responsible for displaying the menu and reading user input from the console.
public class MenuRenderer {
    private final Scanner scanner = new Scanner(System.in);

    public void showMainMenu() {
        System.out.println("\nWelcome to the To-Do List App!");
        System.out.println("1. Add a Task");
        System.out.println("2. View All Tasks");
        System.out.println("3. Mark Task as Complete");
        System.out.println("4. Delete a Task");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    public String getInput() {
        return scanner.nextLine();
    }
    // Returns -1 if the input is not a valid integer to indicate an error
    public int getIntInput() {
        // Attempts to read an integer input from the user
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            return -1;
        }
    }

    // Prints a custom message to the console.
    public void print(String message) {
        System.out.println(message);
    }
}
