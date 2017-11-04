package javaPOC.String;

/**
 * All N Length Strings from Given String of Length K

 */
public class problem5 {


    public static void main(String[] args) {

        String n = "ALGO";

        int val = 5;

        char arr[] = new char[val];

        func(val, n , arr);

    }

    public static void func(int val, String str, char arr[]){

        if(val <= 0)
            System.out.print(String.valueOf(arr) + " ");
        else
            for(int i = 0 ; i < str.length(); i++){
               arr[val - 1] = str.charAt(i);
               func(val-1 , str, arr);
            }


    }
}
