package day0204;

import java.util.Random;

/**
 * 황성준 클래스
 * @author user
 */
public class HwangSungJun {
	
	public String walk() throws TabaccoException {//사용자정의 예외처리
		String result = ""; //empty
		
		String[] studentGrade = {"초딩", "중딩", "고딩", "대딩"};
		int tempFlag=new Random().nextInt(studentGrade.length);
		
		switch (tempFlag) {
		case 0://초딩이 담배를 피우는 상황
			throw new TabaccoException("초딩님 흡연은 건강에 해롭습니다.");
			
		}//end switch
		
		result = studentGrade[tempFlag]+"님 흡연 중 모른척 지나감.";
		
		return result;
	}//walk

	public static void main(String[] args) {
		HwangSungJun hsj = new HwangSungJun();
		try {
			String result = hsj.walk();
			System.out.println("정상적인 상태 "+result);
		}catch(TabaccoException e) {
			System.err.println("비정상적인 상태 "+e);
			e.printStackTrace();
		}//end catch

	}//main

}//class
