package javaPOC.passByReferenceOrValue;

/**
 * Created by Arpan on 9/4/17.
 */
public class passByValue2 {
    public static void main(String args[]) {
        String str= "Old value";
        printNext(str);
        System.out.println("number Inside main(): "+str);
    }

    public static void printNext(String str){
        str = "new value is present";
    }
}
