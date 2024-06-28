package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        // Creating new users
        User user1 = new User("Kateryna");
        User user2 = new User("Alex");
        User user3 = new User("Tim");
        User user4 = new User("Solomiia");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        // add tasks to them
        user1.addTask("Buy a milk");
        user1.addTask("Wash the car");
        user2.addTask("Plant a flowers");
        user2.addTask("Working call");
        user4.addTask("Fun meeting with friends");

        // tasks status
        user1.markTaskAsCompleted("Buy a milk");
        user2.markTaskAsCompleted("Plant a flowers");
        user4.markTaskAsCompleted("Fun meeting with friends");

        System.out.println();
        System.out.println("TO DO LIST");
        System.out.println();
        // print tasks for each user
        for (User user : users) {
            user.printTasks();
            System.out.println("Number of tasks: " + user.getNumberOfTasks()); // Tasks counting
            System.out.println();
        }
    }
}