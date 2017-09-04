package Interview;

/**
 * Created by Arpan on 7/24/17.
 */
public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {0,1,2,3,5,8,67,78,89,90,100,123,234,5646};
        int search = 234;
        int val = -1;

        int low = 0;
        int high = arr.length - 1;
        int mid;

        while(low < high){
            mid = (high + low) / 2 ;
            if(arr[mid] > search )
            {
                high = mid -1;
            }
            else if(arr[mid] < search){
                low = mid+1;
            }
            else if(arr[mid] == search)
            {
                val = mid;
                break;
            }
        }
    }
}
