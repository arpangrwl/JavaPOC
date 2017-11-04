package Rough.rough;

/**
 * Created by Arpan on 10/22/17.
 */
public class QuickSortPivot {

    public static void main(String[] args) {


        int arr[] = {7,2,1,8,6,3,5,4};
        int tmp,i = -1, pivot = arr[arr.length-1];
        for(int j = 0 ; j < arr.length - 1 ; j++)
        {
            if(pivot > arr[j]){
                ++i;
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }

            j++;
        }

        for(int j = arr.length - 2 ; j > (i-1) ; j--){
            arr[j] = arr[j-1];
        }

        arr[i+1] = pivot;


        for(int h = 0 ; h < arr.length ; h++)
            System.out.println(arr[h]);
    }
}
