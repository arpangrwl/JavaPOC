package javaPOC.DynamicProgram;

/**
 * Created by Arpan on 9/17/17.
 */
public class Fabonaaci {

    public static void main(String[] args) {

        System.out.println(recursiveMethod(9));
    }

    public static int recursiveMethod(int i) {
        if(i == 0) return 0;

        if (i < 2)
            return 1;
        return recursiveMethod(i - 1) + recursiveMethod(i - 2);
    }
}
