package javaPOC.Collection;

import java.util.*;

/**
 * Created by Arpan on 9/19/17.
 */
public class Conversion {

    public static void main(String[] args) {

        HashMap<String , Integer> hm = new HashMap<>();

        hm.put("Hello",1);
        hm.put("hi",2);
        hm.put("Arpan",3);
        hm.put("Nipun",4);
        hm.put("Ajay",5);

        Set s = hm.entrySet();

        LinkedList l = new LinkedList(s);

        Iterator itr = l.iterator();

        while(itr.hasNext()){

            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + "  -->  "+ entry.getValue());
        }

    }
}
