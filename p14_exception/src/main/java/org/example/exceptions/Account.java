package org.example.exceptions;

import java.io.IOException;

public class Account {

    public void deposit(double value) throws IOException {

        if (value <= 0)
//            throw new IllegalArgumentException();
            throw new IOException();
    }
}
