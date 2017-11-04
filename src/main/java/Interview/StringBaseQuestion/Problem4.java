package Interview.StringBaseQuestion;

/**
 * You are given two string (like two statements).
 * You have to remove all the words of second string from first string and print the remaining first string.
 * Please maintain the order of the remaining words from the first string.
 * You will be only removing the first word, not all occurrence of a word.
 Example: Str1 = "A Statement is a Statement", Str2 = "Statement a"
 Output: "A is Statement"
 */
public class Problem4 {

    public static void main(String[] args) {

        String Str1 = "A Statement is a Statement", Str2 = "Statement a" ;

        String arr2[] = Str2.split("\\s+");

        String newWord = null;

        for(String word : arr2){

            if(Str1.contains(word)){
                Str1 = Str1.replaceFirst(word,"");
            }
        }

        System.out.println(Str1);

        Str1 = Str1.replaceAll("\\s+", " ");

        System.out.println(Str1);
    }
}
