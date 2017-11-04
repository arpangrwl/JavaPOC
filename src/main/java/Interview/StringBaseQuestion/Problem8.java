package Interview.StringBaseQuestion;

/**
 * Objective: Write an algorithm to find The Longest Sequence Of Pre­fix Shared By All The Words In A String.
 * This inter­est­ing prob­lem was asked in the Google inter­view for soft­ware engi­neer.
 * This prob­lem is bit tricky, it looks dif­fi­cult but actu­ally it is sim­ple problem.
 * <p>
 * Input: A String
 * <p>
 * Out­put: The longest sequence of pre­fix com­mon in all the words in a string
 * <p>
 * Exam­ple:
 * <p>
 * “Bed­room Bed­Clock Bed­Table Bed­Wall” => “Bed”
 */
public class Problem8 {

    public static void main(String[] args) {

        String str = "Bed1room Bed1Clock Bed1Table BedWall";

        String arr[] = str.split("\\s+");

        StringBuilder sb = new StringBuilder();

        int cnt = 0, index = 0;

        Boolean flag = false;
        while (true) {
            for (int i = 1; i < arr.length; i++) {

                if (arr[i - 1].charAt(index) == arr[i].charAt(index)) {
                    cnt++;
                } else {
                    flag = true;
                    break;
                }

                if (cnt == arr.length - 1) {
                    sb.append(arr[i].charAt(index));
                    index++;
                    cnt = 0;
                }
            }

            if(flag)
            break;
        }

        System.out.println(sb.toString());

    }
}
