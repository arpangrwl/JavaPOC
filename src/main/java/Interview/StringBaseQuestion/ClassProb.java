package Interview.StringBaseQuestion;

/**
 * Created by Arpan on 10/26/17.
 */
public class ClassProb {

    public static void main(String[] args) {

        String value = "Blue is the sky";
        String arr[] = value.split("\\s+");

        for(int i = (arr.length - 1) ; i > -1 ;i--){
            System.out.print(arr[i] + " ");
        }

    }
}
