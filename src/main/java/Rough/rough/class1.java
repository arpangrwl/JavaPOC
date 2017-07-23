package Rough.rough;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arpan on 7/16/17.
 */
public class class1 {
    public static HashMap<String, Integer> hm = new HashMap<>();
    public static void main(String[] args) {



        hm.put("A", 1);
        hm.put("B", 2);

        class2.function(hm);

        for(Map.Entry<String, Integer> asa : hm.entrySet())
        {
            System.out.println(asa.getKey() + "\t\t\t" + asa.getValue());
        }

    }
}
