package javaPOC.String;

/**
 * Created by Arpan on 9/4/17.
 */
public class StringPool2 {

    public static void main(String[] args) {

        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        if(a == b){
            System.out.println("String pool case");
        }

        if( a == c )
            System.out.println("String pool case");
        else
            System.out.println("C is on Heap");


        if(a.equals(c))
        {
            System.out.println("values are same");
        }

        System.out.println("======================================================");

        String s1 = "Hello".concat("World");
        String s3 = new String("HelloWorld");
        String s2 = s1.intern();
        System.out.println(s1 == s2); //false
        System.out.println(s1 == s3); //false
        System.out.println(s2 == s3); //false


    }
}
