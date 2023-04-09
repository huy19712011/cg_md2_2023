package org.example;

public class PartTimeEmployee extends Employee {

    private double hours;

    @Override
    public double calculateSalary() {
        return 100_000 * this.hours;
    }

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String id, String name) {

        super(id, name);
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "hours=" + hours +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
