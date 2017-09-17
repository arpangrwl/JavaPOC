package Interview.StringBaseQuestion;

import java.util.Arrays;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 */
public class Problem1 {

    public static void main(String[] args) {

        String str = "aahagabgaadeggfabahefeffefaeghggachg";

        char c[] = uniqueCharacter(str);

        for (Character a : c){
            System.out.print(a);
        }
    }

    public static char[] uniqueCharacter(String str) {

        boolean flag = false;
        char c[] = str.toCharArray();
        int n = 0;

        char tmp[] = new char[c.length-1];

        for(int i = 0 ; i < c.length  ;i++)
        {
            for(int j = i ; j < c.length - 1 ;j++)
            {
                if(c[i] == c[j+1])
                {
                   flag = false;
                   break;
                }
                else
                    flag = true;
            }

            if(flag){
                tmp[n] = c[i];
                n++;
            }

        }

        c = Arrays.copyOfRange(tmp, 0, n);

        return c;
    }
}
