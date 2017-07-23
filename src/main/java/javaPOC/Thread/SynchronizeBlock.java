package javaPOC.Thread;

/**
 * Created by Arpan on 6/18/17.
 */
public class SynchronizeBlock {

    public static volatile int count = 0;

//    public  void increment() {
//        count++;
//    }

    public static void main(String[] args) {
//        SynchronizeBlock sc = new SynchronizeBlock();
//        sc.runFunc();
//    }
//
//
//    public void runFunc(){
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10000; i++) {
                    synchronized (SynchronizeBlock.class) {
                        count++;
                    }
                    //  increment();
                }
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 10000; j++) {
                    synchronized (SynchronizeBlock.class) {
                        count++;
                    }
                    //increment();
                }
            }
        });


        th1.start();
        th2.start();


        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Value of Final Count is :-  " + count);

    }
}
