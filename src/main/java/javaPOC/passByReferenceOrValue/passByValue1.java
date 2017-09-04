package javaPOC.passByReferenceOrValue;

/**
 * Created by Arpan on 9/4/17.
 */
public class passByValue1 {
    public static void main(String args[]) {
        int number = 3;
        printNext(number);
        System.out.println("number Inside main(): "+number);
    }

    public static void printNext(int number){
        number++;
        System.out.println("number Inside printNext(): "+number);
    }

}


