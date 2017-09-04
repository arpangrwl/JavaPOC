package javaPOC.String;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Arpan on 8/9/17.
 */
public class StringPool {

    public static void main(String[] args) {

        String a = "Test";
        String b = "Test";

        String c = new String("Test");

        Set<Object> set = new HashSet<Object>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add("Test");
        set.add(new String("Test"));
//        set.add(new dummy("Test"));
//        set.add(new dummy("Test"));
//        set.add(new dummy("Test"));


        Iterator<Object> itr = set.iterator();


        System.out.println(set.size());
    }
}

class dummy{
    String val = "";

    dummy(String str){
        val = str;
    }
}
