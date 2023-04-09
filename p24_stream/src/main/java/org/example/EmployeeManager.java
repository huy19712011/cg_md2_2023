package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeManager() {
    }


    public void add(Employee employee) {

        this.employees.add(employee);
    }

    public void update(Employee employee) {

    }

    public void remove(Employee employee) {

    }

    public double calculateAvgSalary() {

        return employees.stream()
                .mapToDouble(e -> e.calculateSalary())
                .average()
                .getAsDouble();
    }

    public List<Employee> findEmployeesBelowAvgSalary() {

        double avgSalary = employees.stream()
                .mapToDouble(employee -> employee.calculateSalary())
                .average()
                .getAsDouble();

        List<Employee> employeesBelowAvg = employees.stream()
                .filter(e -> e.calculateSalary() < avgSalary && (e instanceof PartTimeEmployee))
//                .filter(e -> e instanceof FullTimeEmployee)
                .collect(Collectors.toList());

        return employeesBelowAvg;
    }


    public double calculateSumSalaryOfPart_timeEmployees() {

        double sum = employees.stream()
                .filter(e -> e instanceof PartTimeEmployee)
                .mapToDouble(e -> e.calculateSalary())
                .sum();

        return sum;
    }

    public List<Employee> sortFulltimeEmployeesBySalary() {
        List<Employee> sortedFulltimeEmployees = employees.stream()
                .filter(e -> e instanceof FullTimeEmployee)
                .sorted(Comparator.comparingDouble(e -> e.calculateSalary()))
                .collect(Collectors.toList());

        return sortedFulltimeEmployees;
    }




}
