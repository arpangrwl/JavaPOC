package javaPOC.String;

/**
 * Objec­tive: Write an algo­rithm to find The Longest Sequence Of Pre­fix Shared By All The Words In A String.
 * This inter­est­ing prob­lem was asked in the Google inter­view for soft­ware engi­neer.
 * This prob­lem is bit tricky, it looks dif­fi­cult but actu­ally it is sim­ple problem.

 Input: A String

 Out­put: The longest sequence of pre­fix com­mon in all the words in a string

 Exam­ple:

 “Bedroom BedClock BedTable BedWall” => “Bed”
 */
public class LongestPrefixOfASentence {

    public static void main(String[] args) {

        String str = "Bedroom BedClock BedTable BedWall";
        System.out.println(function(str));
    }


    public static String function(String str){

        String arr[] =str.split(" ");

        int len = minLength(arr);

        StringBuffer sb = new StringBuffer(len);

        int cntr = 1;
        for(int i = 0 ; i < len ; i++)
        {
            for(int j = 0 ; j < arr.length - 1 ;j++)
            {
                if(arr[j].charAt(i) == arr[j+1].charAt(i))  {
                    ++cntr;
                    if(cntr == arr.length){
                        sb.append(arr[j].charAt(i));
                        cntr = 1;
                    }
                }
                else
                    return sb.toString();
            }
        }

        return null;
    }

    private static int minLength(String[] arr) {

        return 7;
    }
}
