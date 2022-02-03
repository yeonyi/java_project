package day0120;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HomeAssignment_0120_2 {
	public int year;
	public int month;
	public int day;
	
	public HomeAssignment_0120_2() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String[] weekText = "일,월,화,수,목,금,토".split(",");
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR,2021);
		year = cal.get(Calendar.YEAR);
		cal.set(Calendar.MONTH,11);
		month= cal.get(Calendar.MONTH)+1;
		cal.set(Calendar.DAY_OF_MONTH,31);
		day = cal.get(Calendar.DAY_OF_MONTH);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year+"-"+month+"-"+day+"의 요일은 "+weekText[week-1]+"요일");
	
	}//HomeAssignmnet_0120_2
	public static void main(String[] args) {
		HomeAssignment_0120_2 date  =new HomeAssignment_0120_2();
	}//main

}//class
