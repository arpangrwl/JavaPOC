package javaPOC.String;

/**
 * Created by Arpan on 9/4/17.
 */
public class StringPool3 {

    public static void main(String[] args) {
        String a = "abc";
        String b = a;
        a += "d";
        System.out.println(a + "   " + b + "   " + (a==b));

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1 + "   " + sb2 + "   " + (sb1==sb2));

    }

}
