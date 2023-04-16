package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassesDemo {

    public static void main(String[] args) {

/*
        // [abc]
        Pattern pattern = Pattern.compile("[abc]");
        Matcher matcher = pattern.matcher("Java is fun!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
*/

/*
        // [^abc]
        Pattern pattern = Pattern.compile("[^abc]");
//        Matcher matcher = pattern.matcher("Java is fun!");
        Matcher matcher = pattern.matcher("abc");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
*/

/*
        // [a-z]
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher("Java is fun!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
*/

        // union character classes
        Pattern pattern = Pattern.compile("[a-d[m-p]]");
//        Matcher matcher = pattern.matcher("Java is fun!");
        Matcher matcher = pattern.matcher("efg");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }


    }
}
