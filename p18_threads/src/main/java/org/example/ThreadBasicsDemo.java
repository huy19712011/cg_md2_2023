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
class Task2 implements Runnable {

    @Override
    public void run() {

        System.out.println("\n task 2 started");
        for (int i = 201; i <= 299; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\n task2 done ");

    }
}

public class ThreadBasicsDemo {

    public static void main(String[] args) throws InterruptedException {

        // New
        // Runnable
        // Running
        // Blocked/waiting
        // Terminated/dead

        // task 1
        System.out.println("task1 kicked off");
        Task1 task1 = new Task1();
        task1.setPriority(1);
//        task1.run();
        task1.start();

        // task 2
        System.out.println("task2 kicked off");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();


        // wait for task1, task2 to complete
        task1.join();
        task2Thread.join();

        // task 3
        System.out.println("task3 kicked off");
        for (int i = 301; i <= 399; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\n task3 done ");

        System.out.println("\n main done");

    }
}
