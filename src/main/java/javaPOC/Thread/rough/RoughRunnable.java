package javaPOC.Thread.rough;

/**
 * Created by Arpan on 10/9/17.
 */
public class RoughRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Working");
    }

    public static void main(String[] args) {

        Thread myThread = new Thread(new RoughRunnable());


        myThread.start();

    }
}
