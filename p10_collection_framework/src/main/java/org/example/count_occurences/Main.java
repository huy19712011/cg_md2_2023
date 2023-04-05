package org.example.count_occurences;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String str1 = "i have a male cat. the color of male cat is Black";
        String word1 = "male cat";

        String str = "cong hoa xa hoi chu nghia viet nam";
        String word = "ho ";



        long count = Pattern.compile(word)
                .splitAsStream(str)
                .count() - 1;

        System.out.println(count);
    }
}
