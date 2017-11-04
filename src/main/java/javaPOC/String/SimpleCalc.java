package javaPOC.String;

/**
 * Created by Arpan on 10/10/17.
 */
public class SimpleCalc {

    public static int eval(String str) {

        int result = 0;
        char arr[] = str.toCharArray();

        int var[] = {0,0}, cnt=0;

        boolean sum = false;
        boolean sub = false;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == '+'){
                sum = true;
                cnt++;
                continue;
            }
            else if(arr[i] == '-'){
                sub = true;
                cnt++;
                continue;
            }
            else{
                var[cnt] = var[cnt]*10 + Character.getNumericValue(arr[i]);

                if(arr[i+1] == '+' ||  arr[i+1] =='i'){

                }
            }

            if(sum){

                sum = false;
            }else if(sub){

                sub = false;
            }

        }

        return result;
    }

    public static void main(String[] args) {

        String str = "3-5+6-19+20";

        System.out.println(eval(str));

    }
}
