package day0105;

/**
 * instance method를 작성하고 호출
 * 
 * @author user
 */
public class UseInstanceMethod {

	/**
	 * instance method
	 */
	public void test() {
		System.out.println("test method 호출!!");
	}// test

	public static void main(String[] args) {
//		test(); static영역에서는 instance method를 직접 호출할 수 없다.
		//객체화
		UseInstanceMethod uim = new UseInstanceMethod();
		//호출
		uim.test();

	}// main

}// class
