package Interview.StringBaseQuestion;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Objec­tive : Given an string and a dic­tio­nary of words, find out if the input string can be bro­ken into a space-separated sequence of one or more dic­tio­nary words.

 Exam­ple:

 dictionary = ["I" , "have", "Jain", "Sumit", "am", "this", "dog"]

 String = "IamSumit"

 Output: "I am Sumit"

 String ="thisisadog"

 Output : String can't be broken
 */

public class Problem6 {

    public static void main(String[] args) {


        String arr[] = {"I" , "have", "Jain", "Sumit", "am", "this", "dog"};
        HashSet<String> hs = new HashSet<>(Arrays.asList(arr));

        String str= "IamSumit";
        char ch[] = str.toCharArray();
        StringBuilder sb  = new StringBuilder();
        StringBuilder tmp  = new StringBuilder();

        for(int i = 0 ; i < ch.length ; i++ ){

            tmp.append(ch[i]);

            if(hs.contains(tmp.toString())){
                sb.append(tmp).append(" ");
                tmp.setLength(0);
            }
        }

        System.out.println(sb.toString());
    }
}
