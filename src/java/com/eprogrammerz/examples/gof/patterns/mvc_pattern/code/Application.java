package com.eprogrammerz.examples.gof.patterns.mvc_pattern.code;

/**
 * Client
 */
public class Application {
    public static void main(String[] args) {
        //retrieve information from database
        Employee employee = new EmployeeRepository().getEmployee();
        //creating view to display employee information
        View view = new View();

        EmployeeController controller = new EmployeeController(view,employee);
        controller.updateView();

        //updating model
        employee.setName("Hilary Sanders");
        controller = new EmployeeController(view,employee);
        controller.updateView();
    }
}
