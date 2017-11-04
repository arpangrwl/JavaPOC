package Interview.StringBaseQuestion;

/**
 * Reverse this string 1+2*3-20. Note: 20 must be retained as is.
 * Expected output: 20-3*2+1
 */
public class ReversingMathString {

    public static void main(String[] args) {

        String val = "1+2*3-20";
        String intArr[] = val.split("\\D");
        String opr[] = val.split("\\d");
        StringBuffer sb = new StringBuffer();

        for (int i = intArr.length - 1; i > -1; i--) {

            if (i == 0) {
                sb.append(intArr[i]);
            } else {
                sb.append(intArr[i]).append(opr[i]);
            }

        }

        System.out.println(sb);
    }
}
