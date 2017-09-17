package javaPOC.ExceptionHandle;

/**
 * Created by Arpan on 9/4/17.
 */
public class problem1 {

    public static void main(String[] args) {

        System.out.println(function());
    }

    public static int function(){

        try{
            System.out.println("try");
            int x = 4/0;
            return 10;
        }
        catch(Exception e)
        {
            System.out.println("catch");
        }
        finally{
            System.out.println("finally");
            return 10;
        }
    }
}
