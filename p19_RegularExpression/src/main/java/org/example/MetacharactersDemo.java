package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetacharactersDemo {

    public static void main(String[] args) {

/*
        // |- metacharacter
        String text = "Cat Dog Fish";
        String pattern = "cat|dog";

        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
*/

/*
        // . metacharacter
        String text = "Cat Bat Rat XYZat";
        String pattern = ".at";

        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        while (m.find()){
            System.out.println(m.group());
        }
*/

/*
        // ^ metacharacter
        String text = "Hello World";
        String pattern = "^hello";

        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        boolean b = m.find();

        System.out.println(b);
*/

/*
        // $ metacharacter
        Pattern pattern = Pattern.compile("fun$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Java is Fun");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
*/

/*
        // \d metacharacter
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher("Java is fun 123");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
*/

/*
        // \w metacharacter
        Pattern pattern = Pattern.compile("\\w");
        Matcher matcher = pattern.matcher("Java is fun!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
*/

        // \s metacharacter
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher("Java is fun!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }



    }
}
