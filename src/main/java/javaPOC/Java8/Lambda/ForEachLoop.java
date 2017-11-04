package javaPOC.Java8.Lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Arpan on 10/11/17.
 */
public class ForEachLoop {

    public static void main(String[] args) {

        Integer i[] = {12,13,14,15,16,16,17};

        List<Integer> l = Arrays.asList(i);

        l.forEach(s -> System.out.println(s));
    }
}
