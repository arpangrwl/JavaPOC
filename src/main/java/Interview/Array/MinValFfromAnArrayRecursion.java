package Interview.Array;

/**
 * Created by Arpan on 9/18/17.
 */
public class MinValFfromAnArrayRecursion {

    public static void main(String[] args) {

        int arr[] = {10,1, 4, 2, 5,23,5,6,8,11,12};
        int maxInt = Integer.MAX_VALUE;

        System.out.println( func(arr,maxInt,arr.length-1));

    }

    public static int func(int arr[], int maxval, int len){

        if(len == -1)
            return maxval;

        return (maxval < arr[len]) ? func(arr, maxval, len-1) :  func(arr, arr[len], len-1) ;
    }

}
