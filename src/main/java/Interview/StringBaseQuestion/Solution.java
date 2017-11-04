package Interview.StringBaseQuestion;

import java.util.*;
import java.util.stream.Stream;

public class Solution {

    static void isValid(String s) {

        HashMap<Character, Integer> charFreq = new HashMap<Character, Integer>();

        char arr[] = s.toCharArray();

        for (Character c : arr) {
            if (charFreq.containsKey(c))
                charFreq.put(c, charFreq.get(c) + 1);
            else
                charFreq.put(c, 1);
        }

        Stream<Integer> stream = (Stream<Integer>) charFreq.values();
        stream.forEach(System.out::print);
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//         isValid(s);
        //  System.out.println(result);

        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6);

        Stream<Integer> stream = l.stream();

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("ad0", 15);
        hm.put("ad1", 15);
        hm.put("ad2", 15);
        hm.put("ad3", 15);
        hm.put("ad3", 15);
        hm.put("ad3", 15);
        hm.put("ad3", 15);

        for(Map.Entry<String, Integer> entry : hm.entrySet()){


        }

        hm.values().stream().forEach(a -> {
            if (hm.values().contains(a)) {
                System.out.println("true");
            } else
                System.out.println("false");

        });




    }
}
