package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegularExpressionBasics {

    public static void main(String[] args) {

        // Pattern
        // Matcher
        // PatternSyntaxException

        String str = "Training in Codegym";

        Pattern pattern = Pattern.compile("codegym", Pattern.CASE_INSENSITIVE);
//        Pattern pattern = Pattern.compile("codegym", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher("Training in Codegym");
        boolean matchFound = matcher.find();
        boolean exactMatch = matcher.matches();

        System.out.println(matcher);
        System.out.println(matchFound);
        System.out.println(exactMatch);

//        System.out.println(pattern.matcher("Training in Codegym").find());
//        System.out.println(pattern.matcher("Training in Codegym").matches());
//        System.out.println(Pattern.matches("codegym", "Training in Codegym"));
//        System.out.println(Pattern.matches(pattern.toString(), "Training in Codegym"));
//
//        System.out.println(str.matches("Codegym"));
//        System.out.println("I learn in Codegym".matches("Codegym"));
    }
}
