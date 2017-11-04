package javaPOC.Thread.rough;

import java.util.concurrent.Callable;

/**
 * Created by Arpan on 10/9/17.
 */
public class CallableImpl implements Callable<String> {
    @Override
    public String call() throws Exception {

        return String.valueOf(Thread.currentThread());
    }

    public static void main(String[] args) {
        Callable<String> c = new CallableImpl();

       // Future<String> f =
    }
}
