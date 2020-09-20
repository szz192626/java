package common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDate {

	public static void main(String[] args) {
		Date date1=new Date();
		System.out.println(date1);
		Date date2=new Date(2222222222222L);
		System.out.println(date2);
		//从日期到字符串
		DateFormat df1=new SimpleDateFormat("yyyy/MM/dd a,HH:mm:ss #E",Locale.UK);
		String string=df1.format(date2);
		System.out.println(string);
		//从字符串生成一个date:String=>Date
		String string2="1990/09/15 PM,12:50:22 #Tue";
		Date date3=null;
		try {
			 date3=df1.parse(string2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date3);
	}

}
