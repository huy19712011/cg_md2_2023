package org.example;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunnerDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

//        ExecutorService executorService = Executors.newFixedThreadPool(1);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<CallableTask> tasks = List.of(
                new CallableTask("C02"),
                new CallableTask("C03"),
                new CallableTask("C04")
        );

        List<Future<String>> results = executorService.invokeAll(tasks);

        for (var result: results) {
            System.out.println(result.get());
        }

        executorService.shutdown();
    }
}
