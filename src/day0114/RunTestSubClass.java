package day0114;

/**
 * 클래스를 사용하는 클래스
 * @author user
 */
public class RunTestSubClass {

	public static void main(String[] args) {
		//상속관계에서는 자식클래스를 사용하여 객체화한다. 부모클래스가 먼저 객체화된 후 자식클래스가 객체화된다.
		TestSubClass tsc = new TestSubClass();
		tsc.parentMethod();
		//객체명으로도 사용가능
		System.out.println("main method에서 자식클래스의 객체로" + tsc.a + ", "+ tsc.b+", "+tsc.c);
		tsc.parentMethod();
	}//main

}//class
