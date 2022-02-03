package day0114;

/**
 * 부모클래스 : 자식이 사용할 공통코드정의 => 코드의 재사용성
 * @author user
 */
public class TestSuperClass {
	public int a;
	protected int b;
	int c;//default: 패키지가 다르면 자식클래스도 사용하지 못함
	private int d; //자식클래스가 사용하지 못함

	public TestSuperClass() {
		System.out.println("부모클래스의 기본생성자");
	}//TestSuperClass
	
	public void parentMethod() {
		System.out.println("부모의 method");
	}//parentMethod
	
	
}//class

