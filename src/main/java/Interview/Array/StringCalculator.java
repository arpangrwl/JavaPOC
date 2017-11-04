package Interview.Array;

/**
 * Created by Arpan on 10/21/17.
 */
public class StringCalculator {

    public static void main(String[] args) {

        String eval = "2+3*2/2+2*5/5*5";

        System.out.println(calculator(eval));
    }

    public static int calcMulAndDiv(String val){

        String nos[] = val.split("\\D+");
        String opr[] = val.split("\\d+");
        int res = Integer.parseInt(nos[0]);

        for(int i = 1; i< opr.length ;i++){

            if(opr[i].equals("*")){
                res = res * Integer.parseInt(nos[i]);
            }
            else if(opr[i].equals("/")){
                res = res / Integer.parseInt(nos[i]);
            }

        }

        return res;
    }

    public static int calculator(String val){

        String nos[] = val.split("[+-]");
        String operators = val.replaceAll("[^+-]","");
        char opr[] = operators.toCharArray();
        int result = 0;

        if(nos[0].contains("*") || nos[0].contains("*")){
            result = calcMulAndDiv(nos[0]);
        }else{
            result = Integer.parseInt(nos[0]);
        }

        for(int i = 0 ; i < opr.length ; i++){

            if(opr[i] == '+'){
                if(nos[i+1].contains("*") || nos[i+1].contains("*")){
                    result = result + calcMulAndDiv(nos[i+1]);
                }else{
                    result = result + Integer.parseInt(nos[i+1]);
                }
            }
            else if(opr[i] == '-'){
                if(nos[i+1].contains("*") || nos[i+1].contains("*")){
                    result = result + calcMulAndDiv(nos[i+1]);
                }else{
                    result = result - Integer.parseInt(nos[i+1]);
                }
            }

        }

        return result;
    }
}
