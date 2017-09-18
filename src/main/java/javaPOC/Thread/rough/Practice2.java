package javaPOC.Thread.rough;

/**
 * Created by Arpan on 9/17/17.
 */
public class Practice2 {
    public static volatile int cnt;

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 10000; i++){
                    new Practice2().method();
                }
            }
        });

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 10000; i++){
                    new Practice2().method();
                }
            }
        });
        t.start();
        t1.start();

        try {
            t.join();
            t1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(cnt);
    }

    public synchronized void method(){
            cnt++;
    }

    public synchronized static void staticMethod(){
            cnt++;
    }
}
