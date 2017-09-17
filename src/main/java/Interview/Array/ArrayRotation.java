package Interview.Array;

/**
 * Program for array rotation
 */
public class ArrayRotation {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9};

        int sol[] = {3,4,5,6,7,8,9,1,2};

        int temp[] = new int[arr.length];

        ArrayRotation ar = new ArrayRotation();

        temp = ar.rotationByADigit(arr, 0);



    }

    public int[] rotationByADigit(int arr[], int rotation){
        int tmp[] = new int[arr.length];
        int range = 0;
        for(int i = rotation ; i < arr.length ; i++)
        {
            tmp[range++] = arr[i];
        }

        if(rotation > 0) {
            for (int j = 0; j < rotation; j++){
                tmp[range++] = arr[j];
            }

        }


        return tmp;

    }


}
