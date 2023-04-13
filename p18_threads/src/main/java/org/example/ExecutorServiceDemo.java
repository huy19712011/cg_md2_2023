package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

    private int number;

    public Task(int number) {
        this.number = number;
    }

    public void run() {

        System.out.println("\ntask" + number + " started");
        for (int i = number * 100 + 1; i <= number * 100 + 99; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\n task" + number + " done");
    }
}


public class ExecutorServiceDemo {

    public static void main(String[] args) {

//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorService executorService = Executors.newFixedThreadPool(5);


//        executorService.execute(new Task1());
//        executorService.execute(new Thread(new Task2()));
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));
        executorService.execute(new Task(8));

//        // task 3
//        System.out.println("task3 kicked off");
//        for (int i = 301; i <= 399; ++i) {
//            System.out.print(i + " ");
//        }
//        System.out.print("\n task3 done ");
//
//        System.out.println("\n main done");
//

        executorService.shutdown();

    }
}
