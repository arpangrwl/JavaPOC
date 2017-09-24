package javaPOC.Thread.rough;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Arpan on 9/20/17.
 */
public class ExecuterServiceClass {

    public static void main(String[] args) {

        ExecutorService executer = Executors.newFixedThreadPool(10);

        for (int j =0 ; j<2 ; j++)
            executer.execute(new ImplRunnable());

        executer.shutdown();
    }
}


class ImplRunnable implements Runnable{

    @Override
    public void run() {

        for (int i =0 ; i < 2 ; i++)
             System.out.println("Value of i is :- " +i );
    }
}