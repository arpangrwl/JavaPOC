package Rough.rough;

import java.util.Arrays;

public class probelm1 {

    public static void main(String[] args) {

        int num = 4 ;
        int div = 2;
        int arr[] = new int[div];
        func(div, num , arr);


    }

    public static void func(int div, int num , int arr[]){
        if(div <= 0)
            System.out.print(Arrays.toString(arr));
        else{
            for(int i = 1; i <= num ; i++ ){

                if((div - 1) == 0){
                   //  arr[div - 1] = num - sum(Arrays.asList(arr)) ;
                     func(div - 1 , num - i , arr);
                }
                else{
                    arr[div - 1] = i ;
                    func(div - 1 , num - i , arr);
                }

            }
        }
    }


}
