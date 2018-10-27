package com.eprogrammerz.examples.gof.patterns.mvc_pattern.code;

/**
 * Data access layer;
 * this interacts with database
 */
public class EmployeeRepository {
    public Employee getEmployee(){
        Employee employee = new Employee();
        employee.setId("984598A");
        employee.setName("John Jrump");
        return employee;
    }
}
