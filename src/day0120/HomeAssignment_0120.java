package day0120;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HomeAssignment_0120 {
	public HomeAssignment_0120( int i ) {
		Date date = new Date();
		
//		int i = 0;
		Locale country = Locale.KOREA;
		switch(i) {//무조건 3이 들어가요.
		case 0 : country = Locale.KOREA; break; 
		case 1 : country = Locale.US; break;
		case 2 : country = Locale.CHINA; break;
		case 3 : country = Locale.JAPAN; break;
		case 4 : country = Locale.UK; break;
		default :country = Locale.KOREA;
		}//end switch
		
		SimpleDateFormat sdf = new SimpleDateFormat
				("MM-dd-yyyy EEEE HH:mm", country);
		
		String formatDate = sdf.format(date);
		
		System.out.println(formatDate);
		
	}//HomeAssignment_0120
	
	
	
	public static void main(String[] args) {
		new HomeAssignment_0120(0);

	}//main

}//class
