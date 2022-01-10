package day0106;

/**
 * class field에 선언되는 변수는 자동초기화됨 (개발자가 초기값을 넣을 필요가 없다.)
 * @author user
 */
public class TestDefaultValue {
	//instance variable : 지역변수 (instance와는 다르다.)
	int i;//정수형 : 0
	char c;//문자형 : \u0000 (white space)
	double d;//실수형 : 0.0
	boolean b;//불린형 : false
	TestDefaultValue tdv;//참조형 : null
	String str;//참조형 : null
	int[] arr;//참ㅈ형 : null
	
	public static void main(String[] args) {
		//각각의 데이터형들이 가지는 자동초기화값
		TestDefaultValue instance = new TestDefaultValue(); //instance는 객체
		System.out.println("정수형 ["+instance.i+"]");
		System.out.println("문자형 ["+instance.c+"]");
		System.out.println("실수형 ["+instance.d+"]");
		System.out.println("불린형 ["+instance.b+"]");
		System.out.println("참조형 class ["+instance.tdv+"]");
		System.out.println("정수형 string ["+instance.str+"]");
		System.out.println("정수형 array ["+instance.arr+"]");

	}//main

}//class
