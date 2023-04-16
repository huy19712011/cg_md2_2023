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

        // . metacharacter
        String text = "Cat Bat Rat XYZat";
        String pattern = ".at";

        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
