package javaPOC.String;

/**
 * The Word Break Problem
 * Objec­tive : Given an string and a dic­tio­nary of words, find out if the input string can be bro­ken
 * into a space-separated sequence of one or more dic­tio­nary words.
 * <p>
 * Exam­ple:
 * <p>
 * dictionary = ["I" , "have", "Jain", "Sumit", "am", "this", "dog"]
 * <p>
 * String = "IamSumit"
 * <p>
 * Output: "I am Sumit"
 * <p>
 * String ="thisisadog"
 * <p>
 * Output : String can't be broken
 */
public class WordBreakProblem {

    public static void main(String[] args) {


        String dic[] = {"I", "have", "Jain", "Sumit", "am", "this", "dog"};

        String val = "IamSumit";
        String Output = "I am Sumit";
        StringBuffer sb = new StringBuffer();

        int first = 0, last = val.length(), sum =0;

        for (String s : dic) {
            if (val.length() >= (sum = sum + s.length())) {
                if (s.equals(val.substring(first, sum))) {
                    sb.append(val.substring(first, sum)).append(" ");
                    first = sum;
                    sum = sum ;
                }
                else{
                    sum = first;
                }
            }
        }

        System.out.println(sb);


    }
}
