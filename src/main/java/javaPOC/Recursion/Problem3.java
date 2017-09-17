package javaPOC.Recursion;

/**
 * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

 changePi("xpix") → "x3.14x"
 changePi("pipi") → "3.143.14"
 changePi("pip") → "3.14p"
 */
public class Problem3 {

    public static void main(String[] args) {

        System.out.println(changePi("pixpixpipipi"));
    }

    private static String changePi(String s) {

        if(s.length() < 2)
            return s;

        return (s.substring(0,2).equals("pi") ? "3.14" + changePi(s.substring(2)) : s.substring(0,1) + changePi(s.substring(1)));
    }

}
