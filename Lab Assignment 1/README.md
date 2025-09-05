# Student Management System

A simple command-line based Student Management System written in Java.

## Features

- Add a new student with their name, roll number, course, and marks.
- Automatically calculates the grade based on the marks.
- Display a list of all students with their details.
- Interactive menu-driven interface.

## How to Run

1.  **Compile the Java code:**
    ```bash
    javac Task3.java
    ```

2.  **Run the application:**
    ```bash
    java Task3
    ```

3.  Follow the on-screen instructions to add and display students.

## Code Structure

-   `Task3.java`: The main file containing the `main` method to run the application. It handles the user menu and interaction.
-   `Student`: A class representing a student with attributes like `rollnumber`, `name`, `course`, `marks`, and `grade`. It also contains methods to input student details and calculate the grade.
-   `StudentManagementSystem`: A class to manage the collection of `Student` objects. It includes methods to add a student and display all students.
