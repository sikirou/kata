package com.exo.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FixedThreadPoolMain {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        CompletionService<String> pool = new ExecutorCompletionService<String>(threadPool);

        List<Future<String>> futures = new ArrayList<Future<String>>();
        for (int i = 0; i < 100; i++) {
            pool.submit(new StringTask("name " + i));
        }

        for (int i = 0; i < 100; i++) {
            String result;
            try {
                result = pool.take().get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(threadPool.isTerminated());
        }
        threadPool.shutdown();
        System.out.println(threadPool.isShutdown());
        while (!threadPool.isTerminated()) {
            System.out.println("Still alive ");
        }
        System.out.println(threadPool.isTerminated());
    }

}
