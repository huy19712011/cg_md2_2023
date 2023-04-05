package org.example.lambda.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void show() {

        List<Integer> list = List.of(1, 2, 3);

        for (var item: list)
            System.out.println(item);

        list.forEach(item -> System.out.println(item));

        // chaining
        List<String> list1 = List.of("a", "b", "c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUppercase = item -> System.out.println(item.toUpperCase());
        list1.forEach(print);
        list1.forEach(print.andThen(printUppercase));
    }
}
