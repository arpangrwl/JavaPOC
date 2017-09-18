package javaPOC.Thread.rough;

/**
 * Created by Arpan on 9/6/17.
 */
public class Class2 implements Runnable {
    static int cntr=0;

    Object o = new Object();

    @Override
    public void run() {
        for(int i =0 ;i < 10000 ;i++)
            synchronized (Class2.class){
            cntr++;
        }
    }

    public static void main(String[] args) {

        Thread t = new Thread(new Class2());
        t.start();

        Thread t1 = new Thread(new Class2());
        t1.start();

        try {
            t.join();
            t1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Print counter -->  " +cntr);
    }
}
