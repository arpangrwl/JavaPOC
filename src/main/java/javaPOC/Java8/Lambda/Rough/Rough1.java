package javaPOC.Java8.Lambda.Rough;

interface General{

    public void opertn(int a , int b);

    default public  void sum(int a , int b ){
        System.out.println(a+b);
    }
}
public class Rough1 {
    public static void main(String[] args) {

        General g = (a, b) -> System.out.println(a+b);

        g.sum(1,2);
        g.opertn(3,4);
    }
}
