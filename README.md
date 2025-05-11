## Project developed using the following: 

- Programming Language : Java 17
- Maven 4.0.0

## Exercises

This project includes the following solved exercises, each with proper unit testing using JUnit. Tests can be found  under `src/test/java/`

### 1. FizzBuzz
**Description**: Prints numbers from 1 to 100. For multiples of 3, prints `"Fizz"`; for multiples of 5, prints `"Buzz"`; and for multiples of both 3 and 5, prints `"FizzBuzz"`.

**Test Coverage**:
- Validates correct output for typical ranges (e.g., 1–15).

### 2. Palindrome Checker
**Description**: Checks if a given string is a palindrome (case-insensitive and ignores spaces).

**Test Coverage**:
- Tests typical palindromes like `"racecar"` or `"madam"`.
- Validates non-palindromes.
- Handles null cases.

### 3. Sum of Unique Elements
**Description**: Accepts an integer array and returns the sum of elements that appear exactly once.

**Test Coverage**:
- Tests arrays with repeated and unique values.
- Handles empty arrays and arrays with only duplicates.



# To-Do List Console Application

## Overview

This is a Java-based console application that allows users to manage a list of tasks. Users can add, view, mark as completed, and delete tasks. The program separates concerns into different layers: model, service, repository, UI, and controller.

## Features

- Add a new task
- View all tasks
- Mark a task as completed
- Delete a task
- Input validation and error handling

## Project Structure

- `model`: Contains the Task class which represents a task object.
- `repository`: Defines an in-memory data store to manage tasks.
- `service`: Implements CRUD operations.
- `ui`: Handles user interface input/output .
- `controller`: Coordinates UI interactions and service operations.
- `ToDoListApplication`: Entry point to initialize components and run the application loop.

## Assumptions and considerations

- Task data is stored in memory only and is not persisted after the program ends.
- Console input is expected from the user, and invalid inputs are handled.
- The application remains simple and does not use external frameworks.
