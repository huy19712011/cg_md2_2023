package org.example.balanced_brackets_example;

import static org.example.balanced_brackets_example.BalancedBrackets.areBracketsBalanced;

public class Main {

    public static void main(String[] args) {

        String expr = "([{}{}])";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
