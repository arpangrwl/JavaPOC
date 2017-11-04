package javaPOC.Thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<String> {

    public static int i = 0;
    public static void main(String args[]) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<String>> list = new ArrayList<Future<String>>();
        Callable<String> callable = new MyCallable();

        for (int i = 0; i < 20; i++) {
            Future<String> future = executor.submit(callable);
            list.add(future);
        }

        for (Future<String> fut : list) {
            try {
                System.out.println(new Date() + "::" + fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }

    @Override
    public String call() throws Exception {

        System.out.println("Do Some stuff " +(++i));
        return Thread.currentThread().getName();
    }

}