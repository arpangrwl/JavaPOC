package javaPOC.Thread;

/**
 * Created by Arpan on 6/18/17.
 */
public class BasicThread extends Thread{

    public void run(){

        System.out.println("Thread name is " + Thread.currentThread());
    }

    public static void main(String[] args) {

        BasicThread t = new BasicThread();
        t.start();

    }


}
