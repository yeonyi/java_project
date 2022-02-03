package day0120;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Homework0120 {
	
	public String formatTime(int countryNum) {	
		countryNum = validCountryNum(countryNum);
		Locale[] countryArr = {Locale.KOREA, Locale.US, Locale.CHINA, Locale.JAPAN, Locale.UK};		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy EEEE HH:mm",countryArr[countryNum]);
		return sdf.format(date);		
	}
	
	private int validCountryNum(int countryNum ) {
		if(!(countryNum==0 || countryNum==1 || countryNum ==2 || countryNum==3 || countryNum==4)) {
			countryNum=1;
		}
		return countryNum;
	}
	
	public void printFormatTime(int countryNum) {
		System.out.println(formatTime(countryNum));
	}
	
	public String dateOfWeek(UseDate ud) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, ud.getYear());
		cal.set(Calendar.MONTH, ud.getMonth()-1);
		cal.set(Calendar.DAY_OF_MONTH, ud.getDay());
		
		String[] dateArr = "일,월,화,수,목,금,토".split(",");
		return dateArr[cal.get(Calendar.DAY_OF_WEEK)-1] + "요일";		
	}
	
	public void printDateOfWeek(int year, int month, int day) {
		UseDate usd = new UseDate(year, month, day);	
		System.out.println(dateOfWeek(usd));
	}

	public static void main(String[] args) {
		Homework0120 hw = new Homework0120();
		hw.printFormatTime(2);
		hw.printDateOfWeek(2022, 1, 20);	
	}

}
