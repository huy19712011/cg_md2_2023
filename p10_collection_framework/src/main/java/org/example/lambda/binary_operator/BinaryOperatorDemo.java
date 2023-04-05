package org.example.lambda.binary_operator;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryOperatorDemo {

    public static void show() {

        BinaryOperator<Integer> add = (a, b) -> a + b;
        Function<Integer, Integer> square = a -> a * a;

        var result = add.andThen(square).apply(1, 2);
        System.out.println(result);

        //unaryOperator
        UnaryOperator<Integer> sqr = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;

        System.out.println(increment.andThen(sqr).apply(1));
    }
}
