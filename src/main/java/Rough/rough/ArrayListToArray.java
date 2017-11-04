package Rough.rough;

import java.util.ArrayList;

/**
 * Created by Arpan on 10/26/17.
 */
public class ArrayListToArray {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);

        ArrayList<Integer> la = new ArrayList<>();
        la = al;
        la.add(16);

        for(Integer i : la)
        {
            System.out.println(i);
        }

    }
}
