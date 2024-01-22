package ru.job4j.calculator;

public class ArgumentsMethod {
    public static void hello(String name) {
        int age = 6;
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        ArgumentsMethod.hello(name);
        ArgumentsMethod.hello(name);
        ArgumentsMethod.hello(name);
        ArgumentsMethod.hello(name);
    }
}