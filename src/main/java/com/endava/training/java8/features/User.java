package com.endava.training.java8.features;


// =========================
// Domain Model
// =========================
public class User {
    private String name;
    private int age;
    private boolean active;
    private double balance;

    User(String name, int age, boolean active, double balance) {
        this.name = name;
        this.age = age;
        this.active = active;
        this.balance = balance;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    boolean isActive() {
        return active;
    }

    double getBalance() {
        return balance;
    }
}