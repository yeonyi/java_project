package day1224;
/**
	지역 변수의 사용.
*/

public class UseLocalVariable {
	//Java Applicaion
	public static void main(String[] args) {
		//1.변수 선언:변수명이 다르다면 몇개든 만들 수 있다.
		int i;//초기화가 되지 않은 변수
		int age=0;//초기화된 변수
		
		//2.값 할당
		i=2021;
		age=25;
		System.out.println(age);//25
		age=24;
		System.out.println(age);//24
		age=27;
		//값할당은 여러번 할 수 있다.(변수는 가장 마지막에 할당된 값)
		
		//double age; 데이터형이 달라도 변수명이 같아면 에러 발생.
		
		//3.사용
		System.out.println(i);
		System.out.println(age+"살");

		//변수명을 한글로 부여
		int 나이=25;
		int 올해=2021;
		int 태어난해=0;

		태어난해=올해-나이+1;

		System.out.println("내 나이"+age+"살");
		System.out.println(태어난해);
	}//main
}//class
