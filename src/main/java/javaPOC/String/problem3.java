package javaPOC.String;

/**
 * Created by Arpan on 9/4/17.
 */
public class problem3 {

    public static void func(String str)
    {
        System.out.println("String Print :--> " +str);
    }

    public static void func(Object obj){
        System.out.println("Object Print :--> ");
    }

    public static void func(Integer s){
        System.out.println("Integer Print :--> ");
    }

    public static void main(String[] args) {

       // func(null);   //--> this will not get compiled..

    }
}
