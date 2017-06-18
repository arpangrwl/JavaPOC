package javaPOC.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Arpan on 6/17/17.
 */
public class SortingNestedArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> nestArr = new ArrayList<ArrayList<String>>();

        ArrayList<String> inn = new ArrayList<String>();
                inn.add("arp9");
                inn.add("nip9");
                inn.add("mri9");
        nestArr.add(inn);

        ArrayList<String> inn1 = new ArrayList<String>();
        inn1.add("arp3");
        inn1.add("nip3");
        inn1.add("mri3");
        nestArr.add(inn1);

        ArrayList<String> inn2 = new ArrayList<String>();
        inn2.add("arp2");
        inn2.add("nip2");
        inn2.add("mri2");
        nestArr.add(inn2);

        ArrayList<String> inn3 = new ArrayList<String>();
        inn3.add("arp5");
        inn3.add("nip5");
        inn3.add("mri5");
        nestArr.add(inn3);

        System.out.println(nestArr);

        Collections.sort(nestArr, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }
        });

        System.out.println("\n\n\n" +nestArr);

    }
}
