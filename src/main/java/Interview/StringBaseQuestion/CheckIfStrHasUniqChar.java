package Interview.StringBaseQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arpan on 9/19/17.
 */
public class CheckIfStrHasUniqChar {

    public static void main(String[] args) {

        String str= "adxsfg2zz";

        if(funcCheckIfStrHasUniqChar(str)){
            System.out.println("Unique");
        }
        else
        {
            System.out.println("Not");
        }

    }

    public static boolean funcCheckIfStrHasUniqChar(String str){

        char c[]= str.toCharArray();

        Arrays.sort(c);

        for(int i =0 ;i < c.length - 1 ; i++){

            if(c[i] == c[i+1])
                return false;

        }
        return true;
    }

    public static boolean funcCheckIfStrHasUniqChar2(String str){

        char c[]= str.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (Character ch : c){
            if(hm.containsKey(ch))
                hm.put(ch,1);
            else
                hm.put(ch,hm.get(ch) + 1 );
        }

        for(Map.Entry<Character,Integer> entry : hm.entrySet())
        {
            if(entry.getValue() > 1)
                return false;
        }

        return true;
    }
}
