package javaPOC.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Program to count vowels in a string (Iterative and Recursive)
 */
public class CountVowels {

    public static void main(String[] args) {

        String str = "hello How are you";

        char arr[] = str.toCharArray();

        int cnt = 0 ;

        Character[] c = new Character[]{'a', 'e', 'i', 'o', 'u'};

        List<Character> l = Arrays.asList(c);

        HashSet<Character> vowel = new HashSet<Character>(l);


        for(int i = 0 ; i < arr.length ; i++){

            if(vowel.contains(arr[i])){
                ++cnt;
            }
        }

        System.out.println(cnt);
    }


}
