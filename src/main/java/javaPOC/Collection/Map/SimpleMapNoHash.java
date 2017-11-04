package javaPOC.Collection.Map;

import java.util.HashMap;

/**
 * Created by Arpan on 10/5/17.
 */
public class SimpleMapNoHash {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put(null, "Value");
        hm.put(null, "Value1");
        hm.put(null, "Value2");
        hm.put("A", "Value3");
        hm.put("B", "Value4");
        hm.put("C", "Value5");

//        for(Map.Entry<String, String> e : hm.entrySet()){
//
//            System.out.println(e.getKey() + "  " + e.getValue());
//        }


        System.out.println(hm.get(null));
    }
}
