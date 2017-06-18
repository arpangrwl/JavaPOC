package javaPOC.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Arpan on 6/17/17.
 */
public class BasicComparatorArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(15);
        al.add(1);
        al.add(89);
        al.add(65);
        al.add(45);

        System.out.println(al);

        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               return ( o1 > o2 ? 1 : (o1 < o2 ? -1 : 0));
            }
        });

        System.out.println("\n\n\n" + al);


    }
}
