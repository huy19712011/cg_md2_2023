package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifierDemo {

    public static void main(String[] args) {

        // + quantifier
        Pattern pattern = Pattern.compile("a+");
        Matcher matcher = pattern.matcher("Java is fun!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
