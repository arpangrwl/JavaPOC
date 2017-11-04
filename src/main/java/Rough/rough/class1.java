package Rough.rough;

/**
 * Created by Arpan on 7/16/17.
 */
public class class1 {
    public static void main(String[] args) {

        String str = "This is a sentence.  This is a question, right?  Yes!  It is.";
        String delims = "[ .,?!]+";
        String[] tokens = str.split(delims);

        for(String i : tokens){
            System.out.println(i);
        }

        String expr = "2*x^3 - 4/5*y + z^2";
        String del = "[+\\-*/\\^ ]+"; // so the delimiters are:  + - * / ^ space
        String[] tok = expr.split(del);

        for(String ii : tok){
            System.out.println(ii);
        }
    }
}
