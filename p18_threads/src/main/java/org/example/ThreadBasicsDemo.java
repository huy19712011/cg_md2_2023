package org.example;

// extends Thread

class Task1 extends Thread {

    public void run() {

        System.out.println("\ntask 1 started");
        for (int i = 101; i <= 199; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\n task1 done ");
    }
}

// implements Runnable

public class ThreadBasicsDemo {

    public static void main(String[] args) {

        // task 1
        Task1 task1 = new Task1();
//        task1.run();
        task1.start();

        // task 2
        for (int i = 201; i <= 299; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\n task2 done ");

        // task 3
        for (int i = 301; i <= 399; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\n task3 done ");

        System.out.println("\n main done");

    }
}
