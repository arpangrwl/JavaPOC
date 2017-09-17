package javaPOC.Thread.rough;

/**
 * Created by Arpan on 9/6/17.
 */
public class class1 extends Thread{

    public void run (){

        System.out.println("Thread is working fine");
    }

    public static void main(String[] args) {

        class1 c = new class1();
        c.start();

    }
}
