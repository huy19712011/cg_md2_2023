package org.example;

import java.util.concurrent.*;

class CallableTask implements Callable<String> {

    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {

        Thread.sleep(3000);
        return "Hello " + name;
    }
}

public class CallableRunnerDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcomeFuture = executorService.submit(new CallableTask("C02"));

        System.out.println("\n new CallableTask() executed");

        String welcomeMessage = welcomeFuture.get();
        System.out.println(welcomeMessage);

        System.out.println("\n main completed");

        executorService.shutdown();

    }
}
