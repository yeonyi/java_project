package day0106;

/**
 * class field�� ����Ǵ� ������ �ڵ��ʱ�ȭ�� (�����ڰ� �ʱⰪ�� ���� �ʿ䰡 ����.)
 * @author user
 */
public class TestDefaultValue {
	//instance variable : �������� (instance�ʹ� �ٸ���.)
	int i;//������ : 0
	char c;//������ : \u0000 (white space)
	double d;//�Ǽ��� : 0.0
	boolean b;//�Ҹ��� : false
	TestDefaultValue tdv;//������ : null
	String str;//������ : null
	int[] arr;//������ : null
	
	public static void main(String[] args) {
		//������ ������������ ������ �ڵ��ʱ�ȭ��
		TestDefaultValue instance = new TestDefaultValue(); //instance�� ��ü
		System.out.println("������ ["+instance.i+"]");
		System.out.println("������ ["+instance.c+"]");
		System.out.println("�Ǽ��� ["+instance.d+"]");
		System.out.println("�Ҹ��� ["+instance.b+"]");
		System.out.println("������ class ["+instance.tdv+"]");
		System.out.println("������ string ["+instance.str+"]");
		System.out.println("������ array ["+instance.arr+"]");

	}//main

}//class
