package Rough.Exceptions;

/**
 * Created by Arpan on 6/18/17.
 */
public class ExceptionInConstructor {
    public ExceptionInConstructor(int j) throws Exception {
        System.out.println();
        if(j == 0)
            throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        try {
            ExceptionInConstructor eic = new ExceptionInConstructor(12);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
