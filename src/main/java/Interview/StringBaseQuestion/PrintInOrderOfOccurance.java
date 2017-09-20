package Interview.StringBaseQuestion;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 * Print all the character in the order of occurance..
 */
public class PrintInOrderOfOccurance {

    public static void main(String[] args) {

        String s = "aaaabbbbwwewewesdf";
        char arr[] = s.toCharArray();

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

        for (Character ch : arr){
            if(hm.containsKey(ch))
                hm.put(ch,1);
            else
                hm.put(ch,hm.get(ch) + 1 );
        }

        Collections.sort((List)hm.entrySet(), new Comparator<Object>() {

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });


    }
}
