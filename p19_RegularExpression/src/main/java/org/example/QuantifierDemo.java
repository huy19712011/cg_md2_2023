package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifierDemo {

    public static void main(String[] args) {

/*
        // + quantifier
        Pattern pattern = Pattern.compile("a+");
        Matcher matcher = pattern.matcher("Java is fun!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
*/

/*
        // * quantifier
        Pattern pattern = Pattern.compile("a*");
        Matcher matcher = pattern.matcher("Java is fun!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
*/

/*
        // ? quantifier
        Pattern pattern = Pattern.compile("a?");
        Matcher matcher = pattern.matcher("Java is fun!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
*/

/*
        // {number} quantifier
        Pattern pattern = Pattern.compile("a{3}");
        Matcher matcher = pattern.matcher("Javaaa is fun!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
*/

/*
        // {ranger}
        Pattern pattern = Pattern.compile("a{2,3}");
        Matcher matcher = pattern.matcher("Javaaa is fun!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
*/

        // {n,} => at least n
        Pattern pattern = Pattern.compile("a{2,}");
        Matcher matcher = pattern.matcher("Javaaa is fun!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

    }
}
