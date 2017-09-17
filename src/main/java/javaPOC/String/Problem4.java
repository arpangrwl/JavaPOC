package javaPOC.String;

/**
 * Reverse an array without affecting special characters
 */
public class Problem4 {

    public static void main(String[] args) {

        String val = "abcd#e$f%g^h&i*jk" ;

        char arr[] = val.toCharArray();
        char temp[] = new char[arr.length];

        int convertedVal = 0;
        for(int i = 0 ; i < arr.length ;i++)
        {
            convertedVal = (int) arr[i];
            if(((convertedVal > 64  || convertedVal <91 )) || (convertedVal > 96  || convertedVal < 123 )) {
                    temp[i] = arr[i];
            }

        }

        for(Character c : temp)
            System.out.print(c);

    }
}
