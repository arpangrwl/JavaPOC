package Rough.rough;

/**
 * Created by Arpan on 10/22/17.
 */
public class mergingSortedArray {

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,7,14,15,16,17,18,57,80,91,93,95,96,1002};
        int arr2[] = {56,58,59,81,94,3001,3002,4000,4001};

        int SIZE = arr1.length + arr2.length;

        int[] arr3 = new int[SIZE];

        int arr1ptr = 0 , arr2ptr = 0;

        for(int i = 0 ; i < SIZE ; i++){

            if((arr1ptr < arr1.length) && (arr2ptr < arr2.length)) {
                if (arr1[arr1ptr] > arr2[arr2ptr]) {
                    arr3[i] = arr2[arr2ptr];
                    arr2ptr++;
                }
                else {
                    arr3[i] = arr1[arr1ptr];
                    arr1ptr++;
                }
            }else {

                if (arr2ptr == arr2.length) {
                    arr3[i] = arr1[arr1ptr];
                    arr1ptr++;
                } else if (arr1ptr == arr1.length) {
                    arr3[i] = arr2[arr2ptr];
                    arr2ptr++;
                }
            }
        }


        for(int j = 0 ;j < SIZE ; j++)
        {
            System.out.println(arr3[j]);
        }
    }

}
