package com.example.builderdesignpattern.withoutBuilder;

public class Employee {

    private String firstName;
    private String lastName;
    private String age;
    private int empId;

    public Employee(String firstName, String lastName, String age, int empId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.empId = empId;
    }
}
