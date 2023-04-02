package org.example;

public class Calculator {

    public double sum(double x, double y) {

        return x + y;
    }

    public double sub(double x, double y) {

        return x - y;
    }

    public double divide(double i, double i1) {

        if (i1 == 0) throw new IllegalArgumentException("Cannot divide by zero");

        return i / i1;
    }
}
