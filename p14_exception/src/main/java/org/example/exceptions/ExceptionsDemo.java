package org.example.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {

    public static void show() {

        try {

            var reader = new FileReader("file.txt");

            var value = reader.read();

            new SimpleDateFormat().parse("");
            System.out.println("File opened...");
        } catch (FileNotFoundException e) {

//            System.out.println("file does not exist!");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        var account = new Account();
        try {
            account.deposit(-10);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
