package com.endava.training.java8.features;

import java.util.ArrayList;
import java.util.List;

public class Main {


    // =========================
    // Application Entry Point
    // =========================
    public static void main(String[] args) {

        // Sample data
        List<User> users = new ArrayList<>();
        users.add(new User("qin-jie", 25, true, 1200));
        users.add(new User("xin-ru", 19, true, 800));
        users.add(new User("sher-cheng", 30, false, 3000));
        users.add(new User("jian-quan", 28, true, 5000));

        // TODO (Training Goal):
        // We want to generate a user report from this list.
        //
        // The report should show only users that meet certain business rules.
        // These rules may change over time.
        //
        // Requirement:
        //  Print names of active users

        // Old Way (Create Pain)

        for (User u : users) {
            if (u.isActive()) {
                System.out.println(u.getName());
            }
        }


        System.out.println("Application started");
        System.out.println("Number of users: " + users.size());
    }
}
