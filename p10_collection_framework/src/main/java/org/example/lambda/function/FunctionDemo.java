package org.example.lambda.function;

import java.util.function.Function;

public class FunctionDemo {

    public static void show() {

        Function<String, Integer> map = str -> str.length();
        Integer length = map.apply("CodeGym");
        System.out.println(length);

        // composing function
        // "key:value"
        // first: "key=value"
        // second: "{key=value}"

        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        String result = replaceColon.andThen(addBraces).apply("key:value");
        System.out.println(result);
    }
}
