package javaPOC.Recursion;

/**
 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
 * Compute the result recursively (without loops).
 */
public class Factorial {

    public static void main(String[] args) {
        int val = 5  ;

        System.out.println(factorialOfaNumber(val));
    }


    public static int factorialOfaNumber(int i){

        if(i < 2)
            return 1;

        return i * factorialOfaNumber(i -1 );

    }
}
