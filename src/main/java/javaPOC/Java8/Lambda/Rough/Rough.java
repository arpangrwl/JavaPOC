package javaPOC.Java8.Lambda.Rough;

interface functnal{

    public int operations(int i , int j );
}
public class Rough {
    public static void main(String[] args) {

        functnal sum = (a, b) -> (a+b);
        System.out.println(sum.operations(3,4));

        functnal multi = (a,b) -> (a*b);
        System.out.println(multi.operations(3,4));

    }
}
