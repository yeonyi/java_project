package day0117;

/**
 * 객체화 되지 않는 클래스
 * 
 * @author user
 */
public abstract class AbstractSuper {
	
	int i;
	
	public AbstractSuper() { //자식클래스에 의해서만 호출
		System.out.println("추상클래스의 생성자");
	}//Abstract
	
	public void methodA() {
		System.out.println("부모의 일반 method");
	}//methodA
	
	public abstract void methodB();//추상 method: body가 없음
	public abstract int methodC(String name);//추상 method

//	public static void main(String[] args) {
//		new AbstractSuper();
//
//	}//main

}//class
