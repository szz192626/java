package common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Data {

	public static void main(String[] args) {
		Date date1 = new Date();
		DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy,a,HH:mm:ss", Locale.UK);
		String string = df1.format(date1);
		System.out.println(string);
		Date date2 = new Date();
		DateFormat df2 = new SimpleDateFormat("星期三，dd 三月 yyyy HH:mm:ss", Locale.UK);
		String string2 = df2.format(date2);
	    String string3 = "星期三，13 三月 2019 20:48:31";
		Date date3 = null;
		try {
			date3 = df2.parse(string3);
         } catch (ParseException e) {
			e.getStackTrace();
		}
		System.out.println(date2);
    }

}
