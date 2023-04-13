package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

        // task 3
        System.out.println("task3 kicked off");
        for (int i = 301; i <= 399; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\n task3 done ");

        System.out.println("\n main done");

        executorService.shutdown();

    }
}
