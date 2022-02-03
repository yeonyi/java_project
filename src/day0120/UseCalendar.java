package day0120;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 개별적인 날짜 정보를 얻을 때 사용하는 클래스
 * @author user
 */
public class UseCalendar {
	
	public UseCalendar() {
//		Calendar cal = new Calendar(); 추상클래스이므로 객체화 안됨
		//is a 관계의 객체화
		Calendar cal = new GregorianCalendar();
		
		//자식클래스를 사용한 객체화
		GregorianCalendar gc = new GregorianCalendar();
		
		//static method를 사용하는 경우
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println("cal: "+cal);
		System.out.println("gc: "+gc);
		System.out.println("cal2: "+cal2);
		
		System.out.println(cal2.get(Calendar.YEAR)+"/"+Calendar.YEAR);//Constant를 사용하여 가독성 향상
		
		System.out.println("------------------------------");
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//0월부터 11월이므로 +1을 해야함
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int amPm = cal.get(Calendar.AM_PM);//0-오전, 1-오후
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//요일을 숫자가 아닌 문자열로 출력
//		String weekText = ""; 
//		switch(week) {
//		case 0 : weekText = "일요일"; break; 
//		case 1 : weekText = "월요일"; break;
//		case 2 : weekText = "화요일"; break;
//		case 3 : weekText = "수요일"; break;
//		case 4 : weekText = "목요일"; break;
//		case 5 : weekText = "금요일"; break;
//		case 6 : weekText = "토요일"; break;
//		}//end switch
		
		String[] weekText = "일,월,화,수,목,금,토".split(",");//위의 switch case보다 더 간결한 방법
		
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);//이번년도의 몇번째 날
		
		int hour = cal.get(Calendar.HOUR);//12시간제
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);//24시간제
		
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int maximum = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println(year+"-"+month+"-"+day+" "+
		(amPm==Calendar.AM?"오전":"오후")+" "+weekText[week-1]+"요일"+" "+
				dayOfYear+" "+hour+"("+hourOfDay+")"+":"+min+
				":"+second);
		System.out.println("마지막날: "+maximum);
		
		System.out.println("------------------------------");
		Calendar cal4 = Calendar.getInstance();
		//년 변경
		cal4.set(Calendar.YEAR,2021);
		//월 변경(사람이 생각하는 월보다 1 적게)
		cal4.set(Calendar.MONTH,2);
		//일 변경
		cal4.set(Calendar.DAY_OF_MONTH, 1);
//		cal4.set(Calendar.DAY_OF_MONTH, 32); 현재월에 없는 날짜-> 다음달 1일로 설정
		
		System.out.println(cal4.get(Calendar.YEAR)+"-"+(cal4.get(Calendar.MONTH)+1)+"-"+
		cal4.get(Calendar.DAY_OF_MONTH)+" "+
				weekText[cal4.get(Calendar.DAY_OF_WEEK)-1]);
	}//UseCalendar
	
	

	public static void main(String[] args) {
		new UseCalendar();

	}//main

}//class
