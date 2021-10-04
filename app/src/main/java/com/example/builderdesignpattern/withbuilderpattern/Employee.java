package com.example.builderdesignpattern.withbuilderpattern;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private int empId;

    private Employee(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.empId = builder.empId;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private int empId;

        public Builder(String firstName,String lastName) {
            this.firstName = firstName;
            this.lastName =  lastName;
        }

        public Builder Age(int age) {
            this.age = age;
            return this;
        }

        public Builder EmpId(int empId) {
            this.empId = empId;
            return this;
        }

        public Employee build() {
           return new Employee(this);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", empId=" + empId +
                '}';
    }
}
