package org.example.lambda.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void show() {


        Predicate<String> isLongerThan5 = str -> str.length() > 5;

        boolean result = isLongerThan5.test("Codegym");
        System.out.println(result);

        // combining

        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);

        boolean result2 = hasLeftAndRightBraces.test("{key: value}");
        System.out.println(result2);

    }
}
