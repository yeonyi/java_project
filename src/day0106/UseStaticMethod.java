package day0106;

/**
 * static method ��� : �ν��Ͻ������� ������� �ʰ�, �Էµ� �����θ� ������ ó��
 * @author user
 */
public class UseStaticMethod {
	//1.method ����
	public static void test() {
		System.out.println("static method ȣ��");
	}//test
	public static void main(String[] args) {
		//2.method ȣ��
		UseStaticMethod.test();
	}//main

}//class
