package day0105;

/**
 * instance method�� �ۼ��ϰ� ȣ��
 * 
 * @author user
 */
public class UseInstanceMethod {

	/**
	 * instance method
	 */
	public void test() {
		System.out.println("test method ȣ��!!");
	}// test

	public static void main(String[] args) {
//		test(); static���������� instance method�� ���� ȣ���� �� ����.
		//��üȭ
		UseInstanceMethod uim = new UseInstanceMethod();
		//ȣ��
		uim.test();

	}// main

}// class
