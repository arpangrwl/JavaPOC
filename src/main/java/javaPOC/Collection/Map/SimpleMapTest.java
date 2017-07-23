package javaPOC.Collection.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arpan on 7/16/17.
 */
public class SimpleMapTest {
    public static void main(String[] args) {

        HashMap<String, String> loans = new HashMap<String, String>();
        loans.put("home", "Citibank");
        loans.put("personal", "Wells Fargo");
        loans.put("car", "BOFA");
        loans.put("property", "Chase");
        loans.put("Study", "SBI");


//        for (String key : loans.keySet()) {
//            System.out.println("------------------------------------------------");
//            System.out.println("Iterating or looping map using java5 foreach loop");
//            System.out.println("key: " + key + " value: " + loans.get(key));
//        }
//
//
//        Iterator<Map.Entry<String, String>> iterator = loans.entrySet().iterator();
//
//        while(iterator.hasNext())
//        {
//            Map.Entry<String, String> entry = iterator.next();
//            System.out.printf("Key : %s and Value: %s %n", entry.getKey(), entry.getValue());
//            iterator.remove(); // right way to remove entries from Map, 
//            // avoids ConcurrentModificationException
//        }



        for (Map.Entry<String, String> entry : loans.entrySet()) {
            System.out.printf("Key : %s and Value: %s %n", entry.getKey(), entry.getValue());
        }


    }}