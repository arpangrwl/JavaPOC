package javaPOC.Thread;

/**
 * Created by Arpan on 6/18/17.
 */
public class AnonymousRunnable {


    public static void main(String[] args) {

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread name is " + Thread.currentThread());
            }
        });

        th.start();

    }

}
