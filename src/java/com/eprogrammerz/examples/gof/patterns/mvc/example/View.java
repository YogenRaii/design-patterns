package com.eprogrammerz.examples.gof.patterns.mvc.example;

/**
 * View
 * It renders the information coming from controller.
 */
public class View {
    public void printEmployeeInformation(Employee employee) {
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("-------------------------");
    }
}
