package day0125;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author user 주말에 해달하는 일자 뽑기------------숙제풀이 숙제 01/25
 */
public class Work1 {

	public Map<Integer, List<Integer>> weekend(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year); // 입력받은 year로 변경
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>(); // Map

//		int day = Calendar.DAY_OF_MONTH; 상수는 변수 저장하지 않고 바로 사용하는게 가독성이 좋다.
//		int dayOfWeek=Calendar.DAY_OF_WEEK;

		List<Integer> list = null;
		int lastDay = 0;// 월의 마지막날을 저장할 변수

		for (int i = 0; i < 12; i++) {
			list = new ArrayList<Integer>(); // 휴일을 저장할 List 생성
			cal.set(Calendar.MONTH, i);// 0~11월 설정
			lastDay = cal.getActualMaximum(Calendar.DATE) + 1;// 설정된 월의 마지막 날 얻기

			for (int j = 1; j < lastDay; j++) {
				cal.set(Calendar.DAY_OF_MONTH, j);//일자 설정
				
				switch (cal.get(Calendar.DAY_OF_WEEK)) {//설정된 일자의 요일 비교
				case Calendar.SUNDAY: 
				case Calendar.SATURDAY:
					list.add(j);
					break; // 1, 7이라고 쓰지말고, constant로 쓰기..
				}// end switch
				map.put(i + 1, list);
			} // end for
			//월을 설정하기 전에 모든 월에 존재하는 일로 초기화
			cal.set(Calendar.DAY_OF_MONTH, i);
			
		} // end for
//		System.out.println(map.get(12));
		return map;
	}// weekend

	public void printWeekend( Map<Integer, List<Integer>> map, int year) {
		System.out.println(year+"년 휴일 정보");
		for(int i=1;i<13;i++)
		System.out.println(i + "월 주말 " + map.get(i));
	}
	public static void main(String[] args) {
		Work1 w1 = new Work1();
		int year = 2022;
		w1.printWeekend(w1.weekend(year), year);

	}// main

}// class
