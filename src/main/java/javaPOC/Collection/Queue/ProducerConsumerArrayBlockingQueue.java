package javaPOC.Collection.Queue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by Arpan on 6/18/17.
 */
public class ProducerConsumerArrayBlockingQueue {

    private static ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);


    public static void producer() throws InterruptedException {
        Random randNum = new Random();

        while(true)
            queue.put(randNum.nextInt(100));

    }

    public static void consumer() throws InterruptedException {

        Random num = new Random();

        while(true)
        {
            if(num.nextInt(10) == 0) {
                Integer i = queue.take();
                System.out.println("Value is :- " + i + "  Queue size is "+ queue.size());
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {


        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(30000);
        System.exit(0);
    }
}
