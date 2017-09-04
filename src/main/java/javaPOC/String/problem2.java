package javaPOC.String;

/**
 * Objec­tive: Print All N Length Strings from Given String of Length K where char­ac­ters can appear mul­ti­ple time.
 * String k = "ALGO"
   N=2

    Result:
    AA LA GA OA AL LL GL OL AG LG GG OG AO LO GO OO
 */
public class problem2 {

    public static void main(String[] args) {

    char arr[] = "ALGOG".toCharArray();

    int length = 2;

        printPattern(arr, length);

    }

    public static void printPattern(char[] arr, int length) {

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr.length ; j++){
                System.out.print(arr[i] +""+ arr[j] + "\t");
            }
        }
    }



}
