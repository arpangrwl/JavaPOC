package javaPOC.String;

/**
 * Created by Arpan on 9/22/17.
 */
public class CheckingIfStringIsRotationOfOther {


    public static void main(String[] args) {

        String input = "sumitjain", output = "tjainsumi";

        if(function(input, output)){
            System.out.println("True");
        }
        else
            System.out.println("false");

    }

    public static boolean function(String input, String output) {
        if(input.length() != output.length()) return false;

        int upper = 0 ;
        for(int i = 0 ; i < input.length();i++){
           if(input.substring(i).equals(output.substring(0,output.length() - i))){
               upper = i ; break;
           }
        }

        if(upper == 0) return true;
        if(input.substring(0,upper).equals(output.substring(output.length() - upper,output.length())))
            return true;

        return false;
    }
}


