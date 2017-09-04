package javaPOC.Static;

/**
 * Created by Arpan on 8/10/17.
 */
public class StaticBlock {

    public static final int i = 5;
    public String j ;


    public static void main(String[] args) {

        StaticBlock sb = new StaticBlock();
        System.out.println(sb.j);
    }
}
