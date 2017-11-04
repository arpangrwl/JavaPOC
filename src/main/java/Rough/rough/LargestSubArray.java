package Rough.rough;

/**
 * Maximum Subarray OR Largest Sum Contiguous Subarray Problem – Divide and Conquer

 Objec­tive:  The max­i­mum sub­ar­ray prob­lem is the task of find­ing the con­tigu­ous sub­ar­ray within a
 one-dimensional array of num­bers which has the largest sum.

 Exam­ple:

 int [] A = {−2, 1, −3, 4, −1, 2, 1, −5, 4};
 Output: contiguous subarray with the largest sum is 4, −1, 2, 1, with sum 6.
 */
public class LargestSubArray {

    public static void main(String[] args) {
        int []a = {-2, 1, -3, 4, -1, 2, 1, -5, 4,6,6};

        int arrLeft = -1 , arrRight = -1;

        int maxval = Integer.MIN_VALUE;
        int tmp = 0;
        for(int i = 0 ; i < a.length-1 ; i++){

            for(int j = i ; j < a.length ; j++){

                tmp += a[j];

                if(maxval < tmp) {
                    maxval = tmp;
                    arrLeft = i;
                    arrRight = j;
                }

            }
            tmp = 0;
        }

        System.out.println(maxval);
        System.out.println(arrLeft);
        System.out.println(arrRight);
    }
}
