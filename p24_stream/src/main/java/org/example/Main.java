package org.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmployeeManager em = new EmployeeManager();

        var fe1 = new FullTimeEmployee("fe1", "fulltime E 1");
        fe1.setFixedSalary(21_000_000);

        var fe2 = new FullTimeEmployee("fe2", "fulltime E 2");
        fe2.setFixedSalary(22_000_000);

        var fe3 = new FullTimeEmployee("fe3", "fulltime E 3");
        fe3.setFixedSalary(23_000_000);

        var pe1 = new PartTimeEmployee("pe1", "Parttime E 1");
        pe1.setHours(110);

        var pe2 = new PartTimeEmployee("pe2", "Parttime E 2");
        pe2.setHours(120);

        var pe3 = new PartTimeEmployee("pe3", "Parttime E 3");
        pe3.setHours(130);

        em.add(fe1);
        em.add(fe2);
        em.add(fe3);
        em.add(pe1);
        em.add(pe2);
        em.add(pe3);

        System.out.println(em.calculateSumSalaryOfPart_timeEmployees());
        System.out.println(em.calculateAvgSalary());

        em.findEmployeesBelowAvgSalary().stream()
                .forEach(employee -> System.out.println(employee));

        System.out.println(em.findEmployeesBelowAvgSalary());

        System.out.println(em.sortFulltimeEmployeesBySalary());

    }
}
