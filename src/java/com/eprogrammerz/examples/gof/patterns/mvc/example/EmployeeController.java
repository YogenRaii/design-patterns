package com.eprogrammerz.examples.gof.patterns.mvc.example;

/**
 * Controller
 * It acts as bridge for model (Employee) and view (View)
 */
public class EmployeeController {
    private View view;
    private Employee employee;

    public EmployeeController(View view, Employee employee) {
        this.view = view;
        this.employee = employee;
    }

    public void updateView() {
        view.printEmployeeInformation(employee);
    }
}
