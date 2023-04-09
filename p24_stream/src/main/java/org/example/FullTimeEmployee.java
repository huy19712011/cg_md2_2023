package org.example;

public class FullTimeEmployee extends Employee{

    private double fixedSalary;
    private double bonus;
    private double penalty;

    @Override
    public double calculateSalary() {

        return this.fixedSalary + this.bonus - this.penalty;
    }

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String id, String name) {

        super(id, name);
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "fixedSalary=" + fixedSalary +
                ", bonus=" + bonus +
                ", penalty=" + penalty +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
