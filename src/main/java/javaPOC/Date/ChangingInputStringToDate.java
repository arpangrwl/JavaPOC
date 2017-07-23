package javaPOC.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Arpan on 7/12/17.
 */
public class ChangingInputStringToDate {

    public static void main(String[] args) {
        //String dateValue = "201707121804";

        SimpleDateFormat inputDateFormate = new SimpleDateFormat("yyyyMMddHHmm");
        String dateInString = "201708010024";

        SimpleDateFormat convertedDataPathFormate = new SimpleDateFormat("/yyyy/MM/dd/HH/");


        try {

            Date date = inputDateFormate.parse(dateInString);
            System.out.println(date);

//            String dataPath1 = convertedDataPathFormate.format(date);
//            System.out.println(dataPath1);

            String minutelyOutputFolder = "";
            int minute = date.getMinutes();
            if ((minute >= 15) && (minute < 30))
                minutelyOutputFolder = "00";
            if ((minute >= 30) && (minute < 45))
                minutelyOutputFolder = "15";
            if ((minute >= 45) && (minute <= 59))
                minutelyOutputFolder = "30";
            if ((minute >= 00) && (minute < 15)) {
                minutelyOutputFolder = "45";
                date = new Date(date.getTime() - (60 * 60 *       1000));
            }

            String dataPath = convertedDataPathFormate.format(date);
            System.out.println(dataPath + minutelyOutputFolder + "/");

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
