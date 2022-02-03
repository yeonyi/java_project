package day0121;

import java.util.Calendar;

public class CalendarPrint{

	public static void main(String[] args) {
		 
		Calendar cal = Calendar.getInstance();

		int y = 2022;
		int m = 0 ; //구하고 싶은 월-1
		int w = cal.get(Calendar.DAY_OF_WEEK);//요일
		int i;   

		cal.set(y,m,1); //년, 월, 일

		w = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println(); 
		System.out.println("  일  월  화  수  목  금   토");
		
		for (i=1; i<w; i++)
			System.out.print("    ");
		
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++){//1월의 마지막 날짜
			System.out.printf("%4d",i); 
			w++;   //날짜가 증가할 때마다 요일 증가

			if(w%7==1) {  //일요일 = 1
				System.out.println(); //증가한 요일이 일요일이 될 때
			}//end if
			
		}//end for

		if(w%7!=1) {
			System.out.println();
		}//end if

	}//main
}//end class