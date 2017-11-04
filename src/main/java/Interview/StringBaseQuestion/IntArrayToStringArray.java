package Interview.StringBaseQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * For a given int arr[] = {1,2,3,4,5,7,8,9,11,13,14};
 * String arr[] = {1->5,7->9,11,13,14};
 */
public class IntArrayToStringArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 7, 8, 9, 11, 13, 14};
        List<String> outVal = new ArrayList<String>();

        int ini = arr[0], fin = 0, cntr = 0;
        String tmpVal, tmp1;

        outVal.add(String.valueOf(arr[0]));

        for (int i = 1; i < arr.length; i++) {

            if ((arr[i - 1] + 1) == arr[i]) {
                tmpVal = outVal.get(cntr);
                if (tmpVal.contains("->")) {
                    outVal.remove(outVal.size()-1);
                    outVal.add(tmpVal.substring(0, tmpVal.indexOf("-")) + "->" + String.valueOf(arr[i]));
                } else {
                    outVal.remove(outVal.size()-1);
                    outVal.add(tmpVal + "->" + String.valueOf(arr[i]));
                }

            } else {
                outVal.add(String.valueOf(arr[i]));
                cntr++;
            }
        }


        for (String s : outVal) {
            System.out.print(s + "\t");

        }
    }
}
