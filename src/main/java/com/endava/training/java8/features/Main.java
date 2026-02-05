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
        // During the training, we will improve this code so that:
        // - The business rules are easy to read
        // - The rules are easy to change
        // - The code explains WHAT it is doing, not HOW


        System.out.println("Application started");
        System.out.println("Number of users: " + users.size());
    }
}
