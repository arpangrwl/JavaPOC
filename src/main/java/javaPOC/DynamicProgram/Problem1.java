package javaPOC.DynamicProgram;

/**
 * Created by Arpan on 9/23/17.
 */
public class Problem1 {

    public static void main(String[] args) {

        int value[] = {1,5,8,9,10,17,17,20,24,30};

        System.out.println("Max profit for length is " + 5 + ":" +profit(value, 5));

    }


    public static int profit(int[] value, int length) {
        if (length <= 0)
            return 0;
        // either we will cut it or don't cut it
        int max = -1;
        for(int i=0;i<length;i++)
            max = Math.max(max, value[i] + profit(value, length-(i+1)));
        return max;
    }
}




