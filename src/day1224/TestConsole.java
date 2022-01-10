package day1224;
/**
console 출력에 대한 연습 
*/

public class TestConsole {
	/*
	main method를 가진 클래스는 단독으로 실행될 수 있는 클래스이고,
	단독으로 실행될 수 있는 클래스를 Java Application이라고 한다.
	*/
	public static void main(String[] args){
		//System.out.print("안녕하세요?");
		//System.out.print("오늘은 크리스마스 이브 입니다.");
		//System.out.println("안녕하세요?");
		//System.out.print("오늘은 크리스마스 이브 입니다.");

		System.out.println("상수 출력");
		System.out.println("24");//정수 상수
		System.out.println("12.24");//실수 상수
		System.out.println('A');//문자 상수
		System.out.println(true);//불린 상수
		System.out.println("안녕");//문자열 상수

		System.out.println("변수");
		int i=12;//기본형 데이터형
		TestConsole t=new TestConsole();//참조형 데이터형
		
		System.out.println(i);//기본형 데이터형은 값이 출력
		System.out.println(t);//참조형 데이터형은 주소가 출력

		System.out.println("연산식");
		System.out.println(12+24);//연산식은 연산의 결과만 출력

		System.out.println("12+24="+12+24);//전체가 문자열로 출력
		System.out.println("12+24-"+(12+24));//괄호 먼저 연산 후 문자열 처리
	}//main

}//class
