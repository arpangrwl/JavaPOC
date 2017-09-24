package javaPOC.Sort.Rough;

public class MergeSort {


    public void splitArray(int arr[], int left, int right){
        int mid;
        while(left < right){
            mid = (left + right)/2;

            splitArray(arr, left, mid);
            splitArray(arr, mid + 1, right);

            sort(arr, left, mid, right);

        }
    }

    public void sort(int[] arr, int left, int mid, int right) {


        int n1 = mid - left +1;
        int n2 = right - mid;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];


        for(int i = 0 ; i < n1 ;i++){
            arr1[i] = arr[i];
        }

        for(int j = 0 ; j < n2 ; j++){
           // arr2[j] =
        }


    }

    public static void main(String[] args) {

    }
}
