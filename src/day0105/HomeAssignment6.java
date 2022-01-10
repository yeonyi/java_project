package day0105;

/**
 * 과제<br>
 * 1. 어디에서나 호출할 수 있고, 태어난해를 입력받아 나이를 연산하여 출력하는 메소드 작성 <br>
 * 2. 어디에서나 호출할 수 있고, 정수를 입력받아 대문자, 소문자, 숫자에 해당하는 범위라면, 해당문자로 출력하고 그렇지 않다면 입력된
 * 숫자를 출력하는 method작성
 * @author user
 */

public class HomeAssignment6 {

	// 1번문제
	public void age(int birth) { //변수선언
		System.out.println("당신의 나이는 " + (2022 - birth + 1) + "입니다."); //변수의 사용
	}// age

	// 2번문제
	public void num(int i) {
		System.out.print("i의 값은 " + i);
	}// num

	public static void main(String[] args) {
		HomeAssignment6 birth = new HomeAssignment6(); //객체화
		birth.age(1997); //값 할당

		HomeAssignment6 ha = new HomeAssignment6();// ? :변수 i와 정수의 관계연산이 안되서 if의 조건문이 error가 나옴
		ha.num(65);
		char j = 0;
		int i = 65;
		if ((i > 64 && i < 91) || (i > 96 && i < 123) || (i > 47 && i < 58)) {// 대문자:65~90, 소문자:97~122, 숫자:48~57
			j = (char)i;
			System.out.println(" "+j);
		} else {
			System.out.println(i);	
		} // end else

	}// main

//	private void i(int i) {
//		// TODO Auto-generated method stub
//		
//	}

}// class
