package javaPOC.Thread.rough;

/**
 * Created by Arpan on 9/6/17.
 */
public class Class2 implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

    }

    public static void main(String[] args) {

        Thread t = new Thread(new Class2());
        t.start();

    }
}
