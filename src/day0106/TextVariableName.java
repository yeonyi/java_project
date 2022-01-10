package day0106;

/**
 * 같은 이름의 변수를 사용
 * @author user
 */
public class TextVariableName {
	//class field : instance variable, static variable
	//class field에서 선언되는 변수는 유일하다
	int i;
	static int j;
//	static int i; error 같은이름의 변수는 중복될 수 없다.
	
	public static void main(String[] args) {
		//local : local variable
		//local은 class field와 영역이 다르기 때문에 class field에 선언된 같은 이름의 변수를 선언할 수 있다.
		int i=0;
		System.out.println(i);//출력되는 i는 지역변수 (가장 가까이 있는 변수 할당)
		//instance variable 사용 : 객체화 -> 객체명으로 변수 사용 의 순서로
		TextVariableName tvn = new TextVariableName();
		System.out.println("인스턴스 변수: "+ tvn.i);
//		int i; 같은영역에서는 같은 이름의 변수를 선언할 수 없다.
		
		
	}//main

}//class
