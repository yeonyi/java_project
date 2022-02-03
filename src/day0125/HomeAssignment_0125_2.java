package day0125;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeAssignment_0125_2 {
	
	public HomeAssignment_0125_2() {
		Calendar cal = Calendar.getInstance();
		List<Integer> list = new ArrayList<Integer>();
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();

		int day = 0;// 요일 변수
		int lastDay = 0;
		for (int i = 0; i < 12; i++) {// 1~12월까지 요일이 토,일이면 날짜 출력
			cal.set(Calendar.MONTH, i);
			
			lastDay = cal.getActualMaximum(Calendar.DATE) + 1;
			for (int j = 1; j < lastDay; j++) { 
				cal.set(Calendar.DAY_OF_MONTH, j);
				day = cal.get(Calendar.DAY_OF_WEEK);
				
				if (day == Calendar.SUNDAY || day == Calendar.SATURDAY) {// 토요일 또는 일요일인 경우
					list.add(cal.get(Calendar.DAY_OF_MONTH));// list에 날짜 추가
				} // end if
			} // end for
			map.put(String.valueOf(i+1), list);//해당 월에 대한 list
			System.out.println(String.valueOf(i+1)+"월 주말: "+map);
			list.clear();//다음 월로 넘어가기 전에 방 삭제
		} // end for

	}// PrintWeekend

	public static void main(String[] args) {
		new HomeAssignment_0125_2();
	}// main

}// class
