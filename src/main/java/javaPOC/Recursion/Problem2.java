package javaPOC.Recursion;

/**
 * Given a non-negative int n, return the count of the occurrences of 7 as a digit,
 * so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost
 * digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

 count7(717) → 2
 count7(7) → 1
 count7(123) → 0
 */
public class Problem2 {

    public static void main(String[] args) {

        System.out.println(count7(717171712323237777l));
    }

    private static int count7(long i) {

        if (i == 0 )
            return 0;

        return ((i%10 == 7) ? (1 + count7(i/10)) : count7(i/10));
    }
}
