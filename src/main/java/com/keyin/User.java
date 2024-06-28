package com.keyin;

public class User {
    private String name;
    private TaskList taskList; // new list for each user

    // Constructor
    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }
// Getters and Setters
    public String getName() {
        return name;
    }

    public void addTask(String description) {
        taskList.addTask(new Task(description));
    }

    public void markTaskAsCompleted(String description) {
        taskList.markTaskAsCompleted(description);
    }

    public void printTasks() {
        System.out.println("All tasks for " + name + ":");
        if (taskList.isEmpty()) {
            System.out.println("You have no any tasks.");
        } else {
            taskList.printTasks();
        }
    }

    public int getNumberOfTasks() {
        return taskList.getNumberOfTasks(); // Отримання кількості завдань від TaskList
    }
}