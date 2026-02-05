package com.endava.training.java8.features;

@FunctionalInterface
interface UserRule {
    boolean test(User user);
}

