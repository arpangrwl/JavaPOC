package javaPOC.String;

/**
 * Input String : ssssuuuummmmmmiiiittttttttttttt
 Compressed String : s4u4m6i4t13

 Input String : Jaain
 Compressed String : Jaain (Since compressed string is length is greater than original string)
 */
public class StringCompression {

    public static void main(String[] args) {

        String str = "abcdefgssssuuuummmmmmiiiittttttttttttt";

        System.out.println(function(str));
    }

    public static String function(String str){

        StringBuffer sb = new StringBuffer(str.length());

        int cnt = 1;

        for(int i = 0 ;i < str.length() - 1 ; i++){

            if(str.charAt(i) == str.charAt(i+1)){
                ++cnt;

                if( i ==  str.length() - 2){
                    if(cnt > 1){
                        sb.append(str.charAt(i)).append(cnt);
                    }
                }
            }
            else{

                if(cnt > 1) {
                    sb.append(str.charAt(i)).append(cnt);
                }
                else
                    sb.append(str.charAt(i));

                cnt = 1;
            }
        }

        if(str.length() == sb.toString().length()){
            return str;
        }

        return sb.toString();
    }
}
