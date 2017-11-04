package Interview.StringBaseQuestion;

import java.util.*;

/**
 * You are given set of strings, You have return anagrams subsets from it.
 * An anagram set is that one where every string is an anagram of another string.
 * If the subset contains only one string, don't include that in the result.
 example: String[] str = {"cat","dog","ogd","act","tca","ofg"}; is given
 and the o/p -
 dog ogd
 cat act tca
 ofg

 */
public class Problem2 {

    public static void main(String[] args) {

        HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();

        String[] str = {"cat","dog","ogd","act","tca","ofg"};

        String outpt;

        for(int i = 0 ; i < str.length ; i++){
            outpt = function(str[i]);

            if(hm.containsKey(outpt)) {
                ArrayList<String>  la = new ArrayList<String>();
                la = hm.get(outpt);
                la.add(str[i]);
                hm.put(outpt, la);
            }else{
                ArrayList<String> al = new ArrayList<String>();
                al.add(str[i]);
                hm.put(outpt, al);
            }
        }

        Iterator<ArrayList<String>> itr = hm.values().iterator();

        while(itr.hasNext()){

            ArrayList<String> newVal = itr.next();

            for (String s: newVal)
                System.out.print(s + "\t");

            System.out.println();
        }
    }

    public static String function(String str){

        char arr[] = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        Arrays.sort(arr);
        for(Character C : arr)
            sb.append(C);
        return sb.toString();
    }


    public boolean Anagram(String str1 , String str2){

        char arr1[] = str1.toCharArray(), arr2[] = str2.toCharArray();
        List<Character> l = new ArrayList<Character>();

        for(Character c : arr1){
            l.add(c);
        }

        List<Character> l1 = new ArrayList<Character>();

        for(Character c1 : arr2){
            l1.add(c1);
        }

        Collections.sort(l);Collections.sort(l1);

        for(int i = 0 ; i < l.size() ; i++)
        {
            if(l.get(i).equals(l1.get(i))){

            }
            else{
                return false;
            }

        }

        return true;
    }
}
