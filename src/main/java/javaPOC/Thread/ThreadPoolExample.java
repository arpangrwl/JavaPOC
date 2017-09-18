package javaPOC.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Arpan on 9/17/17.
 */
public class ThreadPoolExample {

    public static int cntr;
    public static void main(String[] args) {


        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int j = 0 ; j<10 ;j++)
         executor.execute(new RunnableClass1());

        executor.shutdown();

    }
}

class RunnableClass1 implements Runnable{

    @Override
    public void run() {
        process();

    }

    public void process(){
        System.out.println(Thread.currentThread().getName());
    }
}