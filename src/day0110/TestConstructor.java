package day0110;

/**
 * 생성자의 정의와 호출
 * 
 * @author user
 */
public class TestConstructor {
//눈에 보이지는 않지만 자동으로 TestConstructor의 constructor가 생성되어있다.
	private int i;//인스턴스 변수, 객체화할 때 heap메모리에 자동초기화되어 올라간다.
	
	public TestConstructor() {
		i = 2022;
		System.out.println("기본 생성자");
	}//TestConstructor
	
	public void test() {
		System.out.println("test method!!");
	}//test
	
	/**
	 * 생성자 Overload 규칙 : 접근지정자, 반환형, 메소드명 같고 매개변수만 다르게!!
	 * @param i 객체가 생성될 때 들어갈 초기값
	 */
	public TestConstructor(int i) {
		this.i = i;
		System.out.println("인수 있는 생성자");
		//test(); 일반 method의 호출
//		TestConstructor(); error : 생성자는 일반 method호출문법으로 호출할 수 없다.
	}//TestConstructor
	
	public static void main(String[] args) {
		//객체가 생성될 때 인스턴스 변수의 값을 2022로 초기화 => 생성자에서 초기화값 할당
		TestConstructor tc = new TestConstructor(); //기본생성자를 사용하여 객체화
		System.out.println(tc.i);
		
		TestConstructor tc1 = new TestConstructor(110);//매개변수 있는 생성자를 사용한 객체화
		System.out.println(tc1.i);
	}// main

}// class
