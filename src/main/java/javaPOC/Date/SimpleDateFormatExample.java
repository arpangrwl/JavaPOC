package javaPOC.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatExample {
    public static void main(String[] args) {

		Date curDate = new Date();

		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd/hh");

		String DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		Date d=new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("E, yyyy/MM/dd/hh z");
		String DateToStr1 = format1.format(d);
		System.out.println(DateToStr1);


		format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		format = new SimpleDateFormat("dd MMMM yyyy zzzz", Locale.ENGLISH);
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		try {
			Date strToDate = format.parse(DateToStr);
			System.out.println(strToDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}