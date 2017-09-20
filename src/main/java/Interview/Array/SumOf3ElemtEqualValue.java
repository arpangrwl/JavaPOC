package Interview.Array;

/**
 * Find three elements in an array that sum to a given value
 */
public class SumOf3ElemtEqualValue {

    public static void main(String[] args) {

        int arr[] = { 3,1,7,4,5,9,10} , k = 24;

        int output[] = function(arr,k);

        for (Integer i : output) {
            System.out.print(i +"\t");
        }

    }

    public static int[] function(int[] arr, int sum) {
            int retArr[] = {0,0,0};
        for(int i = 0 ; i <arr.length ;i++)
        {
            for(int j = 0 ; j < arr.length ; j++)
            {
                if(i == j)
                    continue;

                for(int k = 0 ; k < arr.length ; k++)
                {
                    if(k == j || k == i)
                        continue;

                    if((arr[i] + arr[j] +arr[k]) == sum) {
                        retArr[0] = arr[i];
                        retArr[1] = arr[j];
                        retArr[2] = arr[k];

                        return retArr;
                    }
                }
            }
        }

        return retArr;
    }
}
