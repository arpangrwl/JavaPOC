package Interview.StringBaseQuestion;

/**
 * Convert Camel casing working into separate works
 * <p>
 * Example :- helloHowAreYou --> hello how are you
 */
public class Problem9 {

    public static void main(String[] args) {
        String str = "helloHowAreYou";

        StringBuilder sb = new StringBuilder();

        char arr[] = str.toCharArray();

        String val = "";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == Character.toUpperCase(arr[i]))
                sb.append(" ").append(arr[i]);
            else
                sb.append(arr[i]);
        }

        System.out.println(sb.toString());
    }
}
