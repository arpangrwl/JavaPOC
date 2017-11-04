package Interview.StringBaseQuestion;

/**
 * Given a string of numbers in sequence order. find the missing number.Range is not given.
 * sample input:"9899100101103104105"
 * Answer:102
 */
public class Problem3 {
    public static void main(String[] args) {
        String val = "9899100101103104105";
        int valLen = val.length();
        int cnt = 0;
        int firstNum = Integer.parseInt(val.substring(0, 1));
        int valIndex = 1, updtIndex;
        int newVal = firstNum + 1;
        int newNoIs = 0, rotateIndex = 1, noToCompare;

        while (true) {
            for (int i = 1; i < valLen; ) {
                updtIndex = valIndex + String.valueOf(newVal).length();
                i = i + String.valueOf(newVal).length();
                if (i < valLen) {
                    noToCompare = Integer.parseInt(val.substring(valIndex, updtIndex));
                    if (newVal == noToCompare) {
                        cnt++;
                    } else {
                        newNoIs = noToCompare - 1;
                        newVal++;
                        if (newVal == noToCompare) {
                            cnt++;
                        }
                    }
                    valIndex = updtIndex;
                } else
                    break;
                newVal++;
            }
            if (cnt > 3 && newNoIs != 0) {
                System.out.println(newNoIs);
                break;
            } else {
                firstNum = Integer.parseInt(val.substring(0, ++rotateIndex));
                newVal = firstNum + 1;
                valIndex = String.valueOf(firstNum).length();
            }
        }
    }
}
