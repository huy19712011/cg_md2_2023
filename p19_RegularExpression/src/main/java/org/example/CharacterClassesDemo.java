package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassesDemo {

    public static void main(String[] args) {

        // [abc]
        Pattern pattern = Pattern.compile("[abc]");
        Matcher matcher = pattern.matcher("Java is fun!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
