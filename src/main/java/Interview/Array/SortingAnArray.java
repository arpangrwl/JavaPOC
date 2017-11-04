package Interview.Array;

/**
 * Objec­tive:  Given an array which con­tains only 0’s and 1’s.
 * write an algo­rithm to sep­a­rate 0’s and 1’s.

 Example

 int [] arrA = {1,0,1,0,1,1,0,0,0,0,1};
 Output: [0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
 */
public class SortingAnArray {

    public static void main(String[] args) {

        int []arr = {1,0,1,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,1,1,0,0,0,0,1};
        int i = 0 , j = arr.length -1, tmp =-1;

        while(i < j){

            if(arr[i] == 0)
                i++;
            if(arr[j] == 1)
                j--;

            if(arr[i] !=0 && arr[j] !=1){
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++; j--;
            }

        }

        for(Integer in : arr){

            System.out.print(in + "\t");
        }
    }
}
