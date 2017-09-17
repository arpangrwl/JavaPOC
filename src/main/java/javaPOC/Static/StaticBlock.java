package javaPOC.Static;

/**
 * Created by Arpan on 8/10/17.
 */
public class StaticBlock {

    public static final int i = 5;
     String j ;

    static int val = 30;

   {
        System.out.println("without static keyword");
        val = 10;
       // j = "da";
    }

    static{

        System.out.println("static block");
    }

    public static void main(String[] args) {

        StaticBlock sb = new StaticBlock();
        System.out.println(sb.j);


        StaticBlock sb1 = new StaticBlock();
        System.out.println(sb1.j);
    }
}
