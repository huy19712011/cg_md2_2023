package org.example.lambda.supplier;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void show() {

        Supplier<Double> getRandom = () -> Math.random();

        Double random = getRandom.get();
        System.out.println(random);
    }
}
