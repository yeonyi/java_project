package day0120;

import java.util.Date;
/**
 * Date클래스의 사용
 * @author user
 */
public class UseDate2 {

	public static void main(String[] args) {
		//CMOS의 날짜를 얻기
		long ctm = System.currentTimeMillis(); //1970-01-01 00:00:00에서부터 현재까지의 시간을 ms로 
		System.out.println(ctm);
		//1.객체화
		Date date = new Date();
		Date date2 = new Date(ctm);
		
		System.out.println(date);//주소가 아닌 값이 출력: java.lang.Object클래스의 toString()을 Override함
		System.out.println(date2);
		
		
	}//main

}//class
