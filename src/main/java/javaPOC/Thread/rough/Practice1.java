package javaPOC.Thread.rough;

public class Practice1 {
   static int cntr = 0;

    public static void main(String[] args) {

        Object o = new Object();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ;i < 1000 ;i++)
                 synchronized (o){  cntr++;}
            }
        });

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0 ;i < 1000 ;i++)
                    synchronized (o){cntr++;}
            }
        });

        t.start();
        t1.start();

        try {
            t.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("value of counter is : " +cntr);
    }
}
