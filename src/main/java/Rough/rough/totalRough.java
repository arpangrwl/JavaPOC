package Rough.rough;

/**
 * Created by Arpan on 6/18/17.
 */
public class totalRough {

    {
        System.out.println("static block");

        int i = 4;

        System.out.println( i/0);

    }


    public void func()
    {

        System.out.println("function func");
    }

    public static void main(String[] args) {

        totalRough tr = new totalRough();
        tr.func();

    }
}
