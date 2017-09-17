package javaPOC.Static;

/**
 * Created by Arpan on 9/4/17.
 */

 public class StaticClassExample{
    //Static class
    static int val = 20 ;
    static class StaticClass{
        static String str = "Inside Class X";
        static int i = 9;
       // val = 21;
    }
    public static void main(String args[])
    {
        StaticClass.str="Inside Class Example1";
        System.out.println("String stored in str is- "+ StaticClass.str);

        StaticClassExample.StaticClass obj = new StaticClassExample.StaticClass();
        obj.str = "hello";


    }
}
