package javaPOC.Lambda;

/**
 * Created by Arpan on 9/11/17.
 */
@FunctionalInterface
interface dummy{

    public int func(int i , int j );

}
public class ThirdLambda {
    public static void main(String[] args) {
        dummy d = (a, b) -> (a+b);
        System.out.println(d.func(2,3));


    }
}
